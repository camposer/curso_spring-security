<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Gestión de tareas</title>
</head>
<body>
	<h1>Gestión de tareas</h1>
	<div>Aquí va la gestión de tareas...</div>
	
	<% if (request.isUserInRole("USER")) { %>
	<div>Este mensaje sólo lo pueden ver los también USER</div>
	<% } %>
	
	<a href="../sesion/cerrar.do">Cerrar sesión</a>&nbsp;
	<a href="../index.do">Atrás</a>
</body>
</html>