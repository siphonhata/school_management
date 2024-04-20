/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.Service.Impl;


import za.Dao.UserDao;
import za.Dao.Impl.UserDaoImpl;
import za.model.User;
import za.Service.UserService;
/**
 *
 * @author Abuti-Small
 */
public class UserServiceImpl implements UserService
{

    private final UserDao userDao;
    
    public UserServiceImpl()
    {
        userDao = new UserDaoImpl();
    }
    
    @Override
    public User userLogin(String email, String password) 
    {
        return userDao.userLogin(email, password);
    }

    @Override
    public User getUserByEmail(String email)
    {
        return userDao.getUserByEmail(email);
    }

    @Override
    public int addPasswordTokens(User user, int token) 
    {
        return userDao.addPasswordTokens(user, token);
    }

    @Override
    public int sendEmail(String emailTo, String subject, String message) 
    {
        return userDao.sendEmail(emailTo, subject, message);
    }

    @Override
    public int addUser(User user)
    {
        return userDao.addUser(user);
    }

    @Override
    public String hash(String password) 
    {
        return userDao.hash(password);
    }

}
