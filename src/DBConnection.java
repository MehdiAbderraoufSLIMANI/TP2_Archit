import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		private String BDD = "nomBD";
		private String url = "jdbc:mysql://localhost:3306/" + BDD;
		private String user = "root";
		private String passwd = "";
	    private Connection conn;
		private static DBConnection dbc;
	   
	    private DBConnection() throws SQLException {
			conn=DriverManager.getConnection(url, user,passwd);
		}

	    
	    public Connection getConn() {
			return conn;
		}

		public static DBConnection getDBConnection(){
			if(dbc == null){
				try {
					dbc = new DBConnection();
				} catch (SQLException e) {
					 
					e.printStackTrace();
				}
			}
			return dbc;
		} 

		
	
}
