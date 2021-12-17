package gagame;

import java.util.Random;
import java.util.Scanner;

public class seoul {
	function fun = new function();
	Scanner in = new Scanner(System.in);
	endcredit end = new endcredit();
	Random ran = new Random();
	static int returnMonth;
	static int month;
//	int healthcnt =100;
//	int defend_vir=0;

	character character = new character();
	omicron omi = new omicron();

	public int getmonth() { // 랭킹을 위한 회차 가져오기

		return returnMonth;
	}

	public void setmonth() { //랭킹을 위한 회차 가져오기
		returnMonth = month;
	}

	public void main(String[] mychar) {
		while (true) {
			int a = 0;
			if (mychar[0].equals("1")) {

				System.out.println("\t\t\t\t\t\t" + "간호사는 조기 백신으로 면역력 15가 증가되 있습니다.");
				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("\t\t\t\t\t\t" + "운동선수는 체력이 20 증가합니다.");
				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("\t\t\t\t\t\t" + "학생");
				student_print(a);
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "다시골라주세요요요");
			}
		}
	}

	public void zibang(String[] mychar) {
		while (true) {
			int a = 1;
			if (mychar[0].equals("1")) {

				System.out.println("\t\t\t\t\t\t" + "간호사는 조기 백신으로 면역력 15 증가합니다.");
				System.out.println("\t\t\t\t\t\t" + "지방에서는 감염 저항력이 15 증가합니다.");
				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("\t\t\t\t\t\t" + "운동선수는 체력이 20 증가합니다.");
				System.out.println("\t\t\t\t\t\t" + "지방에서는 감염 저항력이 15 증가합니다.");
				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("\t\t\t\t\t\t" + "학생");
				System.out.println("\t\t\t\t\t\t" + "지방에서는 감염 저항력이 15 증가합니다.");
				student_print(a);
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "다시골라주세요요요");
			}
		}

	}

	// 두메산골 아직 미구현
	public void dume(String[] mychar) {
		while (true) {
			int a = 2;
			if (mychar[0].equals("1")) {

				System.out.println("\t\t\t\t\t\t" + "간호사는 조기 백신으로 면역력 15 증가합니다.");
				System.out.println("\t\t\t\t\t\t" + "두메산골에서는 감염 저항력이 50 증가합니다.");

				nurse_print(a);
				break;

			} else if (mychar[0].equals("2")) {
				System.out.println("\t\t\t\t\t\t" + "운동선수는 체력이 20 증가합니다.");
				System.out.println("\t\t\t\t\t\t" + "두메산골에서는 감염 저항력이 50 증가합니다.");

				sport_print(a);
				break;
			} else if (mychar[0].equals("3")) {
				System.out.println("\t\t\t\t\t\t" + "학생");
				System.out.println("\t\t\t\t\t\t" + "두메산골에서는 감염 저항력이 50 증가합니다.");

				student_print(a);
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "다시골라주세요요요");
			}
		}

	}

	public void nurse_print(int a) {
		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "지방";
		} else if (a == 2) {
			witch = "강원";
		} else {
			witch = "수도";
		}

		for (month = 1; month <= 13; month++) {
			if (month == 13) {
				end.normal_nurse_end();
				break;
			}
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (month == 12) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (month < 13) {
				System.out.println("\t\t\t\t\t\t" + "==========");
				System.out.println("\t\t\t\t\t\t" + month + " 번째 달");
				System.out.println("\t\t\t\t\t\t" + "==========");
				setmonth();  //랭킹을 위한 회차 저장하기
			}
			if (month == 3 || month == 6 || month == 9) {
				System.out.println("\t\t\t\t\t\t" + (month / 3) + "단계 거리두기가 시행됐다!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			} else {
				gagame.omicron.goridugi(0, 0);
			}
			if (month == 4 || month == 8) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			} else {
				gagame.omicron.dae_u_hang(0);
			}

			if (month == 12) {
				if (a == 2) {
					character.dume_nurse_morning();
					character.dume_nurse_ohu();
					endcnt = character.dume_nurse_night(endcnt);
				} else {
					character.seoul_nur_mornig();
					character.seoul_nur_afternoon();
					endcnt = character.seoul_nur_night(endcnt);
				}
			}
			if (month == 5 || month == 10) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				character.nurse_baksin();
			}

			else {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				if (a == 2) {
					character.dume_nurse_morning();
					character.dume_nurse_ohu();
					endcnt = character.dume_nurse_night(endcnt);
				} else {
					character.seoul_nur_mornig();
					character.seoul_nur_afternoon();
					endcnt = character.seoul_nur_night(endcnt);
				}

			}
		}
	}

	public void sport_print(int a) {
		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "지방";
		} else if (a == 2) {
			witch = "강원";
		} else {
			witch = "수도";
		}
		for (month = 1; month <= 13; month++) {
			if (month == 13) {
				end.normal_sport_end();
				break;
			}
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (month == 12) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (month < 13) {
				System.out.println("\t\t\t\t\t\t" + "==========");
				System.out.println("\t\t\t\t\t\t" + month + " 번째 달");
				System.out.println("\t\t\t\t\t\t" + "==========");
				setmonth();  //랭킹을 위한 회차 저장하기
			}
			if (month == 3 || month == 6 || month == 9) {
				System.out.println("\t\t\t\t\t\t" + (month / 3) + "단계 거리두기가 시행됐다!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			} else {
				gagame.omicron.goridugi(0, 0);
			}
			if (month == 4 || month == 8) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			} else {
				gagame.omicron.dae_u_hang(0);
			}

			if (month == 12) {
				if (a == 2) {
					character.dume_sport_morning();
					character.dume_sport_ohu();
					endcnt = character.dume_sport_night(endcnt);
				} else {
					character.nor_sport_morning();
					character.nor_sport_evening();
					endcnt = character.nor_sport_night(endcnt);
				}
			}
			if (month == 5 || month == 10) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				endcnt = character.backsin();
			}

			else {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				if (a == 2) {
					character.dume_sport_morning();
					character.dume_sport_ohu();
					endcnt = character.dume_sport_night(endcnt);
				} else {
					character.nor_sport_morning();
					character.nor_sport_evening();
					endcnt = character.nor_sport_night(endcnt);
				}

			}
		}

	}

	public void student_print(int a) {

		character character = new character();
		int endcnt = 0;
		int omicron = 0;
		int guri_cnt = 1;
		String witch = null;
		if (a == 1) {
			witch = "지방";
		} else if (a == 2) {
			witch = "강원";
		} else {
			witch = "수도";
		}
		for (month = 1; month <= 13; month++) {
			if (month == 13) {
				end.normal_student_end();
				break;
			}
			if (omicron == 0) {
				gagame.omicron.omicron_cnt(0);
			}
			if (month == 12) {
				if (month >= 6 && omicron == 0) {
					omicron(omicron);
				}
				endcnt = character.x_mas(endcnt);

			}
			if (endcnt == 1) {
				break;
			}

			if (month < 13) {
				System.out.println("\t\t\t\t\t\t" + "==========");
				System.out.println("\t\t\t\t\t\t" + month + " 번째 달");
				System.out.println("\t\t\t\t\t\t" + "==========");
				setmonth();  //랭킹을 위한 회차 저장하기
			}
			if (month == 3 || month == 6 || month == 9) {
				System.out.println("\t\t\t\t\t\t" + (month / 3) + "단계 거리두기가 시행됐다!!");
				end.goridugi();
				gagame.omicron.goridugi(1, guri_cnt);
				guri_cnt++;
			} else {
				gagame.omicron.goridugi(0, 0);
			}
			if (month == 4 || month == 8) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				gagame.omicron.dae_u_hang(1);
				end.event_u_hang();
			} else {
				gagame.omicron.dae_u_hang(0);
			}

			if (month == 12) {

				if (a == 2) {
					character.dume_student_morning();
					character.dume_student_ohu();
					endcnt = character.dume_student_night(endcnt);
				} else {
					character.nor_student_morning();
					character.nor_student_evening();
					endcnt = character.nor_student_night(endcnt);
				}
			}
			if (month == 5 || month == 10) {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				endcnt = character.backsin();
			}

			else {
				if (month >= 6 && omicron == 0) {
					omicron = omicron(omicron);
				}
				character.zibang(witch);
				if (a == 2) {
					character.dume_student_morning();
					character.dume_student_ohu();
					endcnt = character.dume_student_night(endcnt);
				} else {
					character.nor_student_morning();
					character.nor_student_evening();
					endcnt = character.nor_student_night(endcnt);
				}

			}
		}

	}

	public int omicron(int omicron) {

		if (ran.nextInt(10) < 2) {
			end.event_hi_omicron();
			omicron = 1;

			gagame.omicron.omicron_cnt(1);
			return omicron;
		}

		return 0;

	}

}
