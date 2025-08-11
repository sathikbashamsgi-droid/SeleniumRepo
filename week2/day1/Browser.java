package week2.day1;

public class Browser {
	
	String launchBrowser(String browserName){
		System.out.println("Browser launched sucessfully");
		return browserName;
	
		
	}

	 void loadUrl() {
		System.out.println("Application url loaded successfully");
	}
		
		public static void main(String[] args) {
			
			Browser bro = new Browser();
			bro.launchBrowser("Chrome");
			bro.loadUrl();
		}	

}
