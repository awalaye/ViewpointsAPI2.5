
package com.viewpoints.viewpoints;

import kernel.knowledgeGraph.KnowledgeGraph;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TopicController {
	
	  public KnowledgeGraph KG;
	  
	  @RequestMapping(value = "/topics", method = RequestMethod.GET )
	  
	 public String  affichage( Model model) {
		  
	        KG = KnowledgeGraphHolder.getInstance();	    	

			model.addAttribute("topics", KG.getTopics());			
			return "topics";
	    }
	 
	 
	
}

