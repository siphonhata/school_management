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
    public User userLogin(String email, String password);
}
