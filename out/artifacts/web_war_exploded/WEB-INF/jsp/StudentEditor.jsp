<%@page import="java.util.List"%>
<%@page import="com.iba.project.beans.Student"%>
<%@page import="com.iba.project.controllers.student.MoveToCreateStudent"%>
<%@page import="com.iba.project.controllers.student.StudentNew"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Student Editor</title>
</head>
<body>
<h1 align="left">Edit student:</h1>
<% Student student= (Student) request.getSession().getAttribute("currentStudent");%>
<form action="StudentEditor" method="post">
    <input type="hidden" name="id" value="<%=student.getId()%>">
    <br>First name: <input name="firstName" value="<%=student.getFirstName()%>">
    <br>Second Name: <input name="secondName" value="<%=student.getSecondName()%>">
    <br>AvgMark: <input name="avgMark" value="<%=student.getAvgMark()%>">
    <br>Group number:<input name="groupName" value="<%=student.getGroupName()%>">
    <br><input type="submit" value="SAVE">
</form>
</body>
</html>
