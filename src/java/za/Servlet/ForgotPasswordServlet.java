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
               String subject = "Password Reset Request";
               String mess = "Dear " + user.getFirst_name() + "\n" +
                       "\nYou recently requested to reset your password for your account with us. "
                       + "To complete the process, please use the following reset code:\n" +
                         "\nReset Code: " + token + "\n" +
                         "Validity: [Validity Period]\n" +
                         "Link: http://localhost/school_management/verify_code.jsp" +
                         "\nPlease visit our password reset page and enter the reset code to " +
                         "proceed with resetting your password. Please note that the reset code " +
                         "is only valid for the specified duration.\n" +
                         "\nIf you did not request a password reset, please ignore this email.\n" +
                         "Thank you,\n" +
                         "\n\nSchool Management Team\n";
            
               
               emailObj.createAndSendEmailAsync(user.getEmail(), subject, mess);
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
