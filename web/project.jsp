<%-- 
    Document   : project
    Created on : Feb 28, 2021, 8:56:36 AM
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
        </ul>

        <%
            String pid = request.getParameter("project");
            System.out.println(pid);

            String prg_compnay = "";
            String prg_name = "";
            String prg_website = "";
            String prg_video_link = "";
            String prg_build_link = "";
            String prg_describe_briefly = "";
            String prg_future_plans = "";
            String prg_exp_funding = "";
            String prg_material_need = "";
            String prg_date = "";
            String cou_id = "";

            try {
                ResultSet rs1 = Database.getData("SELECT `prg_compnay`, `prg_name`, `prg_website`, `prg_video_link`, `prg_build_link`, `prg_describe_briefly`, `prg_future_plans`, `prg_exp_funding`, `prg_material_need`, `prg_date`, `cou_id` FROM `startup_new_version`.`project` WHERE `project`.`prg_id` = '" + pid + "'");
                if (rs1.next()) {
                    prg_compnay = rs1.getString("prg_compnay");
                    prg_name = rs1.getString("prg_name");
                    prg_website = rs1.getString("prg_website");
                    prg_video_link = rs1.getString("prg_video_link");
                    prg_build_link = rs1.getString("prg_build_link");
                    prg_describe_briefly = rs1.getString("prg_describe_briefly");
                    prg_future_plans = rs1.getString("prg_future_plans");
                    prg_exp_funding = rs1.getString("prg_exp_funding");
                    prg_material_need = rs1.getString("prg_material_need");
                    prg_date = rs1.getString("prg_date");
                    cou_id = rs1.getString("cou_id");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        %>   

        <div class="project_view_section">
            <div class="card">
                <div class="card-content">
                    <div class="row">
                        <div class="col s10">
                            <h3><%=prg_name%></h3>
                            <div class="video-container">
                                <iframe width="853" height="480" src="//www.youtube.com/embed/Q8TXgCzxEnw?rel=0" frameborder="0" allowfullscreen></iframe>
                            </div>
                            <div class="card">
                                <div class="card-content">
                                    <h6>Details</h6>
                                    <div class="row">
                                        <div class="col s3">
                                            <h6>Amount of Project</h6>
                                            <h6>$<%=prg_exp_funding%></h6>
                                        </div>
                                        <div class="col s3">
                                            <h6>Listed Date</h6>
                                            <h6><%=prg_date%></h6>
                                        </div>
                                        <div class="col s3">
                                            <h6>Company</h6>
                                            <h6><%=prg_compnay%></h6>
                                        </div>
                                        <div class="col s3">
                                            <h6>Website</h6>
                                            <h6><%=prg_website%></h6>
                                        </div>
                                        <div class="col s3">
                                            <h6>Link for Project Prototype</h6>
                                            <h6><%=prg_build_link%></h6>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col s12">
                                    <h5>What it try to do</h5>
                                    <p><%=prg_describe_briefly%></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col s12">
                                    <h5>What it plan to do in future</h5>
                                    <p><%=prg_future_plans%></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col s12">
                                    <h5>What it required</h5>
                                    <p><%=prg_material_need%></p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col s12">
                                    <h5>Backers</h5>
                                    <table>
                                        <thead>
                                            <tr>
                                                <th>Backer</th>
                                                <th>Date</th>
                                                <th>Amount</th>
                                            </tr>
                                        </thead>

                                        <tbody>
                                            <tr>
                                                <td>Alvin</td>
                                                <td>Eclair</td>
                                                <td>$0.87</td>
                                            </tr>
                                            <tr>
                                                <td>Alan</td>
                                                <td>Jellybean</td>
                                                <td>$3.76</td>
                                            </tr>
                                            <tr>
                                                <td>Jonathan</td>
                                                <td>Lollipop</td>
                                                <td>$7.00</td>
                                            </tr>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col s12">
                                    <h4 class="center">Related Projects</h4>
                                    <div class="row">
                                        <div class="col s12 m3">
                                            <div class="card">
                                                <div class="card-image">
                                                    <img src="img/banner2.jpg">
                                                    <span class="card-title">Coffee Receipie</span>
                                                </div>
                                                <div class="card-content">
                                                    <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                                                    <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);">FUND</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col s12 m3">
                                            <div class="card">
                                                <div class="card-image">
                                                    <img src="img/banner2.jpg">
                                                    <span class="card-title">Coffee Receipie</span>
                                                </div>
                                                <div class="card-content">
                                                    <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                                                    <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);">FUND</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col s12 m3">
                                            <div class="card">
                                                <div class="card-image">
                                                    <img src="img/banner2.jpg">
                                                    <span class="card-title">Coffee Receipie</span>
                                                </div>
                                                <div class="card-content">
                                                    <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                                                    <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);">FUND</a>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col s12 m3">
                                            <div class="card">
                                                <div class="card-image">
                                                    <img src="img/banner2.jpg">
                                                    <span class="card-title">Coffee Receipie</span>
                                                </div>
                                                <div class="card-content">
                                                    <p>I am a very simple card. I am good at containing small bits of information. I am convenient because I require little markup to use effectively.</p>
                                                    <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);">FUND</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="col s2">
                            <h5>Funding options</h5>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">1$</p>
                                        <p style="font-size: 12px;">Thank you.</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=1%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">10$</p>
                                        <p style="font-size: 12px;">Free Mug with Thank you.</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=10%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">50$</p>
                                        <p style="font-size: 12px;">Free Mug, Sticker with Thank you.</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=50%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">100$</p>
                                        <p style="font-size: 12px;">Free Mug, Free Brand T'Shirt and Thank you.</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=100%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">500$</p>
                                        <p style="font-size: 12px;">Free Copy, Brand T'Shirt, Mug with Thank you.</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=500%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                            <div class="col  s12">
                                <div class="card">
                                    <div class="card-content center">
                                        <p style="font-size: 30px;">1000$</p>
                                        <p style="font-size: 12px;">Free Copy, Brand T'Shirt, Mug, Thank you gift!</p>
                                        <a class="waves-effect waves-light btn tiny" style="margin-top: 10px; background-color: var(--color-pumpkin);" href="payment.jsp?pid=<%=pid%>&pAM=<%=1000%>">FUND</a>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>

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