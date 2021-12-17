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
	String a = "¼öµµ";
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
		if (b.equals("Áö¹æ")) {
			return a = "Áö¹æ";
		} else if (b.equals("°­¿ø")) {
			return a = "°­¿ø";
		} else {
			return a = "¼öµµ";
		}

	}

	public void witch() {
		if (a.equals("Áö¹æ") && x == 0) {
			defend_vir += 15;
			x++;
		}
		if (a.equals("°­¿ø") && x == 0) {
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
			System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" +"1. ¾ÆÄ§¿îµ¿ 2. ¸¶À» »êÃ¥°¡±â 3. ¹ä¸Ô°í Ãâ±ÙÇÏ±â");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"¿îµ¿Àº °øº¹¿îµ¿ÀÌÁö!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¿îµ¿À¸·Î ÀÎÇÑ Ã¼·Â Áõ°¡! ");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"ºó¼Ó¿¡ ¹«¸®¸¦ Çß³ª...");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¼Ó ¾²·Á.... ");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"»êÃ¥À» °¡´Ù°¡ ¹ìÀ» ¸¶ÁÖÃÆ´Ù!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"°ÑÀº ±ÙÀ°ÀÌ¿©µµ ¼ÓÀº ¿©¸° ³ª...");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"½Ã°ñÀÇ Á¤±â¸¦ ¹Ş¾Ò´Ù!!!");
					fun.timelate(1);
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿£ ´ß°¡½¿»ìÀÌÁö!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"´ß°¡½¿»ìÀ» ¸Ô¾î Ã¼·Â°ú ¸é¿ª·Â Áõ°¡!");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"³Ãµ¿½Ç¿¡ ´ß°¡½¿»ìÀÌ ´Ù ¶³¾îÁ³´Ù....");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +".........");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Èş");
			}
		}

	}

	public void dume_sport_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Á¡½É¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" +" 1. ¹ä? ¾î¸²µµ¾øÁö ¿îµ¿ 2. ¹ä ¸Ô°í ¿îµ¿ 3. ÈŞ½Ä!");
			choice = in.next();
			if (choice.equals("1")) {

				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"½Ã°ñÀº »ê½ºÁüÀÌ ÃÖ°íÁö!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¿îµ¿À¸·Î Ã¼·Â");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"¿îµ¿À» °¡·Á°í ÇßÁö¸¸ »ó»ç¿Í ½Ä´çÀ» °¡°Ô µÇ¾ú´Ù.");
					fun.timelate(1);
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"´Ü¹éÁúÀº Ã¬±â°í ¿îµ¿ÇØ¾ßÁö");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"À¾.. ¹èºÒ·¯¼­ ¿îµ¿ÀÌ Á¦´ë·Î ¾ÈµÅ");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"¿ª½Ã µçµçÇÏ°Ô ¸Ô°í ¿îµ¿ÇØ¾ßÁö!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"±Ù¼ºÀå Çß´Ù");
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"zzZZ~ À½ °³¿îÇÏ´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"À½..? ±Ù¼Õ½ÇÀÌ ³µÀİ¾Æ? ¾ÈµÅ¤À¤À¤À¤À!");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"¿ª½Ã ¿îµ¿µµ ½¬¾ö ½¬¾ö ÇØ¾ßÁö");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"½¬¾ú´õ´Ï °³¿îÇÏ´Ù");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Èş");
			}
		}

	}

	public int dume_sport_night(int endcnt) {

		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"Àú³á¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
				System.out.println("\t\t\t\t\t\t" +" 1. Àú³á¿îµ¿ 2. Áı°¡¼­ ÀÚ±â 3. µî»ê°¡±â");
				choice = in.next();
				if (choice.equals("1")) {

					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"½Ã°ñÀº »ê½ºÁüÀÌ ÃÖ°íÁö!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"¿îµ¿À¸·Î Ã¼·Â");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"ÀÚ±âÀü¿¡ ¿îµ¿ÇÏ´Â°Ô ÃÖ°í!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÇÏÁö¸¸ ÀÇÇĞÀûÀ¸·Î ÀÚ±âÀü¿¡´Â ¿îµ¿ÀÌ ¾ÈÁÁ... ");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"½Ã°ñ¹ö½º¸¦ ³õÃÄ¼­ Áı±îÁö ¶Ù¾î°¬´Ù!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"Áı±îÁö ¶Ù¾î°¡¼­ Èûµé¾î ÁöÃÄ ¾²·¯Á³´Ù.");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"°£¸¸¿¡ Áı¿¡°¡¼­ Ç« ½¬¾ú´Ù.");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÁıÀÌ ÃÖ°í¾ß!");
						defend_vir += ten;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"µî»êµµ ¿îµ¿ÀÌÁö!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"»êÀÇ Á¤±â¸¦ ¹Ş¾Æ ¸é¿ª·Â ");
						healthcnt += five;
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"»êÀ» ¿À¸£´Ù°¡ °í¶ó´Ï¸¦ ¸¸³µ´Ù.");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							gorani = 1;
							break;
						} else {
							System.out.println("\t\t\t\t\t\t" +"¾î.....?");
							fun.timelate(1);
							System.out.println("\t\t\t\t\t\t" +"¿ì¾î¾Æ¾Æ¾î¾î¾î¾Æ¾Æ¾î!!!");
							healthcnt += minfive;
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
							System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
							status();
						}
					}

					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"Èş");
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
			System.out.print("\t\t\t\t\t\t" +"ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+  "%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
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
			System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"1.»õº®ÀÌ ¹à¾Ò½À´Ï´Ù 2.´ßÀÌ ¿ï±â ½ÃÀÛÇÕ´Ï´Ù 3.¾Ä°í ÇÏ·ç¸¦ ÁØºñÇÏÁÒ");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"´«À» ¶°¾ßµË´Ï´Ù");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ÇÏÁö¸¸ ´«Àº ¶°ÁöÁö ¾Ê°í.....");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"»õº®ÀÏÂïºÎÅÍ ÀÏÀ»ÇÏ´Ï ³Ê¹« Èûµé¾î...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				
				System.out.println("\t\t\t\t\t\t" +"²¿³¢¿Ë¤·¿Ë¤·¤·¤·¿Ë¤·¿À¿À¿Ë");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¸ÁÇÒ ´ß»õ±â....");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"´ß¼Ò¸®¸¦ µéÀ¸¸ç ÀÏ¾î³ª´Â°Å¾ß¸»·Î °Ç°­À» Ã¬±â´Â ±æ!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¹°À» Æ²¾ú´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"º¸ÀÏ·¯°¡ °íÀå³ª ³Ã¼ö¸¸ ³ª¿Â´Ù");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"½÷¾Æ¾Æ¾Æ¤¿¾Æ");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¶ß¶æÇÑ ¹°·Î °³¿îÇÏ°Ô ¾Ä¾ú´Ù!");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Çó");
			}
		}

	}

	public void dume_student_ohu() {

		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Á¡½É¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" +"1.Á¡½É³ª°¡¼­¸Ô±â 2.Á¡½É½ÃÄÑ¼­¸Ô±â 3.Á¡½É¸¸µé¾î¸Ô±â");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"µçµçÇÏ°Ô Á¡½ÉÀ» ¸Ô¾î¾ßÁö");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"½Ã°ñÂ¥ÀåÀÌ¾ß¸»·Î ÁøÂ¥ ¸ÀÀÌÁö");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"°¡°Ô¸¦ Àß¸ø µé¾î°¬´Ù..¸ÁÇß´Ù");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"¸ğµÎ°¡ Â¥ÀåÀ» ½ÃÅ³¶§ ³ª´Â Â«»ÍÀ» ½ÃÅ²´Ù!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¼º°øÇß´Ù!!!!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");

					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"°­¿øµµ´Â °¨ÀÚ·¡¿ä");
				fun.timelate(1);
				if (rancnt == 0) {

					System.out.println("\t\t\t\t\t\t" +"°¨ÀÚÀüÀ» ½ÃÄÑ¸Ô¾ú´Ù. ¾ÆÀÌ¸ÀÀÖ¾û");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"¿äÁò°¨ÀÚ°¡ Ã¶ÀÌ¾Æ´Ï¾ß..");
					fun.timelate(1);
					healthcnt += minfive;

					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				System.out.println("\t\t\t\t\t\t" +"¾Æ´Ï±Ùµ¥ Á¡½ÉÀ» ¾î¶»°Ô ¸¸µé¾î¸Ô¾î?");
				fun.timelate(1);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¿ì¸®´Â Æí½ºÅä¶û ½¦ÇÁ ¤¾¤¾");
					fun.timelate(1);
					healthcnt += ten;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"»¹Áş¸¸ ÇÏ´Ù Á¡½ÉÀ» ¸ÔÁö ¸øÇß´Ù....");
					fun.timelate(1);
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Àå³­ ¸ØÃç!");
			}
		}

	}

	public int dume_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"¹ã¿¡´Â ¹«¾ùÀ» ÇÒ°í¾ß?");
				System.out.println("\t\t\t\t\t\t" +"1.ÀáÀÚ±â 2.¼ú¸Ô±â 3.³İÇÃ¸¯½º º¸±â");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					sleep();
					break;
				} else if (choice.equals("2")) {
					alcol_cnt++;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221ÁÙ
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
						System.out.println("\t\t\t\t\t\t" +"¿·Áı ¾ÆÀú¾¾°¡ Àå´ßÀ» Àâ¾Æ¿À¼Ì´Ù");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"¹é¼÷¿¡´Â ¼ÒÁÖÁö È÷ÆRÆRÈ÷");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else {
						System.out.println("\r\n"   // 1065¹øÂ° ÁÙ
					            + "\r\n"
					            + "                 ;$$$$~                ~\r\n"
					            + "               ,$     ,$, .             \r\n"
					            + "         ~$-~$*=        =~--~$-         \r\n"
					            + "       :!     ,               *-        \r\n"
					            + "       !                       $        \r\n"
					            + "      ;                        !.       \r\n"
					            + "      $                        ;.      .\r\n"
					            + "      =                        $       ;\r\n"
					            + "      ;                       ;:       .\r\n"
					            + "       =        *      .$$;::$-        ~\r\n"
					            + "       -$     .$*$.   .$    .$         ~\r\n"
					            + "        .$$==$!   $== =     .$          \r\n"
					            + "         *                  .$;.        \r\n"
					            + "         *                   ,.!=       \r\n"
					            + "         *  .*-   ;*    *=      .=      \r\n"
					            + "         *  ,.    ;     :    $=. ;.     \r\n"
					            + "         *  -     ;     :    $ $  =     \r\n"
					            + "         =  ,     =     :    $ ,, $     \r\n"
					            + "         =  -     =     -    $ ,! $     \r\n"
					            + "         =  -     =     ,    $ -, $     \r\n"
					            + "         =  -     =     .   .$ $  $     \r\n"
					            + "         $  -     =     .   ,$=, ~;     \r\n"
					            + "         $  -     =     .   ,=.  $      \r\n"
					            + "         $  -     =     .       $       \r\n"
					            + "         $  -     =     .     :$.       \r\n"
					            + "         =  -     =     .   -$;         \r\n"
					            + "         $        =     .   -=          \r\n"
					            + "        *;  -     =     .   ,$          \r\n"
					            + "        $         $,-   =.   =          \r\n"
					            + "       .$                    =          \r\n"
					            + "        $                    $          \r\n"
					            + "        *~                  $-          \r\n"
					            + "         ; ;.            ~-;            \r\n"
					            + "            ==$=-    ~=$=!              \r\n"
					            + "                .,,,.                   \r\n"
					            + "");
						System.out.println("\t\t\t\t\t\t" +"Ä£±¸ÁıÀ¸·Î ¼úÀ» ¸ÔÀ¸·¯ °¬´Ù");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 0) {
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
							defend_vir += five;
							System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
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
						System.out.println("\t\t\t\t\t\t" +"ÀÌ°ÍÀÌ °­¿øµµÀÇ À¯ÀÏÇÑ ³«ÀÏ±î...");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÇÏ³ª¸¸ ´õº¸°í ÀÚ¾ßÁö");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"¿À´ÃÀº º¼°Ô º°·Î ¾ø³×..");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÀÏÂï ÀÚ¾ßÁö");
						fun.timelate(1);
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"´Ù¸Ş´Ù¸Ş ´Ù¸Ş¿ä");
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
			System.out.print("\t\t\t\t\t\t" +"ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public void dume_nurse_morning() { // µÎ¸Ş °£È£»ç ¾ÆÄ§
		only_nur();
		omi_change();
		da_u_hang();
		gori();
		witch();
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" + "1. ¹ä ¸Ô°í Ãâ±ÙÇÏ±â 2. Ãâ±ÙÇÏ±â 3. 10ºĞ ´õ ÀÚ°í Áö°¢ÇÏ±â");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "´ÙÀÌ¾îÆ® ÁßÀÎµ¥ ³Ê¹« ¸¹ÀÌ ¸Ô¾î¹ö·È´Ù..");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112¹øÂ° ÁÙ
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
					System.out.println("\t\t\t\t\t\t" + "µÅÁö»õ±â ¾ó¸¶³ª ¸Ô´Â°Å¾ß!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "¿ª½Ã ¾ÆÄ§Àº µçµçÇÏ°Ô ¸Ô¾î¾ßÁö!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 ÁÙ
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
					System.out.println("\t\t\t\t\t\t" + "Ãâ±ÙÇÏ´Â ±æ¿¡ ±Í¿©¿î °í¾çÀÌ¸¦ ºÃ´Ù!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "ÇÇ°ïÇØ ¤Ğ¤Ğ Ãâ±ÙÇÏ±â ½È¾î");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "10ºĞ ´õ ÀÜ´Ù´Â°Ô 2½Ã°£ ´õ ÀÚ¹ö·È´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "ºÎÀçÁß 15Åë... ¿Â ¸ö¿¡ ½ÄÀº¶¡ÀÌ Èå¸¥´Ù...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "Áö°¢À» Çß´Âµ¥ ¾Æ¹«µµ ´«Ä¡Ã¤Áö ¸øÇß´Ù!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "10ºĞ ´õ ÀÚ¼­ ÇÇ·Î°¡ Ç®·È´Ù");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "Èş");
			}
		}

	}

	public void dume_nurse_ohu() { // µÎ¸Ş °£È£»ç ¿ÀÈÄ

		while (true) {
			System.out.println("\t\t\t\t\t\t" + "Á¡½É¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" + "1. ¹ä¸Ô±â 2. ³·ÀáÀÚ±â 3. ¸¶À»È¸°ü¿¡¼­ ¼ö´Ù¶³±â");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" + "µçµçÇÏ°Ô Á¡½ÉÀ» ¸Ô¾î¾ßÁö");
				fun.timelate(1);
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "µÎ¸Ş»ê°ñ ÃÖ°íÀÇ ¸ÀÁı¿¡¼­ ¹äÀ» ¸Ô¾ú´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "µçµçÇØ¼­ ±âºĞÀÌ ÁÁ´Ù!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "¸¶À»È¸°ü¿¡ ÀÜÄ¡°¡ ÀÖ¾î¼­ °Å±â¼­ Á¡½ÉÀ» ¸Ô¾ú´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "¸¶À» ¾î¸£½ÅµéÀÌ ¸·°É¸®¸£¤© ³Ê¹« ¸¹ÀÌ ÁÖ¼Å¤µ¼­¤¤ÃëÇØ¶ì..");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "³Ê¹«ÇÇ°ïÇØ~ ¹äÀº ½ºÅµÇÑ´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "zzZZ~ À½ °³¿îÇÏ´Ù!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "³·Àá ÀÚ¼­ °³¿îÇÏ±äÇÑµ¥ ³Ê¹« ¹è°íÆÄ¼­ ÈûÀÌ ºüÁø´Ù...");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" + "¸¶À» ¾î¸£½ÅµéÇÑÅ× ÀÌ»İ¹Ş´Â´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "¿ëµ·µµ Áã¾îÁÖ½Å´Ù ±âºĞ ÃÖ°í~");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" + "¸¶À» ¾î¸£½ÅµéÇÑÅ× °áÈ¥Àº ¾ğÁ¦ÇØ? ¶ó¶¼´Â ¸»¾ß ÄŞº¸¸¦ ¸Â¾Ò´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" + "¸¶À»È¸°ü¿¡¼­ µµ¸ÁÃÆ´Ù!");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" + "Àå³­ ¸ØÃç!");
			}
		}

	}

	public int dume_nurse_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" + "¹ã¿¡´Â ¹«¾ùÀ» ÇÒ°í¾ß?");
				System.out.println("\t\t\t\t\t\t" + "1.ÀáÀÚ±â 2.¼ú¸Ô±â 3.³İÇÃ¸¯½ºº¸±â");
				choice = in.next();
				if (choice.equals("1")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					sleep();

					if (rancnt == 0) {

						System.out.println("\t\t\t\t\t\t" + "°£¸¸¿¡ Ç« Àä´Ù");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "¾ÆÀÌ °³¿îÇôÀ¯¿ì~");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "º¸ÀÏ·¯°¡ °íÀå³µ³ª ¹æÀÌ ³Ê¹« Ãä´Ù");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "¿Àµé¿Àµé ¶³¸é¼­ Àä´Ù °¨±â °É·È³ª..?");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					alcol();
					rancnt = ran.nextInt(2);

					if (rancnt == 0) {
						System.out.println("\r\n"   // 1065¹øÂ° ÁÙ
					            + "\r\n"
					            + "                 ;$$$$~                ~\r\n"
					            + "               ,$     ,$, .             \r\n"
					            + "         ~$-~$*=        =~--~$-         \r\n"
					            + "       :!     ,               *-        \r\n"
					            + "       !                       $        \r\n"
					            + "      ;                        !.       \r\n"
					            + "      $                        ;.      .\r\n"
					            + "      =                        $       ;\r\n"
					            + "      ;                       ;:       .\r\n"
					            + "       =        *      .$$;::$-        ~\r\n"
					            + "       -$     .$*$.   .$    .$         ~\r\n"
					            + "        .$$==$!   $== =     .$          \r\n"
					            + "         *                  .$;.        \r\n"
					            + "         *                   ,.!=       \r\n"
					            + "         *  .*-   ;*    *=      .=      \r\n"
					            + "         *  ,.    ;     :    $=. ;.     \r\n"
					            + "         *  -     ;     :    $ $  =     \r\n"
					            + "         =  ,     =     :    $ ,, $     \r\n"
					            + "         =  -     =     -    $ ,! $     \r\n"
					            + "         =  -     =     ,    $ -, $     \r\n"
					            + "         =  -     =     .   .$ $  $     \r\n"
					            + "         $  -     =     .   ,$=, ~;     \r\n"
					            + "         $  -     =     .   ,=.  $      \r\n"
					            + "         $  -     =     .       $       \r\n"
					            + "         $  -     =     .     :$.       \r\n"
					            + "         =  -     =     .   -$;         \r\n"
					            + "         $        =     .   -=          \r\n"
					            + "        *;  -     =     .   ,$          \r\n"
					            + "        $         $,-   =.   =          \r\n"
					            + "       .$                    =          \r\n"
					            + "        $                    $          \r\n"
					            + "        *~                  $-          \r\n"
					            + "         ; ;.            ~-;            \r\n"
					            + "            ==$=-    ~=$=!              \r\n"
					            + "                .,,,.                   \r\n"
					            + "");
						System.out.println("\t\t\t\t\t\t" + "¿ª½Ã ¾ËÄÚ¿ÃÀº ¿µ¿øÇÑ Ä£±¸");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "¼ÒÁÖ·Î ¸ö°ú ¸¶À½À» ¼Òµ¶Çß´Ù");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" + "À½... ¿©±ä ¾îµğÁö..?");
						fun.timelate(1);
						rancnt = ran.nextInt(2);
						if (rancnt == 1) {
							System.out.println("\t\t\t\t\t\t" + "³»°¡.. Áı¿¡ ¾î¶»°Ô µé¾î¿Ô´õ¶ó...?");
							fun.timelate(1);
							System.out.println("\r\n"   // 1065¹øÂ° ÁÙ
						            + "\r\n"
						            + "                 ;$$$$~                ~\r\n"
						            + "               ,$     ,$, .             \r\n"
						            + "         ~$-~$*=        =~--~$-         \r\n"
						            + "       :!     ,               *-        \r\n"
						            + "       !                       $        \r\n"
						            + "      ;                        !.       \r\n"
						            + "      $                        ;.      .\r\n"
						            + "      =                        $       ;\r\n"
						            + "      ;                       ;:       .\r\n"
						            + "       =        *      .$$;::$-        ~\r\n"
						            + "       -$     .$*$.   .$    .$         ~\r\n"
						            + "        .$$==$!   $== =     .$          \r\n"
						            + "         *                  .$;.        \r\n"
						            + "         *                   ,.!=       \r\n"
						            + "         *  .*-   ;*    *=      .=      \r\n"
						            + "         *  ,.    ;     :    $=. ;.     \r\n"
						            + "         *  -     ;     :    $ $  =     \r\n"
						            + "         =  ,     =     :    $ ,, $     \r\n"
						            + "         =  -     =     -    $ ,! $     \r\n"
						            + "         =  -     =     ,    $ -, $     \r\n"
						            + "         =  -     =     .   .$ $  $     \r\n"
						            + "         $  -     =     .   ,$=, ~;     \r\n"
						            + "         $  -     =     .   ,=.  $      \r\n"
						            + "         $  -     =     .       $       \r\n"
						            + "         $  -     =     .     :$.       \r\n"
						            + "         =  -     =     .   -$;         \r\n"
						            + "         $        =     .   -=          \r\n"
						            + "        *;  -     =     .   ,$          \r\n"
						            + "        $         $,-   =.   =          \r\n"
						            + "       .$                    =          \r\n"
						            + "        $                    $          \r\n"
						            + "        *~                  $-          \r\n"
						            + "         ; ;.            ~-;            \r\n"
						            + "            ==$=-    ~=$=!              \r\n"
						            + "                .,,,.                   \r\n"
						            + "");
							System.out.println("\t\t\t\t\t\t" + "¼úÀ» ³Ê¹« ¸¶¼Å¼­ ¸Ó¸®°¡ ±úÁú °Í °°´Ù");
							healthcnt += minfive;
							System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
							defend_vir += minfive;
							System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
							status();
						} else {
							System.out.println("\t\t\t\t\t\t" +"Àú°Ç... °í¶ó´Ï??");
							fun.timelate(1);
							gorani = 1;
						}
					}
					break;
				} else if (choice.equals("3")) {
					alcol_cnt = 0;
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // ³İÇÃ¸¯½º
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "¾Æ´Ï ½Ã°£ÀÌ ¹ú½á..?");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" + "³İÇÃ¸¯½º º¸´Ù°¡ ´ÊÀáÀÌ´Ù!");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" + "¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"   // ³İÇÃ¸¯½º
								+"\t\t\t\t\t\t" + " _   _        _     __  _  _       \r\n"
								+"\t\t\t\t\t\t" + "| \\ | |      | |   / _|| |(_)      \r\n"
								+"\t\t\t\t\t\t" + "|  \\| |  ___ | |_ | |_ | | _ __  __\r\n"
								+"\t\t\t\t\t\t" + "| . ` | / _ \\| __||  _|| || |\\ \\/ /\r\n"
								+"\t\t\t\t\t\t" + "| |\\  ||  __/| |_ | |  | || | >  < \r\n"
								+"\t\t\t\t\t\t" + "\\_| \\_/ \\___| \\__||_|  |_||_|/_/\\_\\\r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "                                   \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" + "Àû´çÇÑ ³İÇÃ¸¯½º´Â ÀÎ»ı¿¡ µµ¿òÀÌ µÈ´Ù!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" + "Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "´Ù¸Ş´Ù¸Ş ´Ù¸Ş¿ä");
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
			System.out.print("\t\t\t\t\t\t" + "ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
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
			System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" +"1.ÀÏ¾î³ª±â 2.´ÊÀáÀÚ±â 3.¹ä¸Ô±â");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"ÀÏ´Ü ÀÏ¾î³ª°í »ı°¢ÇØº¸ÀÚ");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¿À! ´ÃÀº ¿ø°İ¼ö¾÷!");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"±³¼ö´ÔÀÇ ±â½ÀÈŞ°­~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"¾î¸²µµ¾øÁö Ã¹¼ö¾÷ 9½Ã!");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¹«Áö¼º ´ÊÀáÀ» Àä´Ù..");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"±×·±µ¥ Ã¹¼ö¾÷ÀÌ 3½Ã? ¤¡¤·¤§!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"´ÊÀáÀÌ ¼¼»ó¿¡¼­ Á¦ÀÏ ´ŞÁö");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"ºÎÀçÁß 30Åë??½Ã¤Ó¤² ¤¿¤¿¤²¤· ¤²¤© ¤¸ µ½¤¶´ë¾Æ ´Ù");
					fun.timelate(1);
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"´ÊÀáÀ» Àä´Ù.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"±³¼ö´ÔÀÇ ±ä±ŞÈŞ°­!!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ÀÌ°Å½¼ Àü³¯¿¡ ¸Ô°í ³²±ä Âò´ß??");
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"»óÇß´Ù....¹Ì°¢À»ÀÒ¾ú´Ù...");
					fun.timelate(1);
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§Àº µçµçÇÏ°Ô!!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"ÇìÇì");
					fun.timelate(1);
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"..............");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"ÀÌ°ÍÀº ...Áø¹Ì(òÒÚ«)!!");
					fun.timelate(1);
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Çó");
			}
		}

	}

	public void nor_student_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Á¡½É¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.println("\t\t\t\t\t\t" +"1. ÇĞ½Ä¸Ô±â 2. ¸ÀÁıÅ½¹æ 3. ³î·¯°¡±â");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"µçµçÇÏ°Ô Á¡½ÉÀ» ¸Ô¾î¾ßÁö");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¾îÁ¦µµ ÇĞ½Ä ¿À´Ãµµ ÇĞ½Ä...");
					System.out.println("\t\t\t\t\t\t" +"±×¸¸ ¸Ô°í ½Í´Ù Áú·Á..");
					fun.timelate(1);
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"ÇĞ½Ä¿¡ Ä¡Å²ÀÌ ³ª¿Ô´Ù!");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"ÀÌ¸À¿¡ ÇĞ½Ä ¸ÔÁö~");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"±³³»½Ä´ç¿¡¼­ È®ÁøÀÚ°¡ ³ª¿Ô´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"È¤½Ã.. ³ªµµ?");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ÀÎ±âÀıÁ¤ ¸ÀÁıÀ» Ã£¾Æ°¬´Ù");
					System.out.println("\t\t\t\t\t\t" +"»ç¶÷ÀÌ ²ËÃ¡´Ù");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·Â " + minfive + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"ÆÄ½ºÅ¸´Â ¿ª½Ã ÀÌ ¸ÀÀÌÁö~");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"¿­½ÉÈ÷ °É¾î¼­ ¸ÀÁıÀ» Ã£¾Æ°¬´Âµ¥ ¹®À» ´İ¾Ò´Ù!");
					System.out.println("\t\t\t\t\t\t" +"ÁöÃÄ ¤Ğ Ã¼·Â ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"°ø¿ø¿¡¼­ ÁÁ¾ÆÇÏ´Â ¿©ÀÚ¾Ö¶û »êÃ¥Çß´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"È÷È÷");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"pc¹æ¿¡¼­ Ä£±¸µé°ú °ÔÀÓÀ» Çß´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¿ª½Ã ·ÑÀº Áúº´°ÔÀÓÀÌ´Ù");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"ÄÚÀÎ³ë·¡¹æ°¡¼­ ³ë·¡½Ç·ÂÀ» »Ë³Â´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"ÀÌÀ¯´Â ¸ğ¸£Áö¸¸ Ã¼·Â°¨¼Ò ");
					healthcnt += minfive;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Àå³­ ¸ØÃç!");
			}
		}
	}

	public int nor_student_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"¹ã¿¡´Â ¹«¾ùÀ» ÇÒ°í¾ß?");
				System.out.println("\t\t\t\t\t\t" +"1.¼ú¸¶½Ã±â 2.Å¬·´°¡±â 3.°úÁ¦ÇÏ±â");
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
						System.out.println("\t\t\t\t\t\t" +"°úÁ¦ÇÏ´À¶ó ¹ã»ü´Ù..");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"°úÁ¦ ÇØ¾ßÁö..zzZZ~");
						System.out.println("\t\t\t\t\t\t" +"°úÁ¦ ÇÏ´Ù°¡ Àá µé¾ú´Ù ¸ÁÇß´Ù.");
						fun.timelate(1);
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}

					else {
						System.out.println("\t\t\t\t\t\t" +"ÁÁ¾ÆÇÏ´Â ¿©ÀÚ¾Ö°¡ °úÁ¦ ´ë½Å ÇØ´Ş¶ó°í Çß´Ù");
						System.out.println("\t\t\t\t\t\t" +"°úÁ¦ 2°³ ÇÏ´À¶ó ¹ã»ü´Ù");
						fun.timelate(1);
						System.out.print("\t\t\t\t\t\t" +"ÇìÇì.. ±×·¡µµ Çàº¹ÇØ...");
						fun.timelate(1);
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"´Ù¸Ş´Ù¸Ş ´Ù¸Ş¿ä");
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
			System.out.print("\t\t\t\t\t\t" +"ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
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
			System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.print("\t\t\t\t\t\t" +"1.¾ÆÄ§¸Ô±â 2.À¯»ê¼Ò 3.´Ü¹éÁú ½¦ÀÌÅ©");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"½Ä´ÜÀº ¿îµ¿ÀÇ ÀÏºÎ!");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					
					System.out.println("\t\t\t\t\t\t" +"\r\n" // character 112¹øÂ° ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"µÅÁö»õ±â ¾ó¸¶³ª ¸Ô´Â°Å¾ß!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"Àû´çÇÑ ½Ä´Ü Àû´çÇÑ ¿îµ¿!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"³Ê¹« Àû°Ô ¸Ô¾î °øº¹°¨ÀÌ ´À²¸Áø´Ù....");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"Àû´çÇÑ À¯»ê¼Ò´Â ¿îµ¿ÀÇ ½ÃÀÛÀÌÁö!!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"À¯»ê¼Ò¸¸ ÇØ¼­ ±Ù¼Õ½ÇÀÌ ÀÏ¾î³µ´Ù..");
					healthcnt += minten;

					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"ÇÏÁö¸¸ ¿À´ÃÀº ¹Ì¼¼¸ÕÁö ÃÖ¾Ç.....");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¾Æ´Ï... ¹ÎÆ®ÃÊÄÚ¸À ´Ü¹éÁú ½¦ÀÌÅ©°¡ ¿Ö ÀÖ´Â°ÅÁö?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¹Ì°¢À» ÀÒ°í ¹ÙÀÌ·¯½º¸¦ Á×¿´µû...");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"µçµçÇÑ ½¦ÀÌÅ© ¶ß¶æÇÏ°Ô ¸Ô¾î¾ßÁö!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"½ÅÁ¦Ç° 3°¡Áö¸À ½¦ÀÌÅ©¸¦ ¸Ô¾ú´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"½Å¼±ÇÑ ¸ÀÀÇ ¼¼°èÀÌ´Ù");
					healthcnt += five;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Èş");
			}
		}
	}

	public void nor_sport_evening() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Á¡½É¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.print("\t\t\t\t\t\t" +"1.Á¡½É¸Ô±â 2.Áß·® 3.¸Ç¸ö");
			choice = in.next();
			if (choice.equals("1")) {
				System.out.println("\t\t\t\t\t\t" +"µçµçÇÏ°Ô Á¡½ÉÀ» ¸Ô¾î¾ßÁö");
				fun.timelate(1);
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"Ä¡ÆÃµ¥ÀÌ¶ó ±â¸§Áø °£Â¥ÀåÀ» ºñº­¸Ô¾ú´Ù");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"±âºĞÀÌ ÁÁ¾Æ °¨¼º±ÙÀ°ÀÌ Áõ°¡Çß´Ù!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"½Ä´Ü°ü¸®ÁßÀÌ¶ó »ø·¯µå¸¸ ¸Ô¾ú´Ù.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"¹ú·¹ÇüÀÌ ¿©±â¼­ ¿Ö...??");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"\r\n"    //  221ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"´ß °¡ ½¿ »ì ´ß °¡ ½¿ »ì ´ß °¡ ½¿ »ì");
					
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"°¡½¿ÀÌ ¾ø´Â ´ßÀÇ ÀúÁÖ¸¦ ¹Ş¾Æ ¸é¿ª·Â °¨¼Ò!!");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				}

				break;
			} else if (choice.equals("2")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"¸ÚÁø µî ±×°ÍÀº ³ªÀÇ ·Î¸Á");
					healthcnt += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
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
					System.out.println("\t\t\t\t\t\t" +"´ıº§À» ¹ß¿¡ ¶³¾î¶ß·Á¹ö·Ç´Ù.....Á¨Àå");
					healthcnt += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"³ªÀÇ ¸ñÇ¥´Â ¾ğ´õ¾Æ¸Ó ¹«¸®ÇØ¼­¶óµµ ¿îµ¿ÀÌ´Ù!");
					healthcnt += five;
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}
				break;
			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"ÁøÁ¤ÇÑ ¸Ç¸öÀº µî»êÀÌ ¾Æ´Ò±î?");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"µî»ê ³¡³ª°í ¸¶½Ã´Â ¸·°É¸®´Â ¸øÂüÁö ¤»¤»");
					healthcnt += minten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				} else if (rancnt == 1) {
					System.out.println("\t\t\t\t\t\t" +"¹«È£Èí(Ùíû¼ıå) 100¿¬ ¹öÇÇ");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"°úµµÇÑ ¿îµ¿Àº ¿ÀÈ÷·¯ µæÀÌ µË´Ï´Ù.");
					healthcnt += ten;
					defend_vir += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"±ÙÃ³ È£¼ö°ø¿ø¿¡ °£´ÜÈ÷ Á¶±ëÇÏ·¯ °¬´Ù.");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"\r\n"  // 274 ÁÙ
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
					System.out.println("\t\t\t\t\t\t" +"Áö³ª°¡´Â ±æ°í¾çÀÌÇÑÅ× ³É³É½½·¡½Ã¸¦ ´çÇß´Ù");
					healthcnt += minfive;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"Àå³­ ¸ØÃç!");
			}
		}

	}

	public int nor_sport_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"¹ã¿¡´Â ¹«¾ùÀ» ÇÒ°í¾ß?");
				System.out.print("\t\t\t\t\t\t" +"1.ÀáÀÚ±â 2.Å¬·´°¡±â 3.Á¾±¹ÀÌÇü À¯Æ©ºêº¸±â");
				choice = in.next();
				if (choice.equals("1")) {
					sleep();

					break;
				} else if (choice.equals("2")) {
					System.out.println("\t\t\t\t\t\t" +"ÇïÃ¢ÀÇ Å¬·´Àº 'Çï½º'Å¬·´ÀÌÁö");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"¸¶½ºÅ©¸¦ ±ôºıÇÏ°í ³ª¿Ô´Ù..!!");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"¸¶½ºÅ©¸¦ °¡Á®¿À´Â °Íµµ ¿îµ¿ÀÌ´Ù");
						healthcnt += five;
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"³» ¸ñÇ¥´Â ¾ğ´õ¾Æ¸Ó");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"¿À´Ã Çï½ºÀå¿¡ »ç¶÷ÀÌ¸¹³×");
						healthcnt += ten;
						defend_vir += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"Ä£±¸ÇÑÅ× ÀüÈ­°¡¿Ô´Ù");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÇÏ...ÇÏÁö¸¸...·çÆ¾À» ±ı¼ø ¾ø´Â°É?");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}

					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"À¯ºZÀ»º¸´Ù »õ“İ 4½Ã°¡µÇ¾ú´Ù.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"\"Á¾±¹ÀÌÇüÀÌ¶û °°ÀÌ ¹Ş´Â ÀÚ±Ø...Â¥¸´ÇØ¢½\"");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else if (rancnt == 1) {
						System.out.println("\t\t\t\t\t\t" +"À¯ºZÀ»º¸´Ù »õ“İ 4½Ã°¡µÇ¾ú´Ù.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"Áö³ªÄ£ ´ÊÀáÀº ±Ù¼Õ½ÇÀ» À¯¹ßÇÕ´Ï´Ù...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312ÁÙ
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"Á¾±¹ÀÌÇü À¯Æ©ºê´Â ÀÎ»ı¿¡ µµ¿òÀÌ µÈ´Ù!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"´Ù¸Ş´Ù¸Ş ´Ù¸Ş¿ä");
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
			System.out.print("\t\t\t\t\t\t" +"ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");

			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;

	}

	public int backsin() {
		int endcnt = 0;
		System.out.println("\t\t\t\t\t\t" +"¿À´ÃÀº ¹é½Å Á¢Á¾ÀÇ ³¯ÀÌ´Ù");
		System.out.println(" ");
		fun.timelate(1);
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"¹«¾ùÀ» ÇÒ±î¿ä?");
			System.out.print("\t\t\t\t\t\t" +"1.¹é½Å¸Â±â 2.¹é½Å¸Â±â 3.¹é½Å¸Â±â");
			choice = in.next();
			if (choice.equals("1") || choice.equals("2") || choice.equals("3")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					 System.out.println("\r\n"
					            + "\r\n"
					            + "                                                      .~              \r\n"
					            + "                                                       =!             \r\n"
					            + "                                                       .@;            \r\n"
					            + "                                                       -@@!           \r\n"
					            + "                                                      -#@@@;          \r\n"
					            + "                                                     -#@@@@@!         \r\n"
					            + "                                            ~=,     -#@@@@@@@;        \r\n"
					            + "                                            $@#.   -#@@@@@@*-$!       \r\n"
					            + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
					            + "                                            =:#@#-#@@@@@@*.           \r\n"
					            + "                                           $@@:#@#;@@@@@=.            \r\n"
					            + "                                          =@@@@:#@#:@@@=.             \r\n"
					            + "                                         -#@@@@@:$@#;@=.              \r\n"
					            + "                                        *.-#@@@@@:$@#:.               \r\n"
					            + "                                       $@#.-@@@@@@:#@#,               \r\n"
					            + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
					            + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
					            + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
					            + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
					            + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
					            + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
					            + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
					            + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
					            + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
					            + "                              :@@@@@@@@@@@@@@@*                       \r\n"
					            + "                            $* :@@@@@@@@@@@@@!                        \r\n"
					            + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
					            + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
					            + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
					            + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
					            + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
					            + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
					            + "                      :@@@@@@@@@@@@@@@*                               \r\n"
					            + "                       !@@@@@@@@@@@@@!                                \r\n"
					            + "                        *@@@@@@@@@@@*                                 \r\n"
					            + "                       ,=*@@@@@@@@@!                                  \r\n"
					            + "                       =@**@@@@@@@*                                   \r\n"
					            + "                      ,@@@=*@@@@@;                                    \r\n"
					            + "                      !@@@@*!@@@*                                     \r\n"
					            + "                      $@@@$- !@!                                      \r\n"
					            + "                     .=#=-                                            \r\n"
					            + "                    .=,.                                              \r\n"
					            + "                   .=,                                                \r\n"
					            + "                  .=,                                                 \r\n"
					            + "                 .=,                                                  \r\n"
					            + "                .=,                                                   \r\n"
					            + "               .=,                                                    \r\n"
					            + "              .=,                                                     \r\n"
					            + "             .=,                                                      \r\n"
					            + "            ,=,                                                       \r\n"
					            + "           .=,                                                        \r\n"
					            + "           ,,                                                         \r\n"
					            + "");
					System.out.println("\t\t\t\t\t\t" +"³»°¡ ¸ÂÀ» ¹é½ÅÀº È­ÀÌÀÚ");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"25ÆÛÀÇ Ä¡»çÀ²À» °¡Áö°í ÀÖ´Ù.");
					fun.timelate(1);
					rancnt = ran.nextInt(4);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"die");
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"Á¶±İ ¾ÆÇÁ±ä ÇßÁö¸¸ ¸çÄ¥ ´©¿öÀÖÀ¸´Ï ±¦Âú¾ÆÁ³´Ù!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡Çß´Ù.");

					}
				} else if (rancnt == 1) {
					 System.out.println("\r\n"
					            + "\r\n"
					            + "                                                      .~              \r\n"
					            + "                                                       =!             \r\n"
					            + "                                                       .@;            \r\n"
					            + "                                                       -@@!           \r\n"
					            + "                                                      -#@@@;          \r\n"
					            + "                                                     -#@@@@@!         \r\n"
					            + "                                            ~=,     -#@@@@@@@;        \r\n"
					            + "                                            $@#.   -#@@@@@@*-$!       \r\n"
					            + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
					            + "                                            =:#@#-#@@@@@@*.           \r\n"
					            + "                                           $@@:#@#;@@@@@=.            \r\n"
					            + "                                          =@@@@:#@#:@@@=.             \r\n"
					            + "                                         -#@@@@@:$@#;@=.              \r\n"
					            + "                                        *.-#@@@@@:$@#:.               \r\n"
					            + "                                       $@#.-@@@@@@:#@#,               \r\n"
					            + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
					            + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
					            + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
					            + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
					            + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
					            + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
					            + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
					            + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
					            + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
					            + "                              :@@@@@@@@@@@@@@@*                       \r\n"
					            + "                            $* :@@@@@@@@@@@@@!                        \r\n"
					            + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
					            + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
					            + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
					            + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
					            + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
					            + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
					            + "                      :@@@@@@@@@@@@@@@*                               \r\n"
					            + "                       !@@@@@@@@@@@@@!                                \r\n"
					            + "                        *@@@@@@@@@@@*                                 \r\n"
					            + "                       ,=*@@@@@@@@@!                                  \r\n"
					            + "                       =@**@@@@@@@*                                   \r\n"
					            + "                      ,@@@=*@@@@@;                                    \r\n"
					            + "                      !@@@@*!@@@*                                     \r\n"
					            + "                      $@@@$- !@!                                      \r\n"
					            + "                     .=#=-                                            \r\n"
					            + "                    .=,.                                              \r\n"
					            + "                   .=,                                                \r\n"
					            + "                  .=,                                                 \r\n"
					            + "                 .=,                                                  \r\n"
					            + "                .=,                                                   \r\n"
					            + "               .=,                                                    \r\n"
					            + "              .=,                                                     \r\n"
					            + "             .=,                                                      \r\n"
					            + "            ,=,                                                       \r\n"
					            + "           .=,                                                        \r\n"
					            + "           ,,                                                         \r\n"
					            + "");
					System.out.println("\t\t\t\t\t\t" +"³»°¡ ¸ÂÀ» ¹é½ÅÀº ¸ğ´õ³ª");
					fun.timelate(1);
					System.out.println("\t\t\t\t\t\t" +"33ÆÛÀÇ Ä¡»çÀ²À» °¡Áö°í ÀÖ´Ù.");
					fun.timelate(1);
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						end.hidden_bacsin();
						endcnt = 1;
					} else {
						System.out.println("\t\t\t\t\t\t" +"Á¶±İ ¾ÆÇÁ±ä ÇßÁö¸¸ ¸çÄ¥ ´©¿öÀÖÀ¸´Ï ±¦Âú¾ÆÁ³´Ù!!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡Çß´Ù.");

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
			System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§¿¡ ¹«¾ùÀ» ÇÒ °ÍÀÎ°¡¿ä?");
			System.out.print("\t\t\t\t\t\t" +"1.Ãâ±ÙÇÏ±â 2.¼Õ¾Ä°í Ãâ±ÙÇÏ±â 3.¾ÆÄ§Àº µçµçÇÏ°Ô");
			choice = in.next();
			if (choice.equals("1")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"Ãâ±ÙÀº °Ç°­¿¡ ÇØ·Ó½À´Ï´Ù");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");

					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"Ãâ±Ù±æ¿¡ ¼±¹è¸¦ ¸¸³ª Â÷¸¦ Å¸°í °°ÀÌ ¿Ô½À´Ï´Ù!");
					System.out.println("\t\t\t\t\t\t" +"±âºĞÀÌ ÁÁ¾ÆÁ³´Ù!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ" + five + "Áõ°¡!");
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
					System.out.println("\t\t\t\t\t\t" +"¼¼»ó¿¡ È­Àå½Ç¿¡¼­ ¹ÙÄû¹ú·¹¸¦ ¹ß°ß!");
					System.out.println("\t\t\t\t\t\t" +"³ª´Â ±×¸¸ Á¤½ÅÀ» ÀÒ¾î¹ö·È´Ù...");
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					healthcnt += minten;
					defend_vir += minten;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"°Ç°­À» Ã¬°äµû!");
					healthcnt += ten;
					defend_vir += ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
					status();
				}

				break;

			} else if (choice.equals("3")) {
				rancnt = ran.nextInt(3);
				if (rancnt == 0) {
					System.out.println("\t\t\t\t\t\t" +"Àü³¯ ³²±ä À½½ÄÀÌ »óÇÑ°Å °°´Ù... ¸ÀÀÌ ÀÌ»óÇÏ´Ù...");
					healthcnt -= ten;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
					defend_vir += minfive;
					System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				}

				else {
					System.out.println("\t\t\t\t\t\t" +"¾ÆÄ§Àº ¿ª½Ã µçµçÇÑ ±¹¹äÀÌÁö!!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}

				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"´Ù½Ã°ñ¶óÁ¶ »ÑÀ×");
				fun.timelate(1);
			}
		}

	}

	public void seoul_nur_afternoon() {
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Á¡½É¿£ ¹«¾ùÀ» ÇÒ°Ç°¡¿ä?");
			rancnt = ran.nextInt(10);
			if (rancnt == 0) {
				fun.timelate(1);
				System.out.println("\t\t\t\t\t\t" +"ÇÏÁö¸¸ ¹Ğ·Áµå´Â È¯ÀÚ¿¡ ÀÇÇØ ³ª´Â È¯ÀÚ¸¦ º¸°Ô µÇ¾ú´Ù.");
				fun.timelate(1);
				healthcnt += minten;
				System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
				status();
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"1.¹ä¸Ô±â 2.³·ÀáÀÚ±â 3.¼ö´Ù¶³±â");
				choice = in.next();
				if (choice.equals("1")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"¹äÀ» ¸ÀÀÖ°Ô ¸Ô¾ú´Ù!");
						healthcnt += ten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"¹äÀ» ±ŞÇÏ°Ô ¸Ô´Ù Ã¼ÇØ¹ö·È´Ù...");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						status();
					}
					break;
				} else if (choice.equals("2")) {
					rancnt = ran.nextInt(2);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"ÂÊÀáÀÌ¾ß¸»·Î ¼¼°èÃÖ°íÀÇ ½Ã°£!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						defend_vir += five;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"´ÊÀáÀ» ÀÚ ¼ö°£È£»ç´Ô²² È¥³µ´Ù....");
						System.out.println("\t\t\t\t\t\t" +"Á¤½ÅÀû Å¸°İÀÌ »ı°å´Ù");
						healthcnt += minfive;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					}
					break;
				} else if (choice.equals("3")) {
					rancnt = ran.nextInt(3);
					if (rancnt == 0) {
						System.out.println("\t\t\t\t\t\t" +"Àú³â ³²ÀÚÄ£±¸°¡ ¿¡¸£¸Ş½º¸¦ ¼±¹°ÇØÁá´Ù³× Âü³ª");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"Â¦ÅüÀÌ¿©¶ó--(°¨¼ºÃ¼·Â °¨¼Ò)");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"½Ã°£°¡´ÂÁÙ ¸ğ¸£°í ÀÖ¾úµû! ¼Ò¼ÒÇÑ Çàº¹");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"À×");
					fun.timelate(1);
				}
			}

		}

	}

	public int seoul_nur_night(int endcnt) {
		while (true) {
			while (true) {
				System.out.println("\t\t\t\t\t\t" +"¹ã¿¡´Â ¹«¾ùÀ» ÇÒ°í¾ß?");
//				rancnt = ran.nextInt(2);
//				if (rancnt == 0) {
//					fun.timelate(1);
//					System.out.println("±×·¯³ª ¿À´ÃÀº ¾ß±ÙÇÏ´Â³¯ ¡Ú");
//					healthcnt += minten;
//					defend_vir += minfive;
//					System.out.println("Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
//					System.out.println("¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
//					status(healthcnt, defend_vir);
//					break;
//				} else {
				System.out.print("\t\t\t\t\t\t" +"1.ÀáÀÚ±â 2.¼ú¸Ô±â 3.À¯Æ©ºêº¸±â");
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
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312ÁÙ
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"À¯ºZÀ»º¸´Ù »õ“İ 4½Ã°¡µÇ¾ú´Ù.....");
						fun.timelate(1);
						System.out.println("\t\t\t\t\t\t" +"ÇÏ³ª¸¸ ´õº¸°íÀÚ¾ßÁö");
						healthcnt += minten;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
						defend_vir += minfive;
						System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minfive + "Áõ°¡!");
						status();
					} else {
						System.out.println("\t\t\t\t\t\t" +"\r\n"  //  312ÁÙ
								+"\t\t\t\t\t\t" + "__   __               _           _           \r\n"
								+"\t\t\t\t\t\t" + "\\ \\ / /              | |         | |          \r\n"
								+"\t\t\t\t\t\t" + " \\ V /   ___   _   _ | |_  _   _ | |__    ___ \r\n"
								+"\t\t\t\t\t\t" + "  \\ /   / _ \\ | | | || __|| | | || '_ \\  / _ \\\r\n"
								+"\t\t\t\t\t\t" + "  | |  | (_) || |_| || |_ | |_| || |_) ||  __/\r\n"
								+"\t\t\t\t\t\t" + "  \\_/   \\___/  \\__,_| \\__| \\__,_||_.__/  \\___|\r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "                                              \r\n"
								+"\t\t\t\t\t\t" + "");
						System.out.println("\t\t\t\t\t\t" +"Àû´çÇÑ À¯Æ©ºê´Â ÀÎ»ı¿¡ µµ¿òÀÌ µÈ´Ù!!");
						healthcnt += five;
						System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
						status();
					}
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" +"´Ù¸Ş´Ù¸Ş ´Ù¸Ş¿ä");
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
			System.out.print("\t\t\t\t\t\t" +"ÄÚ·Î³ª °Ë»çÁß..");
			for (int i = 0; i < 2; i++) {
				fun.timelate(1);
				System.out.print("..");
			}
			System.out.println(" ");
			if (ran.nextInt(1000) < (corona_persent(defend_vir) * 10)) {
				System.out.println(String.format("\t\t\t\t\t\t" + "%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+"%ÀÇ È®·ü·Î ÄÚ·Î³ª¿¡ °É·È½À´Ï´Ù" + "\n");
				if (five == 3) {
					end.bad_omicron_die();
				} else {
					end.bad_corona_end();
				}
				endcnt = 1;

			} else {
				System.out.println(String.format("\t\t\t\t\t\t" +"%.2f", (corona_persent(defend_vir) * 100) / 100.00)
						+ "%ÀÇ È®·üÀ» ÇÇÇØ »ì¾Æ³²¾Ò½À´Ï´Ù." + "\n");
				fun.timelate(1);
			}
			break;
		}
		return endcnt;
	}

	public void nurse_baksin() {
		System.out.println("\t\t\t\t\t\t" +"¿À´ÃÀº ¹é½Å Á¢Á¾ÀÇ ³¯ÀÌ´Ù");
		System.out.println(" ");
		fun.timelate(1);
		int cnt = 0;
		while (cnt == 0 || cnt == 1) {

			if (cnt == 0) {
				System.out.println("\t\t\t\t\t\t" +"Ãâ±ÙÇß´Ù!!");
				fun.timelate(1);
			}
			if (cnt == 1) {
				System.out.println("\t\t\t\t\t\t" +"¹äÀ» ¸Ô°í ¿Ô´Ù");
				fun.timelate(1);
			}
			System.out.println("\t\t\t\t\t\t" +"¹«¾ùÀ» ÇÒ±î?");
			System.out.println("\t\t\t\t\t\t" +"1.¹é½Å ³õ¾ÆÁÖ±â 2.¹é½Å ³î¾ÆÁÖ±â 3.¹é½Å ³õ¾ÆÁÖ±â");
			choice = in.next();
			rancnt = ran.nextInt(3);
			if (rancnt == 0) {
				 System.out.println("\r\n"
				            + "\r\n"
				            + "                                                      .~              \r\n"
				            + "                                                       =!             \r\n"
				            + "                                                       .@;            \r\n"
				            + "                                                       -@@!           \r\n"
				            + "                                                      -#@@@;          \r\n"
				            + "                                                     -#@@@@@!         \r\n"
				            + "                                            ~=,     -#@@@@@@@;        \r\n"
				            + "                                            $@#.   -#@@@@@@*-$!       \r\n"
				            + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
				            + "                                            =:#@#-#@@@@@@*.           \r\n"
				            + "                                           $@@:#@#;@@@@@=.            \r\n"
				            + "                                          =@@@@:#@#:@@@=.             \r\n"
				            + "                                         -#@@@@@:$@#;@=.              \r\n"
				            + "                                        *.-#@@@@@:$@#:.               \r\n"
				            + "                                       $@#.-@@@@@@:#@#,               \r\n"
				            + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
				            + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
				            + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
				            + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
				            + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
				            + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
				            + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
				            + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
				            + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
				            + "                              :@@@@@@@@@@@@@@@*                       \r\n"
				            + "                            $* :@@@@@@@@@@@@@!                        \r\n"
				            + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
				            + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
				            + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
				            + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
				            + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
				            + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
				            + "                      :@@@@@@@@@@@@@@@*                               \r\n"
				            + "                       !@@@@@@@@@@@@@!                                \r\n"
				            + "                        *@@@@@@@@@@@*                                 \r\n"
				            + "                       ,=*@@@@@@@@@!                                  \r\n"
				            + "                       =@**@@@@@@@*                                   \r\n"
				            + "                      ,@@@=*@@@@@;                                    \r\n"
				            + "                      !@@@@*!@@@*                                     \r\n"
				            + "                      $@@@$- !@!                                      \r\n"
				            + "                     .=#=-                                            \r\n"
				            + "                    .=,.                                              \r\n"
				            + "                   .=,                                                \r\n"
				            + "                  .=,                                                 \r\n"
				            + "                 .=,                                                  \r\n"
				            + "                .=,                                                   \r\n"
				            + "               .=,                                                    \r\n"
				            + "              .=,                                                     \r\n"
				            + "             .=,                                                      \r\n"
				            + "            ,=,                                                       \r\n"
				            + "           .=,                                                        \r\n"
				            + "           ,,                                                         \r\n"
				            + "");
				System.out.println("\t\t\t\t\t\t" +"È¯ÀÚ ÆøÁÖ! ¹é½Å È¯ÀÚ°¡ ³Ê¹« ¸¹½À´Ï´Ù!!");
				healthcnt += minfive;
				System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
				status();
			} else {
				System.out.println("\t\t\t\t\t\t" +"¿À´ÃÀº È¯ÀÚ°¡ º°·Î ¾È°è½Å´Ù È÷È÷!");
				healthcnt += five;
				System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
				status();
			}
			cnt++;
		}
		while (true) {
			System.out.println("\t\t\t\t\t\t" +"Àú³èÀÌ´Ù...");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"1.¹é½Å ³õ¾ÆÁÖ±â 2.¹é½Å ³õ¾ÆÁÖ±â 3.¼ú¸Ô±â");
			choice = in.next();
			if (choice.equals("3")) {
				alcol();
				break;
			} else if (choice.equals("1") || choice.equals("2")) {
				rancnt = ran.nextInt(2);
				if (rancnt == 0) {
					 System.out.println("\r\n"
					            + "\r\n"
					            + "                                                      .~              \r\n"
					            + "                                                       =!             \r\n"
					            + "                                                       .@;            \r\n"
					            + "                                                       -@@!           \r\n"
					            + "                                                      -#@@@;          \r\n"
					            + "                                                     -#@@@@@!         \r\n"
					            + "                                            ~=,     -#@@@@@@@;        \r\n"
					            + "                                            $@#.   -#@@@@@@*-$!       \r\n"
					            + "                                            ,#@#, -#@@@@@@=.  ,,      \r\n"
					            + "                                            =:#@#-#@@@@@@*.           \r\n"
					            + "                                           $@@:#@#;@@@@@=.            \r\n"
					            + "                                          =@@@@:#@#:@@@=.             \r\n"
					            + "                                         -#@@@@@:$@#;@=.              \r\n"
					            + "                                        *.-#@@@@@:$@#:.               \r\n"
					            + "                                       $@#.-@@@@@@:#@#,               \r\n"
					            + "                                      $@@@#=@@@@@@@:#@#,              \r\n"
					            + "                                      $@@@@@@@@@@@@@:#@#.             \r\n"
					            + "                                    =,.$@@@@@@@@@@@@@~$@!             \r\n"
					            + "                                   $@@,.@@@@@@@@@@@@=..;              \r\n"
					            + "                                  $@@@@$@@@@@@@@@@@*                  \r\n"
					            + "                                  =@@@@@@@@@@@@@@@*                   \r\n"
					            + "                                =~ =@@@@@@@@@@@@@*                    \r\n"
					            + "                               $@@~ @@@@@@@@@@@@*.                    \r\n"
					            + "                              $@@@@$@@@@@@@@@@@!                      \r\n"
					            + "                              :@@@@@@@@@@@@@@@*                       \r\n"
					            + "                            $* :@@@@@@@@@@@@@!                        \r\n"
					            + "                          .$@@*.=@@@@@@@@@@@*                         \r\n"
					            + "                          $@@@@$@@@@@@@@@@@!                          \r\n"
					            + "                        ..-#@@@@@@@@@@@@@@*                           \r\n"
					            + "                        $$ -@@@@@@@@@@@@@!                            \r\n"
					            + "                       $@@$.*@@@@@@@@@@@*                             \r\n"
					            + "                      !@@@@#@@@@@@@@@@@!                              \r\n"
					            + "                      :@@@@@@@@@@@@@@@*                               \r\n"
					            + "                       !@@@@@@@@@@@@@!                                \r\n"
					            + "                        *@@@@@@@@@@@*                                 \r\n"
					            + "                       ,=*@@@@@@@@@!                                  \r\n"
					            + "                       =@**@@@@@@@*                                   \r\n"
					            + "                      ,@@@=*@@@@@;                                    \r\n"
					            + "                      !@@@@*!@@@*                                     \r\n"
					            + "                      $@@@$- !@!                                      \r\n"
					            + "                     .=#=-                                            \r\n"
					            + "                    .=,.                                              \r\n"
					            + "                   .=,                                                \r\n"
					            + "                  .=,                                                 \r\n"
					            + "                 .=,                                                  \r\n"
					            + "                .=,                                                   \r\n"
					            + "               .=,                                                    \r\n"
					            + "              .=,                                                     \r\n"
					            + "             .=,                                                      \r\n"
					            + "            ,=,                                                       \r\n"
					            + "           .=,                                                        \r\n"
					            + "           ,,                                                         \r\n"
					            + "");
					System.out.println("\t\t\t\t\t\t" +"È¯ÀÚ ÆøÁÖ! ¹é½Å È¯ÀÚ°¡ ³Ê¹« ¸¹½À´Ï´Ù!!");
					healthcnt += minfive;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
					status();
				} else {
					System.out.println("\t\t\t\t\t\t" +"¿À´ÃÀº È¯ÀÚ°¡ º°·Î ¾È°è½Å´Ù È÷È÷!");
					healthcnt += five;
					System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
					status();
				}
				break;
			} else {
				System.out.println("\t\t\t\t\t\t" +"ÀÀ¾Ö ³ª ¾Ö±â¼±ÅÃÁö ÀÌ°Ç¸ğ¸£°Ù¿À ÀÀ¾Ö");
			}
		}
	}

	public void status() {

		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println("\t\t\t\t\t\t" +"Ã¼·Â >> " + healthcnt);
		System.out.println("\t\t\t\t\t\t" +"°¨¿° ÀúÇ×·ü >> " + defend_vir);
		System.out.println("\t\t\t\t\t\t" +"================================");
		System.out.println(" ");

		fun.timelate(1);

	}

	public void sleep() {
		rancnt = ran.nextInt(3);
		System.out.println("\t\t\t\t\t\t" +"ÀáÀ»Àä´Ù");
		fun.timelate(1);
		if (rancnt == 0) {

			System.out.println("\t\t\t\t\t\t" +"²ÜÀáÀ» Àä´Ù");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + ten + "Áõ°¡!");
			System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + ten + "Áõ°¡!");
			healthcnt += ten;
			defend_vir += ten;
			status();
		} else if (rancnt == 1) {
			System.out.println("\t\t\t\t\t\t" +"¾Ç¸ùÀ» …f´Ù");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"±Í½ÅÀÌ Á¤¿ì¼º ½Å¹Î¾Æ´Ù...¿À...¤¡¤·¤§");
			healthcnt += five;
			System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
			status();
		} else {
			System.out.println("\t\t\t\t\t\t" +"¸ö»ìÀÌ ³µ´Ù");
			fun.timelate(1);
			System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minten + "Áõ°¡!");
			healthcnt += minten;
			defend_vir += ten;
			System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + minten + "Áõ°¡!");
			status();
		}

	}

	public void alcol() {
		alcol_cnt++;
		System.out.println("\t\t\t\t\t\t" +"¼úÀ»¸Ô´Â´Ù?");
		rancnt = ran.nextInt(2);
		if (rancnt == 0) {
			System.out.println("\r\n"   // 1065¹øÂ° ÁÙ
		            + "\r\n"
		            + "                 ;$$$$~                ~\r\n"
		            + "               ,$     ,$, .             \r\n"
		            + "         ~$-~$*=        =~--~$-         \r\n"
		            + "       :!     ,               *-        \r\n"
		            + "       !                       $        \r\n"
		            + "      ;                        !.       \r\n"
		            + "      $                        ;.      .\r\n"
		            + "      =                        $       ;\r\n"
		            + "      ;                       ;:       .\r\n"
		            + "       =        *      .$$;::$-        ~\r\n"
		            + "       -$     .$*$.   .$    .$         ~\r\n"
		            + "        .$$==$!   $== =     .$          \r\n"
		            + "         *                  .$;.        \r\n"
		            + "         *                   ,.!=       \r\n"
		            + "         *  .*-   ;*    *=      .=      \r\n"
		            + "         *  ,.    ;     :    $=. ;.     \r\n"
		            + "         *  -     ;     :    $ $  =     \r\n"
		            + "         =  ,     =     :    $ ,, $     \r\n"
		            + "         =  -     =     -    $ ,! $     \r\n"
		            + "         =  -     =     ,    $ -, $     \r\n"
		            + "         =  -     =     .   .$ $  $     \r\n"
		            + "         $  -     =     .   ,$=, ~;     \r\n"
		            + "         $  -     =     .   ,=.  $      \r\n"
		            + "         $  -     =     .       $       \r\n"
		            + "         $  -     =     .     :$.       \r\n"
		            + "         =  -     =     .   -$;         \r\n"
		            + "         $        =     .   -=          \r\n"
		            + "        *;  -     =     .   ,$          \r\n"
		            + "        $         $,-   =.   =          \r\n"
		            + "       .$                    =          \r\n"
		            + "        $                    $          \r\n"
		            + "        *~                  $-          \r\n"
		            + "         ; ;.            ~-;            \r\n"
		            + "            ==$=-    ~=$=!              \r\n"
		            + "                .,,,.                   \r\n"
		            + "");
			System.out.println("\t\t\t\t\t\t" +"¸ö°ú ¸¶À½À» ¾ËÄÚ¿Ã·Î ¼Òµ¶ÇÏ¿´´Ù.");
			healthcnt += five;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + five + "Áõ°¡!");
			System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
			status();

		} else {
			System.out.println("\t\t\t\t\t\t" +"°úµµÇÑ À½ÁÖ´Â °Ç°­¿¡ ÇØ·ÓÁö..");
			healthcnt += minfive;
			defend_vir += five;
			System.out.println("\t\t\t\t\t\t" +"¸é¿ª·ÂÀÌ " + five + "Áõ°¡!");
			System.out.println("\t\t\t\t\t\t" +"Ã¼·ÂÀÌ " + minfive + "Áõ°¡!");
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
