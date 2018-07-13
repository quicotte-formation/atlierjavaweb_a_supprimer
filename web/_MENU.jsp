<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${clientConnecte ne null}">
    Yo ${clientConnecte.login}
</c:if>
<br>
Menu:
<c:choose>
    <c:when test="${clientConnecte eq null}">
        <a href="<c:url value="/connexion" />">Login</a>
        <a href="<c:url value="/inscription"/>">Inscription</a>
    </c:when>
    <c:otherwise>
        <a href="<c:url value="/logout"/>">Logout</a>
        <a href="#">Mon compte</a>
    </c:otherwise>
</c:choose>
<br>
Change de style:
<a href="<c:url value="/changeStyle" />?style=jamaique">Jamaique</a>
<a href="<c:url value="/changeStyle" />?style=cuba">Cuba</a>