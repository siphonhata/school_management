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
     
  <div class="wrapper">
    <header>Login</header>
   
    <%
        String credential = (String) session.getAttribute("wrong");
        if (credential != null) {
            session.removeAttribute("wrong");
    %>
    <div class="alert alert-danger" id="danger" style="width: 350px; margin-top: 10px;">Wrong credentials.</div>
    <%
       }
    %>
    <form method="POST" action="UserLogin">
      <div class="field email">
        <div class="input-area">
            <input type="text" name="email" placeholder="Email Address">
          <i class="icon fas fa-envelope"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
       
        <div class="error error-txt">Email can't be blank</div>
      </div>
      <div class="field password">
        <div class="input-area">
            <input type="password" name="password" placeholder="Password">
          <i class="icon fas fa-lock"></i>
          <i class="error error-icon fas fa-exclamation-circle"></i>
        </div>
        <div class="error error-txt">Password can't be blank</div>
      </div>
      
      <input type="submit" value="Login">
    </form>
    <div class="sign-txt">Not yet member? <a href="register.jsp">Sign up now</a></div>
  </div>



</body>
</html>>
