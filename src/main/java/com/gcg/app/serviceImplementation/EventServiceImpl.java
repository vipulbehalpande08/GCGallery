package com.gcg.app.serviceImplementation;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcg.app.beans.Event;
import com.gcg.app.beans.Message;
import com.gcg.app.beans.StatusCode;
import com.gcg.app.dao.EventDao;
import com.gcg.app.service.EventsService;
import com.gcg.app.util.Constants;

@Service
//@Transactional
public class EventServiceImpl implements EventsService{

	@Autowired
	private EventDao eventsDao;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public List<Event> getAllEvents() {
		// TODO Auto-generated method stub
		return eventsDao.getAllEvents();
		//return null;
	}

	@Override
	public List<Event> getPastEvents() {
		// TODO Auto-generated method stub
		return eventsDao.getPastEvents();
	}

	@Override
	public List<Event> getUpcomingEvents() {
		// TODO Auto-generated method stub
		return eventsDao.getupcomingEvents();
	}
	public static void createGalleryPath(int eventId){
		File galleryPath = new File(Constants.EVENT_UPLOAD_PATH+eventId);
		if(!galleryPath.exists()){
			galleryPath.mkdir();
		}
	}
	@Override
	public Message addEvent(Event event) {
		// TODO Auto-generated method stub
		int isSuccess = 0;
		Message msg = new Message();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try{
			isSuccess = eventsDao.addEvent(event);
			if(isSuccess > 0){
				sqlSession.commit();
				msg.setStatusCode(StatusCode.E201);
				msg.setStatusMessage(StatusCode.S201.value);
				msg.setId(event.getEventId());
				createGalleryPath(event.getEventId());
				updateGalleryPathById(event.getEventId(), Constants.EVENT_UPLOAD_PATH+event.getEventId());
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
	public void updateEvent(Event event) {
		// TODO Auto-generated method stub
		  eventsDao.updateEvent(event);
	}

	@Override
	public void removeEventById(int eventId) {
		// TODO Auto-generated method stub
		eventsDao.removeEventById(eventId);
		File images = new File(Constants.EVENT_UPLOAD_PATH+eventId);
//		if(images.exists()){
		String[] imageList = {};
			 imageList = images.list();
			for(String image: imageList){
				File currentFile = new File(images.getPath(), image);
				currentFile.delete();
			}
// 		}
	}
	@Override
	public void updateGalleryPathById(int eventId, String galleryPath){
		eventsDao.updateGalleryPathById(eventId, galleryPath);
	}
	
	@Override
	public List<Event> getCurrentEvents() {
		// TODO Auto-generated method stub
		return eventsDao.getCurrentEvents();
	}

	@Override
	public List<Event> getEventsByCategoryIds(String categories) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventsByArtistId(String artistId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventsByDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getEventsByYear(String year) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Event> getFilteredEvents(Event event, int sortingOrder) {
		// TODO Auto-generated method stub
		return eventsDao.getFilteredEvents("%"+event.getEventName()+"%",event.getStartDate(),event.getEndDate(), sortingOrder);
	}

	
}
