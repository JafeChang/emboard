package info.jafe.emboard.dao;

import info.jafe.emboard.entity.User;
import info.jafe.emboard.exceptions.FullUsersException;

public interface UserDao {
	/**
	 * ���User
	 * @throws FullUsersException 
	 * 
	 */
	boolean add(String email, String password, String invitationcode) throws FullUsersException;

	/**
	 * ͨ��id����User
	 * 
	 */
	User getById(int id);

	/**
	 * ͨ��email���������User
	 * 
	 */
	User get(String email, String password);

	/**
	 * ͨ��email��ѯ�Ƿ����User
	 * 
	 */
	boolean has(String email);

	/**
	 * ����User
	 * 
	 */
	void update(User user);
}
