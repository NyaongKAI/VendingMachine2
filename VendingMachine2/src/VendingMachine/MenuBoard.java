package VendingMachine;

public class MenuBoard {
	
	String[][] menuBoard = {{"콜라(600원)", "사이다(600원)", "환타(600원)"},
			{"커피(1480원)", " 생수(470원)", "이온음료(900원)"},
			{"과자(1350원)", " 팝콘(1000원)", " 껌(550원)"}};
	
	int[][] menuBoardNum = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};		// 메뉴판 번호
	
	public void menuBoard() {
		System.out.println("========================메뉴(MENU)========================");
		System.out.println();
		
		for(int i = 0; i < menuBoard.length; i++) {
			for(int j = 0; j < menuBoard.length; j++) {
				System.out.printf(menuBoardNum[i][j] + "%14s   ", menuBoard[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("                    10 선택하지 않고 나가기");
		System.out.println("=========================================================");
		System.out.println();
	}
}