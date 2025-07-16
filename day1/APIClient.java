package week4.day1;

public class APIClient {
	
	public void sendRequest(String endPoint)
	{
		System.out.println("The string endpoint is:" +endPoint);
	}
	
	public void sendRequest(String endPoint, String requestBody, boolean requestStatus)
	{
		System.out.println("The string endpoint is:" +endPoint);
		System.out.println("The request body is:" +requestBody);
		System.out.println("Status is:"+requestStatus);
	}

	public static void main(String[] args) {
		APIClient client=new APIClient();
		client.sendRequest("google");
		client.sendRequest("edge", "edgedriver", true);

	}

}
