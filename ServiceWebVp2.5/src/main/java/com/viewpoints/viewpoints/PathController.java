package com.viewpoints.viewpoints;

import java.util.Collection;
import java.util.HashSet;

import kernel.knowledgeActivity.semanticNeighbourhood.ShortestPathNeighbourhood;
import kernel.knowledgeGraph.KnowledgeGraph;

import org.neo4j.cypher.internal.compiler.v1_9.symbols.NodeType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kernel.knowledgeGraph.nodes.Edge;
import kernel.knowledgeGraph.nodes.Node;
import kernel.knowledgeGraph.nodes.knowledgeObjects.Agent;
import kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject;




@Controller
public class PathController {
	public KnowledgeGraph KG;
	
	
	
	@RequestMapping(value = "/walk", method = RequestMethod.GET )
	 public String walk( @RequestParam("destinataire") String destinataire, Model model){
		  KG = KnowledgeGraphHolder.getInstance();
		
		  model.addAttribute("walk",KG.getNamedObject( destinataire.trim()));
		 
			return "walk";
	  }
	
	@RequestMapping(value = "/path", method = RequestMethod.GET )
	 public String chemain( @RequestParam("destinataire") String destinataire,@RequestParam("origine") String origine, Model model){
		  KG = KnowledgeGraphHolder.getInstance();
		  float m = 3.0f;
		  KnowledgeObject o = new KnowledgeObject ();
		  KnowledgeObject d = new KnowledgeObject ();
		   o = KG.getNamedObject( origine.trim());
		   d = KG.getNamedObject( destinataire.trim());
		   Agent observer = new Agent("observer");
		   ShortestPathNeighbourhood sp = new ShortestPathNeighbourhood ();
		   sp.setObserver(observer);
		   sp.process(o, m);
		   System.out.println("origine et destination recupéré");
		   Collection<Edge> chemain = KG.shortestPath(o,d,m);
		  model.addAttribute("result",chemain);
			return "result";
	  }
	
	
	
	
	
	
	

}
