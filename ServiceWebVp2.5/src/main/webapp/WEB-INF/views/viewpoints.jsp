<%@ page language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>affichage des viewpoints </title>
</head>
<body>
<p> Tous les viewpoints du graphe de connaissance  </p>
<c:forEach items="${viewpoints}" var="a">
		  ${a.id} : ${a.label} - ${a.emitter} --> ${a.o1} / ${a.o2} : ${a.type} <br>
	</c:forEach> 
</body>
</html>