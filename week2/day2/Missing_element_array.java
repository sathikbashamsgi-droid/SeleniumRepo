package week2.day2;

import java.util.Arrays;

public class Missing_element_array {

	public static void main(String[] args) {
		int a[]= {1,4,3,2,8,6,7};
		
		Arrays.sort(a);
		int i=0;
		
		for ( i = a[i]; i < a.length-1; i++) {
			if ((a[i]+1)== a[i+1]) 
			{
				continue;
			}
			else {
				System.out.println("Missing element is: "+(a[i]+1));
			}
				
		}

	}

}