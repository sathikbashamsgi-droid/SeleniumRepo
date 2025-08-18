package week3.day1;

public class MethodOverRiding extends MethodOverloading {
	public void reporStep(String msg, String status) {
		System.out.println(msg);
		System.out.println(status);

	}

	public static void main(String[] args) {
		MethodOverRiding mo=new MethodOverRiding();
		mo.reporStep("hi", "what's the status");
	}

}
