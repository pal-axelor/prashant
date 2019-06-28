<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
function myFunction() {

  var btn = document.createElement("INPUT");
  var att = document.createAttribute("name");     
  att.value = "phoneno";                           
  btn.setAttributeNode(att);    
  document.body.appendChild(btn);

}
</script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="POST" action="<%=request.getContextPath() %>/ContactResource/insert">
		<h2>Name:</h2>
		<input type="text" id="say-hello-text-input" name="name" />
		<h2>Phone No.</h2>
		<input type="text" id="say-hello-text-input" name="phoneno" /> 
		<h2>Phone No.</h2>
		<input type="text" id="say-hello-text-input" name="phoneno" /> 
	<input type="button" onclick="myFunction()" value="add"/>



		<h2>PhoneType</h2>
		<select name="phonetype">
  <option value="mobile" selected>mobile</option>
  <option value="office">office</option>
  <option value="home">home</option>
  
</select>
		</br>
		<input	type="submit" name="btn" value="Submit" />
	
	</form>
</body>
</html>


