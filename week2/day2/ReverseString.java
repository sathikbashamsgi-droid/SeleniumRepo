package week2.day2;

public class ReverseString {
	
	public static void main(String[] args) {
		
	String name ="Sathik Basha";
	char[] reverseName = name.toCharArray();
	for (int i =reverseName.length-1; i>=0; i--) {
		System.out.println(reverseName[i]);
		
	}
	}
	

}
