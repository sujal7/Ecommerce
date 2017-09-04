<%-- 
    Document   : index
    Created on : Aug 25, 2017, 8:10:38 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! by html</h1>
        <h1><%out.println("hello world by scriplet, not good practice though");%></h1>
        <h1>${el}</h1> 
<!--        This prints the value stored in el in IndexController and runs if condition satisfied-->
        <h1><c:out value="Learning JSTL way of printing"/></h1>
        <h1><c:out value="${el}"/></h1> <%--Unified Expression Language--%>
    </body>
</html>
