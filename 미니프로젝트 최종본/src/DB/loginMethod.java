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
					+ "                         //�� ��     //   ) )   //  ) )   //___) )   //   ) ) \r\n"
					+ "                        //  �� ��   //   / /   //        //         //   / /  \r\n"
					+ "                       //    �� �� ((___/ /   //        ((____     ((___( (   \t ");

			// System.out.println();
			System.out.println("                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                                                          \r\n"
					+ "                                            ___                    __                ( )              ___       //  \r\n"
					+ "                                          ((   ) )   //   / /    //  ) )  ||  / /   / /   ||  / /   //   ) )   //   \r\n"
					+ "                                           ����      //   / /    //        || / /   / /    || / /   //   / /   //    \r\n"
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
				System.out.print("\t\t\t" + " 1.[�α���] 2.[ȸ������] 3.[��������] 4.[ȸ����Ϻ���] 5.[ȸ��Ż��] 6. [����] >>> ");
//				if(getEnding() == 1) {
//					System.out.println("8.[����]");
//				}
				int choice = sc.nextInt();
				System.out.println();
				System.out.println();
				if (choice == 1) {

					System.out.println(

							" () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () () ()");

					System.out.println();
					System.out.println();
					System.out.println("\t\t\t\t\t\t" + "[�α���]");
					System.out.print("\t\t\t\t\t\t" + "���̵� �Է� : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "��й�ȣ �Է� : ");
					String pw = sc.next();
					nick = dao.login(id, pw);
					
					if (nick != null) {
						System.out.println("\t\t\t\t\t\t" + nick + "�� ȯ���մϴ�!");
						
//						setEnding(choice);
						
						
						exit++;
						if (id.equals("admin")) {
							System.out.println("1.ȸ���������� 2.ȸ������");
							choice = sc.nextInt();

							if (choice == 1) {
								System.out.println("[������ ȸ����������]");
								System.out.print("���̵� �Է� : ");
								String change_id = sc.next();
								System.out.print("������ �г��� �Է� : ");
								String change_nick = sc.next();

								int cnt = dao.adminUpdate(change_id, change_nick);
								if (cnt > 0) {
									System.out.println("ȸ������ ���� �Ϸ�");
								} else {
									System.out.println("ȸ������ ���� ����");
								}

							} else if (choice == 2) {
								System.out.println("[������ ȸ������]");

								ArrayList<MemberDTO> list = dao.selectAll();
								int cnt = 1;
								for (int i = 0; i < list.size(); i++) {
									MemberDTO m = list.get(i);
									if (!m.getId().equals("admin")) {
										System.out.println(cnt + "." + m.getId());
										cnt++;
									}
								}
								System.out.println("������ ���̵� �Է� : ");
								String removeId = sc.next();
								if (!removeId.equals("admin")) {
									int result = dao.deleteId(removeId);
									if (result > 0) {
										System.out.println("���̵� ���� �Ϸ�");
									} else {
										System.out.println("���̵� ���� ����");
									}
								} else {
									System.out.println("������ �� �����ϴ�");
								}
							}
							break;
						}

					} else {
						System.out.println("\t\t\t\t\t\t" + " [Server] �α��� ����");
					}
				} else if (choice == 2) {

					System.out.println("\t\t\t\t\t\t" + "[ȸ������]");
					System.out.print("\t\t\t\t\t\t" + "���̵� �Է� : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "��й�ȣ �Է� : ");
					String pw = sc.next();
					System.out.print("\t\t\t\t\t\t" + "�г��� �Է� : ");
					nick = sc.next();
					int cnt = dao.join(id, pw, nick);
					if (cnt > 0) {
						System.out.println("\t\t\t\t\t\t" + "ȸ������ ����");
					} else {
						System.out.println("\t\t\t\t\t\t" + "�г����� �ߺ��Դϴ�.");
						System.out.println("\t\t\t\t\t\t" + "ȸ������ ����");
					}

				} else if (choice == 3) {
					System.out.println("\t\t\t\t\t\t" + "[���� ����]");
					ArrayList<MemberDTO> list = dao.selectRanking();
					int cnt = 1;
					System.out.println("\t\t\t\t\t\t" +  "[�г���]     [����]         [��]");
					for (int i = 0; i < list.size(); i++) {
						MemberDTO m = list.get(i);
						System.out.print("\t\t\t\t\t\t" + cnt + ". " + m.getRankingNick() + " - ");
						System.out.print(m.getDiffcult() + " - ");
						System.out.println(m.getMonth());
						cnt++;
					}
				} else if (choice == 4) {
					System.out.println("\t\t\t\t\t\t" + "[ȸ����Ϻ���]");
					ArrayList<MemberDTO> list = dao.selectAll();
					int cnt = 1;
					System.out.println("\t\t\t\t\t\t" + "[���̵�]  [�г���]");
					for (int i = 0; i < list.size(); i++) {
						MemberDTO m = list.get(i);
						System.out.print("\t\t\t\t\t\t" + cnt + ". " + m.getId() + " - ");
						System.out.println(m.getNick());
						cnt++;
					}
				} else if (choice == 5) {
					System.out.println("\t\t\t\t\t\t" + "[ȸ��Ż��]");
					System.out.print("\t\t\t\t\t\t" + "���̵� �Է� : ");
					String id = sc.next();
					System.out.print("\t\t\t\t\t\t" + "��й�ȣ �Է� : ");
					String pw = sc.next();

					int cnt = dao.delete(id, pw);

					if (cnt > 0) {
						System.out.println("\t\t\t\t\t\t" + "ȸ������ �Ϸ�");
					} else {
						System.out.println("\t\t\t\t\t\t" + "ȸ������ ����");
					}
				} 
				else if (choice == 123) {
					Scanner in = new Scanner(System.in);
					function fun = new function();
					System.out.println("\t\t\t\t\t\t" + "[����]");
					while(true) {
					
					System.out.println("\t\t\t\t\t\t" +"���� ����");
					System.out.print("\t\t\t\t\t\t" + "¹�� �̽��Ϳ���"+"\n"
							+"\t\t\t\t\t\t" + "1���� ��â, 2���� ���, 3���� ũ��������,"+"\n"
							+ "\t\t\t\t\t\t" + "4�븻 �л�, 5�븻 �, 6�븻 ��ȣ��, 7��忣�� �ڷγ�"+"\n"
							+ "\t\t\t\t\t\t" +"8��忣�� ���̹��̷���,9 ��忣�� ����"+"\n"
							+ "\t\t\t\t\t\t" + "10.���� ���ڿ� , 11 ���Ͽ���, 12 ������");
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

