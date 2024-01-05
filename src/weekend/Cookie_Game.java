package weekend;

import java.util.Random;
import java.util.Scanner;


public class Cookie_Game {
	
	public static long cookie = 0;			// 보유쿠키
	public static int workPower = 1;		// 노동력
	public static int cookiePowerCost = 10;	// 강화비용
	public static int powerRatio = 0;		// 꾸끼
	public static boolean ggukki[] = new boolean[5];	// 꾸끼 보유 확인
	public static String ggukkiName[] = new String[5]; // 꾸끼 이름 
	public static int count = 0;						// 꾸끼 개수
	public static Random rand = new Random();

	
	
	public static int main() {
		Scanner sc =new Scanner(System.in);
		System.out.println("");
		System.out.println("");
		System.out.print("============================Cookie Game============================");
		System.out.println("");
		System.out.println("                          보유 쿠키 : " + cookie);
		System.out.println("                          현재 노동력 :" + workPower);
		System.out.println("");
		System.out.println("1. 일하기         	    2. 강화하기                3. 꾸끼구매하기  ");
		System.out.println("4. 보유쿠키 확인하기    5. 스테이터스 확인하기");
		System.out.println("6. 게임종료     	    7. 게임설명");
		System.out.println();
		System.out.print("===================================================================");
		System.out.println("");
		System.out.print("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}	
	
	public static void set() {					// 꾸끼이름설정
		for(int i=0;i<ggukki.length;i++) {
			ggukki[i] = false;
		}
		ggukkiName[0] = "잔망꾸끼";
		ggukkiName[1] = "승환꾸끼";
		ggukkiName[2] = "준영꾸끼";
		ggukkiName[3] = "뽕씪꾸끼";
		ggukkiName[4] = "봉쒺꾸끼";		
	}
	public static void information() {
		System.out.println("        Cookie_Game은 노가다를 통해 쿠키를 모으고 ");
		System.out.println("        모은 쿠키를 소모하여 꾸끼를 구매하여 노동력을 향상시키고");
		System.out.println("        향상시킨 노동력으로 쿠키를 더 모으고를 반복하며");
		System.out.println("        기하급수적으로 늘어나는 쿠키를 보며 성취감을 얻는 게임입니다");
		System.out.println("");
		System.out.println("");
		System.out.println("              모든 꾸끼를 모아보세요! ");
		System.out.println("               (플탐 10분 내외)");
	}
	public static void work() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.print("============================ 1. 일하기 ==============================");
			while(true) {
			System.out.println();

			System.out.println("    --------------------------------------------------------");
			System.out.println();
			System.out.printf("              노동으로 %d + %d개의 쿠키를 얻습니다 \n",workPower,powerRatio);
			System.out.println();
			System.out.println("              보유큐키 : " + cookie + "쿠키");
			System.out.println();
			System.out.println("    --------------------------------------------------------");
			System.out.println();
			System.out.println("1. 노동을 하시겠습니까         2. 그만하시겠습니까");
			System.out.print("선택 >> ");
			int workChoice = sc.nextInt();
			if(workChoice==1) {
				cookie = cookie + workPower + powerRatio;
				int happyCookie = rand.nextInt(5)+1;					// 행운쿠키
				int junCookie = rand.nextInt(20)+1;						// 준영꾸끼
				int bbongshik = rand.nextInt(40)+1;						// 뽕씪꾸끼
				if(happyCookie==1&&ggukki[1]==true) {
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println();
					System.out.println("                                           승환꾸끼효과 발동!!!                         ");
					System.out.printf("                                     %d개의 쿠키를 추가로 획득하셨습니다!!!                  \n ",workPower + powerRatio);
					System.out.println("");
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠＆■☞♠※＆■☞♠※＆■※＆■＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println();
					System.out.println();
					System.out.println();
					System.out.println();

					cookie = cookie + workPower + powerRatio;
				}else {
				}
				if(junCookie==1&&ggukki[2]==true) {
					System.out.println();
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("");
					System.out.println("                                    준영꾸끼효과 발동!!!                         ");
					System.out.printf("                             %d개의 쿠키를 추가로 획득하셨습니다!!!                 \n  ",(workPower + powerRatio)*100);
					System.out.println("");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println();
					cookie = cookie + (workPower + powerRatio)*100;
				}else {
				}
				if(bbongshik==1&&ggukki[3]==true) {
					System.out.println();
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("                                        뽕씪꾸끼 발동!!!                          ");
					System.out.printf("                                %d개의 쿠키를 추가로 획득하셨습니다!!!                  \n ",(workPower + powerRatio)*1000);
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println("☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■＆■☞♠※＆■☞♠※＆■");
					System.out.println("☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆");
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
					System.out.println();
					cookie = cookie + (workPower + powerRatio)*1000;
				}else {
				}
			}else if(workChoice==2) {
				break;
			}		
		}
	}
	
	public static void power() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.print("=========================== 2. 강화하기 =============================");
			System.out.println();
			System.out.println("                        현재 노동력 : " + workPower + "쿠키");
			System.out.println("                        현재 쿠키량 : " + cookie + "쿠키");
			System.out.println("                        강화비용 : " + cookiePowerCost + "쿠키");
			System.out.println();
			System.out.println("------------------------ 강화하시겠습니까? --------------------------");
			System.out.println();
			System.out.println("                    1. 강화한다.     2. 안 한다.");
			System.out.print("선택 >>");
			int powerChoice = sc.nextInt();
			if(powerChoice==1) {
				if(cookie >= cookiePowerCost) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("***********강화완료************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");

					cookie = cookie - cookiePowerCost;
					workPower = workPower * 2;
					cookiePowerCost = cookiePowerCost * 3;
					break;					
				}else {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("       쿠키가 부족합니다.          ");
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					break;
				}
			}else if(powerChoice==2) {
				break;
			}	
		}
	}
	public static void shopping() {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("======== 3. 꾸끼구매 ========");
			System.out.println();
			System.out.println(" 1. ++++ 잔망꾸끼 ++++   	 2.  ++++ 승환꾸끼 ++++   	  3. ++++ 준영꾸끼 ++++	");
			System.out.println(" 가격 :   300쿠키          	 가격 : 8,000쿠키        	  가격 : 25,000쿠키     ");
			System.out.println(" 능력 : 노동력 +100 향상   	 능력 : 승환꾸끼효과발동        능력 : 준영꾸끼효과발동  ");
			System.out.println();
			System.out.println();
			System.out.println("4. ++++ 뽕씪꾸끼 ++++    	5. ++++ 봉쒺꾸끼 ++++");
			System.out.println("가격 : 400,000쿠키       	가격 : 33,333,333쿠키");
			System.out.println("능력 : 뽕씪꾸끼효과발동    	능력 : 수업종료발동");
			System.out.println();
			System.out.println();
			System.out.print("선택 >> ");
			double cookieChoice = sc.nextInt();
			if(cookieChoice==1) {
				if(ggukki[0]==true) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("    이미 보유하고 있는 꾸끼입니다.    ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}else if(cookie >= 300) {
					cookie = cookie - 300;
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("           구매완료! ^^*         ");
					System.out.println("   노동당 +100개의 쿠키를 얻습니다!   ");
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					powerRatio = powerRatio + 100;
					ggukki[0] = true;
					count = count + 1;
				}else {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("        쿠키가 부족합니다."         );
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}
			}
			else if(cookieChoice==2) {
				if(ggukki[1]==true) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("    이미 보유하고 있는 꾸끼입니다.    ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}else if(cookie >= 8000) {
					cookie = cookie - 8000;
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("           구매완료! ^^*         ");
					System.out.println("   이제 1/5의 확률로 노동당 2배의   ");
					System.out.println("     쿠키를 얻을 수 있습니다! ^^*    ");
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					ggukki[1] = true;
					count = count + 1;
				}else {
					System.out.println("쿠키가 부족합니다.");
				}
			}
			else if(cookieChoice==3) {
				if(ggukki[2]==true) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("    이미 보유하고 있는 꾸끼입니다.    ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}else if(cookie >= 25000) {
					cookie = cookie - 25000;
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("           구매완료! ^^*         ");
					System.out.println(" 이제 1/20의 확률로 노동량 100배의  ");
					System.out.println("     쿠키를 얻을 수 있습니다! ^^*    ");
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					ggukki[2] = true;
					count = count + 1;
				}else {
					System.out.println("쿠키가 부족합니다.");
				}
			}
			else if(cookieChoice==4) {
				if(ggukki[3]==true) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("    이미 보유하고 있는 꾸끼입니다.    ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}else if(cookie >= 400000) {
					cookie = cookie - 400000;
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("                               ");
					System.out.println("           구매완료! ^^*         ");
					System.out.println("  이제 1/40의 확률로 노동량 1000배의 ");
					System.out.println("      쿠키를 얻을 수 있습니다! ^^*   ");
					System.out.println("                               ");
					System.out.println("*******************************");
					System.out.println("*******************************");
//					powerRatio = powerRatio * 2;
					ggukki[3] = true;
					count = count + 1;
				}else {
					System.out.println("쿠키가 부족합니다.");
				}
			}
			else if(cookieChoice==5) {
				if(ggukki[4]==true) {
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("    이미 보유하고 있는 꾸끼입니다.    ");
					System.out.println("*******************************");
					System.out.println("*******************************");
					System.out.println("*******************************");
				}else if(cookie >= 33333333) {
					cookie = cookie - 33333333;
					System.out.println();
					System.out.println("☞♠※＆■☞♠※＆■*********************☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆★★★★★★★★★★★★★★★★★■☞♠※＆■☞♠※＆■☞♠※＆■");
					System.out.println();
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♠※＆■☞♠※＆■☞♠※＆■☞♠♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣★★★★★★★★★★★★★★★★★♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println();
					System.out.println("**********♠※＆■☞♠※＆■☞♠※＆■☞♠***********************★★★★★★★★★★★★★★★★★********************************");
					System.out.println("**************★★★★★★★★★★★★★★★★★*********************************♠※＆■☞♠※＆■☞♠※＆■☞♠******************");
					System.out.println("");
					System.out.println("                                               구매완료! ^^*                          ");
					System.out.println("                                          오늘 수업을 종료합니다!!!                     ");
					System.out.println("");
					System.out.println("*******************************♠※＆■☞♠※＆■☞♠※＆■☞♠*******************★★★★★★★★★★★★★★★★★***************");
					System.out.println("****♠※＆■☞♠※＆■☞♠※＆■☞♠**********************************★★★★★★★★★★★★★★★★★***************************");
					System.out.println();
					System.out.println("♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♠※＆■☞♠※＆■☞♠※＆■☞♠♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣★★★★★★★★★★★★★★★★★♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣♧♣");
					System.out.println();
					System.out.println("☞♠※＆■☞♠※＆■♠※＆■☞♠※＆■☞♠★★★★★★★★★★★★★★★★★※＆■☞♠☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■☞♠※＆■");
					System.out.println();
//					powerRatio = powerRatio * 2;
					ggukki[4] = true;
					count = count + 1;
				}else {
					System.out.println("쿠키가 부족합니다.");
				}
			}
	}
	public static void retain() {
		System.out.println();
		System.out.println("**********현재 보유하고 있는 꾸끼******************");
		System.out.println();
		for(int i=0;i<ggukki.length;i++) {
			if(ggukki[i]==true) {
				System.out.println(ggukkiName[i] + "을(를) 보유하고 있습니다! ^^*");
			}else {
				System.out.println(ggukkiName[i] + "은(는) 보유하고 있지 않습니다.. ㅠoㅠ");
			}
		}
		System.out.println();
		System.out.println("**********************************************");
	}
	public static void status() {
		System.out.println();
		System.out.printf("현재 보유 쿠키는 %d개입니다.\n", cookie);
		System.out.printf("현재 보유한 꾸끼는 %d개입니다.\n", count);
		System.out.printf("현재 노동력은 %d입니다.\n", workPower);
		if(ggukki[0]==true) {
			System.out.println("현재 잔망꾸끼의 버프로 노동력 +100를 얻습니다!");
		}
		if(ggukki[1]==true) {
			System.out.println("현재 승환꾸끼의 버프로 1/10의 확률로 노동당 2배의 쿠키를 얻습니다!");
		}
		if(ggukki[2]==true) {
			System.out.println("현재 준영꾸끼의 버프로 1/30의 확률로 노동당 100배의 쿠키를 얻습니다!");
		}
		if(ggukki[3]==true) {
			System.out.println("현재 뽕씪꾸끼의 버프로 1/50의 확률로 노동당 1000배의 쿠키를 얻습니다!");
		}
		System.out.println();
	}
	public static void end() {
		System.out.println("시스템을 종료합니다!.");
	}
}