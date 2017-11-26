<%@ page import="com.iba.project.beans.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: CatsUser
  Date: 26.11.2017
  Time: 18:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <th>ID</th>
        <th>First Name</th>
        <th>Second Name</th>
        <th>Avg Mark</th>
        <th>Group Number</th>

    </tr>
    <%for(Student student : (List<Student>)request.getSession().getAttribute("allstudent")) { %>
    <tr>
        <td><%=student.getId() %> </td>
        <td><%=student.getFirstName() %> </td>
        <td><%=student.getSecondName() %> </td>
        <td><%=student.getAvgMark() %> </td>
        <td><%=student.getGroupName() %> </td>
        <td>
            <form action="MoveToEditStudent" method="GET">
                <input type="hidden" name="id" value="<%=student.getId() %>">
            <input type="submit" value="Edit">
        </form>
        </td>
        <td>
            <form action="StudentDelete" method="GET">
                <input type="hidden" name="id" value="<%=student.getId() %>">
                <input type="submit" value="Delete">
            </form>
        </td>
    </tr>

    <%} %>
</table>
<a href="MoveToCreateStudent"><input type="submit" value="Add new" /></a>
</body>
</html>
