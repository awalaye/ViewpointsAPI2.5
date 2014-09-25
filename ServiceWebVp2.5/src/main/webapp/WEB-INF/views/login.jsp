<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="com.viewpoints.viewpoints.NeighbourhoodController"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
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
<h2 align= "center">Login sur ViewpointS</h2>
    <div id="login">
       
       
        <form:form action="loginform" commandName="userForm">
                <label for="email">Email d'utilisateur:</label>
                   <form:input path="email" size="30"/>
                    <form:errors path="email" cssClass="error"/>
               
                  <label for="password">Mot de pass:</label>
                    <form:password path="password" size="30"/>
                   <form:errors path="password" cssClass="error"/>
                    <p><a href="#">mot de pass oublié?</a></p>
                
                    
                    <input type="checkbox"><label class="check" for="checkbox">Garder moi connecté</label>
                    <input type="submit" value="Se connecter"/>
                    
               
        </form:form>
        
    </div>
    
    
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/jquery.prettyPhoto.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/site.js"/>"></script>
    
    
      
     
    
</body>
</html>