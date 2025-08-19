package week3.day2;

public class Axis implements RBI{

	@Override
	public void knowYourCustomer() {
		
		System.out.println("Adhar1");
	}

	@Override
	public void withDrawalLimit() {
		System.out.println("20000");
		
		
	}
	public void housingLoan() {
		System.out.println("interest rate:5%");
	}
	public static void main(String[] args) {
		Axis A=new Axis();
		A.knowYourCustomer();
	}

}