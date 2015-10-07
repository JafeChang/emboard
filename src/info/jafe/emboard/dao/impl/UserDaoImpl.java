package info.jafe.emboard.dao.impl;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	// 获取与当前线程绑定的session
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void add(String email, String password, String invitationcode) {
		Date date = new Date(System.currentTimeMillis());
		User user = new User(0, email, password, "u", (byte) 0, 0, (byte) 0, date);
		Session session = getSession();
		session.save(user);
	}

	@Override
	public User getById(int id) {
		Session session = getSession();
		String hql = "from User as user where user.id = ?";
		Query query = session.createQuery(hql);
		query.setInteger(0, id);
		User user = (User) query.uniqueResult();
		return user;
	}

	@Override
	public User get(String email, String password) {
		Session session = getSession();
		String hql = "from User as user where user.email = ? and password = ?";
		Query query = session.createQuery(hql);
		query.setString(0, email);
		query.setString(1, password);
		User user = (User) query.uniqueResult();
		return user;
	}

	@Override
	public boolean has(String email) {
		Session session = getSession();
		String hql = "select count(*) from User as user where user.email = ?";
		Query query = session.createQuery(hql);
		query.setString(0, email);
		Long count = (Long) query.uniqueResult();
		return count > 0 ? true : false;
	}

	@Override
	public void update(User user) {
		Session session = getSession();
		session.update(user);
	}

}
