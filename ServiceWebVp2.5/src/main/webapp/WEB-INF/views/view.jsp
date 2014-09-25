<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.viewpoints.viewpoints.NeighbourhoodController"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>view</title>
<style type="text/css">a:link{text-decoration:none}
img { max-height: 50px;
max-width: 50px;
width: 25px;
height: 20px }</style>
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
            
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span>
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
    
    
      
   <!-- ******************** HeaderWrapViews ********************--> 
    
     <div id="headerview">
      <header class="clearfix">
       
        <div class="container">
          <div class="row">
            <div class="span12">
               <form:form method="get" action="search" commandName="mana">              
               
                  <input type="text" id= "search3" name="label" value="${view.label}"  class="cform-text" size="40" title=" label">
                  <input type="submit" value="" name="rechercher" class="cform1-submit">
                  <input type="submit" value="" name="marcher" class="cform2-submit">  
                  <input type="submit" value="" class="cform3-submit">           
                 
                 
              </form:form>
            </div>
          </div>
          
        </div>
      </header>
    </div> 
    
     <!-- ******************** le bloc view ********************-->  
    
    <div id="view1">
          
                <p>ID: ${view.id} <br> Label: ${view.label}
                <br> Type: ${view['class'].simpleName}</p>
              
             
               
                <a class="more-link" href="<c:url value="http://www.cirad.fr/" />" target="_blank">lien: </a> 
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