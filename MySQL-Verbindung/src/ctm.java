
// Importieren der benötigten SQL Pakete
import java.sql.*;

// Class Connect to MYSQL = ctm
public class ctm {
	Connection connection;

	public ctm() {
		
	}
	
	public boolean ConnectToMysql(String host, String port, String database, String user, String pass){
		try {
			Class.forName("com.mysql.jdbc,Driver").newInstance();
			String url = "jdbc:mysql://" +host+ ":" +port+ "/" +database+ "?user=" +user+ "&password=" +pass;
			connection = DriverManager.getConnection(url);
			return true;
		}catch(Exception ex) {
			System.out.println("Error!");
			return false;
		}
	}
	
}
