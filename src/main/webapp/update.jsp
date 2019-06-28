
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form method="POST" action="<%= request.getContextPath()%>/ContactResource/update">
	     <h2>Id:</h2>
		<input type="text" id="say-hello-text-input" name="contactId" value="<%=request.getParameter("contactId")%>"/>
		
		<h2>Name:</h2>
		<input type="text" id="say-hello-text-input" name="contactName" value="<%=request.getParameter("contactName")%>"/>
		 
		 <h2>phone Id:</h2>
		<input type="text" id="say-hello-text-input" name="phoneId" value="<%=request.getParameter("phoneId")%>"/>
		
		
		<h2>phone No:</h2>
		<input type="text" id="say-hello-text-input" name="phoneNo" value="<%=request.getParameter("phoneNumber")%>"/>
		
		<h2>phone Type:</h2>
		<input type="text" id="say-hello-text-input" name="phoneType" value="<%=request.getParameter("phoneType")%>"/>
		
		<input	type="submit" name="btn" value="Update" />
		
	</form>
</body>
</html>