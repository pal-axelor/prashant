import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Inject;
import com.google.inject.Singleton;
@Singleton
@WebListener
public class MyServlet extends HttpServlet{


	private static final long serialVersionUID = 1L;

	@Inject
	Service service;
	



protected void service(HttpServletRequest  request,HttpServletResponse  response) throws IOException, ServletException {
 
	
//	 response.setContentType("text/html");
//
//     PrintWriter out = response.getWriter();
//     String title = "Using GET Method to Read Form Data";
//     String docType =
//        "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
//        
//     out.println(docType +
//        "<html>\n" +
//           "<head><title>" + title + "</title></head>\n" +
//           "<body bgcolor = \"#f0f0f0\">\n" +
//              "<h1 align = \"center\">" + title + "</h1>\n" +
//              "<ul>\n" +
//                 "  <li><b>name</b>: "
//                 + request.getParameter("name") + "\n" +
//                 "  <li><b>age</b>: "
//                 + request.getParameter("age") + "\n" +
//              "</ul>\n" +
//           "</body>" +
//        "</html>"
//     );
	
	
	
//	//response.getWriter().println("HELLO i m prashant");
//	
String myname=request.getParameter("name");
           String  age=request.getParameter("age");
           int myage1=Integer.parseInt(age);
//           
          PrintWriter out = response.getWriter();
//           
         // out.write(service.myString(myname, myage1));
           

//      	 response.setContentType("text/html");

//           PrintWriter out = response.getWriter();
//           String title = "Using GET Method to Read Form Data";
//           String docType =
//              "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
//              
//           out.println(docType +
//              "<html>\n" +
//                 "<head><title>" + title + "</title></head>\n" +
//                 "<body bgcolor = \"#f0f0f0\">\n" +
//                    "<h1 align = \"center\">" + title + "</h1>\n" +
//                    "<ul>\n" +
//                       "  <li><b>name</b>: "
//                       + request.getParameter("name") + "\n" +
//                       "  <li><b>age</b>: "
//                       + myage1 + "\n" +
//                    "</ul>\n" +
//                 "</body>" +
//              "</html>"
//           );
      	
      	
           
           
           
           
          request.setAttribute("user", myname);
          request.setAttribute("age", myage1);
          request.getRequestDispatcher("response.jsp").forward(request, response); 
           
           
           
           
           
           
           
           
           
           
           
//          //PrintWriter out=response.getWriter();
//	//out.print(service.myString(myname,myage1));
}

}