package com.gcg.app.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gcg.app.beans.Message;
import com.gcg.app.beans.User;

public interface UserService {

	public Message addUser(User user);
	public void updateUser(User user);
	public List<User> getUsersByUserType(String userType);
	public User getArtistDetailsById(int artistId);
	public User getUserDetailsByEmailId(String emailId);
	public void deleteUserById(int userId);
}
