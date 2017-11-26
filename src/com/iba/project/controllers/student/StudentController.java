package com.iba.project.controllers.student;

import com.iba.project.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/StudentController")
public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> students = getStudentsList();
        request.getSession().setAttribute("allstudent", students);
        request.getRequestDispatcher("/WEB-INF/jsp/StudentList.jsp").forward(request, response);

    }

    private List<Student> getStudentsList() {
        List<Student> list = new ArrayList<Student>();

        Student s = new Student();
        s.setId(1);
        s.setAvgMark(5);
        s.setFirstName("Oleg");
        s.setSecondName("Zdanevich");
        s.setGroupName("proizvodstvo");
        list.add(s);

        s = new Student();
        s.setId(2);
        s.setAvgMark(9);
        s.setFirstName("lexa");
        s.setSecondName("ogurcov");
        s.setGroupName("proizvodstvo");
        list.add(s);

        s = new Student();
        s.setId(3);
        s.setAvgMark(7);
        s.setFirstName("Lera");
        s.setSecondName("Buchkova");
        s.setGroupName("Km");
        list.add(s);

        return list;

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

}