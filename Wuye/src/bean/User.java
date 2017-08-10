package bean;

import java.io.Serializable;

public class User implements Serializable{
	private String account;
	private String password;
	private String username;
	private String usertel;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String account, String password, String username, String usertel) {
		super();
		this.account = account;
		this.password = password;
		this.username = username;
		this.usertel = usertel;
	}



	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsertel() {
		return usertel;
	}

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	@Override
	public String toString() {
		return "User [username=" + account + ", password="
				+ password + ", name=" + username + ", tel=" + usertel + "]";
	}
	
}
