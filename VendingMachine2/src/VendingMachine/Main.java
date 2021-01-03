package VendingMachine;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MenuBoard mb = new MenuBoard();
		mb.menuBoard();
		
		VendingMachineClass vmc = new VendingMachineClass();
		vmc.insertMoney();
		vmc.menuSelect();
		vmc.selectFinish();
		vmc.returnMoney();

	}

}