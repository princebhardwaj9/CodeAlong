package businesslogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utility.ConnectionManager;

public class Login {

	//ConnectionManager cm=new ConnectionManager();
	Connection con;
	
	public void validLogin(String email,String password) throws ClassNotFoundException, SQLException, IOException {
		
		con=ConnectionManager.getConnection();
		Statement statement=con.createStatement();
		
		ResultSet rs=statement.executeQuery("SELECT * FROM userdetail");
		
		while(rs.next()) {
			if(rs.getString("email").equals(email)) {
				if(rs.getString("password").equals(password)) {
					System.out.println("Login success");
				}
				else {
					System.out.println("Password Incorrect");
				}
			}
			else {
				System.out.println("Email incorrect");
			}
		}
	}
	
}