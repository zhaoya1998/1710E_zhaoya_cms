package com.zhaoya.cms.dao;

import java.util.List;

import com.zhaoya.cms.domain.User;

public interface UserMapper {
	
	/**
	 * 
	 * @Title: selectByName 
	 * @Description: TODO
	 * @param name
	 * @return
	 * @return: User
	 */
	User selectByName(String name);

	/**
	 * 
	 * @Title: selects 
	 * @Description: 用户列表
	 * @param user
	 * @return
	 * @return: List<User>
	 */
	List<User> selects(User user);
	/**
	 * 
	 * @Title: update 
	 * @Description:修改
	 * @param user
	 * @return
	 * @return: int
	 */
	int update(User user);
	
	/**
	 * 
	 * @Title: insert 
	 * @Description: TODO
	 * @param user
	 * @return
	 * @return: int
	 */
	int insert(User user);
	
	
}
