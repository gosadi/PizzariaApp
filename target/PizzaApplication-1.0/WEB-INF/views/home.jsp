<%-- 
    Document   : home
    Created on : Feb 10, 2021, 8:23:42 PM
    Author     : alkinoos
--%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza Application</title>
        <c:url value="/static/css/style.css" var="cssLink"></c:url>
        <link  rel="stylesheet" href="${cssLink}">
        
    </head>
    <body>
        <h1>Welcome to our Pizza Application</h1>
        <a href="${pageContext.request.contextPath}/orders/pizza">Order Pizza</a>
    </body>
</html>
