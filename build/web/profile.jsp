<%-- 
    Document   : profile
    Created on : Feb 26, 2021, 11:37:00 AM
    Author     : CASSIE
--%>

<%@page import="Startup.Database"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<!doctype html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Shippori+Mincho&display=swap" rel="stylesheet">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="css/materialize.js">
        <link rel="stylesheet" href="css/materialize.min.css">
        <link href="css/Style.css" rel="stylesheet">
        <title>Startup</title>
    </head>

    <body>
        <div class="msg_area">
            <p>This site is under development!</p>
        </div>
        <nav>
            <div class="nav-wrapper">
                <a href="${pageContext.request.contextPath}/index.jsp" class="brand-logo center">Startup.</a>
                <ul id="nav-mobile" class="left hide-on-med-and-down">
                    <li>
                        <a href="${pageContext.request.contextPath}/NewProject">Start a Campaing</a>
                    </li>
                </ul>
                <ul class="right">
                    <li class="hide-on-med-and-down"><a href="${pageContext.request.contextPath}/Explore">Explore</a></li>
                    <a href="#" data-target="slide-out" class="sidenav-trigger"><i class="material-icons">menu</i></a>
                </ul>
            </div>
        </nav>

        <ul id="slide-out" class="sidenav amber">
            <li><a class="subheader" style="font-size: 20px; margin-top: 20px; color: var(--color-errie-black);">Lets Explore</a></li>
            <li><a class="waves-effect waves-green active" style="font-size: 16px; margin-top: 16px; color: var(--color-errie-black);" href="${pageContext.request.contextPath}/NewProject">Start a Campaing</a></li>
            <li><a class="waves-effect waves-green" style="font-size: 16px; margin-top: 16px; color: var(--color-errie-black);" href="${pageContext.request.contextPath}/Explore">Explore</a></li>
            <li><a class="waves-effect waves-green" style="font-size: 16px; margin-top: 16px; color: var(--color-errie-black);" href="${pageContext.request.contextPath}/profile">Profile</a></li>
            <li><a class="waves-effect waves-green" style="font-size: 16px; margin-top: 16px; color: var(--color-errie-black);" href="${pageContext.request.contextPath}/About">About</a></li>
            <li><a class="waves-effect waves-green" style="font-size: 16px; margin-top: 16px; color: var(--color-errie-black);" href="#">Search</a></li>
        </ul

        <%
            HttpSession ses = request.getSession();
            String user = ses.getAttribute("user").toString();

            String name = "";
            String email = "";
            String country = "";
            String password = "";
            String description = "";
            String bnkNumber = "";
            String bank = "";

            ResultSet rs = Database.getData("SELECT `use_name`, `use_description`, `use_email`, `use_password`, `use_bank_account_no`, `use_country`, `use_bank` FROM `startup_new_version`.`user` WHERE user.use_id = '" + user + "'");
            if (rs.next()) {
                name = rs.getString("use_name");
                email = rs.getString("use_email");
                country = rs.getString("use_country");
                password = rs.getString("use_password");
                description = rs.getString("use_description");
                bnkNumber = rs.getString("use_bank_account_no");
                bank = rs.getString("use_bank");
            }

        %>

        <div class="account_section">
            <div class="basic_account_section">
                <div class="card">
                    <div class="card-content">
                        <div class="row">
                            <div class="col s6">
                                <h5>Account Details</h5>
                                <div class="row">
                                    <form class="col s12">
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input placeholder="" id="name" type="text" class="validate" id="state" value="<%=name%>" disabled="true">
                                                <label for="name">Name</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input placeholder="" id="country" type="text" class="validate" id="state" value="<%=country%>" disabled="true">
                                                <label for="country">Country</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <textarea id="textarea2" class="materialize-textarea" data-length="120" placeholder="" disabled="true"><%=description%></textarea>
                                                <label for="textarea2">About Me</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input placeholder="" id="email" type="email" class="validate" id="state" value="<%=email%>" disabled="true">
                                                <label for="email">Email</label>
                                            </div>
                                        </div>
                                        <div class="row">
                                            <div class="input-field col s12">
                                                <input placeholder="" id="password" type="password" class="validate" id="state" value="<%=password%>" disabled="true">
                                                <label for="password">Password</label>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="row">
                                    <div class="col">
                                        <a class="waves-effect waves-light btn">Edit</a>
                                    </div>
                                    <div class="col">
                                        <a class="waves-effect waves-light btn">Submit</a>
                                    </div>
                                </div>
                            </div>
                            <div class="col s6">
                                <h5>Bank details</h5>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <select>
                                            <option value=""  selected disabled="true">Choose your country</option>
                                            <%
                                                ResultSet rs1 = Database.getData("SELECT cou_name, cou_id FROM Country");
                                                while (rs1.next()) {
                                                    out.print("<option value=" + rs1.getString("cou_id") + ">" + rs1.getString("cou_name") + "</option>");
                                                }
                                            %>
                                        </select>
                                        <label>Materialize Select</label>
                                    </div>
                                    <div class="input-field col s12">
                                        <select>
                                            <option value="<%=bank%>"  selected>Choose your Bank</option>
                                            <%
                                                ResultSet rs2 = Database.getData("SELECT bnk_name, bnk_id FROM Bank");
                                                while (rs2.next()) {
                                                    out.print("<option value=" + rs2.getString("bnk_id") + ">" + rs2.getString("bnk_name") + "</option>");
                                                }
                                            %>
                                        </select>
                                        <label>Materialize Select</label>
                                    </div>
                                    <div class="input-field col s12">
                                        <input placeholder="" id="bankANumber" type="text" class="validate" value="<%=bnkNumber%>"  disabled="true">
                                        <label for="bankANumber">Bank Account Number</label>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col s6">
                                <h6>Your Interest</h6>
                                <table class="responsive-table highlight">
                                    <thead>
                                        <tr>
                                            <th>Categories</th>
                                            <th>Interest score</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <%
                                            ResultSet rs3 = Database.getData("SELECT `intrest`.`int_name`, `intrest`.`int_presentatge` FROM `startup_new_version`.`user_interest` INNER JOIN `startup_new_version`.`user` ON (`user_interest`.`use_id` = `user`.`use_id`) INNER JOIN `startup_new_version`.`intrest` ON (`user_interest`.`int_id` = `intrest`.`int_id`) WHERE user.use_id='" + user + "'");
                                            while (rs3.next()) {
                                                out.print("<tr><td>" + rs3.getString("int_name") + "</td><td>" + rs3.getString("int_presentatge") + "</td></tr>");
                                            }
                                        %>
                                    </tbody>
                                </table>
                                <a class="waves-effect waves-light btn" style="margin-top: 10px;">Add more</a>
                            </div>
                            <div class="col s6">
                                <h6>Delete Account</h6>
                                <div class="row">
                                    <div class="input-field col s12">
                                        <input placeholder="" id="Please enter \'Delete Account\' to confirm deletion" type="text" class="validate">
                                        <label for="confim_del">Confirm Delete Account (to confirm type 'confirm') </label>
                                    </div>
                                </div>
                                <a class="waves-effect waves-light btn">Delete</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-content">
                    <h5>Project Details</h5>
                    <div class="row">
                        <div class="col s6">
                            <h6>Funded Project</h6>
                            <table class="responsive-table highlight">
                                <thead>
                                    <tr>
                                        <th>Name</th>
                                        <th>Date</th>
                                        <th>Time</th>
                                        <th>Amount</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        ResultSet rs5 = Database.getData("SELECT `project`.`prg_name`, `bakedproject`.`bap_amount`, `bakedproject`.`bap_date`, `bakedproject`.`bap_time` FROM `startup_new_version`.`bakedproject` INNER JOIN `startup_new_version`.`project` ON (`bakedproject`.`prg_id` = `project`.`prg_id`) INNER JOIN `startup_new_version`.`user` ON (`project`.`use_id` = `user`.`use_id`) AND (`bakedproject`.`use_id` = `user`.`use_id`) WHERE user.`use_id` = '" + user + "'");
                                        if (rs5.next()) {
                                            out.print("<tr><td>" + rs5.getString("prg_name") + "</td><td>" + rs5.getString("bap_date") + "</td><td>" + rs5.getString("bap_time") + "</td><td>" + rs5.getString("bap_amount") + "</td></td>");
                                        }
                                    %>
                                </tbody>
                            </table>
                        </div>
                        <div class="col s6">
                            <h6>Your Projects</h6>
                            <table class="responsive-table highlight">
                                <thead>
                                    <tr>
                                        <th>Name</th>
                                        <th>List</th>
                                        <th>Funding</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <%
                                        ResultSet rs4 = Database.getData("SELECT `prg_name`, `prg_date`, `prg_exp_funding` FROM `startup_new_version`.`project` WHERE `project`.`use_id` = '" + user + "'");
                                        while (rs4.next()) {
                                            out.print("<tr><td>" + rs4.getString("prg_name") + "</td><td>" + rs4.getString("prg_date") + "</td><td>" + rs4.getString("prg_exp_funding") + "</td></tr>");
                                        }
                                    %>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <div class="card">
                <div class="card-content">
                    <h5>Your Activities</h5>
                </div>
            </div>

        </div>

        <form action="Logout" method="POST">
            <div class="form-field">
                <button class="btn-large waves-effect waves-dark" style="width:100%;">Log Out</button>
            </div><br>
        </form>

        <footer class="page-footer">
            <div class="container">
                <div class="row">
                    <div class="col l6 s12">
                        <h5 class="white-text">Startup</h5>
                        <p class="grey-text text-lighten-4">Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>
                    <div class="col l4 offset-l2 s12">
                        <h5 class="white-text">Links</h5>
                        <ul>
                            <li><a class="grey-text text-lighten-3" href="#!">Forum</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Blog</a></li>
                            <li><a class="grey-text text-lighten-3" href="legal.html">Legal</a></li>
                            <li><a class="grey-text text-lighten-3" href="#!">Report</a></li>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    © 2021 Startup.inc
                    <a class="grey-text text-lighten-3 right" href="#!"><i class="material-icons">facebook</i></a>
                </div>
            </div>
        </footer>

        <script src="js/materialize.js "></script>
        <script src="js/materialize.min.js "></script>
        <script src="js/main.js "></script>

        <script>
        </script>
    </body>

</html>
