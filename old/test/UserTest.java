package test;

import java.util.Date;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;

public class UserTest {
	public static void addTest(){
		//public User(int id, String email, String password, String gender, byte postcount, int points, byte flowers,
		//Date regdate, boolean online)
		Date date = new Date();
		long time = System.currentTimeMillis();
		date.setTime(time);
		User user=new User(4,"email2@email.com","password","u",(byte)0,0,(byte)0,date,false);
		UserDao userDao = new UserDao();
		userDao.save(user);
	}
	
	public static void main(String[] args) {
		addTest();
	}
}
