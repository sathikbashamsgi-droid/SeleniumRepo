package week3.day2;

public class Amazon extends CanaraBank  {
	@Override
	public void cashOnDelivery() {
		System.out.println("COD avilable");	
	}

	@Override
	public void upiPayments() {
		System.out.println("UPI payments Accepting");	
	}

	@Override
	public void cardPayments() {
		System.out.println("Limited card only");	
	}

	@Override
	public void internetBanking() {
		System.out.println("Accepting payments");	
	}
	
	public void recordPaymentDetails(){
		System.out.println("statement bill");
	}

	public static void main(String[] args) {
		Amazon am = new Amazon();
		am.cardPayments();
		am.cashOnDelivery();
		am.internetBanking();
		am.recordPaymentDetails();
		am.upiPayments();
		
	}
}
