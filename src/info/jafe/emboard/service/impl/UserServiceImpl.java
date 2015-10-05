package info.jafe.emboard.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean add(String email, String password, String invitationcode) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		System.out.println("service has pass");
		return userDao.has(email);
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub

	}

}
