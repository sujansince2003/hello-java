import java.io.*;
import java.net.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.http.*;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpRequest request, HttpResponse response) throws ServletException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1?>hello </h1?");
    }
}