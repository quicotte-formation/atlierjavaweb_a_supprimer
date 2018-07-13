<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${ cookie.theme ne null }">
    <link href="css/${cookie.theme.value}.css" rel="stylesheet" type="text/css"/>
</c:if>
