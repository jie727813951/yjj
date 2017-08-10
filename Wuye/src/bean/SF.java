package bean;

public class SF {

	String shijian;
	String shuifei;
	String dianfei;
	String wuyefei;
	String zongfeiyong;
	public SF() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SF(String shijian, String shuifei, String dianfei,
			String wuyefei, String zongfeiyong) {
		super();
		this.shijian = shijian;
		this.shuifei = shuifei;
		this.dianfei = dianfei;
		this.wuyefei = wuyefei;
		this.zongfeiyong = zongfeiyong;
	}
	public String getShijian() {
		return shijian;
	}
	public void setShijian(String shijian) {
		this.shijian = shijian;
	}
	public String getShuifei() {
		return shuifei;
	}
	public void setShuifei(String shuifei) {
		this.shuifei = shuifei;
	}
	public String getDianfei() {
		return dianfei;
	}
	public void setDianfei(String dianfei) {
		this.dianfei = dianfei;
	}
	public String getWuyefei() {
		return wuyefei;
	}
	public void setWuyefei(String wuyefei) {
		this.wuyefei = wuyefei;
	}
	public String getZongfeiyong() {
		return zongfeiyong;
	}
	public void setZongfeiyong(String zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	public String toString() {
		return "User [shijian=" + shijian + ", shuifei="
				+ shuifei + ", dianfei=" + dianfei + ", wuyefei=" + wuyefei + ", zongfeiyong=" + zongfeiyong +"]";
	}
}
