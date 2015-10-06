package info.jafe.emboard.dao.impl;

import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullUsersException;

@Repository
public class UserDaoImpl implements UserDao {
	// @Qualifier("sessionFactory")
	@Autowired
	private SessionFactory sessionFactory;

	// 获取与当前线程绑定的session
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	private int getLastId() {
		Session session = getSession();
		String hql = "select max(id) from User ";
		Query query = session.createQuery(hql);
		return (int) query.uniqueResult();
	}

	@Override
	public boolean add(String email, String password, String invitationcode) throws FullUsersException {
		int lastId = getLastId();
		boolean success = false;
		if (lastId == Integer.MAX_VALUE) {
			throw new FullUsersException();
		} else {
			Date date = new Date();
			long time = System.currentTimeMillis();
			date.setTime(time);
			User user = new User(lastId + 1, email, password, "u", (byte) 0, 0, (byte) 0, date, false);
			Session session = getSession();
			session.save(user);
			success = true;
		}
		return success;
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
		// TODO Auto-generated method stub

	}

}
