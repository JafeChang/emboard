package info.jafe.emboard.dao;

import java.util.List;

import info.jafe.emboard.entity.Post;
import info.jafe.emboard.exceptions.FullPostsException;

public interface PostDao {
	
	/**
	 * 添加Post
	 * @throws FullPostsException 
	 * 
	 */
	int add(int postid, String topic, String body, String tag, int id, String author, String shortcut);

	/**
	 * 通过post id查找Post
	 * 
	 */
	Post getByPostId(int postid);
	
	/**
	 * 通过title搜索Post
	 * 
	 */
	List<Post> getBySearch(String args[]);
	
	/**
	 * 通过user的id查询Post
	 * 
	 */
	List<Post> getByUser(int id, int start, int n);
	
	/**
	 * 返回post数量
	 * 
	 */
	long getPostAmount();
	
	/**
	 * 查询最新的n个Post
	 * 
	 */
	List<Post> getPosts(int start, int n);
	
	/**
	 * 通过user的id返回post数量
	 * 
	 */
	long getUserPostAmount(int id);

	/**
	 * 更新post
	 * 
	 */
	void update(Post post);
}
