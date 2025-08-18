package week3.day1;

public class LoginPage extends BasePage {

	public void performCommonTasks(String tasks1,String tasks2,String task3) {
		System.out.println("Perform tasks: "+tasks1+","+tasks2+","+task3);	
	
	}
	

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.performCommonTasks("click()","maximize", "get(URL)");

	}
	

}
