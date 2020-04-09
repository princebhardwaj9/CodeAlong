package utility;

import java.io.IOException;
//import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.util.Properties;

public class ConnectionManager {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con = null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","Prc123");
		
		if(con!=null) {
			return con;
		}
		else {
			return null;
		}
		
//		Properties p=loadProperties();
//		Class.forName(p.getProperty("driver"));
//		Connection con=null;
//		con=DriverManager.getConnection(p.getProperty("url"),p.getProperty("username"),p.getProperty("password"));
//		if(con!=null)
//			return con;
//		else
//			return null;
	}
	
//	public static Properties loadProperties() throws IOException {
//		Properties properties=new Properties();
//		InputStream inputStream=ConnectionManager.class.getClassLoader().getResourceAsStream("jdbc.properties");
//		properties.load(inputStream);
//		inputStream.close();
//		return properties;
//	}

}
