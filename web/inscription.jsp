<%-- 
    Document   : _TEMPLATE
    Created on : 10-juil.-2018, 16:42:45
    Author     : quico
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Cache-Control" content="no-cache"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_STYLESHEET.jsp"/>
    </head>
    <body>
        <c:import url="_TITRE.jsp"/>
        <c:import url="_MENU.jsp"/>
        <div>
            <form method="post">
                <label>Pseudo</label>
                <input name="pseudo">
                <label>M-d-p</label>
                <input name="mdp">
                <input type="submit">
            </form>
        </div>
        <c:import url="_PIED.jsp"/>
        <c:import url="_JAVASCRIPTS.jsp"/>
    </body>
</html>
