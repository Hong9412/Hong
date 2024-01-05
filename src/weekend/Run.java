package weekend;

public class Run {
	
	public static void main(String[] args) {
		Cookie_Game cg = new Cookie_Game();
		cg.set();
		end : 
		while(true) {
			int choice = cg.main();			// 메인화면
			switch(choice) {
			case 1: cg.work(); break;		// 일하기
			case 2: cg.power(); break;		// 강화하기
			case 3: cg.shopping(); break;	// 꾸끼구매하기
			case 4: cg.retain(); break;		// 보유꾸끼 확인하기
			case 5: cg.status(); break;		// 스테이터스 확인하기
			case 6: cg.end(); break end;	// 게임종료
			case 7: cg.information(); break; //게임설명
			}			
		}
	}
}