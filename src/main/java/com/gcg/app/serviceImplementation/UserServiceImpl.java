package com.gcg.app.serviceImplementation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Message;
import com.gcg.app.beans.StatusCode;
import com.gcg.app.beans.User;
import com.gcg.app.dao.UserDao;
import com.gcg.app.service.UserService;

@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public Message addUser(User user) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			isSuccess = userDao.addUser(user);
			if(isSuccess > 0){
				sqlSession.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				msg.setId(user.getUserId());
				
				return msg;
			}else{
				sqlSession.rollback();
				msg.setStatusCode(StatusCode.E202);
				msg.setStatusMessage(StatusCode.E202.value);
				return msg;
			}
		}catch(Exception e){
			e.printStackTrace();
			if(sqlSession != null){
				sqlSession.rollback();
			}
			msg.setStatusCode(StatusCode.E202);
			msg.setStatusMessage(StatusCode.E202.value);
		}finally{
			if(sqlSession != null)
				sqlSession.close();
		}
		return msg;
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userDao.updateUser(user);
	}

	
	@Override
	public User getArtistDetailsById(int artistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserDetailsByEmailId(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUsersByUserType(String userType) {
		// TODO Auto-generated method stub
		return userDao.getUsersByUserType(userType);
	}

	@Override
	public void deleteUserById(int userId) {
		// TODO Auto-generated method stub
		userDao.deleteUserById(userId);
	}

}
