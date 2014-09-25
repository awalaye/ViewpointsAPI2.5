<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
<%@ page import="kernel.knowledgeGraph.KnowledgeGraph" %>
<%@ page import="kernel.knowledgeGraph.nodes.knowledgeObjects.KnowledgeObject" %>
<%@ page import="org.springframework.stereotype.Controller" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<%@ page info="Ma premiere JSP"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>affichage des agents </title>
</head>
<body>
<p> paragraphe plus plus </p>
<c:forEach items="${agent}" var="a">
		${a.label}		
	</c:forEach> 
</body>
</html>