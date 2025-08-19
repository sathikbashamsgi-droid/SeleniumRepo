package week3.day2;

public class CanaraBank implements Payments {
	

	@Override
	public void cashOnDelivery() {
		System.out.println("20000");	
	}

	@Override
	public void upiPayments() {
		System.out.println("100000");	
	}

	@Override
	public void cardPayments() {
		System.out.println("40000");	
	}

	@Override
	public void internetBanking() {
		System.out.println("50000");	
	}
	public void recordPaymentDetails(){
		System.out.println("statement");
	}
	public static void main(String[] args) {
		CanaraBank cb = new CanaraBank();
		cb.cashOnDelivery();
		cb.cardPayments();
		cb.upiPayments();
		cb.internetBanking();
		cb.recordPaymentDetails();
	}

}
