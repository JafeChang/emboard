package info.jafe.emboard.service;

import java.util.List;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostService {

	/**
	 * 添加Post
	 * 
	 * @throws FullPostsException
	 * 
	 */
	int add(String topic, String body, String tag, int id, String author, String shortcut);

	/**
	 * 返回post数量
	 * 
	 */
	long getPostAmount();
	
	/**
	 * 返回某user的post数量
	 * 
	 */
	long getUserPostAmount(User user);
	
	/**
	 * 通过user的id返回post数量
	 * 
	 */
	long getUserPostAmount(int id);
	
	/**
	 * 通过post id查找Post
	 * 
	 */
	Post getByPostId(int postid);

	/**
	 * 通过user查询Post
	 * 
	 */
	List<Post> getByUser(User user, int start, int n);

	/**
	 * 通过user的id查询Post
	 * 
	 */
	List<Post> getByUser(int id, int start, int n);
	
	/**
	 * 通过title搜索Post
	 * 
	 */
	List<Post> getBySearch(String args[]);
	
	/**
	 * 查询最新的n个Post
	 * 
	 */
	List<Post> getPosts(int start, int n);

	/**
	 * 更新post
	 * 
	 */
	void update(Post post);
}
