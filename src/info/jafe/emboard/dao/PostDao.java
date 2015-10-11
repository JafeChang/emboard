package info.jafe.emboard.dao;

import java.util.List;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostDao {
	
	/**
	 * ���Post
	 * @throws FullPostsException 
	 * 
	 */
	int add(int postid, String topic, String body, String tag, int id, String author, String shortcut);

	/**
	 * ����post����
	 * 
	 */
	long getPostAmount();
	
	/**
	 * ͨ��post id����Post
	 * 
	 */
	Post getByPostId(int postid);


	/**
	 * ͨ��user��ѯPost
	 * 
	 */
	List<Post> getByUser(User user);
	
	/**
	 * ͨ��title����Post
	 * 
	 */
	List<Post> getBySearch(String args[]);
	
	/**
	 * ��ѯ���µ�n��Post
	 * 
	 */
	List<Post> getPosts(int start, int n);

	/**
	 * ����post
	 * 
	 */
	void update(Post post);
}
