package com.viewpoints.viewpoints;

import java.util.Map;

import javax.validation.Valid;
 

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 

@Controller
public class LoginController {
	
	 private static final Logger logger = Logger.getLogger(LoginController.class);
    @RequestMapping(value = "/loginform", method = RequestMethod.GET)
    public String viewLogin(Map<String, Object> model) {
    	logger.info("viewpoint Info");
        logger.error("viewpoint error");
		
        User user = new User();
        model.put("userForm", user);
        return "login";
    }
 
    @RequestMapping(value = "/loginform", method = RequestMethod.POST)
    public String doLogin(@Valid @ModelAttribute("userForm") User userForm,
            BindingResult result, Map<String, Object> model) {
 
        if (result.hasErrors()) {
            return "login";
        }
 
        return "loginsuccess";
    }
}
