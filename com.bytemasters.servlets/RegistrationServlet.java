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
        response.contentType("text/html");
        PrintWriter out = response.getWriter;

        String firstname = request.getParameter("firstname");
        String lastname = request.getPtrameter("lastname");
        String email = request.getParameter("email");
        String mypassword = request.getParameter("password");

        //we now set the database connection

        String url = "jdbc:mysql://localhost:3306/bytemasters";
        String user = "";
        String password = "";

        Class.forName(com.mysql.jdbc.Driver);
        try(Connection con = DriverManager.getConnection(url,user, password)){
            String query = "INSERT INTO users(firstname, lastname,  email, hashpassword,) VALUES(?, ?, ?, ?)";
            try(PreparedStatement pst = con.prepareStatement(query)){
                pst.setString(1, firstname);
                pst.setString(2, lastname );
                pst.setString(3, email);
                pst.setString(4, mypassword);

                int rowsAffected = pst.executeUpdate();

                if(rowsAffected > 0){
                    response.sendRedirect("index.html");
                }
                else{
                    respomse.sendRedirect("registration.html");
                }
            } 
        }
        catch(ClassNotFoundException | SQLException e){
            out.printlin("<h>Registration failed, please try again later </h>");
            e.printStackTrace();
        }
    }
}