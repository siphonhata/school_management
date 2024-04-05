<%-- 
    Document   : login.jsp
    Created on : Mar 30, 2024, 7:20:22 PM
    Author     : Abuti-Small
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Form</title>
    <link rel="stylesheet" href="style1.css">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"/>


</head>
<body>
    <header>Login</header>
<center>
    <form method="POST" action="UserLogin"><br><br>
        <label for="email">Email   </label>
        <input type="text" name="email" placeholder="Email Address"><br><br>
        <label for="paasword">Password </label>
        <input type="password" name="password" placeholder="Password"><br><br>
         <a href="forgot_password.jsp" >Forgot Password</a><br><br>
        <input type="submit" value="Login">
       
    </form>
    </center>
    </body>
</html>
