package com.gcg.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gcg.app.beans.User;

public interface UserDao {
	public int addUser(User user);
	public int addCustomer(User user);
	public User getArtistDetailsById(int artistId);
	public User getUserDetailsByEmailId(String emailId);
	public List<User> getUsersByUserType(@Param("userType") String userType);
	public void updateUser(User user);
	public void deleteUserById(int userId);
	}
