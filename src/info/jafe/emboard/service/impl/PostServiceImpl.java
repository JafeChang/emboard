package info.jafe.emboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.jafe.emboard.dao.PostDao;
import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.PostService;

@Service("postService")
public class PostServiceImpl implements PostService {

	@Autowired
	private PostDao postDao;
	@Autowired
	private UserDao userDao;

	@Override
	public int add(String topic, String body, String tag, int id, String author, String shortcut) {
		int postid = -1;
		User user = userDao.getById(id);
		if (user != null) {
			postid = postDao.add(0, topic, body, tag, id, author, shortcut);
		}
		return postid;
	}

	@Override
	public Post getByPostId(int postid) {
		Post post = postDao.getByPostId(postid);
		return post;
	}

	@Override
	public List<Post> getBySearch(String[] args) {
		return postDao.getBySearch(args);
	}

	@Override
	public List<Post> getByUser(int id, int start, int n) {
		return postDao.getByUser(id, start, n);
	}

	@Override
	public List<Post> getByUser(User user, int start, int n) {
		int id = user.getId();
		return getByUser(id, start, n);
	}

	@Override
	public long getPostAmount() {
		return postDao.getPostAmount();
	}

	@Override
	public List<Post> getPosts(int start, int n) {
		return postDao.getPosts(start, n);
	}

	@Override
	public long getUserPostAmount(int id) {
		return postDao.getUserPostAmount(id);
	}

	@Override
	public long getUserPostAmount(User user) {
		int id = user.getId();
		return getUserPostAmount(id);
	}

	@Override
	public void update(Post post) {
		postDao.update(post);
	}
	
	

}
