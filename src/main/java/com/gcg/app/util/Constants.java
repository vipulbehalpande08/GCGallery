package com.gcg.app.util;

import org.springframework.beans.factory.annotation.Value;

public class Constants {
	
	@Value("${aws.host}")
	private static String host;
	
	public static final String UPLOAD_PATH = "/var/www/html/uploads/";
//	public static final String UPLOAD_PATH="C://Stuff/NUIG/project/angular_workspace/GCG-front/src/assets/uploads";
	public static final String ARTIST_UPLOAD_PATH= UPLOAD_PATH+"/artists";
	public static final String EVENT_UPLOAD_PATH= UPLOAD_PATH+"/events/";
	public static final String VENUE_UPLOAD_PATH= UPLOAD_PATH+"/venues/";
	public static final String USER_UPLOAD_PATH= UPLOAD_PATH+"/users/";
	public static final String PRODUCT_UPLOAD_PATH = UPLOAD_PATH+"/products/";
}
