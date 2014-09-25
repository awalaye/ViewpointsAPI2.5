package com.viewpoints.viewpoints;

import kernel.knowledgeActivity.semanticNeighbourhood.ShortestPathNeighbourhood;
import kernel.knowledgeGraph.KnowledgeGraph;
import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
@Controller
@RequestMapping("/rest/neighbourhood")
public class NeighbourhoodRestController {
	
	
	
	
	
	private static KnowledgeGraph KG = KnowledgeGraphHolder.getInstance();
	Agent observer = new Agent("observer");
	ShortestPathNeighbourhood mesNeighbourhood = new ShortestPathNeighbourhood();
	 float m = 0.7f;
	List<String> l1 = new ArrayList<String>();
	KnowledgeObject s = null;
	HashSet<KnowledgeObject> spN = new HashSet<KnowledgeObject>() ;

	
	@RequestMapping(value="/{id}", method=RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody ResponseEntity<String> showNeighbourhood(@PathVariable long id) {
		 HttpHeaders headers = new HttpHeaders(); 
		headers.add("Content-Type", "application/json; charset=utf-8");
		 s = KG.getObjectByID( Long.valueOf(id) );
		System.out.println(s.getLabel());
		mesNeighbourhood.setObserver(observer);
		if (s !=null)
		spN = mesNeighbourhood.process(s, m);
		for(KnowledgeObject o : spN) {
			 
		    l1.add(o.getLabel());		   
				
		 }	
	return new ResponseEntity<String> ( l1.toString(), headers, HttpStatus.OK);	 


	 }	
	
	
	
	
			
		

}
