

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Confirmation</title>
    </head>
    <body>
        <h1>You ordered a nice pizza</h1>
        <div>
            <p>Size : ${paraggelia.size}</p>
        </div>
        <div>
            <ul>
                <c:forEach var="ingredients" items="${paraggelia.ingredients}">  
                    <li>${ingredients}</li>  
                </c:forEach>
            </ul>
        </div>
        <div>
            <p>Payment Method : ${listOfPayments.get(i)}</p>
        </div>
        <div>
            <p>Name : ${paraggelia.name}</p>
        </div>
        <div>
            <p>Age : ${paraggelia.age}</p>
        </div>
        <div>
            <p>Order date : ${paraggelia.date}</p>
        </div>

        <div>
            <h2>Thank You</h2>
        </div>
    </body>
</html>
