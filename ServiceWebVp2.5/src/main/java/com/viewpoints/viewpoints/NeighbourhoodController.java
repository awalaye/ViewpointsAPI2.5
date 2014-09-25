
package com.viewpoints.viewpoints;

import kernel.knowledgeActivity.semanticNeighbourhood.ShortestPathNeighbourhood;
import kernel.knowledgeGraph.KnowledgeGraph;




import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;

import org.apache.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Controller
public class NeighbourhoodController {
	
	  public KnowledgeGraph KG;

		 private static final Logger logger = Logger.getLogger(NeighbourhoodController.class);
	  
	  @RequestMapping(value = "/neighbourhood/{id}", method = RequestMethod.GET )
	  
	 public String affichageNeighbours(@PathVariable long id,  Model model ) {
		  
		  logger.info("viewpoint Info");
	        logger.error("viewpoint error");
			
		  
	        KG = KnowledgeGraphHolder.getInstance();
	        float m = 0.7f;
	        KnowledgeObject s = new KnowledgeObject ();
	        
	        Agent observer = new Agent("observer");			
	        
	        ShortestPathNeighbourhood sp = new ShortestPathNeighbourhood ();
	        
	        s = KG.getObjectByID( Long.valueOf(id) );			
			sp.setObserver(observer);
			HashSet<KnowledgeObject> spN = sp.process(s, m);
	       

			model.addAttribute("voisin", spN);			
			return "voisin";
	    }
	  
	  
	  @RequestMapping(value = "/search")
	   public String Search(@RequestParam("label") String label, Model model) {

		  HashSet<KnowledgeObject> spN = new HashSet<KnowledgeObject>() ;

		  KG = KnowledgeGraphHolder.getInstance();
	        float m = 0.7f;
	        KnowledgeObject s = new KnowledgeObject ();
	        
	        Agent observer = new Agent("observer");			
	        
	        ShortestPathNeighbourhood sp = new ShortestPathNeighbourhood ();
	        
	        s = KG.getNamedObject( label.trim());	
	        //s = KG.getObjectByID(id);
	      
			sp.setObserver(observer);
			if (s !=null) 
				 try {
				spN = sp.process(s, m);
				 }catch (Exception e){  logger.error("ce label n'existe pas ");  }
			

			model.addAttribute("mana", spN);			
			return "mana";
	   }
	  
	  
	 
	 
	
}

