package com.axelor.restdemo.resource;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.axelor.restdemo.service.StudentService;
import com.google.inject.Inject;

@Path("/StudentResource")
//@Path("/")
public class StudentResource {

	@Inject
	StudentService service;

//	@POST
//	// @Path("studentData/{name}/{age}")
//	@Path("/add")
//	public void getUserHistory(@PathParam("name") String studentName, @PathParam("age") int studentAge,
//			@Context HttpServletRequest request, @Context HttpServletResponse response)
//			throws IOException, ServletException {
//		{
//
//			/*
//			 * // String date = year + "/" + month + "/" + day;
//			 * System.out.println(studentName+studentAge); return Response.status(200)
//			 * .entity("studentName is : "+studentName+" studentAge is:"+studentAge )
//			 * .build();
//			 */
//
//			service.insertStudent(studentName, studentAge);
//			request.getRequestDispatcher("index.jsp").forward(request, response);
//
//		}
//	}
	
	@Path("/test")
	public void test() {
		System.out.println("test success!!");
	}
}