<%@page import="java.util.List"%>
<%@page import="com.iba.project.beans.Student"%>
<%@page import="com.iba.project.controllers.student.MoveToCreateStudent"%>
<%@page import="com.iba.project.controllers.student.StudentNew"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>student_Form</title>
</head>
<body >
<h1 align="left">Create new student:</h1>

<form action="StudentNew" method="POST">
    <br>First name: <input name="firstName" value="">
    <br>Second Name: <input name="secondName" value="">
    <br>AvgMark: <input name="avgMark" value="">
    <br>Group number:<input name="groupNmb" value="">
    <br><input type="submit" value="SAVE">
</form>


</body>
</html>