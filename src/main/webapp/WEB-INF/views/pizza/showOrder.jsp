

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Order Details</title>
    </head>
    <body>
        <h1>You ordered a nice pizza</h1>
        <div>
            <p>Size : ${paraggelia.pizza.size.sname}</p>
        </div>
        <div>
            <ul>
                <c:forEach var="ingredients" items="${paraggelia.pizza.ingredients}">  
                    <li>${ingredients.iname}</li>  
                </c:forEach>
            </ul>
        </div>
        <div>
            <p>Payment Method : ${paraggelia.payment.pname}</p>
        </div>
        <div>
            <p>Name : ${paraggelia.customer.cname}</p>
        </div>
        <div>
            <p>Age : ${paraggelia.customer.cage}</p>
        </div>
        <div>
            <p>Order date : ${paraggelia.orderDate}</p>
        </div>

        <div>
            <h2>Thank You</h2>
        </div>
    </body>
</html>
