<%-- 
    Document   : order
    Created on : Feb 10, 2021, 8:25:01 PM
    Author     : alkinoos
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri ="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Pizza order</title>
    </head>
    <body>
        <h1><b>Choose your Pizza</b></h1>
        <form:form action="${pageContext.request.contextPath}/orders/pizza" method="POST" modelAttribute="paraggelia">
            <p><strong>Choose bread size:</strong></p>
            <form:radiobuttons path="pizza.size" items="${sizes}" itemLabel="sname" itemValue="id" element="li"/> <%-- --%>
            <form:errors path="pizza.size"/>
            <br>
            <p><strong>Choose Ingredients:</strong></p>
            <c:forEach items="${ingredients}" var="ingredient">
                <input type="checkbox" name="pizza.ingredients" value="${ingredient.id}">${ingredient.iname}<br>
            </c:forEach>
            <form:errors path="pizza.ingredients"/>
            <br>
            <p><strong>Choose payment method:</strong></p>
            <form:select  path="payment" items="${payments}" itemLabel="pname" itemValue="id"/>
            <form:errors path="payment"/>
            <br>
            <p><strong>Your details:</strong></p>
            Name:<form:input path="customer.cname"/>
            <form:errors path="customer.cname"/>
            <br>
            Age:<form:input  type="number"  path = "customer.cage"/>
            <form:errors path="customer.cage"/>
            <br>
            Date of order:<form:input type="date" path="orderDate"/>
            <form:errors path="orderDate"/>
            <br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
