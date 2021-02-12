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
            <p>Choose bread size:</p>
            <%--<form:radiobutton id="large" path="size" value="large"/>--%>
            <form:radiobutton id="large" path="paraggelia.pizzaId.sizeId" value="Large" />
            <label for="large">Large</label>
            <br>
            <%--<form:radiobutton id="medium" path="size" value="medium"/>--%>
            <form:radiobutton id="medium" path="paraggelia.pizzaId.sizeId" value="Medium"/>
            <label for="medium">Medium</label>
            <br>
            <%--<form:radiobutton id="small" path="size" value="small"/>--%>
            <form:radiobutton id="small" path="paraggelia.pizzaId.sizeId" value="Small"/>
            <label for="small">Small</label>
            <br>
            <br>
            <br>
            <p>Choose Ingredients:</p>
            <%--<form:checkbox id="potatoes" path="ingredients" value="potatoes"/>--%>
            <form:checkbox id="potatoes" path="paraggelia.pizzaId.ingredientList" value="potatoes"/>
            <label for="potatoes">Potatoes</label>
            <br>
            <%--<form:checkbox id="tomatoes" path="ingredients" value="tomatoes"/>--%>
            <form:checkbox id="tomatoes" path="paraggelia.pizzaId.ingredientList" value="tomatoes"/>
            <label for="tomatoes">Tomatoes</label>
            <br>
            <%--<form:checkbox id="sausage" path="ingredients" value="sausage"/>--%>
            <form:checkbox id="sausage" path="paraggelia.pizzaId.ingredientList" value="sausage"/>
            <label for="sausage">Sausage</label>
            <br>
            <br>
            <br>
            <p>Choose payment method:</p>
            <form:select id="payment" path="paymentMethod">
                <c:forEach items="${listOfPayments}" var="payment">
                    <form:option value="${payment}">${payment}</form:option>
                </c:forEach>
            </form:select>
            <br>
            <br>
            <h5>Your details:</h5>
            <label for="inputName">Name:</label>
            <form:input id="inputName" path="name"/>
            <br>
            <label for="inputAge">Age:</label>
            <form:input  type="number"  id="inputAge" path = "age"/>
            <br>
            <label for="inputDate"></label>
            <form:input type="date" id="inputDate" path="date"/>
            <br>
            <input type="submit" value="Submit">
        </form:form>
    </body>
</html>
