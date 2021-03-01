<%@page import="java.sql.ResultSet"%>
<%@page import="Startup.Database"%>
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

        <div class="slider">
            <ul class="slides">
                <li>
                    <img src="img/banner2.jpg" style="opacity: 0.6">
                    <div class="caption center-align" style="color: var(--color-errie-black)">
                        <h3>Make your dream true!</h3>
                        <h5 class="light text-lighten-3" style="color: var(--color-errie-black)">Start Campaing today...</h5>
                    </div>
                </li>
            </ul>
        </div>

        <div class="section_one">
            <h4 class="center">Featured Projects.</h4>
            <div class="row">
                <%
                    ResultSet rs1 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project");
                    while (rs1.next()) {
                        out.print("<div class='col s12 m3'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs1.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs1.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs1.getString("prg_id") + ">FUND</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                %>
            </div>
        </div>

        <div class="section_one">
            <h4 class="center">Most popular Projects.</h4>
            <div class="row">
                <%
                    ResultSet rs2 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project");
                    while (rs2.next()) {
                        out.print("<div class='col s12 m3'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs2.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs2.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs2.getString("prg_id") + ">FUND</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                %>
            </div>
        </div>

        <div class="section_about">
            <div class="row">
                <div class="col s12 center ">
                    <h5 class="caption center">Who We are.</h5>
                    <p class="center">Lorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum
                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquidLorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum
                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquidLorem ipsum dolor sit amet consectetur, adipisicing elit. Ut dolores reprehenderit iusto assumenda saepe sed numquam non incidunt fugit doloribus! Reiciendis itaque doloribus excepturi eos iusto eius, odio quisquam ratione. Lorem ipsum
                        dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquid.</p>
                </div>
            </div>
        </div>

        <div class="section_creative_team">
            <h4 class="center">Creative team...</h4>
            <p class="center para">Lorem ipsum dolor sit amet consectetur adipisicing elit. Est modi ad pariatur ipsa incidunt temporibus molestiae atque tempora alias, ab consequatur eius, nostrum vero optio expedita? Corrupti quibusdam reprehenderit aliquid?</p>
            <div class="row">
                <div class="col sm12 m3">
                    <div class="card small">
                        <div class="card-image waves-effect waves-block waves-light">
                            <img class="activator" src="img/banner2.jpg">
                        </div>
                        <div class="card-content">
                            <span class="card-title activator grey-text text-darken-4 center" >Chamod Diyamantha</span>
                            <p class="center"><a href="#">CEO / CTO</a></p>
                        </div>
                        <div class="card-reveal">
                            <span class="card-title grey-text text-darken-4" style="font-size: 20px;">Chamod Diyamantha<i class="material-icons right">close</i></span>
                            <p style="font-size: 16px;">Here is some more information about this product that is only revealed once clicked on.</p>
                        </div>
                    </div>
                </div>
                <div class="col sm12 m3">
                    <div class="card small">
                        <div class="card-image waves-effect waves-block waves-light">
                            <img class="activator" src="img/banner2.jpg">
                        </div>
                        <div class="card-content">
                            <span class="card-title activator grey-text text-darken-4 center">Chamod Diyamantha</span>
                            <p class="center"><a href="#">Designer</a></p>
                        </div>
                        <div class="card-reveal">
                            <span class="card-title grey-text text-darken-4" style="font-size: 20px;">Chamod Diyamantha<i class="material-icons right">close</i></span>
                            <p style="font-size: 16px;">Here is some more information about this product that is only revealed once clicked on.</p>
                        </div>
                    </div>
                </div>
                <div class="col sm12 m3">
                    <div class="card small">
                        <div class="card-image waves-effect waves-block waves-light">
                            <img class="activator" src="img/banner2.jpg">
                        </div>
                        <div class="card-content">
                            <span class="card-title activator grey-text text-darken-4 center">Chamod Diyamantha</span>
                            <p class="center"><a href="#">Director</a></p>
                        </div>
                        <div class="card-reveal">
                            <span class="card-title grey-text text-darken-4" style="font-size: 20px;">Chamod Diyamantha<i class="material-icons right">close</i></span>
                            <p style="font-size: 16px;">Here is some more information about this product that is only revealed once clicked on.</p>
                        </div>
                    </div>
                </div>
                <div class="col sm12 m3">
                    <div class="card small">
                        <div class="card-image waves-effect waves-block waves-light">
                            <img class="activator" src="img/banner2.jpg">
                        </div>
                        <div class="card-content">
                            <span class="card-title activator grey-text text-darken-4 center">Chamod Diyamantha</span>
                            <p class="center"><a href="#">PM</a></p>
                        </div>
                        <div class="card-reveal">
                            <span class="card-title grey-text text-darken-4" style="font-size: 20px;">Chamod Diyamantha<i class="material-icons right">close</i></span>
                            <p style="font-size: 16px;">Here is some more information about this product that is only revealed once clicked on.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="section_one ">
            <h4 class="center">Successfull Projects.</h4>
            <div class="row ">                
                <%
                    ResultSet rs3 = Database.getData("SELECT prg_id, prg_name, prg_describe_briefly, prg_video_link FROM Project WHERE prg_exp_funding <= prg_raised_amount");
                    while (rs3.next()) {
                        out.print("<div class='col s12 m4'>");
                        out.print("<div class='card'>");
                        out.print("<div class='card-image'>");
                        out.print("<img src='img/banner2.jpg'>");
                        out.print("<span class='card-title'>" + rs3.getString("prg_name") + "</span>");
                        out.print("</div>");
                        out.print("<div class='card-content'>");
                        out.print("<p>" + rs3.getString("prg_describe_briefly") + "</p>");
                        out.print("<a class='waves-effect waves-light btn' style='margin-top: 10px; background-color: var(--color-pumpkin);' href=project.jsp?project=" + rs3.getString("prg_id") + ">OPEN</a>");
                        out.print("</div>");
                        out.print("</div>");
                        out.print("</div>");
                    }
                %>
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