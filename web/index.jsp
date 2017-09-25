<%--
  Created by IntelliJ IDEA.
  User: roman.pipchenko
  Date: 9/19/2017
  Time: 13:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bulls and Cows!</title>
  </head>
  <body>
  <h1>Hello user, if you are ready for the game press Start button!</h1>

  <form method="get" action="http://localhost:8080/BullsAndCows.jsp">
      <input type="submit" value="Start"/>
  </form>

  <form method="get" action="http://localhost:8080/welcome">
      <input type="submit" value="DeleteButton"/>
  </form>

  <a href="BullsAndCows.jsp">Start!:)</a>

   </body>
</html>
