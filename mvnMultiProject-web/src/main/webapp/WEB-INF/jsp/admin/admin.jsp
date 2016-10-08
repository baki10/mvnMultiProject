<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>Admin</title>
</head>
<body>
    Account
    <c:if test="${pageContext.request.userPrincipal.name != null}">
    		<h2>
    		Welcome : ${pageContext.request.userPrincipal.name} | <a href="<c:url value="/logout" />" > Logout</a>
            </h2>
    </c:if>
</body>
</html>