package week2.day2;

public class Odd_Index_To_Uppercase {

	public static void main(String[] args) {
		String test="changeme";
		char[] ch = test.toCharArray();
		char[] c=ch;
		
		for (int i = 0; i <= ch.length-1; i++) {
			if (i%2!=0) {
			c[i]=	Character.toUpperCase(ch[i]);	
			}
		}
		System.out.println(c);
	}
}
