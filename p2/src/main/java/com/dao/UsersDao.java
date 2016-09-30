package com.dao;

import java.util.List;

import com.model.Users;



public interface UsersDao {
public List<Users> userslist();
	
	public Users getUserById(int id);
	
	public void saveOrUpdate(Users users);
	
	public void delete(int id);
	
	public void addUsers(Users users);
	
	public boolean isUserExist(Users users);
	
	public Users getUserByUserLoginName(String username);
	
	


	
	
}
