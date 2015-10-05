package info.jafe.emboard.service.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import info.jafe.emboard.dao.UserDao;
import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullUsersException;
import info.jafe.emboard.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	/** 
     * @param str 
     * @return 
     * @Date: 2013-9-6   
     * @Author: lulei   
     * @Description:  
     */  
    private String encodeMD5(String str){  
        String reStr = null;  
        try {  
            MessageDigest md5 = MessageDigest.getInstance("MD5");  
            byte[] bytes = md5.digest(str.getBytes());  
            StringBuffer stringBuffer = new StringBuffer();  
            for (byte b : bytes){  
                int bt = b&0xff;  
                if (bt < 16){  
                    stringBuffer.append(0);  
                }   
                stringBuffer.append(Integer.toHexString(bt));  
            }  
            reStr = stringBuffer.toString();  
        } catch (NoSuchAlgorithmException e) {  
            e.printStackTrace();  
        }  
        return reStr;  
    }  
	
	@Override
	public boolean add(String email, String password, String invitationcode) {
		if (userDao.has(email)) {
			System.out.println("repeat email");
			return false;
		} else {
			try {
				return userDao.add(email, encodeMD5(password), invitationcode);
			} catch (FullUsersException e) {
				e.printStackTrace();
			} 
		}
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
