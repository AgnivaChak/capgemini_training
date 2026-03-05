package encapsulation;

public class Test2 {

	public static void main(String[] args) {
		BankAccount account= new BankAccount(1,"john",2000);
		account.deposit(1000);
		account.withdraw(500);
		

	}

}
