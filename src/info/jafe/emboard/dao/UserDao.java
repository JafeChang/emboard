package info.jafe.emboard.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import info.jafe.emboard.config.HibernateSessionFactory;
import info.jafe.emboard.entity.Post;
import info.jafe.emboard.entity.User;

public class UserDao {
	private Session session;
	private Query query;
	private Transaction transaction;

	public void save(User user) {
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		session.close();
	}

	// 修改一个用户
	public void update(User user) {
		session = HibernateSessionFactory.getSession();
		transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
		session.close();
	}

	// 查询一个用户信息
	public User getUser(int id) {
		session = HibernateSessionFactory.getSession();
		User user = (User) session.get("entity.User", id);
		session.close();
		return user;
	}

	// 用户登录检查，根据用户名与密码获取用户
	@SuppressWarnings("unchecked")
	public User getUser(User user) {
		User userTemp = null;
		session = HibernateSessionFactory.getSession();
		String hql = "from User as user where user.email = ? and user.password = ?";
		query = session.createQuery(hql);
		query.setString(0, user.getEmail());
		query.setString(1, user.getPassword());
		Iterator<User> iterator = query.list().iterator();
		if (iterator.hasNext()) {
			userTemp = iterator.next();
		}
		session.close();
		return userTemp;
	}

	// 检查用户名是否已经存在
	@SuppressWarnings("unchecked")
	public boolean hasUser(String email) {
		boolean flag = true;
		session = HibernateSessionFactory.getSession();
		String hql = "from User as user where user.email = ?";
		query = session.createQuery(hql);
		query.setString(0, email);
		Iterator<User> iterator = query.list().iterator();
		if (!iterator.hasNext()) {
			flag = false;
		}
		session.close();
		return flag;
	}

	// 查询一个用户所有的帖子
	@SuppressWarnings("unchecked")
	public List<Post> getUserPosts(User user, int pageNumber, int pageSize) {
		List<Post> userPosts = new ArrayList<Post>();
		session = HibernateSessionFactory.getSession();
		String hql = "from Post as post where post.id = ? order by post.datetime desc";
		query = session.createQuery(hql);
		query.setInteger(0, user.getId());
		query.setFirstResult((pageNumber - 1) * pageSize);
		query.setMaxResults(pageSize);
		userPosts = query.list();
		session.close();
		return userPosts;
	}

	// 获取单个用户所有帖子总数
	public int getUserPostsCount(User user) {
		int userPostCount = 0;
		session = HibernateSessionFactory.getSession();
		String hql = "select count(*) from Post as post where post.id = ?";
		query = session.createQuery(hql);
		query.setInteger(0, user.getId());
		long l = (Long) query.uniqueResult();
		userPostCount = (int) l;
		session.close();
		return userPostCount;
	}
	
	//判断用户是否为管理员
	@SuppressWarnings("unchecked")
	public boolean isManagement(User user){
		User userTemp = getUser(user);
		if(userTemp == null){
			return false;
		}else{
			if(userTemp.getAuthority() == 3){
				return true;
			}else{
				return false;
			}
		}
	}
}
