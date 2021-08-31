import java.util.Random;
import java.util.HashMap;

public class ATM {
	private HashMap<String, Double> map;
	
	public ATM() {
		map = new HashMap<>();
	}
	 
	public double getBalance(String ID){
		return map.get(ID);
	}
	
	public void deposit(String ID, double amount) {
		if (amount > 0) {
			if (map.get(ID)!= null) {
				map.replace(ID, map.get(ID)+amount);
				System.out.println("Balance of $"+amount+" deposited into account with ID "+ID+".");
			} else {
				map.put(ID,amount);
				System.out.println("Balance of $"+amount+" deposited into account with ID "+ID+".");
			}
		} else {
			System.out.println("Error: cannot depost negative or zero amount.");
		}
	}

	public void withdraw(String ID, double amount) {
		if (map.get(ID) != null) {
			if (amount <= map.get(ID)) {
				map.replace(ID, map.get(ID)-amount);
				System.out.println("Balance of $"+amount+" withdrawn from ID "+ID+".");
			} else {
				System.out.println("Error: cannot overwithdraw.");
			}
		} else {
			System.out.println("Error: ID does not exist.");
		}
	}
	
	public void checkBalance(String ID) {
		if (map.get(ID) != null) {
			double balance = map.get(ID);
			System.out.println("Balance: $"+balance+"");
		} else {
			System.out.println("Error: ID does not exist.");
		}
	}
}
