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
<title>explore</title>
<style type="text/css">a:link{text-decoration:none}
img { max-height: 50px;
max-width: 50px;
width: 40px;
height: 25px }</style>
  <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link rel="stylesheet" id='prettyphoto-css'  href="<c:url value="/resources/css/prettyPhoto.css"/>" type='text/css' media='all'>
    <link href="<c:url value="/resources/css/fontello.css"/>" type="text/css" rel="stylesheet"> 
    <link href="<c:url value="/resources/css/Autocompleter.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/bootstrap-responsive.css"/>" rel="stylesheet">  
    <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>" >
    <script type="text/javascript">
    

function Pager(tableName, itemsPerPage) {

this.tableName = tableName;

this.itemsPerPage = itemsPerPage;

this.currentPage = 1;

this.pages = 0;

this.inited = false;

this.showRecords = function(from, to) {

var rows = document.getElementById(tableName).rows;

// i starts from 1 to skip table header row

for (var i = 1; i < rows.length; i++) {

if (i < from || i > to)

rows[i].style.display = 'none';

else

rows[i].style.display = '';

}

}

this.showPage = function(pageNumber) {

if (! this.inited) {

alert("not inited");

return;

}

var oldPageAnchor = document.getElementById('pg'+this.currentPage);

oldPageAnchor.className = 'pg-normal';

this.currentPage = pageNumber;

var newPageAnchor = document.getElementById('pg'+this.currentPage);

newPageAnchor.className = 'pg-selected';

var from = (pageNumber - 1) * itemsPerPage + 1;

var to = from + itemsPerPage - 1;

this.showRecords(from, to);

}

this.prev = function() {

if (this.currentPage > 1)

this.showPage(this.currentPage - 1);

}

this.next = function() {

if (this.currentPage < this.pages) {

this.showPage(this.currentPage + 1);

}

}

this.init = function() {

var rows = document.getElementById(tableName).rows;

var records = (rows.length - 1);

this.pages = Math.ceil(records / itemsPerPage);

this.inited = true;

}

this.showPageNav = function(pagerName, positionId) {

if (! this.inited) {

alert("not inited");

return;

}

var element = document.getElementById(positionId);

var pagerHtml = '<span onclick="' + pagerName + '.prev();" class="pg-normal"> « Prev </span> ';

for (var page = 1; page <= this.pages; page++)

pagerHtml += '<span id="pg' + page + '" class="pg-normal" onclick="' + pagerName + '.showPage(' + page + ');">' + page + '</span> ';

pagerHtml += '<span onclick="'+pagerName+'.next();" class="pg-normal"> Next »</span>';

element.innerHTML = pagerHtml;

}

}

</script>
    <style type="text/css">

.pg-normal { 
color: #000000; 
font-size: 15px; 
cursor: pointer; 
background: #0000FF; 
padding: 2px 4px 2px 4px; 
}

.pg-selected { 
color: #fff; 
font-size: 15px; 
background: #000000; 
padding: 2px 4px 2px 4px; 
}
</style>
    
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
            
            <a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a>
           
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
    
    
      
   <!-- ******************** HeaderWrapExplore ********************--> 
    
     <div id="headerexplore">
      <header class="clearfix">
       
        <div class="container">
          <div class="row">
            <div class="span12">
               <form:form method="get" action="search" commandName="carto">              
               
                  <input type="text" id= "search3" name="label" value="${param.label}" class="cform-text" size="40" title=" label">
                  <input type="submit" value="" class="cform-submit">
                  <a href="${pageContext.request.contextPath}/walk?destinataire=${param.label} "  target="_blank" > <img  id="walkim" src=" <c:url value="/resources/img/walk.png"/>"  /></a>          
                 
                </form:form>
           
            </div>
               
          </div>
          
        </div>
      </header>
    </div> 
    
   <div id="Tableau"> 
    <table id = "tablepage" class="tab" > 
<thead> 
<tr> 
    <th>Carto</th> 
    <th>Résultats de la recherche</th>  
    <th>Proximité</th>  
    
</tr> 
</thead>
<tbody> 

<c:forEach items="${mana}" var="a">
    
    <c:choose>
  <c:when test="${a['class'].simpleName == 'Agent'}">
    <tr> 
    <td><a href="${pageContext.request.contextPath}/carto?id1=${a.id}&id2=${param.label}" ><img src=" <c:url value="/resources/img/carto.png"/>" />  </a></td>    
    <td><img src=" <c:url value="/resources/img/agent.png"/>" /> <a href="${pageContext.request.contextPath}/view?id=${a.id} "  target="_blank" > ${a.label} </a>
     <td align= "right"><a href=# ><img align= "right" src=" <c:url value="/resources/img/reseaux.png"/>"  id="reseaux" title="proximité"/>  </a></td>     
		  
		 </tr>
  </c:when>
  <c:when test="${a['class'].simpleName == 'Topic'}">
    <tr> 
    <td><a href="${pageContext.request.contextPath}/carto?id1=${a.id}&id2=${param.label}" ><img src=" <c:url value="/resources/img/carto.png"/>" />  </a></td>    
    <td><img src=" <c:url value="/resources/img/topic.png"/>" /> <a href="${pageContext.request.contextPath}/view?id=${a.id} "  target="_blank" > ${a.label} </a> 
     <td align= "right"><a href=# ><img align= "right" src=" <c:url value="/resources/img/reseaux.png"/>" id="reseaux" title="proximité" />  </a></td>    
		 
		 </tr>
  </c:when>
  <c:otherwise>
   <tr> 
    <td><a href="${pageContext.request.contextPath}/carto?id1=${a.id}&id2=${param.label}" ><img src=" <c:url value="/resources/img/carto.png"/>" />  </a></td>    
    <td><img src=" <c:url value="/resources/img/doc.png"/>" /> <a href="${pageContext.request.contextPath}/view?id=${a.id} "  target="_blank" > ${a.label} </a> 
     <td align= "right"><a href=# ><img align= "right" src=" <c:url value="/resources/img/reseaux.png"/>" id="reseaux" title="proximité"/>  </a></td>    
		 
		 </tr>
  </c:otherwise>
</c:choose>




    </c:forEach>
         
 
</tbody> 
</table>
</div>
 
<div id="pageNavPosition" style="padding-top: 20px" align="center">
</div>


     
        <!--    <div id="footer-wrapper">
      <div class="container">
        <footer>
          <small >&copy; 2014 ViewpointS. Tout droit réservé.</small>
        </footer>
      </div>
     
    </div>-->


<script type="text/javascript"><!--
var pager = new Pager('tablepage', 6);
pager.init();
pager.showPageNav('pager', 'pageNavPosition');
pager.showPage(1);
document.getElementById('search1').Text = "blabla";
</script>






	    

</body>
</html>