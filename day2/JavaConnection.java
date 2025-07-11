package week3.day2;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	@Override
	public void connect() {
		System.out.println("Providing implementation for connect() method - interface");
	}

	@Override
	public void disconnect() {
		System.out.println("Providing implementation for disconnect() method - interface");
		}

	@Override
	public void executeUpdate() {
		System.out.println("Providing implementation for executeUpdate() method - interface");
		
	}
	public static void main(String[] args) {
		JavaConnection javaclass=new JavaConnection();
		javaclass.connect();
		javaclass.executeQuery();
		javaclass.disconnect();
	}

}
