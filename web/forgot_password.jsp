<%-- 
    Document   : forgot_password
    Created on : Apr 4, 2024, 8:43:01 PM
    Author     : Abuti-Small
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
    <h2>Forgot Password</h2>
    <form action="ForgotPasswordServlet" method="post">
        <label for="email">Email </label>
        <input type="email" id="email" name="email" required><br><br>
        <input type="submit" value="Submit">
    </form>
    </center>
    </body>
</html>
