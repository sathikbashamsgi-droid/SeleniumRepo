package week2.day2;

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
		
		//string to integer
		String st="1234";
		System.out.println(st+10);
		int stringTOint = Integer.parseInt(st);
		System.out.println(stringTOint+10);//1244
		//integer to string
		int i=123;
		String intToString = Integer.toString(i);
		System.out.println(intToString+10);
		
		//split--->string is splitted into multiple strings
		String st1="Testleaf and Qeagle";//0---test,1---af and qeag
		String[] split = st1.split("le");
		System.out.println(split[1]);
		String[] split2 = st1.split("");//"t""e"""s
		System.out.println(split2[5]);//e
		String[] split3 = st1.split(" ");//0--->testleaf,1-->and,2-->qeagle
		System.out.println(split3[2]);
		String[] split4 = st1.split("a");//0--->testle,1---f ,2--->nd qe,3
		System.out.println(split4[2]);
		
		//substring--->crop the strings into small strings
		String ss="August";
		String begIndex = ss.substring(2);//from g
		System.out.println(begIndex);
		String begEnd = ss.substring(1,5 );//end index--->n+1
		System.out.println(begEnd );
		
		
		
		
	}

}