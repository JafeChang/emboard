package info.jafe.emboard.entity;
// Generated 2015-10-2 19:04:46 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private int id;
	private String email;
	private String nickname;
	private String password;
	private String gender;
	private Boolean authority;
	private byte postcount;
	private int points;
	private byte flowers;
	private String signature;
	private Date regdate;
	private byte[] icon;
	private boolean online;
	private Set reposts = new HashSet(0);

	public User() {
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

	public User(int id, String email, String nickname, String password, String gender, Boolean authority,
			byte postcount, int points, byte flowers, String signature, Date regdate, byte[] icon, boolean online,
			Set reposts) {
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
		this.reposts = reposts;
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

	public Boolean getAuthority() {
		return this.authority;
	}

	public void setAuthority(Boolean authority) {
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

	public Set getReposts() {
		return this.reposts;
	}

	public void setReposts(Set reposts) {
		this.reposts = reposts;
	}

}