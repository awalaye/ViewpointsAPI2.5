<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>    
    <%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
    <%@page import="com.viewpoints.viewpoints.LoginController"%>
   
    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <title>ViewpointS homepage</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    
    
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
    
    
  <script type="text/javascript" src="<c:url value="/resources/js/jquery.js"/>"></script>    
  <script type="text/javascript" src="<c:url value="/resources/js/jquery.scrollTo-1.4.2-min.js"/>"> </script>   
  <script type="text/javascript" src="<c:url value="/resources/js/jquery.localscroll-1.2.7-min.js"/>"> </script>
    
    
  <link rel="stylesheet" href="//code.jquery.com/ui/1.11.1/themes/smoothness/jquery-ui.css">
  <script src="//code.jquery.com/jquery-1.10.2.js"></script>
  <script src="//code.jquery.com/ui/1.11.1/jquery-ui.js"></script>
  <link rel="stylesheet" href="/resources/demos/style.css">
  
  <script>

  $(function() {
	    var availableTags = [
	      "Philippe Lemoisson",
	      "Clement Jonquet",
	      "Philippe Poignet",
	      "Stéphanie Pointet",
	      "Stefano A. Cerri	",
	      "laser",
	      "sensors and actuators",
	      "Microelectronics Journal",
	      "Journal of Applied Logic",
	      "pregroup grammars",
	      "proof graphs",
	      "light-trail",
	      "IEEE Transaction on VLSI",
	      "Michel Leclère",
	      "Multicast Routing in WDM Networks without Splitters",
	      "Planning contact points for humanoid robots",
	      "Graphical norms via conceptual graphs",
	      "Graph transformations preserving the stability number",
	      "ScripTree: scripting phylogenetic graphics",
	      "Hardness of Optimal Spaced Seed Design",
	      "R. Ost",
	      "Guillaume Revy"
	    ];
	    $( "#search1" ).autocomplete({
	      source: availableTags,
	      minLength : 2
	    });
	  });
  </script>
 
   
    
    
    
</head>
<body>


<!--******************** Barre de navigation viewpointS ********************-->
    <div class="navbar-wrapper">
      <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="navbar-inner">
          <div class="container">
            
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
            <h5 class="brand"><a href="#top">Accueil</a></h5>
            <nav class="pull-right nav-collapse collapse">
              <ul id="menu-main" class="nav">
                <li><a title="inscription" href=${pageContext.request.contextPath}/inscriptionform>S'inscrire</a></li>
                
                <li><a title="connexion" href=${pageContext.request.contextPath}/loginform>Se connecter</a></li>
                <li><a title="équipe" href="#team">l'équipe </a></li>                
                <li><a title="contact" href="#contact">Contact</a></li>
                
              </ul>
            </nav>
          </div>          
        </div>        
      </div>      
    </div>
    
   <!-- ******************** HeaderWrap ********************--> 
    <div id="headerwrap">
      <header class="clearfix">
        <h2><span> Avec ViewpointS:</span>
        <span1> C'est de la recherche dans la sympathie et la confiance !</span1> </h2>
        <div class="container">
          <div class="row">
            <div class="span12">
               <form:form method="get" action="search" commandName="mana">              
               
                  <input type="text" id= "search1" name="label" value="${fn:escapeXml(param.label)}" placeholder="taper ici votre recherche" class="cform-text" size="40" title=" label">
                  <input type="submit" value="Rechercher" class="cform-submit">
              
               </form:form>
                 </div>
                 
              
            </div>
          </div>
          
        </div>
        
    
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.prettyPhoto.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/site.js"/>"></script>
    
    
    
     <!-- ******************** section Incription ********************--> 
     

     
     
  
     
     
      <!-- ******************** section Inscription ********************--> 
    
    
    
    
    
    
    
      <!--******************** Team Section ********************-->
    <section id="team" class="single-page scrollblock">
      <div class="container">
       
        <h2 align="center"> ViewpointS équipe</h2>
        <!-- Five columns -->
        <div class="row">
          <div class="span2 offset1">
            <div class="teamalign"> <img class="team-thumb img-circle" src=" <c:url value="/resources/img/clement-jonquet.png"/>" alt=""> </div>
            <h3>Clement</h3>
            <div class="job-position">Statut</div>
          </div>
          <!-- ./span2 -->
          <div class="span2">
            <div class="teamalign"> <img class="team-thumb img-circle" src=" <c:url value="/resources/img/awa.jpg"/>" alt=""> </div>
            <h3>Awa</h3>
            <div class="job-position">Developpeur web</div>
          </div>
          <!-- ./span2 -->
          <div class="span2">
            <div class="teamalign"> <img class="team-thumb img-circle" src=" <c:url value="/resources/img/cerri.jpg"/>" alt=""> </div>
            <h3>Stefano</h3>
            <div class="job-position">Statut</div>
          </div>
          <!-- ./span2 -->
          <div class="span2">
            <div class="teamalign"> <img class="team-thumb img-circle" src=" <c:url value="/resources/img/guillaume.jpg"/>" alt=""> </div>
            <h3>Guillaume</h3>
            <div class="job-position">Statut</div>
          </div>
          <!-- ./span2 -->
          <div class="span2">
            <div class="teamalign"> <img class="team-thumb img-circle" src=" <c:url value="/resources/img/philippe.jpg"/>" alt=""> </div>
            <h3>Philippe</h3>
            <div class="job-position">Statut</div>
          </div>
          <!-- ./span2 -->
        </div>
        <!-- /.row -->
        <div class="row">
          <div class="span10 offset1">
            <hr class="featurette-divider">
            <div class="featurette">
              <h2 class="featurette-heading">ViewpointS équipe <span class="muted">| A propos de nous</span></h2>
              <p>blablablablablabla blablablablablabla blablablablablabla blablablablablabla blablablablablabla .</p>
              <p>blablablablablabla blablablablablabla blablablablablabla blablablablablabla blablablablablabla .</p>
              <p>blablablablablabla blablablablablabla blablablablablabla blablablablablabla blablablablablabla .</p>
              <p>blablablablablabla blablablablablabla blablablablablabla blablablablablabla blablablablablabla .</p>
            </div>
            <!-- /.featurette -->
            <hr class="featurette-divider">
          </div>
          <!-- .span10 -->
        </div>
        <!-- /.row -->
      </div>
      <!-- /.container -->
    </section>
    
    
    
    
    
     <!--******************** Contact Section ********************-->
    <section id="contact" class="single-page scrollblock">
      <div class="container">
        
        <h3>Nous contacter</h3>
        <div class="row">
          <div class="span12">
            <div class="cform" id="theme-form">
              <form action="#" method="post" class="cform-form">
                <div class="row">
                  <div class="span6"> <span class="your-name">
                    <input type="text" name="your-name" placeholder ="votre nom" class="cform-text" size="20" title="votre nom">
                    </span> </div>
                  <div class="span6"> <span class="your-email">
                    <input type="text" name="your-email" placeholder="votre mail" class="cform-text" size="40" title="votre mail">
                    </span> </div>
                </div>                
                <div class="row">
                  <div class="span12"> <span class="message">
                    <textarea name="message" placeholder="votre message" class="cform-textarea" cols="40" rows="10" title="drop us a line."></textarea>
                    </span> </div>
                </div>
                <div>
                  <input type="submit" value="Envoyer" class="cform-submit pull-left">
                </div>
                <div class="cform-response-output"></div>
              </form>
            </div>
          </div>          
        </div>       
      </div>     
    </section>
    
         
         <!--   <div id="footer-wrapper">
      <div class="container">
        <footer>
          <small >&copy; 2014 ViewpointS. Tout droit réservé.</small>
        </footer>
      </div>
     
    </div>-->
   
    
    

</body>
</html>