package gagame;

import java.util.ArrayList;
import java.util.Scanner;

import DB.DBDAO;
import DB.loginMethod;
import gagame.seoul;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		function fun = new function();
		String mychar[] = { "0" };
		DBDAO dao = new DBDAO();
		loginMethod db = new loginMethod();
		seoul mon = new seoul(); // 랭킹을 위한 객체
		String choice = null;
		int start = 0;

		while (true) {
			
			if(start != 0) {
				System.out.println("\t\t\t\t\t\t"+ "===========================");
				System.out.print("\t\t\t\t\t\t" + "엔딩크레딧을 보시겠습니까? Y/N >>>>");
				String ending = in.next();
				if(ending.equals("Y") || ending.equals("y")) {
					System.out.println("\t\t\t\t\t\t" + "[엔딩]");
					while(true) {
					
					System.out.println("\t\t\t\t\t\t" +"엔딩 고르기");
					System.out.print("\t\t\t\t\t\t" + "1히든 헬창, 2히든 백신, 3히든 크리스마스,"+"\n"
							+ "\t\t\t\t\t\t" + "4노말 학생, 5노말 운동, 6노말 간호사, 7배드엔딩 코로나"+"\n"
							+ "\t\t\t\t\t\t" +"8배드엔드 변이바이러스,9 배드엔드 과로"+"\n"
							+ "\t\t\t\t\t\t" + "10.히든 알코올 , 11 고라니엔딩, 12 나가기 >>>" );
					int x = in.nextInt();
					onlyend(x);
					fun.timelate(2);
					if(x==12) {
						break;
					}
				}
				}else if(ending.equals("N") || ending.equals("n")) {
					
				}
			}
			
			
			
			
			if(start != 0) {
				System.out.print("\t\t\t\t\t\t" + "재시작하시겠습니까?  Y/N >>>");
				String restart = in.next();
				if (restart.equals("y") || restart.equals("Y")) {
					System.out.println();
					System.out.println();
				} else if (restart.equals("n") || restart.equals("N")) {
					System.out.println("\t\t\t\t\t\t" + "종료합니다...");
					break;
				}
			}
			
			

			String nick = db.db();
			if (nick == null) {
				System.out.println("\t\t\t\t\t\t" + "종료합니다...");
				break;
			}

			System.out.println();
			System.out.println("\t\t\t\t\t\t" + " ==== Game Start... ====");
			fun.timelate(1);
			System.out.println("\t\t\t\t" + " 코로나 대유행으로 인해 대한민국은 심각한 침체기를 겪고 있다... ");
			fun.timelate(1);
			System.out.println("\t\t\t\t" + " 2021년... 당신은 코로나를 걸리지 않고 대한민국에서 살아남을수 있을 것인가...  ");
			fun.timelate(1);
			System.out.println("\t\t\t\t" + " 화려한 아침햇살이 나를 감싸는 방안... 눈을뜨며 하루의 일과를 시작하게 된다... ");
			System.out.println("");

			seoul se = new seoul();
			while (true) {
				charchoice(mychar);

				System.out.println("\t\t\t\t\t\t" + "========도시를 고르세요========");
				System.out.println("\t\t\t\t\t\t" + "===========================");
				System.out.println("\t\t\t\t\t\t" + "1.수도권  2.지방 3.강원도 두메산골");
				System.out.print("\t\t\t\t\t\t" + "(Hell) (Normal) (응애애기유저) >>>");
				choice = in.next();
				if (choice.equals("1")) {
					se.main(mychar);
					choice = "수도권";
					break;
				} else if (choice.equals("2")) {
					se.zibang(mychar);
					choice = "지방";
					break;
				} else if (choice.equals("3")) {
					se.dume(mychar);
					choice = "강원도두메산골";
					break;
				} else {
					System.out.println("\t\t\t\t\t\t" + "장난 멈춰");
				}

			}

			String month = mon.returnMonth + "번째 달";
			dao.ranking(nick, choice, month);
			start++;

		}
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

	static void charchoice(String mychar[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("\t\t\t\t\t\t" + "=======캐릭터를 고르세요=======");
			System.out.println("\t\t\t\t\t\t" + "===========================");
			System.out.println("\t\t\t\t\t\t" + "1.간호사 >> 체력(보통) 감염저항↑");
			System.out.println("\t\t\t\t\t\t" + "간호사의 특징 : 조기백신");
			System.out.println("\t\t\t\t\t\t" + "2.운동선수 >> 체력↑  감염저항(보통)");
			System.out.println("\t\t\t\t\t\t" + "운동선수의 특징 : 체력만랩");
			System.out.println("\t\t\t\t\t\t" + "3.학생 >> 체력(보통)  감염저항(보통)");
			System.out.print("\t\t\t\t\t\t" + "학생의 특징 : 특징없는 특징");
			mychar[0] = in.next();
			if (mychar[0].equals("1") || mychar[0].equals("2") || mychar[0].equals("3")) {
				if (mychar[0].equals("1")) {
					System.out.print("\t\t\t\t\t\t" + "간호사 ");
					System.out.println("\r\n" // 간호사 선택
							+ "\t\t\t\t\t\t" + "                              \r\n" + "\t\t\t\t\t\t"
							+ "          ~@@@@@@@@#          \r\n" + "\t\t\t\t\t\t"
							+ "          ;@  @@- @*          \r\n" + "\t\t\t\t\t\t"
							+ "         @ =@@@@@@@ =!        \r\n" + "\t\t\t\t\t\t"
							+ "        @      .@:   @        \r\n" + "\t\t\t\t\t\t"
							+ "        @ :@@@,   $@~@        \r\n" + "\t\t\t\t\t\t"
							+ "       @~!          -@@       \r\n" + "\t\t\t\t\t\t"
							+ "        @@          !@-       \r\n" + "\t\t\t\t\t\t"
							+ "       ,@:@        =$;!       \r\n" + "\t\t\t\t\t\t"
							+ "        @  ;@$;;=@=  @,       \r\n" + "\t\t\t\t\t\t"
							+ "          -~@    @~~          \r\n" + "\t\t\t\t\t\t"
							+ "    -#@@$:@-  *=   @~=@@@~    \r\n" + "\t\t\t\t\t\t"
							+ "  #=       -@~  ,@*       :@  \r\n" + "\t\t\t\t\t\t"
							+ " :=           -$           ~= \r\n" + "\t\t\t\t\t\t"
							+ " *!   @       -$ ,@@@= @   .$ \r\n" + "\t\t\t\t\t\t"
							+ " *!   @       -$       @   .$ \r\n" + "\t\t\t\t\t\t" + "      ~        .       :    , ");
				} else if (mychar[0].equals("2")) {
					System.out.print("\t\t\t\t\t\t" + "운동선수 ");
					System.out.println("\t\t\t\t\t\t" + "\r\n" + "                                              \r\n"
							+ "\t\t\t\t\t\t" + "                      ;!;;!-                      \r\n" + "\t\t\t\t\t\t"
							+ "            .        *~    ;-       ..            \r\n" + "\t\t\t\t\t\t"
							+ "          ~;;;      ~-      *,     ,;!;           \r\n" + "\t\t\t\t\t\t"
							+ " ;********!  ~******!       ,*******. ~*********, \r\n" + "\t\t\t\t\t\t"
							+ ",:      .;   .~     :       .~     ;   .!      .; \r\n" + "\t\t\t\t\t\t"
							+ ".!      ,:   .!     :       .~    ~:   .!      ,; \r\n" + "\t\t\t\t\t\t"
							+ " -~~*~~~~; .~::~~~~~;       ,;~~~~~!:- .;~~~;;~~. \r\n" + "\t\t\t\t\t\t"
							+ "    *    : ,:       ~.      *,       ; .;   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   !- ,-       ,!     -;        ;  ;   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   *  ,,        ~;   .*         !  :~  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  -;  -,         ;   .-         !. .*  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  ~.  ~,      .!*:   .**:       ;,  *, ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   -,     :;,        ~*.     !.  -~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   ,,  . !:           .!. .  !    ~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  !   -*;;;;:    .   ,    ,;;;;!!.  .~ ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  :    .         -,  !         ..   !- ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  ~-             -,  !              *  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *  .*             -,  !             ~;  ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   *.            -,  !             :   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *   ,!-.         ~;.  ~;.         .::   ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *    ,!***;.   !*!.    ~!*   .~***!:    ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *         ,~;               :;-.        ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *           ,*             ~!           ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            -~            ;            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             ;           -~            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             :           ;-            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             :           !-            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *             ~           *.            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *************=*            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *.............:            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *             :            ~-    \r\n" + "\t\t\t\t\t\t"
							+ "    *            *,,,,,,,,,,,,,;            --    \r\n" + "\t\t\t\t\t\t"
							+ "    ,            ,,,,,,,,,,,,,,,                  ");
				} else {
					System.out.print("\t\t\t\t\t\t" + "학생 ");
					System.out.println("                      \r\n"
							+ "                                                        .=-* * * **:!         \r\n"
							+ "\t\t\t\t\t\t" + "        =         -!        \r\n" + "\t\t\t\t\t\t"
							+ "       .!          =        \r\n" + "\t\t\t\t\t\t" + "        ;-  ****   !-        \r\n"
							+ "\t\t\t\t\t\t" + "         .=~    ;=          \r\n" + "\t\t\t\t\t\t"
							+ "        ,::~,-,-:::.        \r\n" + "\t\t\t\t\t\t" + "    ,=*- =. ~=  =  :*=.    \r\n"
							+ "\t\t\t\t\t\t" + "  ;:      ,* *. =       *,  \r\n" + "\t\t\t\t\t\t"
							+ " .=                      .=  \r\n" + "\t\t\t\t\t\t" + "-=.    ,            ~    ,=.\r\n"
							+ "\t\t\t\t\t\t" + "~=~. -=:            ==. .;=,\r\n" + "\t\t\t\t\t\t"
							+ " !..*;~:            =.!: .; \r\n" + "\t\t\t\t\t\t" + " =. -*-:            = *- .* \r\n"
							+ "\t\t\t\t\t\t" + " =. -*-:            = *, .* \r\n" + "\t\t\t\t\t\t"
							+ " .---  :;;;;;;;;;;;;~ .---  ");
				}
				System.out.println("\t\t\t\t\t\t" + "선택 완료!");
				break;
			} else {
				System.out.println(mychar[0]);
				mychar[0] = "0";
				System.out.println("\t\t\t\t\t\t" + "이상한거는 다메다메☆");

			}
		}
//		in.close();
	}
}
