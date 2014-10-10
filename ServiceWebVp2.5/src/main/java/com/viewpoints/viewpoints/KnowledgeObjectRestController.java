package com.viewpoints.viewpoints;

import java.util.ArrayList;
import java.util.List;

import kernel.knowledgeGraph.KnowledgeGraph;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;
import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;










import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;



	
	
	
	
	
	@Controller
	@RequestMapping("/rest/knowledgeobjet")


	public class KnowledgeObjectRestController {
		
			private static KnowledgeGraph KG = KnowledgeGraphHolder.getInstance(); 	
		
			List<String> l1 = new ArrayList<String>();
			
				@RequestMapping( method = RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody  ResponseEntity<String> showObjectJson( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/json; charset=utf-8");	
						for(KnowledgeObject a : KG.getO()) {
							
															 
							    l1.add(a.getLabel());
							    
							   
									
							 }	
						return new ResponseEntity<String> ( l1.toString(), headers, HttpStatus.OK);	 
					
					
						 }	
				
				
				
				
				
				@RequestMapping( method = RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody  void showObjetsXml( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/xml; charset=utf-8");	
						for(KnowledgeObject a : KG.getO()) {							
							
								 System.out.println(a.toXML());
						}
									
						
					
						 }	
				
				
				
				
				
				@RequestMapping(value="/{id}.json", method=RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody String showObjectByIdJson(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/json; charset=utf-8");	
					
					
					
			return ( "{"  + id + " , " + KG.getObjectByID(id).getLabel() + "}"); 
				  
				}
		  
		
							
				
				
				@RequestMapping(value="/{id}.xml", method=RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody String showObjectByIdXml(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/xml; charset=utf-8");
					
					return (KG.getObjectByID(id).toXML());
					
					
					
				  
				}
				
				
				
				 

				// @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/xml")
				 // public   ResponseEntity <KnowledgeObject> createObject( @RequestBody  String label , String type) {
					 
					 //  Agent  a = new Agent (label);
                    // KG.addKnowledgeObject(a);
					 //   HttpHeaders headers = new HttpHeaders();
				        //   headers.add("Content-Type", "application/xml; charset=utf-8");
				       

				        //     return new ResponseEntity<Agent>( a, headers, HttpStatus.CREATED);
				       
				   // }
				 
				 @RequestMapping(value="/{id}" , method = RequestMethod.DELETE,  headers = "Accept=application/xml")
				 public void deleteAgent (@PathVariable long id ) {
					 HttpHeaders headers = new HttpHeaders(); 
						headers.add("Content-Type", "application/xml; charset=utf-8");
						
					 KG.removeKnowledgeObject( KG.getObjectByID( Long.valueOf( id )));
				    
				 }




				
				
				
				
				
				
	}


