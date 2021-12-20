package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class DBDAO {
	// DAO -> DataBase Access Object
	// 데이터 베이스에 접근하기위한 객체를 만들 수 있는 클래스
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	Scanner sc = new Scanner(System.in);

	// 드라이버 로딩과 커넥션 객체를 가져오는 메소드
	private void getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String db_id = "campus_f_2_1209";
			String db_pw = "smhrd2";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// DataBase와 연결을 끊어주는 메소드
	private void close() {
		// 4. Java와 DataBase간의 연결을 끊어준다
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	// 로그인 기능
	public String login(String id, String pw) {

		getConnection();
		String nick = null;
		try {

			// 3. SQL문 작성 및 실행
			String sql = "select * from account where id = ? and pw = ? ";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			rs = psmt.executeQuery();

			if (rs.next()) {
				nick = rs.getString("nick");
			}
			// select문에 사용
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return nick;
	}

	// 회원 가입 기능을 옮겨 주세요
	// 메소드 이름 -> join
	public int join(String id, String pw, String nick) {

		MemberDTO m = new MemberDTO(id, pw, nick);
		ArrayList<MemberDTO> list = selectAll(); // 밑에있는 selectall 메소드 가져오기

		getConnection();
		int cnt = 0;

		try {

			// 3. SQL문 작성 및 실행
			String sql = "insert into account values(account_seq.nextval, ?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, nick);

			boolean isCheck = true; // 변수를 주고 트루값을 준다.

			for (int i = 0; i < list.size(); i++) { // 닉네임 하나씩 확인하는거
				if (list.get(i).getNick().equals(nick)) {
					isCheck = false; // 하나라도 중복이 있으면 false가 반환
				} // 중복이 없으면 isCheck가 true
			}
			if (isCheck) { // isCheck가 트루라면
				cnt = psmt.executeUpdate(); // cnt값이 증가
			}

//			if(!m.getNick().equals(nick)) { //중복이 아니면 cnt값이 증가
//				cnt = psmt.executeUpdate();
//			}else {  //중복이면 cnt는 0
//				cnt = 0;
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	// 회원 정보 수정 update
	public int update(String inputNick, String id, String pw) {

		getConnection();
		int cnt = 0;

		try {

			// 3. sql 문 작성 및 실행
			String sql = "update account set nick = ? where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, inputNick);
			psmt.setString(2, id);
			psmt.setString(3, pw);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return cnt;
	}

	public ArrayList<MemberDTO> selectAll() {

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		getConnection();

		try {
			String sql = "select * from account";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				
				
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String nick = rs.getString("nick");
				MemberDTO m = new MemberDTO(id, pw, nick);
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	public int delete(String id, String pw) {

		getConnection();
		int cnt = 0;
		try {
			String sql = "delete from account where id = ? and pw = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return cnt;
	}

	public int adminUpdate(String change_id, String change_nick) {
		getConnection();
		int cnt = 0;

		try {

			// 3. sql 문 작성 및 실행
			String sql = "update account set nick = ? where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, change_nick);
			psmt.setString(2, change_id);
			cnt = psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();

		}
		return cnt;

	}

	public int deleteId(String removeId) {
		getConnection();
		int cnt = 0;

		try {
			String sql = "delete from account where id = ?";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, removeId);
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return cnt;
	}

	public int ranking(String nick, String difficult, String month) { // 랭킹
		getConnection();

		try {
			String sql = "insert into ranking values(ranking_seq.nextval, ? , ? ,? )";
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, nick);
			psmt.setString(2, difficult);
			psmt.setString(3, month);
			psmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}

		return 0;

	}
	public ArrayList<MemberDTO> selectRanking() { //랭킹 보기

		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		getConnection();
		

		
		try {
			String sql = "select * from ranking order by difficult";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				
				String nick = rs.getString("nick");
				String difficult = rs.getString("difficult");
				String month = rs.getString("month");
				
				
				MemberDTO m = new MemberDTO();
				m.ranking(nick, difficult, month);
				//System.out.println(m.toString());
				list.add(m);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			close();
		}
		return list;
	}

	
		
		
	}


