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
import za.Service.UserService;
import za.Service.Impl.UserServiceImpl;
import za.model.User;

/**
 *
 * @author Abuti-Small
 */
@WebServlet(name = "UserLogin", urlPatterns = {"/UserLogin"})
public class UserLogin extends HttpServlet 
{

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
       response.setContentType("text/html;charset=UTF-8");
       User user;
       HttpSession session = request.getSession();
       UserService userService = new UserServiceImpl();
       
       String email = request.getParameter("email");
       String password = request.getParameter("password");
       
       if(!"".equals(email) && !"".equals(password))
       {
           user = userService.userLogin(email, password);
           
           if(user != null)
           {
                session.setAttribute("email", user.getEmail());
                session.setAttribute("id", user.getId());
                response.sendRedirect("yes.jsp");
           }
           else
           {
                session.setAttribute("wrong", "wrong credentials person");
                response.sendRedirect("login.jsp");
           }
          
       }
       else
       {
           session.setAttribute("blank", "Email/Password cannot be blank");
           response.sendRedirect("index.html");
       }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }
}
    
