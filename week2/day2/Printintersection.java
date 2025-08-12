package week2.day2;

public class Printintersection {

	public static void main(String[] args) {
		int num[]= {2,3,5,6,1,7};
		int num1[]= {1,4,6,9,5,3};
		
		for (int i = 0; i < num.length; i++) {//outerloop
			
			for (int j = 0; j < num1.length; j++) {//innerloop
				
				if (num[i]==num1[j]) {
					System.out.println(num[i]);
					
				}
				
			}
			
		}
		
		
	}

}