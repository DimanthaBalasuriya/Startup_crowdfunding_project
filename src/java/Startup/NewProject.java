/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Startup;

import java.io.IOException;
import java.io.PrintWriter;
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
public class NewProject extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession ses = req.getSession();
        if (ses.getAttribute("user") == null) {
            req.getRequestDispatcher("/signin.jsp").include(req, resp);
        } else {
            req.getRequestDispatcher("/newproject.jsp").include(req, resp);
        }
    }

    SimpleDateFormat sdfD;
    SimpleDateFormat sdfT;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String companyname = req.getParameter("companyname");
        String position = req.getParameter("position");
        String cSize = req.getParameter("cSize");
        String projectname = req.getParameter("projectname");
        String website = req.getParameter("website");
        String video = req.getParameter("video");
        String buildlink = req.getParameter("buildlink");
        String pType = req.getParameter("pType");
        String projectdescription = req.getParameter("projectdescription");
        String plan = req.getParameter("plan");
        String fundAmount = req.getParameter("fundAmount");
        String whatyouplantodo = req.getParameter("whatyouplantodo");
        String whatyourequest = req.getParameter("whatyourequest");
        
        try {
            sdfD = new SimpleDateFormat("yyyy-MM-dd");
            sdfT = new SimpleDateFormat("hh:mm:ss");
            Database.sendData("INSERT INTO Project (prg_compnay, prg_position, prg_ct_size, prg_name, prg_website, prg_video_link, prg_build_link, prg_describe_briefly, prg_future_plans, prg_exp_funding, prg_plan_from_funding, prg_material_need, prg_d_state, prg_s_state, prg_date, prg_time, use_id, cou_id)"
                    + "VALUES('" + companyname + "', '" + position + "', '" + cSize + "', '" + projectname + "', '" + website + "', '" + video + "', '" + buildlink + "', '" + projectdescription + "', '" + plan + "', '" + fundAmount + "',  '" + whatyouplantodo + "', '" + whatyourequest + "', '1', '1', '" + sdfD.format(new Date()) + "', '" + sdfT.format(new Date()) + "', '12', '1')");

            req.getRequestDispatcher("/project.jsp").include(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
