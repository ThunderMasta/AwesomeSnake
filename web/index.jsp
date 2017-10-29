<%@ page import="Sample.HelloWorld" %>
<%--
  Created by IntelliJ IDEA.
  User: evgenijfrolov
  Date: 07.08.17
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head>
    <title>Simple jsp page</title>
    <link rel="stylesheet" type="text/css" href="styles.css">
  </head>
  <body>
    <h3 class="message">dgsgsdfgdfg</h3>
    <h1><%=HelloWorld.getMessage()%></h1>
  </body>
</html>
