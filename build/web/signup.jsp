<%-- 
    Document   : signup
    Created on : Feb 26, 2021, 2:51:08 PM
    Author     : CASSIE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Shippori+Mincho&display=swap" rel="stylesheet">
        <link href='https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css' rel='stylesheet'>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link rel="stylesheet" href="css/materialize.js">
        <link rel="stylesheet" href="css/materialize.min.css">
        <link href="css/Style.css" rel="stylesheet">
        <title>JSP Page</title>
    </head>
    <body class="auth_body">

        <div class="row">
            <div class="col s12 m l4 offset-m2 offset-l4">
                <div class="card">

                    <div class="card-action lighten-1 white-text center" style="background-color: var(--color-pumpkin)">
                        <h3>Be a Member</h3>
                    </div>

                    <div class="card-content">
                        <form action="Signup" method="POST">
                            <div class="form-field">
                                <label for="username">Username</label>
                                <input id="email" type="email" class="validate" valid="username" name="username">
                            </div><br>

                            <div class="form-field">
                                <label for="password">Password</label>
                                <input type="password" id="password" name="password">
                            </div><br>

                            <div class="form-field">
                                <label for="confirmp">Confirm Password</label>
                                <input type="password" id="confirmp" name="cpassword">
                            </div><br>

                            <div class="form-field">
                                <br>
                                <div class="form-field">
                                    <button class="btn-large waves-effect waves-dark" style="width:100%;">Sign up</button>
                                </div><br>
                            </div>
                            <label> <a href="signin.jsp">Sign in</a></label>
                        </form>
                    </div>
                </div>
            </div>

            <script src="js/materialize.js "></script>
            <script src="js/materialize.min.js "></script>
            <script src="js/main.js "></script>

            <script>
            </script>
    </body>
</html>

