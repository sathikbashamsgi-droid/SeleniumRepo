package week3.day2;

public class SBI extends Axis implements RBI,Inter{

	@Override
	public void knowYourCustomer() {
		System.out.println("AAdhar card");
		
	}

	@Override
	public void withDrawalLimit() {
		
		System.out.println("25000");
	}
	public void goldLoan() {
		System.out.println("6%");
	}
	public static void main(String[] args) {
		SBI s=new SBI();
		s.bankBalance();
		s.goldLoan();
		s.housingLoan();
		s.systemDesign();
		
	}

	@Override
	public void systemDesign() {
		System.out.println("design is in process");
		
	}

}