/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.Dao;

import za.model.User;
/**
 *
 * @author Abuti-Small
 */
public interface UserDao
{
    
    public int addUser(User user);
    public String hash(String password);
    public User userLogin(String email, String password);
    public User getUserByEmail(String email);
    public int addPasswordTokens(User user, int token);
    public int sendEmail(String emailTo, String subject, String message);
}
