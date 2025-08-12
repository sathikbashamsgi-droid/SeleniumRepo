package week1.day2;

public class Learncontinue {
	/**
	 * --->skip the particular iteration and continue with the rest of iterations
	 * 
	 */

	public static void main(String[] args) {
		for (int i = 0; i <=10; i++) {
			
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}

	}

}