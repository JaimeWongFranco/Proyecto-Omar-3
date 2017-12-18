package conectarse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conectar {
	
		Connection cc = null;
		
		public Connection conexion()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				cc=DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			return cc;
		}
		

	//sd
}
