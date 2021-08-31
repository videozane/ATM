
public class ATMTester {
	public static void main(String[] args) {
		ATM jim = new ATM();
		jim.newDeposit(50);
		jim.newDeposit(30);
		jim.idDeposit("ddsdsiwi", 10000);
		jim.idDeposit("ddsdsiwi", 1);
		System.out.println(jim.getBalance("ddsdsiwi"));
	}

}
