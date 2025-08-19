package week3.day2;

public class Concrete implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Driver sucessfully connected");
	}

	@Override
	public void disconnect() {
		System.out.println("Sucessfully disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("updated");
	}
	
	public static void main(String[] args) {
		
		Concrete cc = new Concrete();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		
	}

}
