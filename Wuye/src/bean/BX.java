package bean;

public class BX {

	String yuanyin;
	String username;
	String loudong;
	String usertel;
	public BX() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BX(String yuanyin, String username, String loudong, String usertel) {
		super();
		this.yuanyin = yuanyin;
		this.username = username;
		this.loudong = loudong;
		this.usertel = usertel;
	}
	public String getYuanyin() {
		return yuanyin;
	}
	public void setYuanyin(String yuanyin) {
		this.yuanyin = yuanyin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLoudong() {
		return loudong;
	}
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	
}
