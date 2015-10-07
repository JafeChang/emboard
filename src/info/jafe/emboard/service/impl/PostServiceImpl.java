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
	private UserDao userDao;
	@Autowired
	private PostDao postDao;

	@Override
	public boolean add(int postid, String topic, String body, String tag, int id) {
		boolean success = false;
		User user = userDao.getById(id);
		if (user != null) {
			postDao.add(postid, topic, body, tag, id);
			success = true;
		}
		return success;
	}

	@Override
	public Post getByPostId(int postid) {
		Post post = postDao.getByPostId(postid);
		return post;
	}

	@Override
	public List<Post> getByUser(User user) {
		List<Post> posts = postDao.getByUser(user);
		return posts;
	}

	@Override
	public void update(Post post) {
		postDao.update(post);
	}

	@Override
	public List<Post> getBySearch(String[] args) {
		return postDao.getBySearch(args);
	}

}
