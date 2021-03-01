/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CASSIE
 */
public class Signin extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/signin.jsp").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        try {
            ResultSet rs1 = Database.getData("SELECT use_id FROM User WHERE use_email='" + username + "' AND use_password = '" + password + "'");
            if (rs1.next()) {
                int uid = rs1.getInt("use_id");
                HttpSession ses = req.getSession();
                ses.setAttribute("user", uid);
                req.getRequestDispatcher("/profile.jsp").include(req, resp);
            } else {
                PrintWriter out = resp.getWriter();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('Credentials are not matched!');");
                out.println("location='signup.jsp';");
                out.println("</script>");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
