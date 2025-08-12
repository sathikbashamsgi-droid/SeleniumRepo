package week2.day2;

public class PrintDuplicates {

	public static void main(String[] args) {
		int num[]= {2,5,7,7,5,9,2,3};
		
		for (int i = 0; i <num.length; i++) {//outerloop
			
			for (int j = i+1; j <num.length; j++) {//innerloop
				
				if (num[i]==num[j]) {
					System.out.println(num[i]);
					
					
				}
				
			}
			
		}
		
	}

}

