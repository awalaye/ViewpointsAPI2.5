package com.viewpoints.viewpoints;

import java.util.Map;

import javax.validation.Valid;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.viewpoints.viewpoints.Inscription;


@Controller
@RequestMapping("/inscriptionform")
public class InscriptionController {
	
	private static final Logger logger = Logger.getLogger(InscriptionController.class);
	
        @Autowired
        private RegistrationValidation registrationValidation;

        public void setRegistrationValidation(
                        RegistrationValidation registrationValidation) {
                this.registrationValidation = registrationValidation;
        }

        // Display the form on the get request
        @RequestMapping(method = RequestMethod.GET)
        public String showRegistration(Model model) {
                Inscription registration = new Inscription();
                logger.info("viewpoint Info");
    	        logger.error("viewpoint error");
    			
                model.addAttribute("inscription", registration);
                return "inscriptionform";
        }

        // Process the form.
        @RequestMapping(method = RequestMethod.POST)
        public String processRegistration(@Valid Inscription registration,
                        BindingResult result) {
                // set custom Validation by user
                registrationValidation.validate(registration, result);
                if (result.hasErrors()) {
                        return "inscriptionform";
                }
                return "inscriptionsuccess";
        }
}
