package model;

public class User {
	
	private String username;
	private String email;
	private String passowrd;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassowrd() {
		return passowrd;
	}
	public void setPassowrd(String passowrd) {
		this.passowrd = passowrd;
	}
	
	public User(String username, String email, String passowrd) {
		this.username = username;
		this.email = email;
		this.passowrd = passowrd;
	}
	
}
