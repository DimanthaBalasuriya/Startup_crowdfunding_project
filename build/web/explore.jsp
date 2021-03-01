<%-- 
    Document   : explore
    Created on : Feb 25, 2021, 9:18:44 AM
    Author     : CASSIE
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="data" %>
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

        <div class="collapsible_section">
            <h5>Explore  by your intrest</h5>
            <ul class="collapsible">
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">PC Games</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'PC Games'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Mobile Games</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Mobile Games'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Short Films</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Short Films'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Music Video</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Music Video'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Songs</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Songs'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Entrepreneur</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Entrepreneur'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Innovation</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Innovation'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Food Product</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Food Product'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Accessibility Products</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Accessibility Products'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Charity</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Charity'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Other</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Other'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
                <li>
                    <div class="collapsible-header" style="font-size: 20px;">Other</div>
                    <div class="collapsible-body">
                        <div class="row ">
                            <data:forEach items="${projects}" var="project">
                                <data:if test="${project.pIntrest == 'Arts'}">
                                    <div class="col s12 m3 ">
                                        <div class="card ">
                                            <div class="card-image ">
                                                <img src="img/banner2.jpg ">
                                                <span class="card-title ">${project.pTitle}</span>
                                            </div>
                                            <div class="card-content ">
                                                <p>${project.pDescription}</p>
                                                <a class="waves-effect waves-light btn" style="margin-top: 10px; background-color: var(--color-pumpkin);" href=project.jsp?project=${project.pID}>OPEN</a>
                                            </div>
                                        </div>
                                    </div>
                                </data:if>
                            </data:forEach>
                        </div>
                    </div>
                </li>
            </ul>
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
