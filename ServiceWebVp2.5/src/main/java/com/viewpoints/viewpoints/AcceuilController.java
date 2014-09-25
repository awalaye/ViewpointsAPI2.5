package com.viewpoints.viewpoints;
import org.apache.log4j.Logger;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;





import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import kernel.knowledgeGraph.KnowledgeGraph;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class AcceuilController {
	private static final Logger logger = Logger.getLogger(AcceuilController.class);
	
	  public KnowledgeGraph KG;	
	 
	
	  
		 
			   
					
			 
			 
		 
	  
	  @RequestMapping(method = RequestMethod.GET )
	  
	 public String  accueil( Model model) {
		  
	        KG = KnowledgeGraphHolder.getInstance();	    	

			model.addAttribute("homepage", " ");	
			logger.info("Bienvenu sur viewpoint !!! ");
	        
			
			return "homepage";
	    }
	  
	 
	 
	 
	  @RequestMapping(value="/{id}.html", method=RequestMethod.GET, headers = "Accept=text/html")
		public @ResponseBody String showAgentByIdHtml(@PathVariable long id) {
			 HttpHeaders headers = new HttpHeaders(); 
			headers.add("Content-Type", "text/html; charset=utf-8");	
			
			
			
	return ( id + " , " + KG.getObjectByID(id).getLabel() ); 
		  
		}
		
	  
	  
	  
	  
	 
	 
	  
	 
	 
	 
	
}