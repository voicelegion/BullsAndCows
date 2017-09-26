<%--
  Created by IntelliJ IDEA.
  User: roman.pipchenko
  Date: 9/20/2017
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Bulls And Cows</title>
</head>
<body>
Bulls And Cows game!
<p>
<form method="post" action="http://localhost:8080/BullsAndCowsParser">
    <input type="text" name="inputField"/>
    <br/>
    <input type="submit" value="Submit!"/>
    <br/>

</form>
<form>
    <%
        if (request.getAttribute("msgForUser")!=null) {
            out.println(request.getAttribute("msgForUser"));
        }
    %>
</form>
<a href="index.jsp">Go Back!</a>

</body>
</html>
