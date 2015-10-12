package info.jafe.emboard.service;

import java.util.List;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostService {

	/**
	 * ���Post
	 * 
	 * @throws FullPostsException
	 * 
	 */
	int add(String topic, String body, String tag, int id, String author, String shortcut);

	/**
	 * ����post����
	 * 
	 */
	long getPostAmount();
	
	/**
	 * ����ĳuser��post����
	 * 
	 */
	long getUserPostAmount(User user);
	
	/**
	 * ͨ��user��id����post����
	 * 
	 */
	long getUserPostAmount(int id);
	
	/**
	 * ͨ��post id����Post
	 * 
	 */
	Post getByPostId(int postid);

	/**
	 * ͨ��user��ѯPost
	 * 
	 */
	List<Post> getByUser(User user, int start, int n);

	/**
	 * ͨ��user��id��ѯPost
	 * 
	 */
	List<Post> getByUser(int id, int start, int n);
	
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
