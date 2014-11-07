<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Gestión de tareas</title>
</head>
<body>
	<h1>Gestión de tareas</h1>
	<div>Aquí va la gestión de tareas...</div>
	
	<%-- if (request.isUserInRole("ROLE_USER")) { --%>
	<sec:authorize access="hasRole('ROLE_ADMIN') and hasIpAddress('127.0.0.1')">
	<div>Este mensaje sólo lo pueden ver los también USER</div>
	<%-- } --%>
	</sec:authorize>
	
	<hr>
	<a href="../index.do">Atrás</a>
</body>
</html>