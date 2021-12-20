package DB;


public class MemberDTO {
	
	
	private int num;
	private String id;
	private String pw;
	private String nick;
	private String rankingNick;
	
	
	private String diffcult;
	private String month;
	
	



	public MemberDTO() {
	}

	public MemberDTO(String id, String pw, String nick) {
		this.id = id;
		this.pw = pw;
		this.nick = nick;
		
	}
	
	public void ranking(String nick, String difficult, String month) {
		this.rankingNick = nick;
		this.diffcult = difficult;
		this.month = month;
		
		
	}

	public String getRankingNick() {
		return rankingNick;
	}

	public void setRankingNick(String rankingNick) {
		this.rankingNick = rankingNick;
	}
	
//	public MemberRanking(String nick, String diffcult, String month) {
//		this.nick = nick;
//		this.diffcult = diffcult;
//		this.nick = month;
//	}
	
	public String getDiffcult() {
		return diffcult;
	}

	public void setDiffcult(String diffcult) {
		this.diffcult = diffcult;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "MemberDTO [num=" + num + ", id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	}
	
	
	
	
}