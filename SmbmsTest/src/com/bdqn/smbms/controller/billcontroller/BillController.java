package com.bdqn.smbms.controller.billcontroller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bdqn.smbms.pojo.Bill;
import com.bdqn.smbms.service.billservice.BillServiceImpl;
@Controller
@RequestMapping("/Bill")
public class BillController {
	Logger logger =Logger.getLogger(BillController.class);
	@RequestMapping("/getBill")
	public ModelAndView getBill() throws Exception{
		logger.info("展示"+"<<<<<<");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("bill","展示bill信息");
		modelAndView.setViewName("getBill");
		return modelAndView;
	}
	@RequestMapping("/add")
	public ModelAndView addBil(BillServiceImpl bil){
		logger.info("添加bill");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("bill",bil);
		modelAndView.setViewName("getBill");
		return modelAndView;
	}
	

}
