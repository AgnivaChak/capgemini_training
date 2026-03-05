package abstraction;
	
abstract public class Payment {
	double amount;
	
	public Payment(double amount) {
		this.amount= amount;
		
	}
	public void paymentInfo() {
		System.out.println("amount"+amount);
	}
	public abstract void makePayment();
}
