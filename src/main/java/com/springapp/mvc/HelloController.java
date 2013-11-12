package com.springapp.mvc;

import motd.service.MessageOfTheDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

    @Autowired
    private MessageOfTheDayService messageOfTheDayService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
        String mess = messageOfTheDayService.sayHello();
		model.addAttribute("message", mess);
		return "welcome";
	}
}