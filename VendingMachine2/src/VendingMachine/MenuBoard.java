package VendingMachine;

public class MenuBoard {
	
	String[][] menuBoard = {{"�ݶ�(600��)", "���̴�(600��)", "ȯŸ(600��)"},
			{"Ŀ��(1480��)", " ����(470��)", "�̿�����(900��)"},
			{"����(1350��)", " ����(1000��)", " ��(550��)"}};
	
	int[][] menuBoardNum = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};		// �޴��� ��ȣ
	
	public void menuBoard() {
		System.out.println("========================�޴�(MENU)========================");
		System.out.println();
		
		for(int i = 0; i < menuBoard.length; i++) {
			for(int j = 0; j < menuBoard.length; j++) {
				System.out.printf(menuBoardNum[i][j] + "%14s   ", menuBoard[i][j]);
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println("                    10 �������� �ʰ� ������");
		System.out.println("=========================================================");
		System.out.println();
	}
}