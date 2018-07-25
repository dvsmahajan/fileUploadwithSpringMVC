package org.dvsCorp.userDataStore.model.service;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.dvsCorp.userDataStore.model.dao.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class UserService {

	@Autowired
	private UserDAO userDAO;
	
	private static final Logger logger = LoggerFactory
			.getLogger(UserService.class);

	public Boolean uploadImage(MultipartFile file) {
		if(!file.isEmpty())
		{
			try {
				byte[] bytes = file.getBytes();

				
				String filename=file.getOriginalFilename();
				// Creating the directory to store file
				String rootPath = "H:\\maven\\UserDataStore\\src";
				File dir = new File(rootPath + File.separator + "UserImage");
				if (!dir.exists())
					dir.mkdirs();

				
				DateFormat dateFormat = new SimpleDateFormat("HHmmss");
				Date date = new Date();
				System.out.println("Time Is :---------------->>>>>>>>>>>>>>> "+dateFormat.format(date));
				
				
				// Create the file on server
				File serverFile = new File(dir.getAbsolutePath()
						+ File.separator +dateFormat.format(date) +filename);
				BufferedOutputStream stream = new BufferedOutputStream(
						new FileOutputStream(serverFile));
				stream.write(bytes);
				stream.close();

				logger.info("Server File Location="
						+ serverFile.getAbsolutePath());

				return true;
			} catch (Exception e) {
				logger.info(e.getMessage());
				return false;
			}
		} else {
			return false;
		}	
		
	}
}
