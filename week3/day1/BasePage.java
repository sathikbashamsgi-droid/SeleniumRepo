package week3.day1;

public class BasePage {
	public void findElement(String loc1,String loc2,String loc3,String loc4) {
		System.out.println("find Elements By use Basic locators :"+loc1+","+loc2+","+loc3+","+loc4);
	}
	public void clickElement(String ele) {
		System.out.println(ele);
	}
	public void enterText(String text) {
	System.out.println("Enter text : "+text);	
	}
	public void performCommonTasks(String tasks1,String tasks2,String task3) {
	System.out.println("Perform tasks: "+tasks1+","+tasks2+","+task3);	
	}

	public static void main(String[] args) {
	  
		BasePage bp = new BasePage();
		bp.findElement("id", "name", "classname", "linktext");
		bp.clickElement("Element is selected");
		bp.enterText(" status ok");
		bp.performCommonTasks("gettext()", "sendkeys()", "close()");
		

	}

}
