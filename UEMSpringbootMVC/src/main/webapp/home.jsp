

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div style="position:absolute; top:20px; right:20px;">
    <a href="/" style="padding:8px 14px; background:#343a40; color:white; text-decoration:none; border-radius:6px;">
        ← Back to Login
    </a>
</div> 
<h1>
home page  </h1>

<%@ page import="java.util.*, com.capgemini.training.entity.Employee" %>

<h2>Employee List</h2>

<table border="1">
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
</tr>

<%
List<Employee> employees = (List<Employee>) request.getAttribute("employees");

if(employees != null){
    for(Employee e : employees){
%>
<tr>
    <td><%= e.getEmpId() %></td>
    <td><%= e.getEmpName() %></td>
    <td><%= e.getEmpEmail() %></td>
</tr>
<%
    }
}
%>

</table>

</body>
</html>

