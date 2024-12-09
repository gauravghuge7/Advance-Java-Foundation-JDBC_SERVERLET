package mySql_connector;

public class Main {

	
	public static void main(String[] args) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.println("The Server is running on the port 8080");
		}
		catch (Exception e) {
			System.out.println("the Error => "+ e);
			throw new Error(e);
		}
		
	}
}
