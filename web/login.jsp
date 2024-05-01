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
  <title>Login - [School Name]</title>
  <link rel="stylesheet" href="first_page_style.css">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Pacifico&display=swap">
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
      <h2>Login to School Portal</h2>
      <form action="UserLogin" method="post">
        <div class="form-group">
          <label for="username">Username:</label>
          <input type="text" name="username" id="username" required>
        </div>
        <div class="form-group">
          <label for="password">Password:</label>
          <input type="password" name="password" id="password" required>
        </div>
        <div class="form-group">
          <button type="submit">Login</button>
        </div>
        <a href="#">Forgot Password?</a>
        <p>New User? <a href="#">Register Here</a></p>
      </form>
    </section>
  </main>
</body>
</html>
