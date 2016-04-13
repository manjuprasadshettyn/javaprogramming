// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;

public class ServeClient extends HttpServlet {

  // Method to handle GET method request.
  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      // Set response content type
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      // Receive Paramenters with their name
      String fname=request.getParameter("fname");
      String lname=request.getParameter("lname");
      if(fname.length()==0 && fname.length()==0)
        out.println("No Data receieved from client<br/>");
      else {
      out.println("Details Received from the Client: <br/>");
      out.println("First Name: "+fname+"<br/>");
      out.println("Last Name: "+lname+"<br/>");
  }
      out.close();

  }

}
