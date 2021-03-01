/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CASSIE
 */
public class Signup extends HttpServlet {

    private String username;
    private String password;
    private String cpassword;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        username = req.getParameter("username");
        password = req.getParameter("password");
        cpassword = req.getParameter("cpassword");

        if (password.equals(cpassword)) {
            try {
                Database.sendData("INSERT INTO User (use_email, use_password) VALUES('" + username + "', '" + password + "')");
                ResultSet rs1 = Database.getData("SELECT use_id FROM User WHERE use_email = '" + username + "' AND use_password = '" + password + "'");
                if (rs1.next()) {
                    int uid = rs1.getInt("use_id");
                    HttpSession ses = req.getSession();
                    ses.setAttribute("user", uid);
                    req.getRequestDispatcher("/profile.jsp").include(req, resp);
                }
            } catch (Exception ex) {
                System.out.println(ex);
            }
        } else {
            PrintWriter out = resp.getWriter();
            out.println("<script type=\"text/javascript\">");
            out.println("alert('Password Are Not Matched!');");
            out.println("location='signup.jsp';");
            out.println("</script>");
        }
    }

}
