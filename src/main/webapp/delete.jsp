
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	
	<form method="POST" action="kangen">
	     <h2>Id:</h2>
		<input type="text" id="say-hello-text-input" name="studentid1" value="<%=request.getParameter("studentId")%>"/>
		
		<h2>Name:</h2>
		<input type="text" id="say-hello-text-input" name="studentName1" value="<%=request.getParameter("studentName")%>"/>
		
		<h2>Age:</h2>
		<input type="text" id="say-hello-text-input" name="studentAge1" value="<%=request.getParameter("studentAge")%>"/>
		
		<input	type="submit" name="btn" value="Delete" />
		
	</form>

</body>
</html>