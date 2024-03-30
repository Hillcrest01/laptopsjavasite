import java.io.IOException;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegistrationServlet extends HttpServlet{
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.contentType("text.html");
        PrintWriter out = response.getWriter;

        String firstname = request.getParameter("firstname");
        String lastname = request.getPtrameter("lastname");
        String email = request.getParameter("email");
        String mypassword = request.getParameter("password");
    }
}