<html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="POST" action="<%= request.getContextPath()%>/add"/>
		<h2>Name:</h2>
		<input type="text" id="say-hello-text-input" name="name" />
		<h2>Age:</h2>
		<input type="text" id="say-hello-text-input" name="age" /> 
		<input	type="submit" name="btn" value="Submit1" />
	
	</form>

</body>
</html>