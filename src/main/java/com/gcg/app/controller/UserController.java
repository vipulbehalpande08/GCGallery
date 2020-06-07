package com.gcg.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gcg.app.beans.User;
import com.gcg.app.service.UserService;
import com.gcg.app.util.Constants;
import com.gcg.app.util.Utils;
@RequestMapping("/api/user")
@RestController
@CrossOrigin(origins="*", allowedHeaders="*")
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void updateUser(@RequestBody User user){
		userService.updateUser(user);
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public void addArtist(@RequestBody User user){
		userService.addUser(user);
	}
	@RequestMapping(value="/getUsersByUserType/{userType}", method=RequestMethod.GET)
	public List<User> addArtist(@PathVariable String userType){
		return userService.getUsersByUserType(userType);
	}
	@RequestMapping(value="/deleteUserById/{userId}", method=RequestMethod.DELETE)
	public void deleteUserById(@PathVariable int userId){
		userService.deleteUserById(userId);
	}
	@RequestMapping(value="/uploadFile/{userId}", method=RequestMethod.POST)
	public void uploadFiles(@RequestParam("file") MultipartFile file, @PathVariable String userId){
		Utils.uploadFile(Constants.USER_UPLOAD_PATH+userId+"/", file, "user");
	}
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public boolean validateLogin(@RequestParam("username") String username,@RequestParam("password") String password){
		return userService.getUserDetailsByEmailId(username, password);
	}
}
