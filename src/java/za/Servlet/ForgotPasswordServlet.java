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
import za.Service.Impl.UserServiceImpl;
import za.Service.UserService;
import za.model.User;
import za.model.EmailSender;

/**
 *
 * @author Abuti-Small
 */
@WebServlet(name = "ForgotPasswordServlet", urlPatterns = {"/ForgotPasswordServlet"})
public class ForgotPasswordServlet extends HttpServlet 
{
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        UserService userService = new UserServiceImpl();
        User user;
        String email = request.getParameter("email");
               
        System.out.println("| EMAIL | => " + email);
        user = userService.getUserByEmail(email);
        
        if(user != null)
        {
            int token = 4901;
            
            if (userService.addPasswordTokens(user, token) > 0)
            {
                //serService.
               
               EmailSender emailObj = new EmailSender();
               
               
               emailObj.createAndSendEmail("siphonhata@gmail.com", "Test email subject", "Congratulations !!! \nThis is test email sent by java class.");
               response.sendRedirect("verify_code.jsp");
            }
            else
            {
                //do something 
                response.sendRedirect("forgot_password.jsp?error=Reset Password error");
            }
            
        }
        else
        {
            //Invalid EMail address given
            response.sendRedirect("forgot_password.jsp?error=Invalid Email given");
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
