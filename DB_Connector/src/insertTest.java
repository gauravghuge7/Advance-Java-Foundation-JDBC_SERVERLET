import java.sql.DriverManager;

public class insertTest {

	public static void main(String[] args) {
		
		try {
			
			Object check = Class.forName("com.mysql.cj.jdbc.Driver");
			
			System.out.print("Check" + check);
			System.out.println(" The Server is Connected Successfully");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "Sangitabai7@");
			
			
		}
		catch(Exception e) {
			
			System.out.println("Error => "+e);
		}
	}
}
