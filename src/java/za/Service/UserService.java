/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.Service;
import za.model.User;
/**
 *
 * @author Abuti-Small
 */
public interface UserService
{
    public User userLogin(String email, String password);
    public User getUserByEmail(String email);
}
