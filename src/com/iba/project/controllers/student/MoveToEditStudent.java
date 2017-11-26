package com.iba.project.controllers.student;

import com.iba.project.beans.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/MoveToEditStudent")

public class MoveToEditStudent extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<Student> students = (List<Student>) request.getSession().getAttribute("allstudent");

        int id =Integer.parseInt(request.getParameter("id"));

        Student currentStudent=null;

        for(Student student: students)
        {
            if(student.getId()==id)
            {
                currentStudent=student;
                break;
            }
        }

        request.getSession().setAttribute("currentStudent",currentStudent);
        request.getRequestDispatcher("/WEB-INF/jsp/StudentEditor.jsp").forward(request, response);

    }

}