import java.util.Random;
import java.util.HashMap;

public class ATM {
	private HashMap<String, Double> map;
	
	public ATM() {
		map=new HashMap<>();
	}
	 
	public String createID(){
		int ranNum;
		String output="";
		Random rn= new Random();
		
		for(int i=0;i<10;i++) {
			ranNum=rn.nextInt(122 - 65 + 1) + 65;
			output+=(char)ranNum;
		}
		return output;
	}
	
	public double getBalance(String ID){
		return map.get(ID);
	}
	
	public void newDeposit(double amount){
		String id=createID();
		map.put(id,amount);
		System.out.println("Balance of $"+amount+" deposited into account with ID "+id+".");
	}
	public void idDeposit(String ID, double amount){
		if(map.get(ID)!=null){
			map.replace(ID, map.get(ID)+amount);
			System.out.println("Balance of $"+amount+" deposited into account with ID "+ID+".");
		}else {
			map.put(ID,amount);
			System.out.println("Balance of $"+amount+" deposited into account with ID "+ID+".");
		}
	}
	//use hashmaps to connect value (balance) to id (key).
}
