<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="insert.jsp">InsertContactDetails</a></br>

<a href="<%= request.getContextPath() %>/ContactResource/get">showAllRecords</a>
</br>
<a href="search.jsp">searchRecord</a>
</body>
</html>