<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="<%= request.getContextPath() %>/ContactResource/search">
<h2>enter your Name</h2>
<input type="text" " name="searchfor"/>
<input type="submit" value="search" name="search"/>
</form>
</body>
</html>