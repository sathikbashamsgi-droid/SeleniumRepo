package week3.day2;

public class SingaporeBank extends ICICI {

	@Override
	public void knowYourCustomer() {
		System.out.println("pancard");
		
	}

	@Override
	public void withDrawalLimit() {
		
		System.out.println("10000");
	}

	@Override
	public void convertCurrency() {
		System.out.println("in dollars");
		
	}
	public static void main(String[] args) {
		SingaporeBank sb=new SingaporeBank ();
		sb.knowYourCustomer();
	}
	

}
