package org.dvsCorp.userDataStore.controller;

import org.dvsCorp.userDataStore.dto.User;
import org.dvsCorp.userDataStore.model.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class UserController 
{
	private static final Logger logger = LoggerFactory
			.getLogger(UserController.class);
	
	@Autowired
	private UserService userServie;
	
	public UserController() {
		System.out.println(this.getClass().getCanonicalName()+" is Created............");
	}
	
	@RequestMapping(value="/lodin.do",method=RequestMethod.POST)
	public ModelAndView login(@RequestBody User user)
	{
		System.out.println(user);
		return null;
	}
	

	
	
	@RequestMapping(value="/register.do",method=RequestMethod.POST)
	public ModelAndView registerUser(@RequestParam("photoUpload")MultipartFile file
			,User user
			)
	{
		ModelAndView andView=new ModelAndView("/register.jsp");
		if(!file.isEmpty())
		{
//			userServie.savePic(file);
			System.out.println(user);
			System.out.println(file.getOriginalFilename());
			System.out.println(file.getContentType());
			if(file.getContentType().indexOf("image/")!=-1) {
				System.out.println("File Is :"+file.getContentType()+" Valid..........");
				Boolean upld =userServie.uploadImage(file);
				if(upld) {
					andView.addObject("fail", "File Successfully Saved............");
					return andView;
				}
			}else {
				andView.addObject("fail", "Wrong type of file");
				return andView;
			}
		}
		
		return null;
	}
}
