package info.jafe.emboard.dao.impl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	// @Qualifier("sessionFactory")
	@Autowired
	private SessionFactory sessionFactory;

	// 获取与当前线程绑定的session
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public boolean add(String email, String password, String invitationcode) {
		if (has(email)) {
			return false;
		}
		// TODO
		return false;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String email, String password) {
		// TODO Auto-generated method stub
		return null;
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
