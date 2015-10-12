package info.jafe.emboard.dao;

import java.util.List;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostDao {
	
	/**
	 * ���Post
	 * @throws FullPostsException 
	 * 
	 */
	int add(int postid, String topic, String body, String tag, int id, String author, String shortcut);

	/**
	 * ͨ��post id����Post
	 * 
	 */
	Post getByPostId(int postid);
	
	/**
	 * ͨ��title����Post
	 * 
	 */
	List<Post> getBySearch(String args[]);
	
	/**
	 * ͨ��user��id��ѯPost
	 * 
	 */
	List<Post> getByUser(int id, int start, int n);
	
	/**
	 * ����post����
	 * 
	 */
	long getPostAmount();
	
	/**
	 * ��ѯ���µ�n��Post
	 * 
	 */
	List<Post> getPosts(int start, int n);
	
	/**
	 * ͨ��user��id����post����
	 * 
	 */
	long getUserPostAmount(int id);

	/**
	 * ����post
	 * 
	 */
	void update(Post post);
}
