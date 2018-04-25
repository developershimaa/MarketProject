<%-- 
    Document   : login
    Created on : Apr 24, 2018, 2:22:47 PM
    Author     : AbdAllh
--%>

<%@page contentType="text/html" pageEncoding="windows-1256"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="s"%>%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
        <title>Employees login</title>
    </head>
    <body>
    <center>
        <h1>Hello our drearly employee..... please login</h1><br/>

        <s:form commandName="customerservicedata" method="get">
            Email:    <s:input path="mail"/><br/>
            PASSWORD:  <s:password path="password"/><br/>
            <input type="submit" value="Login"/>
        </s:form>
            </center>
    </body>
</html>
