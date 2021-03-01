/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startup;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author CASSIE
 */
public class Payment extends HttpServlet {

    SimpleDateFormat sdfD;
    SimpleDateFormat sdfT;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession ses = req.getSession();
        if (ses.getAttribute("user") == null) {
            req.getRequestDispatcher("/signin.jsp").include(req, resp);
        } else {
            String user = ses.getAttribute("user").toString();
            double invest = Double.parseDouble(req.getParameter("investment").toString());
            String project = req.getParameter("proj");
            sdfD = new SimpleDateFormat("yyyy-MM-dd");
            sdfT = new SimpleDateFormat("hh:mm:ss");
            try {
                Database.sendData("INSERT INTO BakedProject (use_id, prg_id, bap_amount, bap_date, bap_time) "
                        + "VALUES('" + user + "', '" + project + "', '" + invest + "', '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "')");
                ResultSet rs1 = Database.getData("SELECT prg_raised_amount FROM Project WHERE prg_id  = '" + project + "'");
                if (rs1.next()) {
                    double newRaise = invest + rs1.getDouble("prg_raised_amount");
                    Database.sendData("UPDATE Project SET prg_raised_amount = '" + newRaise + "' WHERE prg_id = '" + project + "'");
                }
                req.getRequestDispatcher("/profile.jsp").include(req, resp);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
