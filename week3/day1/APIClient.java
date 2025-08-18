package week3.day1;

public class APIClient {
	public void sendRequest(String endpoint) {	
	}
	public void sendRequest(String endpoint,String requestBody) {
	}
	public void sendRequest(String endpoint,String requestBody,boolean requestStatus ) {
		System.out.println("endpoint is :"+endpoint);
		System.out.println("requestbody:"+requestBody);
		System.out.println("request status is "+requestStatus);
	}

	public static void main(String[] args) {
		APIClient ap = new APIClient();
		ap.sendRequest("webpage", "exist", false);
		
	}

}
