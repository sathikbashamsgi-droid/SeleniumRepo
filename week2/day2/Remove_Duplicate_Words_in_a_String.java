package week2.day2;

public class Remove_Duplicate_Words_in_a_String {

	public static void main(String[] args) {
String text="We learn Java basics as part of java sessions in java week1";
		
		String[] split=text.split(" ");
	
		for (int i = 0; i <=split.length-1; i++) {
	for (int j = i+1; j <= split.length-1; j++) {
		if (split[i].equalsIgnoreCase(split[j])) {
			
			  split[i]=split[i].replace(split[i], " ");
			  
			      }
	           }
             }
            for (int k= 0; k <= split.length-1; k++) {
	            System.out.print(split[k]+(" "));
             }
     }
}
