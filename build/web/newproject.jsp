<%-- 
    Document   : newproject
    Created on : Feb 25, 2021, 9:27:22 AM
    Author     : CASSIE
--%>

<%@page import="Startup.Database"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
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
                        <h3>Start your project here!</h3>
                        <h5 class="light text-lighten-3" style="color: var(--color-errie-black)">Explain your project to community...</h5>
                    </div>
                </li>
            </ul>
        </div>

        <div class="section_one center-align">
            <h2>What is Startup</h2>
            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
        </div>

        <div class="section_one center-align">
            <h3>What projects you can get funds</h3>
            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>  
                    <div class="col s6">
                        <h5>Arts</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>
                </div>
            </div>

            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <h5>Games</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>  
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>
                </div>
            </div>

            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>  
                    <div class="col s6">
                        <h5>Films</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>
                </div>
            </div>

            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <h5>Craft</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>  
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>
                </div>
            </div>

            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>  
                    <div class="col s6">
                        <h5>Charity</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>
                </div>
            </div>

            <div class="row content_margin">
                <div class="container">
                    <div class="col s6">
                        <h5>Other</h5>
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.Lorem ipsum dolor sit amet consectetur adipisicing elit. Magni tempore velit et distinctio, quis aut suscipit ratione optio magnam aliquid.</p>
                    </div>  
                    <div class="col s6">
                        <img class="responsive-img" src="img/img1.jpg" style="opacity: 0.8">
                    </div>
                </div>
            </div>

        </div>

        <div class="start_project_section">
            <h3 class="center-align">Start Now, your project</h3>
            <div class="container">
                <form action="NewProject" method="POST">
                    <h6>Personal</h6>
                    <div class="row">
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="first_name" type="text" class="validate" name="first_name" disabled="true">
                                <label for="first_name">First Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="last_name" type="text" class="validate" name="last_name" disabled="true">
                                <label for="last_name">Last Name</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="email" type="email" class="validate" name="email" disabled="true">
                                <label for="email">Email</label>
                            </div>
                        </div>
                        <div class="row">
                            <div class="input-field col s12">
                                <input id="country" type="text" class="validate" name="country" disabled="true">
                                <label for="country">Country</label>
                            </div>
                        </div>
                    </div>
                    <h6>Company or Institution</h6>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="companyName" type="text" class="validate" name="companyname">
                            <label for="company_name">Company Name</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="position" type="text" class="validate" name="position">
                            <label for="position">Position</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select name="cSize">
                                <option value="" disabled selected>Company/ Team Size</option>
                                <option value="1"><5</option>
                                <option value="2">5 - 20</option>
                                <option value="3">20+</option>
                            </select>
                            <label>Company/ Team Size</label>
                        </div>
                    </div>
                    <h6>Project</h6>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="projectname" type="text" class="validate" name="projectname">
                            <label for="projectname">Project Name</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="website" type="text" class="validate" name="website">
                            <label for="website">Project Website</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="video" type="text" class="validate" name="video">
                            <label for="video">Project Video</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="buildlink" type="text" class="validate" name="buildlink">
                            <label for="buildlink">Link to project build</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <select name="pType">
                                <option value="" disabled selected>Project Type</option>
                                <%
                                    ResultSet rs2 = Database.getData("SELECT int_id, int_name FROM Intrest");
                                    while (rs2.next()) {
                                        out.print("<option value=" + rs2.getString("int_id") + ">" + rs2.getString("int_name") + "</option>");
                                    }
                                %>
                            </select>
                            <label>Project Type</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="projectdescription" class="materialize-textarea" name="projectdescription"></textarea>
                            <label for="projectdescription">Describe your project briefly</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="plan" class="materialize-textarea" name="plan"></textarea>
                            <label for="plan">Describe your next plan</label>
                        </div>
                    </div>
                    <h6>Funding</h6>
                    <div class="row">
                        <div class="input-field col s12">
                            <input id="fundAmount" type="number" class="validate" name="fundAmount">
                            <label for="fundAmount">How much funding are you requesting?</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="whatyouplantodo" class="materialize-textarea" name="whatyouplantodo"></textarea>
                            <label for="whatyouplantodo">What you plan to do</label>
                        </div>
                    </div>
                    <h6>Material Request</h6>
                    <div class="row">
                        <div class="input-field col s12">
                            <textarea id="whatyourequest" class="materialize-textarea" name="whatyourequest"></textarea>
                            <label for="whatyourequest">What you request</label>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <p>
                                <label>
                                    <input type="checkbox" class="filled-in" id="company" onclick="chekIsChecked()"/>
                                    <span>My project is at or beyond the prototype phase</span>
                                </label>
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="input-field col s12">
                            <p>
                                <label>
                                    <input type="checkbox" class="filled-in" id="company" onclick="chekIsChecked()"/>
                                    <span>I like to share my milestones with a community</span>
                                </label>
                            </p>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col s3">
                            <div class="form-field">
                                <button class="waves-effect waves-light btn btn-large">SUBMIT</button>
                            </div>
                        </div>
                        <div class="col s2">
                            <a class="waves-effect waves-light btn btn-large" href="${pageContext.request.contextPath}/index.jsp">RESET</a>
                        </div>
                    </div>
                </form> 
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
                                        function chekIsChecked() {
                                            if (document.getElementById('company').checked) {
                                                alert("checked");
                                            } else {
                                                alert("You didn't check it! Let me check it for you.");
                                            }
                                        }
        </script>
    </body>

</html>
