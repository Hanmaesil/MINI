package DB;


import java.util.ArrayList;
import java.util.Scanner;
import gagame.function;
import gagame.endcredit;

public class loginMethod {
	static int ending = 0;




	public static String db() {
		Scanner sc = new Scanner(System.in);
		DBDAO dao = new DBDAO();
		int exit = 0;
		
		

		System.out.print(
				
				"\t\t\t" + " || " + "\t" + "  1. GAME START " + "\t" + " || " + "\t" + "  2. EXIT " + "\t" + " || ");
		int sel = sc.nextInt();
		

		if (sel == 1) {
			System.out.println(

					" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");
			System.out.println("                                             \r\n"
					+ "        ___         ___         ___                \r\n"
					+ "      //   ) )    //   ) )    //   ) )    /_  /    \r\n"
					+ "       ___/ /    //   / /      ___/ /      / /     \r\n"
					+ "     / ____/    //   / /     / ____/      / /      \r\n"
					+ "    / /____    ((___/ /     / /____      / /       ");

			System.out.println("\t                                                     \r\n"
					+ "                                                      \r\n"
					+ "                           / ____      ___        __        ___        ___    \r\n"
					+ "                         //＼ ＼     //   ) )   //  ) )   //___) )   //   ) ) \r\n"
					+ "                        //  ＼ ＼   //   / /   //        //         //   / /  \r\n"
					+ "                       //    ＼ ＼ ((___/ /   //        ((____     ((___( (   \t ");

			// System.out.println();
			System.out.println("                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                            ___                    __                ( )              ___       //  \r\n"
					+ "                                          ((   ) )   //   / /    //  ) )  ||  / /   / /   ||  / /   //   ) )   //   \r\n"
					+ "                                           ＼＼      //   / /    //        || / /   / /    || / /   //   / /   //    \r\n"
					+ "                                        //___) )   ((___( (    //         ||/ /   / /     ||/ /   ((___( (   //     ");

			System.out.println();
			System.out.println();
			System.out.println(

					" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");
			String nick = null;
			while (true) {
				if (exit != 0) {
					break;
				}
				System.out.println();
				System.out.println();
				System.out.print("\t\t\t" + " 1.[로그인] 2.[회원가입] 3.[명예의전당] 4.[회원목록보기] 5.[회원탈퇴] 6. [종료] >>> ");
//				if(getEnding() == 1) {
//					System.out.println("8.[시험]");
//				}
				int choice = sc.nextInt();
				System.out.println();
				System.out.println();
				if (choice == 1) {

					System.out.println(

							" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");

					System.out.println();
					System.out.println();
					System.out.println("\t\t\t\t\t\t" + "[로그인]");
					System.out.print("\t\t\t\t\t\t" + "아이디 입력 : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "비밀번호 입력 : ");
					String pw = sc.next();
					nick = dao.login(id, pw);
					
					if (nick != null) {
						System.out.println("\t\t\t\t\t\t" + nick + "님 환영합니다!");
						
//						setEnding(choice);
						
						
						exit++;
						if (id.equals("admin")) {
							System.out.println("1.회원정보수정 2.회원삭제");
							choice = sc.nextInt();

							if (choice == 1) {
								System.out.println("[관리자 회원정보수정]");
								System.out.print("아이디 입력 : ");
								String change_id = sc.next();
								System.out.print("변경할 닉네임 입력 : ");
								String change_nick = sc.next();

								int cnt = dao.adminUpdate(change_id, change_nick);
								if (cnt > 0) {
									System.out.println("회원정보 수정 완료");
								} else {
									System.out.println("회원정보 수정 실패");
								}

							} else if (choice == 2) {
								System.out.println("[관리자 회원삭제]");

								ArrayList<MemberDTO> list = dao.selectAll();
								int cnt = 1;
								for (int i = 0; i < list.size(); i++) {
									MemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.println(cnt + "." + m.getId());
										cnt++;
									}
								}
								System.out.println("삭제할 아이디 입력 : ");
								String removeId = sc.next();
								if (!removeId.equals("admin")) {
									int result = dao.deleteId(removeId);
									if (result > 0) {
										System.out.println("아이디 삭제 완료");
									} else {
										System.out.println("아이디 삭제 실패");
									}
								} else {
									System.out.println("삭제할 수 없습니다");
								}
							}
							break;
						}

					} else {
						System.out.println("\t\t\t\t\t\t" + " [Server] 로그인 실패");
					}
				} else if (choice == 2) {

					System.out.println("\t\t\t\t\t\t" + "[회원가입]");
					System.out.print("\t\t\t\t\t\t" + "아이디 입력 : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "비밀번호 입력 : ");
					String pw = sc.next();
					System.out.print("\t\t\t\t\t\t" + "닉네임 입력 : ");
					nick = sc.next();
					int cnt = dao.join(id, pw, nick);
					if (cnt > 0) {
						System.out.println("\t\t\t\t\t\t" + "회원가입 성공");
					} else {
						System.out.println("\t\t\t\t\t\t" + "닉네임이 중복입니다.");
						System.out.println("\t\t\t\t\t\t" + "회원가입 실패");
					}

				} else if (choice == 3) {
					System.out.println("\t\t\t\t\t\t" + "[명예의 전당]");
					ArrayList<MemberDTO> list = dao.selectRanking();
					int cnt = 1;
					System.out.println("\t\t\t\t\t\t" +  "[닉네임]     [지역]         [달]");
					for (int i = 0; i < list.size(); i++) {
						MemberDTO m = list.get(i);
						System.out.print("\t\t\t\t\t\t" + cnt + ". " + m.getRankingNick() + " - ");
						System.out.print(m.getDiffcult() + " - ");
						System.out.println(m.getMonth());
						cnt++;
					}
				} else if (choice == 4) {
					System.out.println("\t\t\t\t\t\t" + "[회원목록보기]");
					ArrayList<MemberDTO> list = dao.selectAll();
					int cnt = 1;
					System.out.println("\t\t\t\t\t\t" + "[아이디]  [닉네임]");
					for (int i = 0; i < list.size(); i++) {
						MemberDTO m = list.get(i);
						System.out.print("\t\t\t\t\t\t" + cnt + ". " + m.getId() + " - ");
						System.out.println(m.getNick());
						cnt++;
					}
				} else if (choice == 5) {
					System.out.println("\t\t\t\t\t\t" + "[회원탈퇴]");
					System.out.print("\t\t\t\t\t\t" + "아이디 입력 : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "비밀번호 입력 : ");
					String pw = sc.next();

					int cnt = dao.delete(id, pw);

					if (cnt > 0) {
						System.out.println("\t\t\t\t\t\t" + "회원삭제 완료");
					} else {
						System.out.println("\t\t\t\t\t\t" + "회원삭제 실패");
					}
				} 
				else if (choice == 123) {
					Scanner in = new Scanner(System.in);
					function fun = new function();
					System.out.println("\t\t\t\t\t\t" + "[엔딩]");
					while(true) {
					
					System.out.println("\t\t\t\t\t\t" +"엔딩 고르기");
					System.out.print("\t\t\t\t\t\t" + "쨔잕 이스터에그"+"\n"
							+"\t\t\t\t\t\t" + "1히든 헬창, 2히든 백신, 3히든 크리스마스,"+"\n"
							+ "\t\t\t\t\t\t" + "4노말 학생, 5노말 운동, 6노말 간호사, 7배드엔딩 코로나"+"\n"
							+ "\t\t\t\t\t\t" +"8배드엔드 변이바이러스,9 배드엔드 과로"+"\n"
							+ "\t\t\t\t\t\t" + "10.히든 알코올 , 11 고라니엔딩, 12 나가기");
					int x = in.nextInt();
					onlyend(x);
					fun.timelate(2);
					if(x==12) {
						break;
					}
				}
				} else if (choice == 6) {
					
					return null;
					
				}
			}return nick;
			
		}
		return null;
		


	}


	static void onlyend(int x) {
		endcredit end = new endcredit();

		if (x == 1) {
			end.hidden_healcang();
		}
		if (x == 2) {
			end.hidden_bacsin();
		}
		if (x == 4) {
			end.normal_student_end();
		}
		if (x == 3) {
			end.hidden_x_mas_solo();
		}
		if (x == 8) {
			end.bad_omicron_die();
		}
		if (x == 10) {
			end.hidden_Alcohol();
		}
//		if (x == 7) {
//			end.event_hi_omicron();
//		}
		if (x == 7) {
			end.bad_corona_end();
		}
		if (x == 5) {
			end.normal_sport_end();
		}
		if (x == 9) {
			end.bad_overwork();
		}
		if (x == 6) {
			end.normal_nurse_end();
		}
//		if (x == 12) {
//			end.normal_nurse_end2();
//		}
//		if (x == 13) {
//			end.event_u_hang();
//		}
//		if(x==15) {
//			end.goridugi();
//		}
		if(x==11) {
			end.gorani();
		}
//		if(x==16) {
//			end.test();
//		}

	}

}

