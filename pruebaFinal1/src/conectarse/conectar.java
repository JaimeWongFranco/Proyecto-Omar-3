package conectarse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class conectar {
	
		Connection cc = null;
		
		public Connection conexion()
		{
			try {
				
				//omar espinoza
				Class.forName("com.mysql.jdbc.Driver");
				cc=DriverManager.getConnection("jdbc:mysql://localhost/supermercado","root","");
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			return cc;
		}
<<<<<<< HEAD
		//JESUSD
=======
		//sd
>>>>>>> 1da8f2835d3b5669337cdb40e8e991080e2dc940
}
