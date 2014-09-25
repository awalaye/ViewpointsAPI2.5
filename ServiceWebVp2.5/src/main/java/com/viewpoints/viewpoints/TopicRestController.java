package com.viewpoints.viewpoints;

import java.util.ArrayList;

import java.util.List;

import kernel.knowledgeGraph.KnowledgeGraph;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;










import kernel.knowledgeGraph.nodes.knowledgeObjects.Topic;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;



	
	
	
	
	
	@Controller
	@RequestMapping("/rest/topics")


	public class TopicRestController {
		
			private static KnowledgeGraph KG = KnowledgeGraphHolder.getInstance(); 	
		
			List<String> l1 = new ArrayList<String>();
			
				@RequestMapping( value ="/rest/topics", method = RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody  ResponseEntity<String> showTopicsJson( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/json; charset=utf-8");	
						for(KnowledgeObject a : KG.getTopics()) {
															 
							    l1.add(a.getLabel());
							   
									
							 }	
						return new ResponseEntity<String> ( l1.toString(), headers, HttpStatus.OK);	 
					
					
						 }	
				
				
				
				
				
				@RequestMapping( value ="/rest/topics.xml", method = RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody  void showTopicsXml( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/xml; charset=utf-8");	
						for(KnowledgeObject a : KG.getTopics()) {							
							
								 System.out.println(a.toXML());
						}
									
						
					
						 }	
				
				
				
				
				
				@RequestMapping(value="/{id}.json", method=RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody String showTopicByIdJson(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/json; charset=utf-8");	
					
					
					
			return ( "{"  + id + " , " + KG.getObjectByID(id).getLabel() + "}"); 
				  
				}
		  
		
							
				
				
				@RequestMapping(value="/{id}.xml", method=RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody String showTopicByIdXml(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/xml; charset=utf-8");
					
					return (KG.getObjectByID(id).toXML());
					
					
					
				  
				}
				
				
				
				 

				 @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/xml")
				    public   ResponseEntity <Topic> createTopic( @RequestBody  String label) {
                    Topic  a = new Topic (label);
					 KG.addKnowledgeObject(a);
				        HttpHeaders headers = new HttpHeaders();
				        headers.add("Content-Type", "application/xml; charset=utf-8");
				       

				        return new ResponseEntity<Topic>( a, headers, HttpStatus.CREATED);
				       
				    }
				 
				 @RequestMapping(value="/{id}" , method = RequestMethod.DELETE,  headers = "Accept=application/xml")
				 public void deleteTopic (@PathVariable long id ) {
					 HttpHeaders headers = new HttpHeaders(); 
						headers.add("Content-Type", "application/xml; charset=utf-8");
						
					 KG.removeKnowledgeObject( KG.getObjectByID( Long.valueOf( id )));
				    
				 }




				
				
				
				
				
				
	}


