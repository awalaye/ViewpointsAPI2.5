<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

pageEncoding="ISO-8859-1"%>

<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Inscriptions avec success</title>

</head>

<body>

<h3>Bienvenue Inscription avec succees .</h3>

<table>

<tr>

<td>User Name :</td>

<td><core:out value="${inscription.userName}" /></td>

</tr>

<tr>

<td>Password :</td>

<td><core:out value="${inscription.password}" /></td>

</tr>
<tr>

<td>Email :</td>

<td><core:out value="${inscription.email}" /></td>

</tr>

</table>

</body>

</html>