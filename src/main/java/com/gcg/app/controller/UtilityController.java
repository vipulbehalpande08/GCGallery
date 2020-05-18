package com.gcg.app.controller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gcg.app.util.Constants;
import com.gcg.app.util.Utils;

@RequestMapping(value="/api/util/")
@RestController
public class UtilityController {

	@RequestMapping(value="uploadFiles/{eventId}", method=RequestMethod.POST)
	public void uploadFiles(@RequestParam("file") MultipartFile files,@PathVariable String eventId){
		
		Utils.uploadFile(Constants.EVENT_UPLOAD_PATH+eventId+"/", files, "event");
		
/*		try {
			Path path = Paths.get(Constants.EVENT_UPLOAD_PATH+eventId, files.getOriginalFilename());
			files.transferTo(path);
			File old = path.toFile();
			File f = new File(Constants.EVENT_UPLOAD_PATH+eventId+"/event.jpg");
			old.renameTo(f);
		
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	}
}
