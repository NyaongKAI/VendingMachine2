package VendingMachine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VendingMachineClass {
	
	Scanner sc = new Scanner(System.in);
	private int money;
	private int menuNum;		// �ݾ�, switch ����� ��
	private int pay = 0;			// ���� �ݾ�
	private int thing = 0;			// ���� �ְ� ���� ����
	private int subMoney;			// �� ������ ��
	String con;				// n�̳� N �� �� ����� ����
	//int n1000 = 0, n500 = 0, n100 = 0, n50 = 0, n10 = 0;
	
	int[] menuNum2 = new int[9];	// ���� �޴� ����
	String[] menu = {"�ݶ�", "���̴�", "ȯŸ", "Ŀ��", "����", "�̿�����", "����", "����", "��"};	//���� ���� �޴���

	public void insertMoney() {
		while(true) {
			System.out.print("�ݾ��� �Է��ϼ���. : ");
			try {
			 money = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. ���Է�");
				sc.next();
				continue;
			}
			if(money < 0)
				System.out.println("�˸��� ���� �Է��Ͻÿ�.");
			else {
				System.out.println("���� ���Ե� �ݾ� : " + money + "��");
				break;
			}
		}
	}
	
	public void menuSelect() {
		while(true) {
			System.out.print("���Ḧ �����ϼ���.(��ȣ �Է�) : ");
			try {
				menuNum = sc.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("������ �ƴմϴ�. ���Է�");
				sc.next();
				continue;
			}
			
			switch(menuNum) {
				case 1:
					pay = 600;
					menuNum2[0]++;	// �ݶ� ���� �߰�
					break;
				case 2:
					pay = 600;
					menuNum2[1]++;	// ���̴� ���� �߰�
					break;
				case 3:
					pay = 600;
					menuNum2[2]++;	// ȯŸ ���� �߰�
					break;
				case 4:
					pay = 1480;
					menuNum2[3]++;	// Ŀ�� ���� �߰�
					break;
				case 5:
					pay = 470;
					menuNum2[4]++;	// ���� ���� �߰�
					break;
				case 6:
					pay = 900;
					menuNum2[5]++;	// �̿����� ���� �߰�
					break;
				case 7:
					pay = 1350;
					menuNum2[6]++;	// ���� ���� �߰�
					break;
				case 8:
					pay = 1000;
					menuNum2[7]++;	// ���� ���� �߰�
					break;
				case 9:
					pay = 550;
					menuNum2[8]++;	// �� ���� �߰�
					break;
				case 10:
					break;
				default:
					System.out.println("�޴� �缱��(1 ~ 9) Ȥ�� ���� �� ��(10)");	
			}	// switch��

			if(money < pay && menuNum != 10) {
				if(menuNum < 1 || menuNum > 9)
					continue;
				
				System.out.println("�ܾ��� �����մϴ�. " + (pay - money) + "�� ��ŭ �ʿ��մϴ�.");
				menuNum2[menuNum - 1]--;	// �߰��� �������� �ϳ� ��
				System.out.print("��� �Ͻðڽ��ϱ�?(Y or N) : ");
				con = sc.next();
				if(con.equals("n")||con.equals("N"))
					break;	// while�� ����������
				
				while(true) {
					System.out.print("���� �� �������ּ���. : ");
					try {
						subMoney = sc.nextInt();
					}
					catch(InputMismatchException e) {
						System.out.println("������ �ƴմϴ�. ���Է�");
						sc.next();
						continue;
					}
					if(subMoney < 0)
						System.out.println("�˸��� ���� �Է��Ͻÿ�.");
					else {
						money += subMoney;
						System.out.println("���� ���Ե� �ݾ� : " + money +"��");
						break;
					}
				}
			}	// �ܾ� ����
			else if(menuNum == 10) {
				break;	// while�� ����������
			}
			else if(menuNum >= 1 && menuNum <= 9){ // �޴� �� ���ø� �߰� �ϱ� ����, �Ⱦ��� �ؿ��� ���� �� ����
				thing = 1;
				money -= pay;
				System.out.println("�ܾ� : " + money +"��");
				
				System.out.print("�߰� ����?(Y or N) : ");
				con = sc.next();
				
				if(con.equals("n")||con.equals("N"))
					break;	// while�� ����������
			}	
		} //while �޴� ����
	}
	
	public void selectFinish() {
		
		System.out.println("�̿����ּż� �����մϴ�.");
		if(thing != 1)
			System.out.print("�����Ͻ� �޴��� �����ϴ�.");		// ������ ���� ���
		else {
			System.out.print("�����Ͻ� �޴��� ");
			for(int i = 0; i < 9; i++) {
				System.out.print(menu[i] + "�� " + menuNum2[i] + "��");
				if(i < 8)
					System.out.print(", ");
			}	// �޴��� ����
		}
		System.out.println();
		System.out.println("���� �ݾ��� " + money + "�� �Դϴ�.");
		
	}
	
	public void returnMoney() {
		int[] coinUnit = { 1000, 500, 100, 50, 10, 1 };	// �Ž����� ����
		for (int i = 0; i < coinUnit.length; i++) {
			System.out.print(coinUnit[i] + "�� " + money/coinUnit[i] +"��");
			money %= coinUnit[i];
			if(i < coinUnit.length - 1)
				System.out.print(", ");
		} // �Ž�����
		/*
		System.out.println();
		n1000 = money/1000;
		n500 = (money%1000)/500;
		n100 = ((money%1000)%500)/100;
		n50 = (((money%1000)%500)%100)/50;
		n10 = ((((money%1000)%500)%100)%50)/10;
		
		System.out.println("1000�� " + n1000 + "��, 500�� " + n500 + "��, 100�� " + n100 + "��, 50�� " + n50 +"��, 10�� " + n10 +"��");
		*/
	}
}