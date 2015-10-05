package info.jafe.emboard.entity.copy;
// Generated 2015-10-4 11:49:14 by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Post generated by hbm2java
 */
@Entity
@Table(name = "_post", catalog = "emboard", uniqueConstraints = @UniqueConstraint(columnNames = "topic") )
public class Post implements java.io.Serializable {

	private int postid;
	private String topic;
	private Date datetime;
	private String body;
	private String tag;
	private int id;
	private byte flowers;

	public Post() {
	}

	public Post(int postid, String topic, Date datetime, String tag, int id, byte flowers) {
		this.postid = postid;
		this.topic = topic;
		this.datetime = datetime;
		this.tag = tag;
		this.id = id;
		this.flowers = flowers;
	}

	public Post(int postid, String topic, Date datetime, String body, String tag, int id, byte flowers) {
		this.postid = postid;
		this.topic = topic;
		this.datetime = datetime;
		this.body = body;
		this.tag = tag;
		this.id = id;
		this.flowers = flowers;
	}

	@Id

	@Column(name = "postid", unique = true, nullable = false)
	public int getPostid() {
		return this.postid;
	}

	public void setPostid(int postid) {
		this.postid = postid;
	}

	@Column(name = "topic", unique = true, nullable = false, length = 80)
	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "datetime", nullable = false, length = 19)
	public Date getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	@Column(name = "body", length = 16777215)
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name = "tag", nullable = false, length = 10)
	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Column(name = "id", nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "flowers", nullable = false)
	public byte getFlowers() {
		return this.flowers;
	}

	public void setFlowers(byte flowers) {
		this.flowers = flowers;
	}

}
