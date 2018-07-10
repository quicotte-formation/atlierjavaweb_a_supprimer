<%-- 
    Document   : lister-cat
    Created on : 09-juil.-2018, 16:28:44
    Author     : quico
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Bonjour ${cookie.pseudo.value}
        <h1>Liste des catégories</h1>
        <c:forEach items="${listeCat}" var="catAct">
            ${catAct.nom}
            <a href="<c:url value="/supprimer-cat"/>?idCat=${catAct.id}">Supprimer</a>
            <br>
        </c:forEach>
    </body>
</html>
