package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import businesslogic.Login;
import businesslogic.SignUp;
import model.User;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, ClassNotFoundException, SQLException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		User user;
		SignUp signUp=new SignUp();
		Login login=new Login();
		System.out.println("1.SignUp");
		System.out.println("2.Login");
		int choice;
		choice=Integer.parseInt(br.readLine());
		
		switch(choice) {
		case 1:
			System.out.println("Enter username");
			String username=br.readLine();
			
			System.out.println("Enter email");
			String email=br.readLine();
			
			System.out.println("Enter password");
			String password=br.readLine();
			
			user=new User(username,email,password);
			signUp.setSignUp(user);
			
			break;
		
		case 2:
			System.out.println("Enter email");
			String Lemail=br.readLine();
			
			System.out.println("Enter password");
			String Lpassword=br.readLine();
			
			login.validLogin(Lemail,Lpassword);
			break;
			
		}
		
	}

}
