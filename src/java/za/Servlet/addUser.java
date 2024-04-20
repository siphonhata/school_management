/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.Servlet;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.UUID;
import za.Service.UserService;
import za.Service.Impl.UserServiceImpl;
import za.model.User;

/**
 *
 * @author Abuti-Small
 */
@WebServlet(name = "addUser", urlPatterns = {"/addUser"})
public class addUser extends HttpServlet
{

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        //HttpSession sess = request.getSession(); 
        User user;
        UserService userService = new UserServiceImpl();
        
        String id = request.getParameter("id");
        String first_name = request.getParameter("first_name");
        String last_name = request.getParameter("last_name");
        String id_number = request.getParameter("id_number");
        String date_of_birth = request.getParameter("date_of_birth");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String phone_number = request.getParameter("phone_number");
        String address = request.getParameter("email");
        String role = request.getParameter("role");
        String pass = request.getParameter("password");
        
        String hashedPassword = userService.hash(pass);
        
        user = new User(id, first_name, last_name, id_number, date_of_birth, gender, email, phone_number, address, role, hashedPassword);
        System.out.println(user);
        System.out.println("USerrrrrrrrrrrrr");
        if(userService.addUser(user) > 0)
        {
            response.sendRedirect("registered.jsp?hey=User added Succesfully");
        }
        else
        {
            response.sendRedirect("add_user.jsp?error=User not Added");
        }
        
       
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    
}
