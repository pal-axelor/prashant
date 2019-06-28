
<%@ page import="java.util.*" import="com.axelor.MiniProject.db.Contact"
	import="com.axelor.MiniProject.db.Phone"%>
<html>
<head>
</head>
<body>
<h2>Show all contact</h2>
	<table>

		<%
			List<Contact> contactList = (List<Contact>) request.getAttribute("listContact");
			for (Contact item : contactList) {
				List<Phone> phoneList = item.getListOfPhone();
				for (Phone phone : phoneList) {
		%>
		<form method="post" >
			<tr>
				<td><input type="text" name="contactId"
					value="<%=item.getContactId()%>"></td>
				<td><input type="text" name="contactName"
					value="<%=item.getContactName()%>"></td>
					<td><input type="text" name="phoneId"
					value="<%=phone.getPhoneId()%>"></td>
				<td><input type="text" name="phoneNumber"
					value="<%=phone.getPhoneNumber()%>"></td>
				<td><input type="text" name="phoneType"
					value="<%=phone.getPhoneType()%>"></td>

				<td><input type="submit" name="contactUpdate" value="Update" onclick="form.action='../update.jsp';"/></td>
				
				
					
				<td><input type="submit" name="contactDelete" value="Delete" onclick="form.action='../delete.jsp';"/></td>

			</tr>
			
			</form>
		
		<%
			}%>
		
			<td>
			<a href="<%=request.getContextPath()%>/ContactResource/deleteAll/<%=item.getContactId()%>">delete contact</a></td>
			
			<% }
		%>


	</table>
</br>
</br>
</br>
<a href="../index.jsp">Home</a>
</body>
</html>