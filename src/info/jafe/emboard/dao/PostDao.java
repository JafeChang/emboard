package info.jafe.emboard.dao;

import java.util.List;
import java.util.Set;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostDao {
	
	/**
	 * 添加Post
	 * @throws FullPostsException 
	 * 
	 */
	void add(int postid, String topic, String body, String tag, int id) ;

	/**
	 * 通过post id查找Post
	 * 
	 */
	Post getByPostId(int postid);


	/**
	 * 通过user查询Post
	 * 
	 */
	List<Post> getByUser(User user);
	
	/**
	 * 通过title搜索Post
	 * 
	 */
	List<Post> getBySearch(String args[]);

	/**
	 * 更新post
	 * 
	 */
	void update(Post post);
}
