package info.jafe.emboard.entity;
// Generated 2015-10-4 17:46:12 by Hibernate Tools 3.5.0.Final

import java.util.Date;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5709816992248282033L;
	private int id;
	private String email;
	private String nickname;
	private String password;
	private String gender;
	private Byte authority;
	private byte postcount;
	private int points;
	private byte flowers;
	private String signature;
	private Date regdate;
	private byte[] icon;
	private boolean online;

	public User() {
	}

	public User(int id, String email, String password) {
		Date date = new Date();
		long time = System.currentTimeMillis();
		date.setTime(time);
		this.id = id;
		this.email = email;
		this.password = password;
		this.gender = "u";
		this.postcount = 0;
		this.points = 0;
		this.flowers = 0;
		this.regdate = date;
		this.online = false;
	}
	
	public User(int id, String email, String password, String gender, byte postcount, int points, byte flowers,
			Date regdate, boolean online) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.postcount = postcount;
		this.points = points;
		this.flowers = flowers;
		this.regdate = regdate;
		this.online = online;
	}

	public User(int id, String email, String nickname, String password, String gender, Byte authority, byte postcount,
			int points, byte flowers, String signature, Date regdate, byte[] icon, boolean online) {
		this.id = id;
		this.email = email;
		this.nickname = nickname;
		this.password = password;
		this.gender = gender;
		this.authority = authority;
		this.postcount = postcount;
		this.points = points;
		this.flowers = flowers;
		this.signature = signature;
		this.regdate = regdate;
		this.icon = icon;
		this.online = online;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Byte getAuthority() {
		return this.authority;
	}

	public void setAuthority(Byte authority) {
		this.authority = authority;
	}

	public byte getPostcount() {
		return this.postcount;
	}

	public void setPostcount(byte postcount) {
		this.postcount = postcount;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public byte getFlowers() {
		return this.flowers;
	}

	public void setFlowers(byte flowers) {
		this.flowers = flowers;
	}

	public String getSignature() {
		return this.signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public Date getRegdate() {
		return this.regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public byte[] getIcon() {
		return this.icon;
	}

	public void setIcon(byte[] icon) {
		this.icon = icon;
	}

	public boolean isOnline() {
		return this.online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
