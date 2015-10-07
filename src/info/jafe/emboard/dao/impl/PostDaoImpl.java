package info.jafe.emboard.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import info.jafe.emboard.dao.PostDao;
import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;
import info.jafe.util.BinaryTree;

@Repository
public class PostDaoImpl implements PostDao {
	@Autowired
	private SessionFactory sessionFactory;

	// 获取与当前线程绑定的session
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(int postid, String topic, String body, String tag, int id) {
		Date date = new Date(System.currentTimeMillis());
		Post post = new Post(postid, topic, date, body, tag, id);
		Session session = getSession();
		session.save(post);
	}

	@Override
	public Post getByPostId(int postid) {
		Session session = getSession();
		String hql = "from Post as post where post.postid = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, postid);
		Post post = (Post) query.uniqueResult();
		return post;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getByUser(User user) {
		int id = user.getId();
		Session session = getSession();
		String hql = "select * from Post as post where post.id = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		List<Post> posts = query.list();
		return posts;
	}

	@Override
	public void update(Post post) {
		Session session = getSession();
		session.update(post);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Post> getBySearch(String[] args) {
		Session session = getSession();
		int len = args.length;
		BinaryTree<Integer> rs = new BinaryTree<Integer>();
		List<Post> posts = new ArrayList<Post>();
		for (int i = 0; i < len; i++) {
			String hql = "from Post as post where post.topic like ?";
			Query query = session.createQuery(hql);
			String q = "%" + args[i] + "%";
			query.setString(0, q);
			List<Post> postsTemp = query.list();
			for (int j = 0; j < postsTemp.size(); j++) {
				int postid = postsTemp.get(j).getPostid();
				if (!rs.had(postid)) {
					rs.add(postsTemp.get(j).getPostid());
					posts.add(postsTemp.get(j));
				}
			}
		}
		return posts;
	}

}
