package com.bdqn.smbms.controller.usercontroller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdqn.smbms.pojo.User;
import com.bdqn.smbms.service.userservice.UserService;
import com.bdqn.smbms.service.userservice.UserServiceImpl;
@Controller
@RequestMapping("/user")
public class UserController {
	Logger logger =Logger.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@RequestMapping("/login")
	public String login(@RequestParam("userCode")String userName,@RequestParam("upassword")String password){
		User user = userService.login(userName, password);
		if(user !=null){
			return "index";
		}else{
			return "error";
		}
	}
	@RequestMapping("/")
	public String t(){
		return "login";
	}
}
