package week3.day2;

public interface RBI {
	/**
	 * 100% abstract methods-->so,it is not possible to create an object
	 * after 1.7version,in interface it is possible to implement the methods
	 */
	public void knowYourCustomer();
	
	public void withDrawalLimit();
	
	public default void bankBalance() {
		System.out.println("bank balance:500");
		
	}

}