package com.iba.project.controllers.student;

import com.iba.project.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentNew")

public class StudentNew extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students = (List<Student>) request.getSession().getAttribute("allstudent");

        String firstName = request.getParameter("firstName");
        String secondName = request.getParameter("secondName");
        float avgMark = Float.parseFloat(request.getParameter("avgMark"));
        String group = request.getParameter("groupNmb");

        Student newStudent = new Student(students.size(), firstName, secondName, group, avgMark);

        for (Student student : students) {
            if (student.equals(newStudent)) {
                request.getRequestDispatcher("/WEB-INF/jsp/StudentList.jsp").forward(request, response);
            }
        }
        students.add(newStudent);

        request.getSession().setAttribute("allstudent", students);
        request.getRequestDispatcher("/WEB-INF/jsp/StudentList.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
