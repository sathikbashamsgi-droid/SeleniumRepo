package week3.day2;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("connection failed");
	}

	@Override
	public void disconnect() {
		System.out.println("Sucessfully disconnected");
	}

	@Override
	public void executeUpdate() {
		System.out.println("update is progress");
	}
	
	public static void main(String[] args) {
		JavaConnection jc = new JavaConnection();
		jc.executeQuery();
		jc.executeUpdate();
		jc.connect();
		jc.disconnect();
	

	
	}

}
