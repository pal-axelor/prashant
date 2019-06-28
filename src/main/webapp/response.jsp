<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.*" import="com.axelor.classes.Student" %>
<html>
<head>
</head>
<body>

<table>

<% List<Student> studentList = ( List<Student> ) request.getAttribute("user"); 
	for(Student item : studentList){
%>
<form  method="post" action="edit.jsp">
    <tr>
       <td><input type="text" name="studentId" value="<%= item.getStudentId() %>"> </td>
       <td><input type="text" name="studentName" value="<%= item.getStudentName() %>"> </td>
       <td><input type="text" name="studentAge" value="<%= item.getStudentAge() %>"> </td>
        <td><input type="submit"  name="studentUpdate" value="Update" /></td>
         
        </tr>
        </form >
        <form  method="post" action="delete.jsp" >
       
  <tr>
            <td><input type="text" name="studentId" value="<%= item.getStudentId() %>"> </td>
       <td><input type="text" name="studentName" value="<%= item.getStudentName() %>"> </td>
       <td><input type="text" name="studentAge" value="<%= item.getStudentAge() %>"> </td>
       <td><input type="submit"  name="studentUpdate" value="Delete" /></td>
       
       </tr>
      
       
   
    </tr>
   </form> 

  <% } %>
  

  
</table>

</body>
</html>


<!-- ============= -->
<!-- <tr> -->
<%--        <td><%= item.getStudentId() %></td> --%>
<%--         <td><%= item.getStudentName() %></td> --%>
<%--         <td><%= item.getStudentAge() %></td> --%>
    
       
<%--         <td><input type="button" id=<%item.getStudentId(); %> name="studentDelete" value="Delete" /></td> --%>
   
<!--     </tr> -->