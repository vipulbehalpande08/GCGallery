package com.gcg.app.util;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.multipart.MultipartFile;

public class Utils {

	
	public static void uploadFile(String uploadPath, MultipartFile file, String fileName){
		Path path = null;
		File dir = null;
		try {
			dir = new File(uploadPath);
			dir.mkdir();
			dir = new File(uploadPath+fileName+".jpg");
			if(dir.exists()){
				dir.delete();
			}
			
			path = Paths.get(uploadPath, file.getOriginalFilename());
			System.out.println("Upload path created:"+ path);
			file.transferTo(path);
			
			File old = path.toFile();
			File f = new File(uploadPath+fileName+".jpg");
			old.renameTo(f);
			System.out.println("file renamed:");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error while uploading file");
			e.printStackTrace();
		} 
		
	}
	public static void uploadMultipleFiles(String uploadPath, MultipartFile[] files){
		Path path = null;
		File dir = null;
		try {
			dir = new File(uploadPath);
			dir.mkdir();
			for(int i = 0; i < files.length; i++){
				path = Paths.get(uploadPath, files[i].getOriginalFilename());
				files[i].transferTo(path);
				/*File old = path.toFile();
				File f = new File(uploadPath);
				old.renameTo(f);*/
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error while uploading file");
			e.printStackTrace();
		}finally{
		
		}
		
	}
}
