package week1.day2;

public class Learnswithcase {

	public static void main(String[] args) {
		// Switchcase shortcut ---> type "switch" then press ctrl+space
		String browser = "Chrome";
		
		switch (browser) {
		case "Chrome":
			System.out.println("open the Chrome browser");
			break;
			
		case "Edge":
			System.out.println("open the Edge browser");
			default:
				System.out.println("open IE");
}
	}

}
