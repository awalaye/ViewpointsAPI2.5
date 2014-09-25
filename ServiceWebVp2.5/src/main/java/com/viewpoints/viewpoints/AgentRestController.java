package com.viewpoints.viewpoints;

import java.util.ArrayList;
import java.util.List;

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
import org.springframework.web.bind.annotation.RequestBody;





	
	
	
	
	
	@Controller
	@RequestMapping("/rest/agents")


	public class AgentRestController {
		
			private static KnowledgeGraph KG = KnowledgeGraphHolder.getInstance(); 	
		
			List<String> l1 = new ArrayList<String>();
			
				@RequestMapping( method = RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody  ResponseEntity<?> showAgentsJson( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/json; charset=utf-8");	
						for(KnowledgeObject a : KG.getAgents()) {
															 
							    l1.add(a.getLabel());
							    
							   
									
							 }	
						return new ResponseEntity<String> ( l1.toString(), headers, HttpStatus.OK);	 
					
					
						 }	
				
				
				
				
				
				@RequestMapping( method = RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody  void showAgentsXml( ){ 
						HttpHeaders headers = new HttpHeaders();
						headers.add("Content-Type", "application/xml; charset=utf-8");	
						for(KnowledgeObject a : KG.getAgents()) {							
							
								 System.out.println(a.toXML());
						}
									
						
					
						 }	
				
				
				
				
				
				@RequestMapping(value="/{id}.html", method=RequestMethod.GET, headers = "Accept=text/html")
				public @ResponseBody String showAgentByIdHtml(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "text/html; charset=utf-8");	
					
					
					
			return ( id + " , " + KG.getObjectByID(id).getLabel() ); 
				  
				}
				
				@RequestMapping(value="/{id}.json", method=RequestMethod.GET, headers = "Accept=application/json")
				public @ResponseBody ResponseEntity <String> showAgentByIdJson(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/json; charset=utf-8");	
					
					
					
			return new ResponseEntity <String> (  id + " : "+ KG.getObjectByID(id).getLabel(), headers, HttpStatus.OK ); 
				  
				}
		  
		
							
				
				
				@RequestMapping(value="/{id}.xml", method=RequestMethod.GET, headers = "Accept=application/xml")
				public @ResponseBody String showAgentByIdXml(@PathVariable long id) {
					 HttpHeaders headers = new HttpHeaders(); 
					headers.add("Content-Type", "application/xml; charset=utf-8");
					
					return (KG.getObjectByID(id).toXML());
					
					
					
				  
				}
				
				
				// @RequestMapping(method = RequestMethod.POST , headers = "Accept=application/json")
				// public void newAgent(String label) {
				        
				//	 KG.addKnowledgeObject(new Agent(label));
				//    }
				 
				 

				 @RequestMapping(method = RequestMethod.POST, headers = "Accept=application/json")
				    public   ResponseEntity <Agent> createAgent( @RequestBody  String label) {
                    Agent  a = new Agent (label);
					 KG.addKnowledgeObject(a);
				        HttpHeaders headers = new HttpHeaders();
				        headers.add("Content-Type", "application/json; charset=utf-8");
				       

				        return new ResponseEntity<Agent>( a, headers, HttpStatus.CREATED);
				       
				    }
				 
				 
				 
				 @RequestMapping(value="/{id}" , method = RequestMethod.DELETE,  headers = "Accept=application/xml")
				 public void deleteAgent (@PathVariable long id ) {
					 HttpHeaders headers = new HttpHeaders(); 
						headers.add("Content-Type", "application/xml; charset=utf-8");
						
					 KG.removeKnowledgeObject( KG.getObjectByID( Long.valueOf( id )));
				    
				 }
				 
				 
				 
				  @RequestMapping(value = "/{tagName}" , method = RequestMethod.GET , headers = "application/json")
					public @ResponseBody List<String> getAutocompletion(@PathVariable  String tagName) {
					  List<String> result = new ArrayList<String>();
					  List<String> l1 = new ArrayList<String>();
					  HttpHeaders headers = new HttpHeaders(); 
						headers.add("Content-Type", "application/json; charset=utf-8");	
						for(KnowledgeObject a : KG.getO()) {
							 
						    l1.add(a.getLabel());
						}
						
						int tabtail = l1.size();
						System.out.println ("la taille du tableau" +" " + tabtail);
						 for(int i=0; i<tabtail; i++) {
							 if (l1.get(i).contains(tagName)) {
									result.add(l1.get(i));
								}
						 }
						
				 
						 return result; 
					}




				
				
				
				
				
				
	}


