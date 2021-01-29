package com.bdqn.smbms.controller.providercontroller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/provider")
public class ProviderController {
	Logger logger =Logger.getLogger(ProviderController.class);
	@RequestMapping("/add")
	public ModelAndView addProvider(){
		logger.info("添加产品信息");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("pro","添加产品信息");
		modelAndView.setViewName("addprovider");
		return modelAndView;
	}
}
