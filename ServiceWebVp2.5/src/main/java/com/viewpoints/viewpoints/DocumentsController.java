
package com.viewpoints.viewpoints;

import kernel.knowledgeGraph.KnowledgeGraph;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class DocumentsController {
	
	  public KnowledgeGraph KG;
	  
	  @RequestMapping(value = "/documents", method = RequestMethod.GET )
	  
	 public String  affichage( Model model) {
		  
	        KG = KnowledgeGraphHolder.getInstance();	    	

			model.addAttribute("docs", KG.getDocuments());			
			return "docs";
	    }
	 
	 
	
}

