<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Movies Manager</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
	<table class="table table-hover table-bordered">
		<thead>
			<tr>
				<th>Id</th>
				<th>Director</th>
				<th>Title</th>
				<th>Year</th>
				<th>Genre</th>
				<th>Rating</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${movies}" var="movie">
				<tr>
					<td>${movie.id}</td>
					<td>${movie.director}</td>
					<td>${movie.title}</td>
					<td>${movie.year}</td>
					<td>${movie.genre}</td>
					<td>${movie.rating}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</body>
</html>