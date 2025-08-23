package week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {
		String name="saranya";
		char[] charArray = name.toCharArray();//S,a,r,a,n,y,a
		
		Set<Character> unique=new LinkedHashSet<Character>();
		Set<Character> duplicates=new LinkedHashSet<Character>();
		
		for (int i = 0; i < charArray.length; i++) {
			
			boolean b = unique.add(charArray[i]);
			if (!b) {
				
				duplicates.add(charArray[i]);
				
			}
			
		}
		System.out.println(unique);
		System.out.println(duplicates);

	}

}