package info.jafe.emboard.service;

import info.jafe.emboard.entity.User;

public interface UserService {
	/**
	 * 添加User
	 * 
	 */
	boolean add(String email, String password, String invitationcode);

	/**
	 * 通过id查找User
	 * 
	 */
	User getById(int id);

	/**
	 * 通过email与密码查找User
	 * 
	 */
	User get(String email, String password);

	/**
	 * 通过email查询是否存在User
	 * 
	 */
	boolean has(String email);

	/**
	 * 更新User
	 * 
	 */
	void update(User user);
}
