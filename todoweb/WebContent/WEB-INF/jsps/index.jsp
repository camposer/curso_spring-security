<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Cosas por hacer</title>
	<style>
		.todo {
			border: 1px dashed red;
		}
	</style>
</head>
<body>
	<h1>Cosas por hacer</h1>
	<c:forEach var="t" items="${todos}">
		<div class="todo">
			<div>${t.nombre}</div>
			<div>${t.status}</div>		
		</div>
	</c:forEach>
	<a href="admin/index.do">Ir a admin</a>
</body>
</html>