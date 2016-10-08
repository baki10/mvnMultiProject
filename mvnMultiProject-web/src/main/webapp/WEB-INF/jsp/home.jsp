<%@ page contentType="text/html; charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
  <title>Hello world</title>
</head>
<body>
    ${logout}
    ${message}
    <hr/>
    From property file: <h3><spring:message code="test.message.greeting"/></h3>
    <hr/>
    <a href="<c:url value="/admin" />" >Admin</a>
</body>
</html>