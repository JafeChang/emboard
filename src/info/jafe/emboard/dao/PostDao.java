package info.jafe.emboard.dao;

import java.util.List;
import java.util.Set;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostDao {
	
	/**
	 * ���Post
	 * @throws FullPostsException 
	 * 
	 */
	void add(int postid, String topic, String body, String tag, int id) ;

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
	 * ����post
	 * 
	 */
	void update(Post post);
}
