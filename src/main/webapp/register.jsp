<%-- 
    Document   : register
    Created on : Apr 24, 2018, 4:14:52 PM
    Author     : AbdAllh
--%>

<%@page contentType="text/html" pageEncoding="windows-1256"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl" %>%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
        <title> employee registeration</title>
    </head>
    <body>
        <h1>Hello our new employee please register!</h1>
        <form:form  commandName="customerservicedata"  action="${pageContext.request.Contextpath}/register" method="POST">
            ID:<form:input path="id"/><br>
            NAME:<form:input path="name"/><br>
            EMAIL:<form:input path="email"/><br>
            PASSWORD:<form:password path="password"/><br>
            ADDRESS:<form:input path="address"/><br>
            PHONE:<form:input path="phone"/><br>
            
            <input type="submit" value="register">
        </form:form>
    </body>
</html>
