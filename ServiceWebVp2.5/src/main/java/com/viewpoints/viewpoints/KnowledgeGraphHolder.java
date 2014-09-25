

package com.viewpoints.viewpoints;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.ServletContext;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.ServletContextResource;

import kernel.knowledgeGraph.KnowledgeGraph;

/**
 *
 * @author Awa
 * 
 */
@Controller
public class KnowledgeGraphHolder {
    
    private static KnowledgeGraph instance;
   
 @RequestMapping(value = "/initialisation", method = RequestMethod.GET)
    
    public static KnowledgeGraph getInstance() {
        if(instance == null)
            createInstance();
        
        return instance;
    }
    
    private static void createInstance() {
    	 File f = new File("WEB-INF\\xml\\KG_LIRMM_v2.xml");
    	try{
    	System.out.println(f.getPath());
    	System.out.println(f.getAbsolutePath());   
        
    } catch (Exception e) {
            e.printStackTrace();
        }
    	
    	 instance = KnowledgeGraph.importFromXML(f);
    	 
    	 
    	 
    	 
    	 
    	 



}
    
    
    public static void destroy() {
        // try {
             try {
 				KnowledgeGraph.exportToXML(new File("WEB-INF\\xml\\KG_LIRMM_v2.xml"), instance);
 			} catch (TransformerConfigurationException e) {
 				Logger.getLogger(KnowledgeGraphHolder.class.getName()).log(Level.SEVERE, null, e);
 				e.printStackTrace();
 			} catch (IOException e) {
 				Logger.getLogger(KnowledgeGraphHolder.class.getName()).log(Level.SEVERE, null, e);
 				e.printStackTrace();
 			} catch (ParserConfigurationException e) {
 				Logger.getLogger(KnowledgeGraphHolder.class.getName()).log(Level.SEVERE, null, e);
 				e.printStackTrace();
 			} catch (TransformerException e) {
 				Logger.getLogger(KnowledgeGraphHolder.class.getName()).log(Level.SEVERE, null, e);
 				e.printStackTrace();
 			}
         
         instance.clear();
     }
    
}