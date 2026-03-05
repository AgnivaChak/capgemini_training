package encapsulation;

public class BankAccount {
	
	int acno;
	String name;
	double balance;
	
	BankAccount(){
		
	}
	BankAccount(int acno,String name,double balance){
		this.acno=acno;
		this.name=name;
		this.balance=balance;
	}

	public void deposit(double amt) {
		if(amt>=0) {
			balance+= amt;
			System.out.println("Amount of "+amt+"Credited to account");
			System.out.println("Current Balance "+balance);
		}else {
			System.out.println("invalid amount");
		}
		
	}
	public void withdraw(double amt) {
		if(amt<=balance) {
			balance -=amt;
			System.out.println("Amount of "+amt+"Debited from your account");
			System.out.println("Current Balance"+balance);
			
		}else {
			System.out.println("invalid amount transaction");
		}
	}

}
