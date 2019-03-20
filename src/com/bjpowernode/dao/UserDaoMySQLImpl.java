package com.bjpowernode.dao;

import org.springframework.stereotype.Repository;

import com.bjpowernode.beans.User;
@Repository("mysqlDao")
public class UserDaoMySQLImpl implements UserDao {

	@Override
	public void insertUser(User user) {
		System.out.println("使用了mysql的插入操作");

	}

}
