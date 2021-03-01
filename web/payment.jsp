<%-- 
    Document   : payment
    Created on : Feb 28, 2021, 12:05:54 PM
    Author     : CASSIE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

        <div class="payment_area">
            <h1>
                <%
                    String project = request.getParameter("pid");
                    String amount = request.getParameter("pAM");
                %>
            </h1>
            <div class="card">
                <div class="card-content">
                    <h1>Your Investment</h1>
                    <form action="Payment" method="POST">
                        <div class="form-field">
                            <label for="investment">Backer Investment</label>
                            <input id="investment" type="number" class="validate" valid="investment" name="investment" value=<%=amount%>>
                        </div>
                        <input type="hidden" name="proj" value=<%=project%>>
                        <div class="form-field">
                            <button class="btn-large waves-effect waves-dark" style="width:100%;">Invest</button>
                        </div>
                    </form>
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