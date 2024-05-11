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
  <title>Login - Dineo Mathibela Combine School</title>
  <link rel="stylesheet" href="first_page_style.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap">
  <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script> 
  
</head>
<body>
  <header>
    <div class="container">
      <div class="logo">
        <img src="school_logo.png" alt="[School Name] Logo">
      </div>
      <h1>Dineo Mathibela Combine School</h1>
    </div>
  </header>
    <br><br<br><br>
  <main>
    <section class="login">
      <h2>      Login to School Portal</h2>
      <form action="UserLogin" method="post">
        <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" name="username" id="username" required>
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="password" name="password" id="password" required>
        </div>
        <%
            String sess = (String) session.getAttribute("wrong");
            if (sess != null)
            {
                session.removeAttribute("wrong");
        %>
            <p id="error-message" style="color: red; font-size: smaller; margin-bottom: 10px;">Invalid username or password!</p>
        <%
            }
        %>
        <div class="form-group">
          <button type="submit">Login</button>
          <a href="forgot_password.jsp" style="float: right;">Forgot Password?</a>
        </div>
        <p>Not yet member?  <a href="#">Sign up now</a></p>
      </form>
    </section>
  </main>
   <script>
        $(document).ready(function() 
        {
            var errorMessage = $("#error-message");
            if (errorMessage.length > 0)
            {
                errorMessage.show().delay(5000).fadeOut();
            }
        });
  </script>
</body>
</html>
