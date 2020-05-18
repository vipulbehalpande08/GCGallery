package com.gcg.app.serviceImplementation;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gcg.app.beans.Message;
import com.gcg.app.beans.StatusCode;
import com.gcg.app.beans.Venue;
import com.gcg.app.dao.VenueDao;
import com.gcg.app.service.VenueService;

//@Transactional
@Service
public class VenueServiceImpl implements VenueService{

	@Autowired
	private SqlSessionFactory SqlSessionFactory;
	@Autowired 
	private VenueDao venueDao;
	@Override
	public Message addVenue(Venue venue) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession sqlSession = SqlSessionFactory.openSession();
		try{
			isSuccess = venueDao.addVenue(venue);
			if(isSuccess > 0){
				sqlSession.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				msg.setId(venue.getVenueId());
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
	public Message updateVenue(Venue venue) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession sqlSession = SqlSessionFactory.openSession();
		try{
			isSuccess = venueDao.updateVenue(venue);
			if(isSuccess > 0){
				sqlSession.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				msg.setId(venue.getVenueId());
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
	public Message updateAvailability(String availability) {
		// TODO Auto-generated method stub
		return new Message();
	}

	@Override
	public List<Venue> getAllVenue() {
		// TODO Auto-generated method stub
		return venueDao.getAllVenue();
	}

	@Override
	public void removeVenueById(int venueId) {
		// TODO Auto-generated method stub
		venueDao.removeVenueById(venueId);
	}

	
}
