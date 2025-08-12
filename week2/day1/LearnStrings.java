package week2.day1;

public class LearnStrings {

	public static void main(String[] args) {
		/**
		 * String--->collection of characters,immutable class
		 * declaration:
		 *  1)string literals
		 *  2)string instantiation
		 */
		
		//string literals:syn:Datatype v.name="values"
		
		String name="Testleaf";
		String name2="Testleaf";
		
		//String instantiation:datatype obj=new datatype("values)
		
		
		String str=new String("Testleaf");//index starts from 0 in java
		
		String str1=new String("TEST LEAF");
		
		//no of characters in given string
		int length = name2.length();
		System.out.println(length);
		//concatenation
		String s1="welcome ";
		String s2="to Testleaf ";
		String s3="selenium course";
		//System.out.println(s1+s2);
		System.out.println(s1.concat(s2).concat(s3));
		
		//Equals(compare two strings)--->checks for the content and also it is case sensitive
		boolean equals = str.equals(name2);
		System.out.println(equals);
		//==--->checks for the memory location
		if (name==name2) {
			System.out.println("same");
			
		} else {
			System.out.println("not same");
		}
		//equal ignorecase
		
		boolean equalsIgnoreCase = str.equalsIgnoreCase(str1);
		System.out.println(equalsIgnoreCase );
		//contains(content and also case sensitive)
		boolean contains = name.contains("testleaf");
		System.out.println(contains);
		
		//toCharArray
		char[] charArray = name.toCharArray();//ctrl+2,L
		
		System.out.println(charArray);
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
			
		}
		//charAt--->retrieve any character
		/*
		 * char charAt = str.charAt(3); System.out.println(charAt);
		 */
		System.out.println(str.charAt(3));
		
		//replace
		String s="Testleaf@321";
		String replace = s.replace("T", "0").replace("e", " ");
		System.out.println(replace);
		
		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);
		
		//retrieve any values
		
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println(s.replaceAll("[^A-z]", ""));
		
		
	}

}