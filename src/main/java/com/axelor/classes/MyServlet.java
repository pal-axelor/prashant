package com.axelor.classes;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
@WebListener
public class MyServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Inject
	Service service;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
	//	PrintWriter writer=response.getWriter();
		
		
		String button =request.getParameter("btn");
		if(button.equals("Submit1")) {
			String myname = request.getParameter("name");
			String age = request.getParameter("age");
				int myage1 = Integer.parseInt(age);
			service.insert(myname, myage1);
			List<Student> listOfStudent=service.getList();
			request.setAttribute("user", listOfStudent);
			request.getRequestDispatcher("response.jsp").forward(request, response); 
		}
    
		
		
		
		
		/*listOfStudent.forEach(v-> {
			System.out.println("student id is :"+v.studentId +" student name is :"+v.studentName+" student age is :"+v.StudentAge );
		});*/
		//String button1 =request.getParameter("myupdate");
			
		
		if(button.equals("Update")) {
			System.out.println("servlet is called");
		String studentName=	request.getParameter("studentName1");
		String studentAge=	request.getParameter("studentAge1");
		String id1=	 request.getParameter("studentid1");
		int age=Integer.parseInt(studentAge);
		int id=Integer.parseInt(id1);
		List<Student> listOfStudent=service.update(studentName,age,id);
		request.setAttribute("user", listOfStudent);
		request.getRequestDispatcher("response.jsp").forward(request, response); 
		}
		else if(button.equals("Delete")) {
			String id1=	 request.getParameter("studentid1");
			int id=Integer.parseInt(id1);
			List<Student> listOfStudent=service.delete(id);
			request.setAttribute("user", listOfStudent);
			request.getRequestDispatcher("response.jsp").forward(request, response); 
		}
		
		
	
	

	}
}