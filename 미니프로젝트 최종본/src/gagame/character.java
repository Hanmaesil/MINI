package gagame;

import java.util.Random;
import java.util.Scanner;

public class character {

	int gorani = 0;
	int healthcnt = 100;
	double defend_vir = 10;
	Scanner in = new Scanner(System.in);
	String choice;
	endcredit end = new endcredit();
	Random ran = new Random();
	int rancnt = 0;
	String a = "수도";
	int ten;
	int five;
	int minfive;
	int minten;

	int alcol_cnt = 0;
	int n = 0;
	int h = 0;
	int x = 0;
	function fun = new function();
	omicron omi = new omicron();
	int omicron_cnt =0;
	public int hi_omicron(int sangsu) {
		if(sangsu==1) {
		omicron_cnt =1;
		}
		else {
		omicron_cnt =0;
		}
		return omicron_cnt;
	}
	public void omi_change() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void da_u_hang() {
		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void only_nur() {
		if (n == 0) {
			defend_vir = 25;
		}
		n++;
	}

	public void only_hel() {
		if (h == 0) {
			healthcnt += 20;
			h++;
		}
	}

	public int x_mas(int x) {
		rancnt = ran.nextInt(5);
		if (rancnt >= 3) {
			end.hidden_x_mas_solo();
			return 1;
		} else {
			return 0;
		}

	}

	public String zibang(String b) {
		if (b.equals("지방")) {
			return a = "지방";
		} else if (b.equals("강원")) {
			return a = "강원";
		} else {
			return a = "수도";
		}

	}

	public void witch() {
		if (a.equals("지방") && x == 0) {
			defend_vir += 15;
			x++;
		}
		if (a.equals("강원") && x == 0) {
			defend_vir += 50;
			x++;
		} else {
			defend_vir += 0;
		}
	}

	public void gori() {

		five = omi.getFive();
		minten = omi.getMinten();
		minfive = omi.getMinfive();
		ten = omi.getTen();
	}

	public void dume_sport_morning() {
		omi_change();
		da_u_hang();
		gori();
		witch();
		only_hel();

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"아침에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1. 아침운동 2. 마을 산책가기 3. 밥먹고 출근하기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"운동은 공복운동이지!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"운동으로 인한 체력 증가! ");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"빈속에 무리를 했나...");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"속 쓰려.... ");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"산책을 가다가 뱀을 마주쳤다!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"겉은 근육이여도 속은 여린 나...");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"시골의 정기를 받았다!!!");
					fun.timelate(1);
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"아침엔 닭가슴살이지!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"닭가슴살을 먹어 체력과 면역력 증가!");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"냉동실에 닭가슴살이 다 떨어졌다....");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +".........");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"힝");
			}
		}

	}

	public void dume_sport_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"점심에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +" 1. 밥? 어림도없지 운동 2. 밥 먹고 운동 3. 휴식! >>> ");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"시골은 산스짐이 최고지!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"운동으로 체력");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"운동을 가려고 했지만 상사와 식당을 가게 되었다.");
					fun.timelate(1);
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"단백질은 챙기고 운동해야지");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"읍.. 배불러서 운동이 제대로 안돼");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"역시 든든하게 먹고 운동해야지!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"근성장 했다");
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"zzZZ~ 음 개운하다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"음..? 근손실이 났잖아? 안돼ㅐㅐㅐㅐ!");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"역시 운동도 쉬엄 쉬엄 해야지");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"쉬었더니 개운하다");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"힝");
			}
		}

	}

	public int dume_sport_night(int endcnt) {

		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"저녁에 무엇을 할 것인가요?");
				System.out.print("\t\t\t\t\t\t" +" 1. 저녁운동 2. 집가서 자기 3. 등산가기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {

					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"시골은 산스짐이 최고지!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"운동으로 체력");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"자기전에 운동하는게 최고!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"하지만 의학적으로 자기전에는 운동이 안좋... ");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"시골버스를 놓쳐서 집까지 뛰어갔다!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"집까지 뛰어가서 힘들어 지쳐 쓰러졌다.");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"간만에 집에가서 푹 쉬었다.");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"집이 최고야!");
						defend_vir += ten;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"등산도 운동이지!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"산의 정기를 받아 면역력 ");
						healthcnt += five;
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"산을 오르다가 고라니를 만났다.");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							gorani = 1;
							break;
						} else {
							System.out.println("\t\t\t\t\t\t" +"어.....?");
							fun.timelate(1);
							System.out.println("\t\t\t\t\t\t" +"우어아아어어어아아어!!!");
							healthcnt += minfive;
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
							System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
							status();
						}
					}

					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"힝");
				}
			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+  "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void dume_student_morning() {

		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"아침에 무엇을 할 것인가요?");
			fun.timelate(1);
			System.out.print("\t\t\t\t\t\t" +"1.새벽이 밝았습니다 2.닭이 울기 시작합니다 3.씻고 하루를 준비하죠 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"눈을 떠야됩니다");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"하지만 눈은 떠지지 않고.....");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"새벽일찍부터 일을하니 너무 힘들어...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				
				System.out.println("\t\t\t\t\t\t" +"꼬끼옹ㅇ옹ㅇㅇㅇ옹ㅇ오오옹");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"망할 닭새기....");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"닭소리를 들으며 일어나는거야말로 건강을 챙기는 길!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"물을 틀었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"보일러가 고장나 냉수만 나온다");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"쏴아아아ㅏ아");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"뜨뜻한 물로 개운하게 씻었다!");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"헹");
			}
		}

	}

	public void dume_student_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"점심에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1.점심나가서먹기 2.점심시켜서먹기 3.점심만들어먹기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"시골짜장이야말로 진짜 맛이지");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"가게를 잘못 들어갔다..망했다");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"모두가 짜장을 시킬때 나는 짬뽕을 시킨다!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"성공했다!!!!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");

					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"강원도는 감자래요");
				fun.timelate(1);
				if (rancnt == 0) {

					System.out.println("\t\t\t\t\t\t" +"감자전을 시켜먹었다. 아이맛있엉");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"요즘감자가 철이아니야..");
					fun.timelate(1);
					healthcnt += minfive;

					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"아니근데 점심을 어떻게 만들어먹어?");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"우리는 편스토랑 쉐프 ㅎㅎ");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"뻘짓만 하다 점심을 먹지 못했다....");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"장난 멈춰!");
			}
		}

	}

	public int dume_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"밤에는 무엇을 할고야?");
				System.out.print("\t\t\t\t\t\t" +"1.잠자기 2.술먹기 3.넷플릭스 보기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();
					break;
				} else if (choice.equals("2")) {
					alcol_cnt++;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221줄
								+"\t\t\t\t\t\t" + "\r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
								+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
								+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
								+"\t\t\t\t\t\t" + "               =..........                        \r\n"
								+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
								+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
								+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
								+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
								+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
								+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
								+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
								+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
								+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
								+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
								+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
								+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
								+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
								+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
								+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
								+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
								+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
								+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
								+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
								+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
								+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
								+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
								+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
								+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
								+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
								+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
								+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
								+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
								+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
								+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
								+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
								+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
								+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
								+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
								+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "                                                  \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"옆집 아저씨가 장닭을 잡아오셨다");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"백숙에는 소주지 히힣힣히");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("\r\n"   // 1065번째 줄
					            + "\t\t\t\t\t\t" + "\r\n"
					            + "\t\t\t\t\t\t" + "                 ;$$$$~                ~\r\n"
					            + "\t\t\t\t\t\t" +"               ,$     ,$, .             \r\n"
					            + "\t\t\t\t\t\t" +"         ~$-~$*=        =~--~$-         \r\n"
					            + "\t\t\t\t\t\t" +"       :!     ,               *-        \r\n"
					            + "\t\t\t\t\t\t" +"       !                       $        \r\n"
					            + "\t\t\t\t\t\t" +"      ;                        !.       \r\n"
					            + "\t\t\t\t\t\t" +"      $                        ;.      .\r\n"
					            + "\t\t\t\t\t\t" +"      =                        $       ;\r\n"
					            + "\t\t\t\t\t\t" +"      ;                       ;:       .\r\n"
					            + "\t\t\t\t\t\t" +"       =        *      .$$;::$-        ~\r\n"
					            + "\t\t\t\t\t\t" +"       -$     .$*$.   .$    .$         ~\r\n"
					            + "\t\t\t\t\t\t" +"        .$$==$!   $== =     .$          \r\n"
					            + "\t\t\t\t\t\t" +"         *                  .$;.        \r\n"
					            + "\t\t\t\t\t\t" +"         *                   ,.!=       \r\n"
					            + "\t\t\t\t\t\t" +"         *  .*-   ;*    *=      .=      \r\n"
					            + "\t\t\t\t\t\t" +"         *  ,.    ;     :    $=. ;.     \r\n"
					            + "\t\t\t\t\t\t" +"         *  -     ;     :    $ $  =     \r\n"
					            + "\t\t\t\t\t\t" +"         =  ,     =     :    $ ,, $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     -    $ ,! $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     ,    $ -, $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     .   .$ $  $     \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .   ,$=, ~;     \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .   ,=.  $      \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .       $       \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .     :$.       \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     .   -$;         \r\n"
					            + "\t\t\t\t\t\t" +"         $        =     .   -=          \r\n"
					            + "\t\t\t\t\t\t" +"        *;  -     =     .   ,$          \r\n"
					            + "\t\t\t\t\t\t" +"        $         $,-   =.   =          \r\n"
					            + "\t\t\t\t\t\t" +"       .$                    =          \r\n"
					            + "\t\t\t\t\t\t" +"        $                    $          \r\n"
					            + "\t\t\t\t\t\t" +"        *~                  $-          \r\n"
					            + "\t\t\t\t\t\t" +"         ; ;.            ~-;            \r\n"
					            + "\t\t\t\t\t\t" +"            ==$=-    ~=$=!              \r\n"
					            + "\t\t\t\t\t\t" +"                .,,,.                   \r\n"
					            + "\t\t\t\t\t\t" +"");
						System.out.println("\t\t\t\t\t\t" +"친구집으로 술을 먹으러 갔다");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
							defend_vir += five;
							System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
							status();
						} else {
							gorani = 1;
							break;
						}
					}
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"이것이 강원도의 유일한 낙일까...");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"하나만 더보고 자야지");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"오늘은 볼게 별로 없네..");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"일찍 자야지");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"다메다메 다메요");
				}

			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void dume_nurse_morning() { // 두메 간호사 아침
		only_nur();
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "아침에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" + "1. 밥 먹고 출근하기 2. 출근하기 3. 10분 더 자고 지각하기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "다이어트 중인데 너무 많이 먹어버렸다..");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112번째 줄
							+"\t\t\t\t\t\t" + "\r\n" + "                               *!                 \r\n"
							+"\t\t\t\t\t\t" + "                              !~!           -     \r\n"
							+"\t\t\t\t\t\t" + "                             *-~!         ,;~     \r\n"
							+"\t\t\t\t\t\t" + "                            ~,~~!   ~=!~,..,-     \r\n"
							+"\t\t\t\t\t\t" + "        ~-*=.      =..~=.   ;,~:!  !,,,,,,,,~     \r\n"
							+"\t\t\t\t\t\t" + "         :   ~-    -     :  -,;;; !,,,,,,,,,!     \r\n"
							+"\t\t\t\t\t\t" + "         .;    ;-:;;;-    -.~,~**.~-~~~~,,,-!     \r\n"
							+"\t\t\t\t\t\t" + "           ;  ;-   .,,.    :!-=,,~*:;;*,,,-~,     \r\n"
							+"\t\t\t\t\t\t" + "           *~-   *----~;*   $:!*-~::~,,,,~~$      \r\n"
							+"\t\t\t\t\t\t" + "         .:-~,  :,------~!  . :~~*;~~~~~~~!.      \r\n"
							+"\t\t\t\t\t\t" + "         !--~$ !.-------~~*    ,:,!*;::::!        \r\n"
							+"\t\t\t\t\t\t" + "        :---~$;.,--------~:~    .~,; !**          \r\n"
							+"\t\t\t\t\t\t" + "        $.$~~*:.---------~:=     .-,=             \r\n"
							+"\t\t\t\t\t\t" + "        ; =$:.,.-=!~--:=*~~:      !,--            \r\n"
							+"\t\t\t\t\t\t" + " -,~!.  ; =:=,~##-       .;!.     -,,!            \r\n"
							+"\t\t\t\t\t\t" + " ~...**-! *$ ;#$#:         -.      :,--           \r\n"
							+"\t\t\t\t\t\t" + ",.....:= $:   ###,         *       *,,=.          \r\n"
							+"\t\t\t\t\t\t" + "*......;; :   $##         ..       :,,!~.         \r\n"
							+"\t\t\t\t\t\t" + "; ......;* :  ~$.         !        ~,,! *         \r\n"
							+"\t\t\t\t\t\t" + "--:,*....-- ;  ;        .;         ~,,;  ~        \r\n"
							+"\t\t\t\t\t\t" + ",:*,;*...;,  *  .;    .$           ~,,:  ;        \r\n"
							+"\t\t\t\t\t\t" + ",;*.!!~..,.;  .    ,,.             ~,,;   ~       \r\n"
							+"\t\t\t\t\t\t" + "-!! !!*...;-                       ~,,;   :       \r\n"
							+"\t\t\t\t\t\t" + ";;*.*!*...*                        !,-!   .  ~:.  \r\n"
							+"\t\t\t\t\t\t" + "*....;....-                        !,~!    .   ,  \r\n"
							+"\t\t\t\t\t\t" + " ~.......;                         :~~;    ;-,$ ~*\r\n"
							+"\t\t\t\t\t\t" + " -:...,-!.                        :~~:.    ~   !--\r\n"
							+"\t\t\t\t\t\t" + "   :=!!,                          !~~*     ~~,.-  \r\n"
							+"\t\t\t\t\t\t" + "     !                            :~:.    ..      \r\n"
							+"\t\t\t\t\t\t" + "      .;               .         =~~=     ~       \r\n"
							+"\t\t\t\t\t\t" + "        :~             ~        .:~*      !       \r\n"
							+"\t\t\t\t\t\t" + "          ;~           *       ,=;*      ,        \r\n"
							+"\t\t\t\t\t\t" + "            .=.        $      -!;*.      ;        \r\n"
							+"\t\t\t\t\t\t" + "              .!*=;,   ***=,  $;*!      *         \r\n"
							+"\t\t\t\t\t\t" + "               ;;!**.,,=;;;!!;~~~$**=. !          \r\n"
							+"\t\t\t\t\t\t" + "               ;;!*:   :;;;!**   =***=-           \r\n"
							+"\t\t\t\t\t\t" + "               .,.     ,!!!*!.   $***;            \r\n" + "");
					System.out.println("\t\t\t\t\t\t" + "돼지새기 얼마나 먹는거야!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "역시 아침은 든든하게 먹어야지!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "         --                         ,             \r\n"
							+"\t\t\t\t\t\t" + "        ,#$*,               *;.:;-.!;             \r\n"
							+"\t\t\t\t\t\t" + "         :$@$,              @@$@@#$@-             \r\n"
							+"\t\t\t\t\t\t" + "           !@@              #@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            *@*             @@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            .#@             @@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@             *@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@           .:*@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@          :=@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@        .!@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       .=@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       ;@@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@      -@@@@@@@@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@      #@@@@@@@@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@     ~@@@@@@@@@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "             #@,    $@@@@@@@@@@@@@@*              \r\n"
							+"\t\t\t\t\t\t" + "             :@=   .#@@@@@@@@@@@@@@               \r\n"
							+"\t\t\t\t\t\t" + "              @#:  :@@@@@@@@@@@@@@-.              \r\n"
							+"\t\t\t\t\t\t" + "              ,#@!-=@@@@@@@@@@@@@@@@~             \r\n"
							+"\t\t\t\t\t\t" + "               -*@@@@@@@@@@@@@@@@@@@*             \r\n"
							+"\t\t\t\t\t\t" + "                .~::::::::::::::::::,             \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+ "");    
					System.out.println("\t\t\t\t\t\t" + "출근하는 길에 귀여운 고양이를 봤다!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + ten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "피곤해 ㅠㅠ 출근하기 싫어");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "10분 더 잔다는게 2시간 더 자버렸다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "부재중 15통... 온 몸에 식은땀이 흐른다...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "지각을 했는데 아무도 눈치채지 못했다!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "10분 더 자서 피로가 풀렸다");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "힝");
			}
		}

	}

	public void dume_nurse_ohu() { // 두메 간호사 오후

		while (true) {
			System.out.println("\t\t\t\t\t\t" + "점심에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" + "1. 밥먹기 2. 낮잠자기 3. 마을회관에서 수다떨기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "두메산골 최고의 맛집에서 밥을 먹었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "든든해서 기분이 좋다!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "마을회관에 잔치가 있어서 거기서 점심을 먹었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "마을 어르신들이 막걸리르ㄹ 너무 많이 주셔ㅅ서ㄴ취해띠..");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "너무피곤해~ 밥은 스킵한다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "zzZZ~ 음 개운하다!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "낮잠 자서 개운하긴한데 너무 배고파서 힘이 빠진다...");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "마을 어르신들한테 이쁨받는다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "용돈도 쥐어주신다 기분 최고~");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + ten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "마을 어르신들한테 결혼은 언제해? 라떼는 말야 콤보를 맞았다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "마을회관에서 도망쳤다!");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" + "면역력이 " + minten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "장난 멈춰!");
			}
		}

	}

	public int dume_nurse_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" + "밤에는 무엇을 할고야?");
				System.out.print("\t\t\t\t\t\t" + "1.잠자기 2.술먹기 3.넷플릭스보기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					sleep();

					if (rancnt == 0) {

						System.out.println("\t\t\t\t\t\t" + "간만에 푹 잤다");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "아이 개운혀유우~");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "보일러가 고장났나 방이 너무 춥다");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "오들오들 떨면서 잤다 감기 걸렸나..?");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);

					if (rancnt == 0) {
						System.out.println("\r\n"   // 1065번째 줄
					            + "\t\t\t\t\t\t" + "\r\n"
					            + "\t\t\t\t\t\t" + "                 ;$$$$~                ~\r\n"
					            + "\t\t\t\t\t\t" +"               ,$     ,$, .             \r\n"
					            + "\t\t\t\t\t\t" +"         ~$-~$*=        =~--~$-         \r\n"
					            + "\t\t\t\t\t\t" +"       :!     ,               *-        \r\n"
					            + "\t\t\t\t\t\t" +"       !                       $        \r\n"
					            + "\t\t\t\t\t\t" +"      ;                        !.       \r\n"
					            + "\t\t\t\t\t\t" +"      $                        ;.      .\r\n"
					            + "\t\t\t\t\t\t" +"      =                        $       ;\r\n"
					            + "\t\t\t\t\t\t" +"      ;                       ;:       .\r\n"
					            + "\t\t\t\t\t\t" +"       =        *      .$$;::$-        ~\r\n"
					            + "\t\t\t\t\t\t" +"       -$     .$*$.   .$    .$         ~\r\n"
					            + "\t\t\t\t\t\t" +"        .$$==$!   $== =     .$          \r\n"
					            + "\t\t\t\t\t\t" +"         *                  .$;.        \r\n"
					            + "\t\t\t\t\t\t" +"         *                   ,.!=       \r\n"
					            + "\t\t\t\t\t\t" +"         *  .*-   ;*    *=      .=      \r\n"
					            + "\t\t\t\t\t\t" +"         *  ,.    ;     :    $=. ;.     \r\n"
					            + "\t\t\t\t\t\t" +"         *  -     ;     :    $ $  =     \r\n"
					            + "\t\t\t\t\t\t" +"         =  ,     =     :    $ ,, $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     -    $ ,! $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     ,    $ -, $     \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     .   .$ $  $     \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .   ,$=, ~;     \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .   ,=.  $      \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .       $       \r\n"
					            + "\t\t\t\t\t\t" +"         $  -     =     .     :$.       \r\n"
					            + "\t\t\t\t\t\t" +"         =  -     =     .   -$;         \r\n"
					            + "\t\t\t\t\t\t" +"         $        =     .   -=          \r\n"
					            + "\t\t\t\t\t\t" +"        *;  -     =     .   ,$          \r\n"
					            + "\t\t\t\t\t\t" +"        $         $,-   =.   =          \r\n"
					            + "\t\t\t\t\t\t" +"       .$                    =          \r\n"
					            + "\t\t\t\t\t\t" +"        $                    $          \r\n"
					            + "\t\t\t\t\t\t" +"        *~                  $-          \r\n"
					            + "\t\t\t\t\t\t" +"         ; ;.            ~-;            \r\n"
					            + "\t\t\t\t\t\t" +"            ==$=-    ~=$=!              \r\n"
					            + "\t\t\t\t\t\t" +"                .,,,.                   \r\n"
					            + "\t\t\t\t\t\t" +"");
						System.out.println("\t\t\t\t\t\t" + "역시 알코올은 영원한 친구");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "소주로 몸과 마음을 소독했다");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + ten + "증가!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "음... 여긴 어디지..?");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 1) {
							System.out.println("\t\t\t\t\t\t" + "내가.. 집에 어떻게 들어왔더라...?");
							fun.timelate(1);
							System.out.println("\r\n"   // 1065번째 줄
						            + "\t\t\t\t\t\t" + "\r\n"
						            + "\t\t\t\t\t\t" + "                 ;$$$$~                ~\r\n"
						            + "\t\t\t\t\t\t" +"               ,$     ,$, .             \r\n"
						            + "\t\t\t\t\t\t" +"         ~$-~$*=        =~--~$-         \r\n"
						            + "\t\t\t\t\t\t" +"       :!     ,               *-        \r\n"
						            + "\t\t\t\t\t\t" +"       !                       $        \r\n"
						            + "\t\t\t\t\t\t" +"      ;                        !.       \r\n"
						            + "\t\t\t\t\t\t" +"      $                        ;.      .\r\n"
						            + "\t\t\t\t\t\t" +"      =                        $       ;\r\n"
						            + "\t\t\t\t\t\t" +"      ;                       ;:       .\r\n"
						            + "\t\t\t\t\t\t" +"       =        *      .$$;::$-        ~\r\n"
						            + "\t\t\t\t\t\t" +"       -$     .$*$.   .$    .$         ~\r\n"
						            + "\t\t\t\t\t\t" +"        .$$==$!   $== =     .$          \r\n"
						            + "\t\t\t\t\t\t" +"         *                  .$;.        \r\n"
						            + "\t\t\t\t\t\t" +"         *                   ,.!=       \r\n"
						            + "\t\t\t\t\t\t" +"         *  .*-   ;*    *=      .=      \r\n"
						            + "\t\t\t\t\t\t" +"         *  ,.    ;     :    $=. ;.     \r\n"
						            + "\t\t\t\t\t\t" +"         *  -     ;     :    $ $  =     \r\n"
						            + "\t\t\t\t\t\t" +"         =  ,     =     :    $ ,, $     \r\n"
						            + "\t\t\t\t\t\t" +"         =  -     =     -    $ ,! $     \r\n"
						            + "\t\t\t\t\t\t" +"         =  -     =     ,    $ -, $     \r\n"
						            + "\t\t\t\t\t\t" +"         =  -     =     .   .$ $  $     \r\n"
						            + "\t\t\t\t\t\t" +"         $  -     =     .   ,$=, ~;     \r\n"
						            + "\t\t\t\t\t\t" +"         $  -     =     .   ,=.  $      \r\n"
						            + "\t\t\t\t\t\t" +"         $  -     =     .       $       \r\n"
						            + "\t\t\t\t\t\t" +"         $  -     =     .     :$.       \r\n"
						            + "\t\t\t\t\t\t" +"         =  -     =     .   -$;         \r\n"
						            + "\t\t\t\t\t\t" +"         $        =     .   -=          \r\n"
						            + "\t\t\t\t\t\t" +"        *;  -     =     .   ,$          \r\n"
						            + "\t\t\t\t\t\t" +"        $         $,-   =.   =          \r\n"
						            + "\t\t\t\t\t\t" +"       .$                    =          \r\n"
						            + "\t\t\t\t\t\t" +"        $                    $          \r\n"
						            + "\t\t\t\t\t\t" +"        *~                  $-          \r\n"
						            + "\t\t\t\t\t\t" +"         ; ;.            ~-;            \r\n"
						            + "\t\t\t\t\t\t" +"            ==$=-    ~=$=!              \r\n"
						            + "\t\t\t\t\t\t" +"                .,,,.                   \r\n"
						            + "\t\t\t\t\t\t" +"");
							System.out.println("\t\t\t\t\t\t" + "술을 너무 마셔서 머리가 깨질 것 같다");
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" + "체력이 " + minfive + "증가!");
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" + "면역력이 " + minfive + "증가!");
							status();
						} else {
							System.out.println("\t\t\t\t\t\t" +"저건... 고라니??");
							fun.timelate(1);
							gorani = 1;
						}
					}
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // 넷플릭스
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "아니 시간이 벌써..?");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "넷플릭스 보다가 늦잠이다!");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + minten + "증가!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "면역력이 " + five + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // 넷플릭스
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "적당한 넷플릭스는 인생에 도움이 된다!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" + "체력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "다메다메 다메요");
				}

			}
			if (gorani == 1) {
				end.gorani();
				endcnt = 1;
			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" + "코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nor_student_morning() {
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"아침에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1.일어나기 2.늦잠자기 3.밥먹기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"일단 일어나고 생각해보자");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"오! 늘은 원격수업!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"교수님의 기습휴강~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"어림도없지 첫수업 9시!");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"무지성 늦잠을 잤다..");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"그런데 첫수업이 3시? ㄱㅇㄷ!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"늦잠이 세상에서 제일 달지");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"부재중 30통??시ㅣㅂ ㅏㅏㅂㅇ ㅂㄹ ㅈ 돕ㅆ대아 다");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"늦잠을 잤다.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"교수님의 긴급휴강!!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"이거슨 전날에 먹고 남긴 찜닭??");
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"상했다....미각을잃었다...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"아침은 든든하게!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"헤헤");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"..............");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"이것은 ...진미(珍味)!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"헹");
			}
		}

	}

	public void nor_student_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"점심에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1. 학식먹기 2. 맛집탐방 3. 놀러가기 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"어제도 학식 오늘도 학식...");
					System.out.println("\t\t\t\t\t\t" +"그만 먹고 싶다 질려..");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"학식에 치킨이 나왔다!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"이맛에 학식 먹지~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"교내식당에서 확진자가 나왔다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"혹시.. 나도?");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"인기절정 맛집을 찾아갔다");
					System.out.println("\t\t\t\t\t\t" +"사람이 꽉찼다");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"파스타는 역시 이 맛이지~");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"열심히 걸어서 맛집을 찾아갔는데 문을 닫았다!");
					System.out.println("\t\t\t\t\t\t" +"지쳐 ㅠ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"공원에서 좋아하는 여자애랑 산책했다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"히히");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"pc방에서 친구들과 게임을 했다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"역시 롤은 질병게임이다");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"코인노래방가서 노래실력을 뽐냈다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"이유는 모르지만 체력감소 ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"장난 멈춰!");
			}
		}
	}

	public int nor_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"밤에는 무엇을 할고야?");
				System.out.print("\t\t\t\t\t\t" +"1.술마시기 2.클럽가기 3.과제하기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					alcol();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"과제하느라 밤샜다..");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"과제 해야지..zzZZ~");
						System.out.println("\t\t\t\t\t\t" +"과제 하다가 잠 들었다 망했다.");
						fun.timelate(1);
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
						status();
					}

					else {
						System.out.println("\t\t\t\t\t\t" +"좋아하는 여자애가 과제 대신 해달라고 했다");
						System.out.println("\t\t\t\t\t\t" +"과제 2개 하느라 밤샜다");
						fun.timelate(1);
						System.out.print("\t\t\t\t\t\t" +"헤헤.. 그래도 행복해...");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"다메다메 다메요");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void nor_sport_morning() {
//		end.test();
		omi_change();
		da_u_hang();
		only_hel();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"아침에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1.아침먹기 2.유산소 3.단백질 쉐이크 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"식단은 운동의 일부!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112번째 줄
							+"\t\t\t\t\t\t" + "\r\n" + "                               *!                 \r\n"
							+"\t\t\t\t\t\t" + "                              !~!           -     \r\n"
							+"\t\t\t\t\t\t" + "                             *-~!         ,;~     \r\n"
							+"\t\t\t\t\t\t" + "                            ~,~~!   ~=!~,..,-     \r\n"
							+"\t\t\t\t\t\t" + "        ~-*=.      =..~=.   ;,~:!  !,,,,,,,,~     \r\n"
							+"\t\t\t\t\t\t" + "         :   ~-    -     :  -,;;; !,,,,,,,,,!     \r\n"
							+"\t\t\t\t\t\t" + "         .;    ;-:;;;-    -.~,~**.~-~~~~,,,-!     \r\n"
							+"\t\t\t\t\t\t" + "           ;  ;-   .,,.    :!-=,,~*:;;*,,,-~,     \r\n"
							+"\t\t\t\t\t\t" + "           *~-   *----~;*   $:!*-~::~,,,,~~$      \r\n"
							+"\t\t\t\t\t\t" + "         .:-~,  :,------~!  . :~~*;~~~~~~~!.      \r\n"
							+"\t\t\t\t\t\t" + "         !--~$ !.-------~~*    ,:,!*;::::!        \r\n"
							+"\t\t\t\t\t\t" + "        :---~$;.,--------~:~    .~,; !**          \r\n"
							+"\t\t\t\t\t\t" + "        $.$~~*:.---------~:=     .-,=             \r\n"
							+"\t\t\t\t\t\t" + "        ; =$:.,.-=!~--:=*~~:      !,--            \r\n"
							+"\t\t\t\t\t\t" + " -,~!.  ; =:=,~##-       .;!.     -,,!            \r\n"
							+"\t\t\t\t\t\t" + " ~...**-! *$ ;#$#:         -.      :,--           \r\n"
							+"\t\t\t\t\t\t" + ",.....:= $:   ###,         *       *,,=.          \r\n"
							+"\t\t\t\t\t\t" + "*......;; :   $##         ..       :,,!~.         \r\n"
							+"\t\t\t\t\t\t" + "; ......;* :  ~$.         !        ~,,! *         \r\n"
							+"\t\t\t\t\t\t" + "--:,*....-- ;  ;        .;         ~,,;  ~        \r\n"
							+"\t\t\t\t\t\t" + ",:*,;*...;,  *  .;    .$           ~,,:  ;        \r\n"
							+"\t\t\t\t\t\t" + ",;*.!!~..,.;  .    ,,.             ~,,;   ~       \r\n"
							+"\t\t\t\t\t\t" + "-!! !!*...;-                       ~,,;   :       \r\n"
							+"\t\t\t\t\t\t" + ";;*.*!*...*                        !,-!   .  ~:.  \r\n"
							+"\t\t\t\t\t\t" + "*....;....-                        !,~!    .   ,  \r\n"
							+"\t\t\t\t\t\t" + " ~.......;                         :~~;    ;-,$ ~*\r\n"
							+"\t\t\t\t\t\t" + " -:...,-!.                        :~~:.    ~   !--\r\n"
							+"\t\t\t\t\t\t" + "   :=!!,                          !~~*     ~~,.-  \r\n"
							+"\t\t\t\t\t\t" + "     !                            :~:.    ..      \r\n"
							+"\t\t\t\t\t\t" + "      .;               .         =~~=     ~       \r\n"
							+"\t\t\t\t\t\t" + "        :~             ~        .:~*      !       \r\n"
							+"\t\t\t\t\t\t" + "          ;~           *       ,=;*      ,        \r\n"
							+"\t\t\t\t\t\t" + "            .=.        $      -!;*.      ;        \r\n"
							+"\t\t\t\t\t\t" + "              .!*=;,   ***=,  $;*!      *         \r\n"
							+"\t\t\t\t\t\t" + "               ;;!**.,,=;;;!!;~~~$**=. !          \r\n"
							+"\t\t\t\t\t\t" + "               ;;!*:   :;;;!**   =***=-           \r\n"
							+"\t\t\t\t\t\t" + "               .,.     ,!!!*!.   $***;            \r\n" + "");
					System.out.println("\t\t\t\t\t\t" +"돼지새기 얼마나 먹는거야!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"적당한 식단 적당한 운동!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"너무 적게 먹어 공복감이 느껴진다....");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"적당한 유산소는 운동의 시작이지!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"유산소만 해서 근손실이 일어났다..");
					healthcnt += minten;

					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"하지만 오늘은 미세먼지 최악.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"아니... 민트초코맛 단백질 쉐이크가 왜 있는거지?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"미각을 잃고 바이러스를 죽였따...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"든든한 쉐이크 뜨뜻하게 먹어야지!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"신제품 3가지맛 쉐이크를 먹었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"신선한 맛의 세계이다");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"힝");
			}
		}
	}

	public void nor_sport_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"점심에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1.점심먹기 2.중량 3.맨몸 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"든든하게 점심을 먹어야지");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"치팅데이라 기름진 간짜장을 비벼먹었다");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"기분이 좋아 감성근육이 증가했다!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"식단관리중이라 샐러드만 먹었다.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"벌레형이 여기서 왜...??");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                .=  :~                            \r\n"
							+"\t\t\t\t\t\t" + "                ,,.,.. =@,                        \r\n"
							+"\t\t\t\t\t\t" + "               $..,~..!-.-                        \r\n"
							+"\t\t\t\t\t\t" + "               =..........                        \r\n"
							+"\t\t\t\t\t\t" + "               !..-~::~,..                        \r\n"
							+"\t\t\t\t\t\t" + "                ;;-;!!;-;;                        \r\n"
							+"\t\t\t\t\t\t" + "               ;:~      ::;.                      \r\n"
							+"\t\t\t\t\t\t" + "              ;~          --:                     \r\n"
							+"\t\t\t\t\t\t" + "             ;~             :~                    \r\n"
							+"\t\t\t\t\t\t" + "            -,               ;~                   \r\n"
							+"\t\t\t\t\t\t" + "            ;~                *-                  \r\n"
							+"\t\t\t\t\t\t" + "        . :#;      :!.         *,                 \r\n"
							+"\t\t\t\t\t\t" + "       ~;  -~     ,@@~          ;-                \r\n"
							+"\t\t\t\t\t\t" + "       *  .,      .;;.           ;                \r\n"
							+"\t\t\t\t\t\t" + "       - ;-!                      :               \r\n"
							+"\t\t\t\t\t\t" + "         ~;!                      ~;              \r\n"
							+"\t\t\t\t\t\t" + "         .~!                       -~             \r\n"
							+"\t\t\t\t\t\t" + "         --~                       .,             \r\n"
							+"\t\t\t\t\t\t" + "         .-:                  ~.    ~;            \r\n"
							+"\t\t\t\t\t\t" + "        :.~!                   ~,    ::           \r\n"
							+"\t\t\t\t\t\t" + "         ,~*                    :,    :,          \r\n"
							+"\t\t\t\t\t\t" + "         ~!!                     :     -          \r\n"
							+"\t\t\t\t\t\t" + "          :-                     .;    ,;         \r\n"
							+"\t\t\t\t\t\t" + "           -~                     :     -*        \r\n"
							+"\t\t\t\t\t\t" + "           ,-       ~-                   ,=       \r\n"
							+"\t\t\t\t\t\t" + "            ;~       ,.           .*      .,      \r\n"
							+"\t\t\t\t\t\t" + "            --        .           .=      .$      \r\n"
							+"\t\t\t\t\t\t" + "             ;-        :,         .=      .=      \r\n"
							+"\t\t\t\t\t\t" + "              ~         *,.       ~:      ~~      \r\n"
							+"\t\t\t\t\t\t" + "              .-         -,:-    ::      ~;       \r\n"
							+"\t\t\t\t\t\t" + "               -~          :-,;!.:     :.~        \r\n"
							+"\t\t\t\t\t\t" + "                ,,-          .-~.    ,:~          \r\n"
							+"\t\t\t\t\t\t" + "                  -;                ::.           \r\n"
							+"\t\t\t\t\t\t" + "                   -!-            **              \r\n"
							+"\t\t\t\t\t\t" + "                     ;@,       ~#.                \r\n"
							+"\t\t\t\t\t\t" + "                     ;~ -=$##;.                   \r\n"
							+"\t\t\t\t\t\t" + "                    .;;   ,,;,                    \r\n"
							+"\t\t\t\t\t\t" + "                   .,~;.- :-*--                   \r\n"
							+"\t\t\t\t\t\t" + "                        ,  ., ,                   \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "                                                  \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"닭 가 슴 살 닭 가 슴 살 닭 가 슴 살");
					
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"가슴이 없는 닭의 저주를 받아 면역력 감소!!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"멋진 등 그것은 나의 로망");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"   // 398   // 517
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                                   .;=$=~         \r\n"
							+"\t\t\t\t\t\t" + "                                 :=$$:~~*#.       \r\n"
							+"\t\t\t\t\t\t" + "                                **.,=;   -$       \r\n"
							+"\t\t\t\t\t\t" + "       .~=#$$$=-               ~$    =-   :!      \r\n"
							+"\t\t\t\t\t\t" + "      .=~**   -#-             .=.    ,*    #~     \r\n"
							+"\t\t\t\t\t\t" + "     .#-  =!   .#             ,;      *;    !     \r\n"
							+"\t\t\t\t\t\t" + "     =~    !-   ~*            $-      .$    =     \r\n"
							+"\t\t\t\t\t\t" + "    .;     ,#    #-           @   .    =~   ;,    \r\n"
							+"\t\t\t\t\t\t" + "    $-      !;   ,;          ;=  ;!*.  -~   :*    \r\n"
							+"\t\t\t\t\t\t" + "   .#        $    =          !.  * ~!  ,:   .@    \r\n"
							+"\t\t\t\t\t\t" + "   ;*  -;-   =-   !.         !  :;  $  ,*    #    \r\n"
							+"\t\t\t\t\t\t" + "   !.  $,=,  ~~   ;~         *  #-  =. .$    #    \r\n"
							+"\t\t\t\t\t\t" + "   *  ~; ~;  ,~   -$  .,-~~~~$*===! *:  =    #.   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @. .$  -;   .@=$$$*;~---,.. *:;!  *    #,   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @   $  ,!    @               *;!  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,*  @   $. ,*    @              ,*!;  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,* .@   $, ,=    @       ..,.-;$#,=-  *    #-   \r\n"
							+"\t\t\t\t\t\t" + "  ,* .@   $. .=    @.,:!!!*=*$::=*. $   =    #.   \r\n"
							+"\t\t\t\t\t\t" + "  ,=  @   $  .=    @##*~     !. .! ,$  .$    #.   \r\n"
							+"\t\t\t\t\t\t" + "  .=  @   $  ,=    @         ;;  *~*-  ,*    #    \r\n"
							+"\t\t\t\t\t\t" + "   *  #~ ,#  ,!    @         ,@  .$;   ,~   ,@    \r\n"
							+"\t\t\t\t\t\t" + "   *  .! :~  ,;   .@          @.       -:   :;    \r\n"
							+"\t\t\t\t\t\t" + "   !-  !=*   -~   -#          :;       $-   !.    \r\n"
							+"\t\t\t\t\t\t" + "   ~$   ~    ~~   ;:           *      .$   .=     \r\n"
							+"\t\t\t\t\t\t" + "    @.       =-   !            ;*     *~   $-     \r\n"
							+"\t\t\t\t\t\t" + "    !:       $   .=             =;.  :$.,-=~      \r\n"
							+"\t\t\t\t\t\t" + "    .=      !;   *:             .;===@$$!~,       \r\n"
							+"\t\t\t\t\t\t" + "     :=    .=  .!$.                               \r\n"
							+"\t\t\t\t\t\t" + "      :=:,:=!!!=;                                 \r\n"
							+"\t\t\t\t\t\t" + "       ,=@@@$;.                                   \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"덤벨을 발에 떨어뜨려버렷다.....젠장");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"나의 목표는 언더아머 무리해서라도 운동이다!");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"진정한 맨몸은 등산이 아닐까?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"등산 끝나고 마시는 막걸리는 못참지 ㅋㅋ");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"무호흡(無呼吸) 100연 버피");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"과도한 운동은 오히러 득이 됩니다.");
					healthcnt += ten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"근처 호수공원에 간단히 조깅하러 갔다.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 줄
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "         --                         ,             \r\n"
							+"\t\t\t\t\t\t" + "        ,#$*,               *;.:;-.!;             \r\n"
							+"\t\t\t\t\t\t" + "         :$@$,              @@$@@#$@-             \r\n"
							+"\t\t\t\t\t\t" + "           !@@              #@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            *@*             @@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "            .#@             @@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@             *@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@           .:*@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@          :=@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@        .!@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       .=@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@       ;@@@@@@@@@@@@@#             \r\n"
							+"\t\t\t\t\t\t" + "             #@      -@@@@@@@@@@@@@@$             \r\n"
							+"\t\t\t\t\t\t" + "             #@      #@@@@@@@@@@@@@@;             \r\n"
							+"\t\t\t\t\t\t" + "             #@     ~@@@@@@@@@@@@@@@.             \r\n"
							+"\t\t\t\t\t\t" + "             #@,    $@@@@@@@@@@@@@@*              \r\n"
							+"\t\t\t\t\t\t" + "             :@=   .#@@@@@@@@@@@@@@               \r\n"
							+"\t\t\t\t\t\t" + "              @#:  :@@@@@@@@@@@@@@-.              \r\n"
							+"\t\t\t\t\t\t" + "              ,#@!-=@@@@@@@@@@@@@@@@~             \r\n"
							+"\t\t\t\t\t\t" + "               -*@@@@@@@@@@@@@@@@@@@*             \r\n"
							+"\t\t\t\t\t\t" + "                .~::::::::::::::::::,             \r\n"
							+ "");    
					System.out.println("\t\t\t\t\t\t" +"지나가는 길고양이한테 냥냥슬래시를 당했다");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"장난 멈춰!");
			}
		}

	}

	public int nor_sport_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"밤에는 무엇을 할고야?");
				System.out.print("\t\t\t\t\t\t" +"1.잠자기 2.클럽가기 3.종국이형 유튜브보기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					sleep();

					break;
				} else if (choice.equals("2")) {
					System.out.println("\t\t\t\t\t\t" +"헬창의 클럽은 '헬스'클럽이지");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"마스크를 깜빡하고 나왔다..!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"마스크를 가져오는 것도 운동이다");
						healthcnt += five;
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"내 목표는 언더아머");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"오늘 헬스장에 사람이많네");
						healthcnt += ten;
						defend_vir += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"친구한테 전화가왔다");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"하...하지만...루틴을 깰순 없는걸?");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						status();
					}

					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"유튭을보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"\"종국이형이랑 같이 받는 자극...짜릿해♡\"");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"유튭을보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"지나친 늦잠은 근손실을 유발합니다...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312줄
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"종국이형 유튜브는 인생에 도움이 된다!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"다메다메 다메요");
				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
//			if (alcol_cnt == 3) {
//				end.hidden_Alcohol();
//				endcnt = 1;
//			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");

			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public int backsin() {
		int endcnt = 0;
		System.out.println("\t\t\t\t\t\t" +"오늘은 백신 접종의 날이다");
		System.out.println(" ");
		fun.timelate(1);
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"무엇을 할까요?");
			System.out.print("\t\t\t\t\t\t" +"1.백신맞기 2.백신맞기 3.백신맞기 >>> ");
			choice = in.next();
			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					 System.out.println("\r\n"
					            +"\t\t\t\t\t\t" + "\r\n"
					            +"\t\t\t\t\t\t" + "                                                      .~              \r\n"
					            +"\t\t\t\t\t\t" + "                                                       =!             \r\n"
					            +"\t\t\t\t\t\t" + "                                                       .@;            \r\n"
					            +"\t\t\t\t\t\t" + "                                                       -@@!           \r\n"
					            +"\t\t\t\t\t\t" + "                                                      -#@@@;          \r\n"
					            +"\t\t\t\t\t\t" + "                                                     -#@@@@@!         \r\n"
					            +"\t\t\t\t\t\t" + "                                            ~=,     -#@@@@@@@;        \r\n"
					            +"\t\t\t\t\t\t" + "                                            $@#.   -#@@@@@@*-$!       \r\n"
					            +"\t\t\t\t\t\t" + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
					            +"\t\t\t\t\t\t" + "                                            =:#@#-#@@@@@@*.           \r\n"
					            +"\t\t\t\t\t\t" + "                                           $@@:#@#;@@@@@=.            \r\n"
					            +"\t\t\t\t\t\t" + "                                          =@@@@:#@#:@@@=.             \r\n"
					            +"\t\t\t\t\t\t" + "                                         -#@@@@@:$@#;@=.              \r\n"
					            +"\t\t\t\t\t\t" + "                                        *.-#@@@@@:$@#:.               \r\n"
					            +"\t\t\t\t\t\t" + "                                       $@#.-@@@@@@:#@#,               \r\n"
					            +"\t\t\t\t\t\t" + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
					            +"\t\t\t\t\t\t" + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
					            +"\t\t\t\t\t\t" + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
					            +"\t\t\t\t\t\t" + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
					            +"\t\t\t\t\t\t" + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
					            +"\t\t\t\t\t\t" + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
					            +"\t\t\t\t\t\t" + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
					            +"\t\t\t\t\t\t" + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
					            +"\t\t\t\t\t\t" + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
					            +"\t\t\t\t\t\t" + "                              :@@@@@@@@@@@@@@@*                       \r\n"
					            +"\t\t\t\t\t\t" + "                            $* :@@@@@@@@@@@@@!                        \r\n"
					            +"\t\t\t\t\t\t" + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
					            +"\t\t\t\t\t\t" + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
					            +"\t\t\t\t\t\t" + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
					            +"\t\t\t\t\t\t" + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
					            +"\t\t\t\t\t\t" + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
					            +"\t\t\t\t\t\t" + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
					            +"\t\t\t\t\t\t" + "                      :@@@@@@@@@@@@@@@*                               \r\n"
					            +"\t\t\t\t\t\t" + "                       !@@@@@@@@@@@@@!                                \r\n"
					            +"\t\t\t\t\t\t" + "                        *@@@@@@@@@@@*                                 \r\n"
					            +"\t\t\t\t\t\t" + "                       ,=*@@@@@@@@@!                                  \r\n"
					            +"\t\t\t\t\t\t" + "                       =@**@@@@@@@*                                   \r\n"
					            +"\t\t\t\t\t\t" + "                      ,@@@=*@@@@@;                                    \r\n"
					            +"\t\t\t\t\t\t" + "                      !@@@@*!@@@*                                     \r\n"
					            +"\t\t\t\t\t\t" + "                      $@@@$- !@!                                      \r\n"
					            +"\t\t\t\t\t\t" + "                     .=#=-                                            \r\n"
					            +"\t\t\t\t\t\t" + "                    .=,.                                              \r\n"
					            +"\t\t\t\t\t\t" + "                   .=,                                                \r\n"
					            +"\t\t\t\t\t\t" + "                  .=,                                                 \r\n"
					            +"\t\t\t\t\t\t" + "                 .=,                                                  \r\n"
					            +"\t\t\t\t\t\t" + "                .=,                                                   \r\n"
					            +"\t\t\t\t\t\t" + "               .=,                                                    \r\n"
					            +"\t\t\t\t\t\t" + "              .=,                                                     \r\n"
					            +"\t\t\t\t\t\t" + "             .=,                                                      \r\n"
					            +"\t\t\t\t\t\t" + "            ,=,                                                       \r\n"
					            +"\t\t\t\t\t\t" + "           .=,                                                        \r\n"
					            +"\t\t\t\t\t\t" + "           ,,                                                         \r\n"
					            +"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"내가 맞을 백신은 화이자");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"25퍼의 치사율을 가지고 있다.");
					fun.timelate(1);
					rancnt = ran.nextInt(4);
					if (rancnt == 0) {
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"조금 아프긴 했지만 며칠 누워있으니 괜찮아졌다!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가했다.");

					}
				} else if (rancnt == 1) {
					System.out.println("\r\n"
				            +"\t\t\t\t\t\t" + "\r\n"
				            +"\t\t\t\t\t\t" + "                                                      .~              \r\n"
				            +"\t\t\t\t\t\t" + "                                                       =!             \r\n"
				            +"\t\t\t\t\t\t" + "                                                       .@;            \r\n"
				            +"\t\t\t\t\t\t" + "                                                       -@@!           \r\n"
				            +"\t\t\t\t\t\t" + "                                                      -#@@@;          \r\n"
				            +"\t\t\t\t\t\t" + "                                                     -#@@@@@!         \r\n"
				            +"\t\t\t\t\t\t" + "                                            ~=,     -#@@@@@@@;        \r\n"
				            +"\t\t\t\t\t\t" + "                                            $@#.   -#@@@@@@*-$!       \r\n"
				            +"\t\t\t\t\t\t" + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
				            +"\t\t\t\t\t\t" + "                                            =:#@#-#@@@@@@*.           \r\n"
				            +"\t\t\t\t\t\t" + "                                           $@@:#@#;@@@@@=.            \r\n"
				            +"\t\t\t\t\t\t" + "                                          =@@@@:#@#:@@@=.             \r\n"
				            +"\t\t\t\t\t\t" + "                                         -#@@@@@:$@#;@=.              \r\n"
				            +"\t\t\t\t\t\t" + "                                        *.-#@@@@@:$@#:.               \r\n"
				            +"\t\t\t\t\t\t" + "                                       $@#.-@@@@@@:#@#,               \r\n"
				            +"\t\t\t\t\t\t" + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
				            +"\t\t\t\t\t\t" + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
				            +"\t\t\t\t\t\t" + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
				            +"\t\t\t\t\t\t" + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
				            +"\t\t\t\t\t\t" + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
				            +"\t\t\t\t\t\t" + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
				            +"\t\t\t\t\t\t" + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
				            +"\t\t\t\t\t\t" + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
				            +"\t\t\t\t\t\t" + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
				            +"\t\t\t\t\t\t" + "                              :@@@@@@@@@@@@@@@*                       \r\n"
				            +"\t\t\t\t\t\t" + "                            $* :@@@@@@@@@@@@@!                        \r\n"
				            +"\t\t\t\t\t\t" + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
				            +"\t\t\t\t\t\t" + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
				            +"\t\t\t\t\t\t" + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
				            +"\t\t\t\t\t\t" + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
				            +"\t\t\t\t\t\t" + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
				            +"\t\t\t\t\t\t" + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
				            +"\t\t\t\t\t\t" + "                      :@@@@@@@@@@@@@@@*                               \r\n"
				            +"\t\t\t\t\t\t" + "                       !@@@@@@@@@@@@@!                                \r\n"
				            +"\t\t\t\t\t\t" + "                        *@@@@@@@@@@@*                                 \r\n"
				            +"\t\t\t\t\t\t" + "                       ,=*@@@@@@@@@!                                  \r\n"
				            +"\t\t\t\t\t\t" + "                       =@**@@@@@@@*                                   \r\n"
				            +"\t\t\t\t\t\t" + "                      ,@@@=*@@@@@;                                    \r\n"
				            +"\t\t\t\t\t\t" + "                      !@@@@*!@@@*                                     \r\n"
				            +"\t\t\t\t\t\t" + "                      $@@@$- !@!                                      \r\n"
				            +"\t\t\t\t\t\t" + "                     .=#=-                                            \r\n"
				            +"\t\t\t\t\t\t" + "                    .=,.                                              \r\n"
				            +"\t\t\t\t\t\t" + "                   .=,                                                \r\n"
				            +"\t\t\t\t\t\t" + "                  .=,                                                 \r\n"
				            +"\t\t\t\t\t\t" + "                 .=,                                                  \r\n"
				            +"\t\t\t\t\t\t" + "                .=,                                                   \r\n"
				            +"\t\t\t\t\t\t" + "               .=,                                                    \r\n"
				            +"\t\t\t\t\t\t" + "              .=,                                                     \r\n"
				            +"\t\t\t\t\t\t" + "             .=,                                                      \r\n"
				            +"\t\t\t\t\t\t" + "            ,=,                                                       \r\n"
				            +"\t\t\t\t\t\t" + "           .=,                                                        \r\n"
				            +"\t\t\t\t\t\t" + "           ,,                                                         \r\n"
				            +"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"내가 맞을 백신은 모더나");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"33퍼의 치사율을 가지고 있다.");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"조금 아프긴 했지만 며칠 누워있으니 괜찮아졌다!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가했다.");

					}
				}
				if(endcnt!=1) {
				if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
					System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
							+"%의 확률로 코로나에 걸렸습니다" + "\n");
					if (omicron_cnt == 1) {
						end.bad_omicron_die();
					} else {
						end.bad_corona_end();
					}
					endcnt = 1;

				} else {
					System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
							+ "%의 확률을 피해 살아남았습니다." + "\n");
					fun.timelate(1);
				}
				}

				break;
			}

			else {
				System.out.println("\t\t\t\t\t\t" +"xxxxxxxxxxxx");
			}
		}

		return endcnt;
	}

	public void seoul_nur_mornig() {
		omi_change();
		da_u_hang();
		only_nur();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"아침에 무엇을 할 것인가요?");
			System.out.print("\t\t\t\t\t\t" +"1.출근하기 2.손씻고 출근하기 3.아침은 든든하게 >>> ");
			choice = in.next();
			if (choice.equals("1")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"출근은 건강에 해롭습니다");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");

					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"출근길에 선배를 만나 차를 타고 같이 왔습니다!");
					System.out.println("\t\t\t\t\t\t" +"기분이 좋아졌다!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이" + five + "증가!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    // 758
							+"\t\t\t\t\t\t" + "\r\n"
							+"\t\t\t\t\t\t" + "                ,-           .;;!-                \r\n"
							+"\t\t\t\t\t\t" + "             .-=!!*;.       :*!:;!;.              \r\n"
							+"\t\t\t\t\t\t" + "             !!,  .~!-     !:.    :!,            .\r\n"
							+"\t\t\t\t\t\t" + "           .=:      ,!.   ;;       ;;             \r\n"
							+"\t\t\t\t\t\t" + "          .!;       -,.,- -,        ;;            \r\n"
							+"\t\t\t\t\t\t" + "         .:!       .  ,.  ,..       .*-           \r\n"
							+"\t\t\t\t\t\t" + "         -=.       - -@: ,@:,        -!           \r\n"
							+"\t\t\t\t\t\t" + "         ;~        ,  ~.  ~,,         !,          \r\n"
							+"\t\t\t\t\t\t" + "        -;        .::.-~:.-:~         -*          \r\n"
							+"\t\t\t\t\t\t" + "        =-       .::::::::::::         *~         \r\n"
							+"\t\t\t\t\t\t" + "       :*        ,::::::::::::.        ::         \r\n"
							+"\t\t\t\t\t\t" + "       :.        ;:::::::::::::         *         \r\n"
							+"\t\t\t\t\t\t" + "      .*        ~::::::::::::;;-        ;         \r\n"
							+"\t\t\t\t\t\t" + "      ,-        ::;;:::::::::;::        ~-        \r\n"
							+"\t\t\t\t\t\t" + "      *,       ,:::*!::::::;;;::,       ~*        \r\n"
							+"\t\t\t\t\t\t" + "      *        ~::::*=;;;;;*::::-        *        \r\n"
							+"\t\t\t\t\t\t" + "     -*        ::::::;*!!!;:::::;        *        \r\n"
							+"\t\t\t\t\t\t" + "     ;,       !::::::::::::::::::,       =,       \r\n"
							+"\t\t\t\t\t\t" + "     ;       -::::::::::::::::::::       ::.      \r\n"
							+"\t\t\t\t\t\t" + "     ;       ;;:::::::::::::::::::-      .;       \r\n"
							+"\t\t\t\t\t\t" + "    .:      -*;;::::::::::::::::::~       :       \r\n"
							+"\t\t\t\t\t\t" + "    ,-      $*!!!:::::::::::::::;!=       :       \r\n"
							+"\t\t\t\t\t\t" + "    ,-     -==!!!!!;;;;::::;;;;!!!*~      ;       \r\n"
							+"\t\t\t\t\t\t" + "    .-     :=*$*!!!!!!!!!!!!!!!!!**$      :       \r\n"
							+"\t\t\t\t\t\t" + "    .-     ==!!*===!!!!!!!!!!!*!!!*=,     :       \r\n"
							+"\t\t\t\t\t\t" + "    .,     $$*!!!!*$#$==*=$$*!!!!!*=:     :       \r\n"
							+"\t\t\t\t\t\t" + "    ..    :=$**=!!!!!!!!!!!!!!!!!!*=~     ;       \r\n"
							+"\t\t\t\t\t\t" + "    .     $==!!!$$!!!!!!!!!!!!**!!*=!     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,     $=$!!!!!===*********!!!!*==     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,     ===$!!!!!!!!!!!!!!!!!!!!*=$     ;       \r\n"
							+"\t\t\t\t\t\t" + "    ,    ,==$*===*!!!!!!!!!!!!!*!!*=$     :       \r\n"
							+"\t\t\t\t\t\t" + "    ,    ~==$*!!!=#=!!!!!!!!!=*!!!==$     ,       \r\n"
							+"\t\t\t\t\t\t" + "    .    ~====!!!!!*====*==*!!!!!!==$             \r\n"
							+"\t\t\t\t\t\t" + "    .    ~===$$!!!!!!!!!!!!!!!!!!!==$    .        \r\n"
							+"\t\t\t\t\t\t" + "         ,====!===*!!!!!!!!!!!*!!*==$    -        \r\n"
							+"\t\t\t\t\t\t" + "     .    =====!!!=$$=**!**==!!!!===*    !        \r\n"
							+"\t\t\t\t\t\t" + "     .    $====*!!!!!****!!!!!!!*===;    :        \r\n"
							+"\t\t\t\t\t\t" + "     ,    $====*=$!!!!!!!!!!!!*!====:             \r\n"
							+"\t\t\t\t\t\t" + "    ..    *=====!!==*******!*!!!====~   .         \r\n"
							+"\t\t\t\t\t\t" + "    ..    ,=====*!!!!!***!!!!!!=====.   ,         \r\n"
							+"\t\t\t\t\t\t" + "           $=====**!!!!!!!!!!!*=====    .         \r\n"
							+"\t\t\t\t\t\t" + "           ;======*$=!!!!!!**!=====,              \r\n"
							+"\t\t\t\t\t\t" + "     .     :======!!!*===*!!!*=====     ,         \r\n"
							+"\t\t\t\t\t\t" + "     .      $======!!!!!!!!!*=====:               \r\n"
							+"\t\t\t\t\t\t" + "     .      ;======**!!!!!!!======,               \r\n"
							+"\t\t\t\t\t\t" + "      .      =======***=**!======:                \r\n"
							+"\t\t\t\t\t\t" + "             ~======$*!!!*======*                 \r\n"
							+"\t\t\t\t\t\t" + "             .$========*========,                 \r\n"
							+"\t\t\t\t\t\t" + "               *=======!$======:                  \r\n"
							+"\t\t\t\t\t\t" + "               ,$=====- ======~                   \r\n"
							+"\t\t\t\t\t\t" + "                 !!!*,   ;!!!.                    \r\n"
							+"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"세상에 화장실에서 바퀴벌레를 발견!");
					System.out.println("\t\t\t\t\t\t" +"나는 그만 정신을 잃어버렸다...");
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"건강을 챙겻따!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
					status();
				}

				break;

			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"전날 남긴 음식이 상한거 같다... 맛이 이상하다...");
					healthcnt -= ten;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
					status();
				}

				else {
					System.out.println("\t\t\t\t\t\t" +"아침은 역시 든든한 국밥이지!!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"다시골라조 뿌잉");
				fun.timelate(1);
			}
		}

	}

	public void seoul_nur_afternoon() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"점심엔 무엇을 할건가요?");
			rancnt = ran.nextInt(10);
			if (rancnt == 0) {
				fun.timelate(1);
				System.out.println("\t\t\t\t\t\t" +"하지만 밀려드는 환자에 의해 나는 환자를 보게 되었다.");
				fun.timelate(1);
				healthcnt += minten;
				System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
				status();
				break;
			} else {
				System.out.print("\t\t\t\t\t\t" +"1.밥먹기 2.낮잠자기 3.수다떨기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"밥을 맛있게 먹었다!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"밥을 급하게 먹다 체해버렸다...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"쪽잠이야말로 세계최고의 시간!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"늦잠을 자 수간호사님께 혼났다....");
						System.out.println("\t\t\t\t\t\t" +"정신적 타격이 생겼다");
						healthcnt += minfive;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"저년 남자친구가 에르메스를 선물해줬다네 참나");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"짝퉁이여라--(감성체력 감소)");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"시간가는줄 모르고 있었따! 소소한 행복");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"잉");
					fun.timelate(1);
				}
			}

		}

	}

	public int seoul_nur_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"밤에는 무엇을 할고야?");
//				rancnt = ran.nextInt(2);
//				if (rancnt == 0) {
//					fun.timelate(1);
//					System.out.println("그러나 오늘은 야근하는날 ★");
//					healthcnt += minten;
//					defend_vir += minfive;
//					System.out.println("체력이 " + minten + "증가!");
//					System.out.println("면역력이 " + minfive + "증가!");
//					status(healthcnt, defend_vir);
//					break;
//				} else {
				System.out.print("\t\t\t\t\t\t" +"1.잠자기 2.술먹기 3.유튜브보기 >>> ");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();

					break;
				} else if (choice.equals("2")) {
					alcol();
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312줄
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"유튭을보다 새볔 4시가되었다.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"하나만 더보고자야지");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"면역력이 " + minfive + "증가!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312줄
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"적당한 유튜브는 인생에 도움이 된다!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"다메다메 다메요");
				}

//				}

			}
			if (healthcnt <= 0) {
				end.bad_overwork();
				endcnt = 1;
			}
			if (healthcnt >= 150) {
				end.hidden_healcang();
				endcnt = 1;
			}
			if (alcol_cnt == 3) {
				end.hidden_Alcohol();
				endcnt = 1;
			}
			if (endcnt == 1) {
				break;
			}
			System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%의 확률로 코로나에 걸렸습니다" + "\n");
				if (omicron_cnt == 1) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%의 확률을 피해 살아남았습니다." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public int nurse_baksin() {
		int endcnt =0;
		System.out.println("\t\t\t\t\t\t" +"오늘은 백신 접종의 날이다");
		System.out.println(" ");
		fun.timelate(1);
		int cnt = 0;
		while (cnt == 0 || cnt == 1) {

			if (cnt == 0) {
				System.out.println("\t\t\t\t\t\t" +"출근했다!!");
				fun.timelate(1);
			}
			if (cnt == 1) {
				System.out.println("\t\t\t\t\t\t" +"밥을 먹고 왔다");
				fun.timelate(1);
			}
			System.out.println("\t\t\t\t\t\t" +"무엇을 할까?");
			System.out.print("\t\t\t\t\t\t" +"1.백신 놓아주기 2.백신 놀아주기 3.백신 놓아주기 >>> ");
			choice = in.next();
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				 System.out.println("\r\n"
				            +"\t\t\t\t\t\t" + "\r\n"
				            +"\t\t\t\t\t\t" + "                                                      .~              \r\n"
				            +"\t\t\t\t\t\t" + "                                                       =!             \r\n"
				            +"\t\t\t\t\t\t" + "                                                       .@;            \r\n"
				            +"\t\t\t\t\t\t" + "                                                       -@@!           \r\n"
				            +"\t\t\t\t\t\t" + "                                                      -#@@@;          \r\n"
				            +"\t\t\t\t\t\t" + "                                                     -#@@@@@!         \r\n"
				            +"\t\t\t\t\t\t" + "                                            ~=,     -#@@@@@@@;        \r\n"
				            +"\t\t\t\t\t\t" + "                                            $@#.   -#@@@@@@*-$!       \r\n"
				            +"\t\t\t\t\t\t" + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
				            +"\t\t\t\t\t\t" + "                                            =:#@#-#@@@@@@*.           \r\n"
				            +"\t\t\t\t\t\t" + "                                           $@@:#@#;@@@@@=.            \r\n"
				            +"\t\t\t\t\t\t" + "                                          =@@@@:#@#:@@@=.             \r\n"
				            +"\t\t\t\t\t\t" + "                                         -#@@@@@:$@#;@=.              \r\n"
				            +"\t\t\t\t\t\t" + "                                        *.-#@@@@@:$@#:.               \r\n"
				            +"\t\t\t\t\t\t" + "                                       $@#.-@@@@@@:#@#,               \r\n"
				            +"\t\t\t\t\t\t" + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
				            +"\t\t\t\t\t\t" + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
				            +"\t\t\t\t\t\t" + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
				            +"\t\t\t\t\t\t" + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
				            +"\t\t\t\t\t\t" + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
				            +"\t\t\t\t\t\t" + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
				            +"\t\t\t\t\t\t" + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
				            +"\t\t\t\t\t\t" + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
				            +"\t\t\t\t\t\t" + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
				            +"\t\t\t\t\t\t" + "                              :@@@@@@@@@@@@@@@*                       \r\n"
				            +"\t\t\t\t\t\t" + "                            $* :@@@@@@@@@@@@@!                        \r\n"
				            +"\t\t\t\t\t\t" + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
				            +"\t\t\t\t\t\t" + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
				            +"\t\t\t\t\t\t" + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
				            +"\t\t\t\t\t\t" + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
				            +"\t\t\t\t\t\t" + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
				            +"\t\t\t\t\t\t" + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
				            +"\t\t\t\t\t\t" + "                      :@@@@@@@@@@@@@@@*                               \r\n"
				            +"\t\t\t\t\t\t" + "                       !@@@@@@@@@@@@@!                                \r\n"
				            +"\t\t\t\t\t\t" + "                        *@@@@@@@@@@@*                                 \r\n"
				            +"\t\t\t\t\t\t" + "                       ,=*@@@@@@@@@!                                  \r\n"
				            +"\t\t\t\t\t\t" + "                       =@**@@@@@@@*                                   \r\n"
				            +"\t\t\t\t\t\t" + "                      ,@@@=*@@@@@;                                    \r\n"
				            +"\t\t\t\t\t\t" + "                      !@@@@*!@@@*                                     \r\n"
				            +"\t\t\t\t\t\t" + "                      $@@@$- !@!                                      \r\n"
				            +"\t\t\t\t\t\t" + "                     .=#=-                                            \r\n"
				            +"\t\t\t\t\t\t" + "                    .=,.                                              \r\n"
				            +"\t\t\t\t\t\t" + "                   .=,                                                \r\n"
				            +"\t\t\t\t\t\t" + "                  .=,                                                 \r\n"
				            +"\t\t\t\t\t\t" + "                 .=,                                                  \r\n"
				            +"\t\t\t\t\t\t" + "                .=,                                                   \r\n"
				            +"\t\t\t\t\t\t" + "               .=,                                                    \r\n"
				            +"\t\t\t\t\t\t" + "              .=,                                                     \r\n"
				            +"\t\t\t\t\t\t" + "             .=,                                                      \r\n"
				            +"\t\t\t\t\t\t" + "            ,=,                                                       \r\n"
				            +"\t\t\t\t\t\t" + "           .=,                                                        \r\n"
				            +"\t\t\t\t\t\t" + "           ,,                                                         \r\n"
				            +"\t\t\t\t\t\t" + "");
				System.out.println("\t\t\t\t\t\t" +"환자 폭주! 백신 환자가 너무 많습니다!!");
				healthcnt += minfive;
				System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
				status();
			} else {
				System.out.println("\t\t\t\t\t\t" +"오늘은 환자가 별로 안계신다 히히!");
				healthcnt += five;
				System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
				status();
			}
			cnt++;
		}
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"저녘이다...");
			fun.timelate(1);
			System.out.print("\t\t\t\t\t\t" +"1.백신 놓아주기 2.백신 놓아주기 3.술먹기 >>> ");
			choice = in.next();
			if (choice.equals("3")) {
				alcol();
				break;
			} else if (choice.equals("1") || choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					 System.out.println("\r\n"
					            +"\t\t\t\t\t\t" + "\r\n"
					            +"\t\t\t\t\t\t" + "                                                      .~              \r\n"
					            +"\t\t\t\t\t\t" + "                                                       =!             \r\n"
					            +"\t\t\t\t\t\t" + "                                                       .@;            \r\n"
					            +"\t\t\t\t\t\t" + "                                                       -@@!           \r\n"
					            +"\t\t\t\t\t\t" + "                                                      -#@@@;          \r\n"
					            +"\t\t\t\t\t\t" + "                                                     -#@@@@@!         \r\n"
					            +"\t\t\t\t\t\t" + "                                            ~=,     -#@@@@@@@;        \r\n"
					            +"\t\t\t\t\t\t" + "                                            $@#.   -#@@@@@@*-$!       \r\n"
					            +"\t\t\t\t\t\t" + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
					            +"\t\t\t\t\t\t" + "                                            =:#@#-#@@@@@@*.           \r\n"
					            +"\t\t\t\t\t\t" + "                                           $@@:#@#;@@@@@=.            \r\n"
					            +"\t\t\t\t\t\t" + "                                          =@@@@:#@#:@@@=.             \r\n"
					            +"\t\t\t\t\t\t" + "                                         -#@@@@@:$@#;@=.              \r\n"
					            +"\t\t\t\t\t\t" + "                                        *.-#@@@@@:$@#:.               \r\n"
					            +"\t\t\t\t\t\t" + "                                       $@#.-@@@@@@:#@#,               \r\n"
					            +"\t\t\t\t\t\t" + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
					            +"\t\t\t\t\t\t" + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
					            +"\t\t\t\t\t\t" + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
					            +"\t\t\t\t\t\t" + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
					            +"\t\t\t\t\t\t" + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
					            +"\t\t\t\t\t\t" + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
					            +"\t\t\t\t\t\t" + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
					            +"\t\t\t\t\t\t" + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
					            +"\t\t\t\t\t\t" + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
					            +"\t\t\t\t\t\t" + "                              :@@@@@@@@@@@@@@@*                       \r\n"
					            +"\t\t\t\t\t\t" + "                            $* :@@@@@@@@@@@@@!                        \r\n"
					            +"\t\t\t\t\t\t" + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
					            +"\t\t\t\t\t\t" + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
					            +"\t\t\t\t\t\t" + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
					            +"\t\t\t\t\t\t" + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
					            +"\t\t\t\t\t\t" + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
					            +"\t\t\t\t\t\t" + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
					            +"\t\t\t\t\t\t" + "                      :@@@@@@@@@@@@@@@*                               \r\n"
					            +"\t\t\t\t\t\t" + "                       !@@@@@@@@@@@@@!                                \r\n"
					            +"\t\t\t\t\t\t" + "                        *@@@@@@@@@@@*                                 \r\n"
					            +"\t\t\t\t\t\t" + "                       ,=*@@@@@@@@@!                                  \r\n"
					            +"\t\t\t\t\t\t" + "                       =@**@@@@@@@*                                   \r\n"
					            +"\t\t\t\t\t\t" + "                      ,@@@=*@@@@@;                                    \r\n"
					            +"\t\t\t\t\t\t" + "                      !@@@@*!@@@*                                     \r\n"
					            +"\t\t\t\t\t\t" + "                      $@@@$- !@!                                      \r\n"
					            +"\t\t\t\t\t\t" + "                     .=#=-                                            \r\n"
					            +"\t\t\t\t\t\t" + "                    .=,.                                              \r\n"
					            +"\t\t\t\t\t\t" + "                   .=,                                                \r\n"
					            +"\t\t\t\t\t\t" + "                  .=,                                                 \r\n"
					            +"\t\t\t\t\t\t" + "                 .=,                                                  \r\n"
					            +"\t\t\t\t\t\t" + "                .=,                                                   \r\n"
					            +"\t\t\t\t\t\t" + "               .=,                                                    \r\n"
					            +"\t\t\t\t\t\t" + "              .=,                                                     \r\n"
					            +"\t\t\t\t\t\t" + "             .=,                                                      \r\n"
					            +"\t\t\t\t\t\t" + "            ,=,                                                       \r\n"
					            +"\t\t\t\t\t\t" + "           .=,                                                        \r\n"
					            +"\t\t\t\t\t\t" + "           ,,                                                         \r\n"
					            +"\t\t\t\t\t\t" + "");
					System.out.println("\t\t\t\t\t\t" +"환자 폭주! 백신 환자가 너무 많습니다!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"오늘은 환자가 별로 안계신다 히히!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
					status();
				}
				System.out.print("\t\t\t\t\t\t" +"코로나 검사중..");
				for (int i = 0; i < 2; i++) {
					fun.timelate(1);
					System.out.print("..");
				}
				System.out.println(" ");
				if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
					System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
							+"%의 확률로 코로나에 걸렸습니다" + "\n");
					if (omicron_cnt == 1) {
						end.bad_omicron_die();
					} else {
						end.bad_corona_end();
					}
					endcnt = 1;

				} else {
					System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
							+ "%의 확률을 피해 살아남았습니다." + "\n");
					fun.timelate(1);
				}
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"응애 나 애기선택지 이건모르겟오 응애");
			}
		}
		return endcnt;
	}

	public void status() {

		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println("\t\t\t\t\t\t" +"체력 >> " + healthcnt);
		System.out.println("\t\t\t\t\t\t" +"감염 저항률 >> " + defend_vir);
		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println(" ");

		fun.timelate(1);

	}

	public void sleep() {
		rancnt = ran.nextInt(3);
		System.out.println("\t\t\t\t\t\t" +"잠을잤다");
		fun.timelate(1);
		if (rancnt == 0) {

			System.out.println("\t\t\t\t\t\t" +"꿀잠을 잤다");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"체력이 " + ten + "증가!");
			System.out.println("\t\t\t\t\t\t" +"면역력이 " + ten + "증가!");
			healthcnt += ten;
			defend_vir += ten;
			status();
		} else if (rancnt == 1) {
			System.out.println("\t\t\t\t\t\t" +"악몽을 꿧다");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"귀신이 정우성 신민아다...오...ㄱㅇㄷ");
			healthcnt += five;
			System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
			status();
		} else {
			System.out.println("\t\t\t\t\t\t" +"몸살이 났다");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"체력이 " + minten + "증가!");
			healthcnt += minten;
			defend_vir += ten;
			System.out.println("\t\t\t\t\t\t" +"면역력이 " + minten + "증가!");
			status();
		}

	}

	public void alcol() {
		alcol_cnt++;
		System.out.println("\t\t\t\t\t\t" +"술을먹는다?");
		rancnt = ran.nextInt(2);
		if (rancnt == 0) {
			System.out.println("\r\n"   // 1065번째 줄
		            + "\t\t\t\t\t\t" + "\r\n"
		            + "\t\t\t\t\t\t" + "                 ;$$$$~                ~\r\n"
		            + "\t\t\t\t\t\t" +"               ,$     ,$, .             \r\n"
		            + "\t\t\t\t\t\t" +"         ~$-~$*=        =~--~$-         \r\n"
		            + "\t\t\t\t\t\t" +"       :!     ,               *-        \r\n"
		            + "\t\t\t\t\t\t" +"       !                       $        \r\n"
		            + "\t\t\t\t\t\t" +"      ;                        !.       \r\n"
		            + "\t\t\t\t\t\t" +"      $                        ;.      .\r\n"
		            + "\t\t\t\t\t\t" +"      =                        $       ;\r\n"
		            + "\t\t\t\t\t\t" +"      ;                       ;:       .\r\n"
		            + "\t\t\t\t\t\t" +"       =        *      .$$;::$-        ~\r\n"
		            + "\t\t\t\t\t\t" +"       -$     .$*$.   .$    .$         ~\r\n"
		            + "\t\t\t\t\t\t" +"        .$$==$!   $== =     .$          \r\n"
		            + "\t\t\t\t\t\t" +"         *                  .$;.        \r\n"
		            + "\t\t\t\t\t\t" +"         *                   ,.!=       \r\n"
		            + "\t\t\t\t\t\t" +"         *  .*-   ;*    *=      .=      \r\n"
		            + "\t\t\t\t\t\t" +"         *  ,.    ;     :    $=. ;.     \r\n"
		            + "\t\t\t\t\t\t" +"         *  -     ;     :    $ $  =     \r\n"
		            + "\t\t\t\t\t\t" +"         =  ,     =     :    $ ,, $     \r\n"
		            + "\t\t\t\t\t\t" +"         =  -     =     -    $ ,! $     \r\n"
		            + "\t\t\t\t\t\t" +"         =  -     =     ,    $ -, $     \r\n"
		            + "\t\t\t\t\t\t" +"         =  -     =     .   .$ $  $     \r\n"
		            + "\t\t\t\t\t\t" +"         $  -     =     .   ,$=, ~;     \r\n"
		            + "\t\t\t\t\t\t" +"         $  -     =     .   ,=.  $      \r\n"
		            + "\t\t\t\t\t\t" +"         $  -     =     .       $       \r\n"
		            + "\t\t\t\t\t\t" +"         $  -     =     .     :$.       \r\n"
		            + "\t\t\t\t\t\t" +"         =  -     =     .   -$;         \r\n"
		            + "\t\t\t\t\t\t" +"         $        =     .   -=          \r\n"
		            + "\t\t\t\t\t\t" +"        *;  -     =     .   ,$          \r\n"
		            + "\t\t\t\t\t\t" +"        $         $,-   =.   =          \r\n"
		            + "\t\t\t\t\t\t" +"       .$                    =          \r\n"
		            + "\t\t\t\t\t\t" +"        $                    $          \r\n"
		            + "\t\t\t\t\t\t" +"        *~                  $-          \r\n"
		            + "\t\t\t\t\t\t" +"         ; ;.            ~-;            \r\n"
		            + "\t\t\t\t\t\t" +"            ==$=-    ~=$=!              \r\n"
		            + "\t\t\t\t\t\t" +"                .,,,.                   \r\n"
		            + "\t\t\t\t\t\t" +"");
			System.out.println("\t\t\t\t\t\t" +"몸과 마음을 알코올로 소독하였다.");
			healthcnt += five;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"체력이 " + five + "증가!");
			System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
			status();

		} else {
			System.out.println("\t\t\t\t\t\t" +"과도한 음주는 건강에 해롭지..");
			healthcnt += minfive;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"면역력이 " + five + "증가!");
			System.out.println("\t\t\t\t\t\t" +"체력이 " + minfive + "증가!");
			status();
		}
	}

	public double corona_persent(double defend_vir) {
//		double corona_persent = 0;
//		double corona_persent =100;
		if (defend_vir >= 100) {
			double corona_persent = 0;
			return corona_persent;
		}
//		else if (defend_vir <= 0) {
//			double corona_persent = 10;
//			return corona_persent;
//		}
		else {
			double corona_persent = 10 - (10 * (defend_vir / 100));
			return corona_persent;
		}
	}

}
