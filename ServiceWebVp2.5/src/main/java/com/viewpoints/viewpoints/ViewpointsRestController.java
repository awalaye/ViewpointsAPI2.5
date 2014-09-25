package com.viewpoints.viewpoints;

import java.util.ArrayList;
import java.util.List;

import kernel.knowledgeGraph.KnowledgeGraph;


import kernel.knowledgeGraph.nodes.viewpoints.Viewpoint;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/rest/viewpoints")
public class ViewpointsRestController {
	
	

	
	private static KnowledgeGraph KG = KnowledgeGraphHolder.getInstance(); 	

	List<String> l1 = new ArrayList<String>();
	
		@RequestMapping(  method = RequestMethod.GET, headers = "Accept=application/json")
		public @ResponseBody  ResponseEntity<String> showViewpoints(){ 
				HttpHeaders headers = new HttpHeaders();
				headers.add("Content-Type", "application/json; charset=utf-8");	
				for(Viewpoint v : KG.getViewpoints()) {
													 
					    l1.add(v.getLabel());
					    l1.add(v.getEmitter().getLabel());
					    l1.add(v.getO1().getLabel());
					    l1.add(v.getO2().getLabel());
					    l1.add(v.getType());
					   
							
					 }	
				return new ResponseEntity<String> ( l1.toString(), headers, HttpStatus.OK);	 
			

}	

		
		
}
