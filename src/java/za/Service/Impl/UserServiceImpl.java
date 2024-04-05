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
    
}
