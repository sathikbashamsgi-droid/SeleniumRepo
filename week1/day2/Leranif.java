package week1.day2;

public class Leranif {

	public static void main(String[] args) {
		// shortcut of if ---> type "if" then press ctrl+spece
		int marks =50;
		if (marks>=40) {
			System.out.println("pass");
		}
		if (marks>=60) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		int marks1=80;
		if (marks1==60) {
			System.out.println("grade1");
		}else if (marks1<40) {
			System.out.println("fail");
		}else if (marks1>=80) {
			System.out.println("distinction");
		}
		else {
			System.out.println("outof range");
		}
			

	}

}
