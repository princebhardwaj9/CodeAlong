package businesslogic;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import model.User;
import utility.ConnectionManager;

public class SignUp {
	
	ConnectionManager cm=new ConnectionManager();
	Connection con;
	
	public void setSignUp(User user) throws ClassNotFoundException, SQLException, IOException {
		
		con=ConnectionManager.getConnection();
		
		Statement statement=con.createStatement();
		statement.executeUpdate("INSERT into userdetail VALUES('"+user.getUsername()+"','"+user.getEmail()+"','"+user.getPassowrd()+"')");
		System.out.println("Successfully SignUp");
	}
}
