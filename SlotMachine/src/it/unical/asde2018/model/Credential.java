package it.unical.asde2018.model;

public class Credential {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Credential(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public boolean checkCredential(String username,String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
			return true;
		
		return false;
			
	}
	
}
