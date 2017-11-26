package com.iba.project.controllers.student;

import com.iba.project.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/StudentDelete")

public class StudentDelete extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students= (List<Student>) request.getSession().getAttribute("allstudent");

        int id=Integer.parseInt(request.getParameter("id"));


        for (Student student : students) {
            if (student.getId()==id) {
                students.remove(student);
                break;
            }
        }


        request.getSession().setAttribute("allstudent", students);
        request.getRequestDispatcher("/WEB-INF/jsp/StudentList.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);

    }
}
