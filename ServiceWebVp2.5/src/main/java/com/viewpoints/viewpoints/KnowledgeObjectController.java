
package com.viewpoints.viewpoints;

import java.util.HashSet;

import kernel.knowledgeActivity.semanticNeighbourhood.ShortestPathNeighbourhood;
import kernel.knowledgeGraph.KnowledgeGraph;




import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KnowledgeObjectController {
	
	  public KnowledgeGraph KG;
	  private static final Logger logger = Logger.getLogger(KnowledgeObjectController.class);
	  
	  
	  
	  @RequestMapping(value = "/objets", method = RequestMethod.GET )
	  
	 public String  affichage( Model model) {

		  KG = KnowledgeGraphHolder.getInstance();
	       model.addAttribute("objets", KG.getO());	
			logger.info("tous les objets du graph");
	      
			
			return "objets";
	    }
	  
	  
	  @RequestMapping(value = "/view")
	   public String SearchObjet(@RequestParam("id") long id, Model model) {

		  KG = KnowledgeGraphHolder.getInstance();
		  
		  	

		
			model.addAttribute("view", KG.getObjectByID(id) );			
			return "view";
	  }
	 
	 
	
}

