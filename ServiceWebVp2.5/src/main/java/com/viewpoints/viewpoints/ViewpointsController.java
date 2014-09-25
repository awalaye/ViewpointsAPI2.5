
package com.viewpoints.viewpoints;

import kernel.knowledgeGraph.KnowledgeGraph;
import kernel.knowledgeGraph.nodes.viewpoints.Viewpoint;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;

@Controller
public class ViewpointsController {
	
	  public KnowledgeGraph KG;
	  
	  @RequestMapping(value = "/viewpoints", method = RequestMethod.GET )
	  
	 public String  affichage( Model model) {
		  
	        KG = KnowledgeGraphHolder.getInstance();	    	

			model.addAttribute("viewpoints", KG.getViewpoints());			
			return "viewpoints";
	    }
	  
	  
	  @RequestMapping(value = "/carto", method = RequestMethod.GET )
	  public String viewpoints( @RequestParam("id1") long id1, @RequestParam("id2") String id2, Model model){
		  KG = KnowledgeGraphHolder.getInstance();
		  
		  model.addAttribute("carto", KG.getObjectByID(id1));
		  model.addAttribute("cart2", KG.getNamedObject( id2.trim()));
			return "carto"+"cart2";
			
	  }
	  
	  @RequestMapping(value = "/emitviewpoint", method = RequestMethod.POST, headers = "Accept=text/html" )
	  public    ResponseEntity <Viewpoint<KnowledgeObject,KnowledgeObject>> createViewpoint(  @RequestParam("ob1") String ob1, 
			  @RequestParam("ob2") String ob2){
		  KG = KnowledgeGraphHolder.getInstance();
		  HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Type", "text/html; charset=utf-8");
		   String type = "knows";
		   Agent emetter = new Agent("Awa");
		   KG.addKnowledgeObject(emetter);
		   System.out.print("agent Awa ajouter");
		   KnowledgeObject d = new KnowledgeObject ();
		   KnowledgeObject t = new KnowledgeObject ();
		   d = KG.getNamedObject( ob1.trim());
		   t = KG.getNamedObject( ob2.trim());
		   
		   Viewpoint<KnowledgeObject,KnowledgeObject> p = new Viewpoint <KnowledgeObject,KnowledgeObject> (emetter,d,t,type);
		  
		   KG.addViewpoint(p);
		   return new ResponseEntity<Viewpoint<KnowledgeObject,KnowledgeObject>>( p, headers, HttpStatus.CREATED);
		  
		  
		 
			
	  }
	  

	  
	  
	  
	  
	  
	  
	  
	 
	 
	
}

