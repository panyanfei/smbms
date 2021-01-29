package com.bdqn.smbms.controller.rolecontroller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/role")
public class RoleController {
	Logger logger =Logger.getLogger(RoleController.class);
	@RequestMapping("/add")
	public String addrole(Model model){
		logger.info("Ìí¼Órole");
		model.addAttribute("test","Ìí¼Órole");
		return "roleadd";	
	}
}
