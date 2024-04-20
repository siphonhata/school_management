<%-- 
    Document   : add_user
    Created on : Apr 20, 2024, 2:13:28 PM
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
    <h2>User Registration Form</h2>
    <form action="addUser" method="post">
        <label for="id">ID:</label>
        <input type="text" id="id" name="id"><br><br>
        
        <label for="first_name">First Name:</label>
        <input type="text" id="first_name" name="first_name"><br><br>
        
        <label for="last_name">Last Name:</label>
        <input type="text" id="last_name" name="last_name"><br><br>
        
        <label for="id_number">ID Number:</label>
        <input type="text" id="id_number" name="id_number"><br><br>
        
        <label for="date_of_birth">Date of Birth:</label>
        <input type="date" id="date_of_birth" name="date_of_birth"><br><br>
        
        <label for="gender">Gender:</label>
        <select id="gender" name="gender">
            <option value="Male">Male</option>
            <option value="Female">Female</option>
        </select><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email"><br><br>
        
        <label for="phone_number">Phone Number:</label>
        <input type="text" id="phone_number" name="phone_number"><br><br>
        
        <label for="address">Address:</label>
        <input type="text" id="address" name="address"><br><br>
        
        <label for="role">Role:</label>
        <select id="role" name="role">
            <option value="STUDENT">Student</option>
            <option value="TEACHER">Teacher</option>
            <option value="PARENT">Parent</option>
            <option value="ADMIN">Admin</option>
        </select><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
