import java.util.Random;

public class ATM {
	private String ID;
	private double balance;
	
	public ATM() {
		ID=this.createID();
		this.balance=0;
	}
	
	public ATM(String id) {
		ID=id;
		this.balance=0;
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
	
	public void deposit(String id, double amount) {
		if(id.equals(ID)) {
			balance+=amount;
		}	
	}
	public static void main(String [] args) {
		ATM bank = new ATM();
		System.out.
		bank.deposit(null, 0);
	}
}
