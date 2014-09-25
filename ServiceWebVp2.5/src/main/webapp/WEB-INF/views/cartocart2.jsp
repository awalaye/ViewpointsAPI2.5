<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.viewpoints.viewpoints.NeighbourhoodController"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
   
    
    
    
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>carto</title>
<style type="text/css">a:link{text-decoration:none}
img { 
width: 50px;
height:1.9em; }


</style>
  <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link rel="stylesheet" id='prettyphoto-css'  href="<c:url value="/resources/css/prettyPhoto.css"/>" type='text/css' media='all'>
    <link href="<c:url value="/resources/css/fontello.css"/>" type="text/css" rel="stylesheet"> 
    <link href="<c:url value="/resources/css/Autocompleter.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-responsive.css"/>" rel="stylesheet">  
    <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>" >
   
    <style>    
    body {
        padding-top: 60px; 
         }
           
     </style>

</head>
<body> 

<!--******************** Barre de navigation viewpointS ********************-->
    <div class="navbar-wrapper">
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            
            <a class="btn btn-navbar" > <span class="icon-bar"></span>
            <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
           
            <nav class="pull-right nav-collapse collapse">
              <ul id="menu-main" class="nav">
                <li><a title="inscrire" href="#inscription">S'inscrire</a></li>
                <li><a title="connexion" href="#connexion">Se connecter</a></li>
                <li><a title="équipe" href="#equipe">l'équipe </a></li>                
                <li><a title="contact" href="#contact">Contact</a></li>
                
              </ul>
            </nav>
          </div>          
        </div>        
      </div>      
    </div> 
    
    
      
   <!-- ******************** HeaderWrapViewCarto ********************-->
   
    
     <div id="headerviewcarto">
      <header class="clearfix">       
        
            <div class="span12">
                           
               
                  
      <input type="text" id= "search3" name="label" value="${carto.label}" class="cform1-text" size="40" title=" label">  
                          
                  <input type="text" id= "search3" name="label" value="${cart2.label}" class="cform-text" size="40" title=" label">
                  <input type="submit" value="" name="marcher" class="cform6-submit"> 
                  
                   </div>
                 
                 
               <!--   <br>
                  <input type="submit" value="" name="rechercher" class="cform4-submit">
                  <input type="submit" value="" name="marcher" class="cform5-submit">  <br>
                  <br>-->
              
            
      </header>
    </div> 
    
    
     <!-- ******************** le bloc view ********************-->  
     <div id= "viewcarto">
     <div id="view">
          
                <p>ID: ${carto.id} <br> Label: ${carto.label}
                <br> Type: ${carto['class'].simpleName}</p>               
                <a class="more-link" href="<c:url value="http://www.cirad.fr/" />" target="_blank">lien: </a> 
                
                
               <!--     <br/>
                 
                <input type="submit" value="" name="rechercher" class="cform4-submit">
          
          
            <input type="submit" value="" name="marcher" class="cform6-submit">
            
                     
                  <input type="submit" value="" name="marcher" class="cform5-submit"> 
                   
                                
                    <input type="submit" value="" name="marcher" class="cform7-submit"> -->
                
                          
      </div>
          <div id= "innerandex">          
          <br/>
           <!--   <a href="${pageContext.request.contextPath}/emitviewpoint?ob1=${carto.label}&ob2=${cart2.label}" ><img src=" <c:url value="/resources/img/inner.png"/>" />  </a>-->
          <input type="submit" value="" name="rechercher" class="cform4-submit"><br/>
          
          <br/>
            <input type="submit" value="" name="marcher" class="cform6-submit">
            
             <br/> 
             <br/>            
                  <input type="submit" value="" name="marcher" class="cform5-submit"> 
                   
                   <br/> 
                   <br/>                
                    <input type="submit" value="" name="marcher" class="cform7-submit"> 
                    
           </div> 
           
         
         
         
          
     
     <div id="view">
          
                <p>ID: ${cart2.id} <br> Label: ${cart2.label}
                <br> Type: ${cart2['class'].simpleName}</p>
               
                <a class="more-link" href="<c:url value="http://www.cirad.fr/" />" target="_blank">lien: </a>                
                
              <!--    <br/> 
                <input type="submit" value="" name="rechercher" class="cform4-submit">
          
          
            <input type="submit" value="" name="marcher" class="cform6-submit">
            
                     
                  <input type="submit" value="" name="marcher" class="cform5-submit"> 
                   
                                
                    <input type="submit" value="" name="marcher" class="cform7-submit"> -->
                
            </div>
            
            
            
            
             
         </div> 
         
        
            
            <!-- ******************** the footer ********************         
            
            <div id="footer-wrapper">
      <div class="container">
        <footer>
          <small >&copy; 2014 ViewpointS. Tout droit réservé.</small>
        </footer>
      </div>
     
    </div>-->
            </body>
</html>