<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Autenticación</title>
	<style>
		.errores {
			color: red;
		}
	</style>
</head>
<body>
	<h1>Autenticación</h1>
	<c:if test="${not empty param.error}">
		<div class="errores">Error al autenticar</div>
	</c:if>
	<form action="j_spring_security_check" method="POST">
		Usuario: <input type="text" name="j_username" /><br /> 
		Contraseña: <input type="text" name="j_password" /><br />
		Recuérdame: <input type="checkbox" name="_spring_security_remember_me"/>
		<input type="submit" value="Entrar" />
	</form>
</body>
</html>