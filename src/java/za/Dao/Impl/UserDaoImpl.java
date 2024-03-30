/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.Dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import connection.Database;
import za.Dao.UserDao;
import za.model.User;
/**
 *
 * @author Abuti-Small
 */
public class UserDaoImpl implements UserDao
{

    private final Connection connect;
    private PreparedStatement ps;
    private ResultSet rs;
    
    public UserDaoImpl()
    {
        connect = Database.getInstance();
    }
    
    
    @Override
    public User userLogin(String email, String password) 
    {
        User user = new User();
        
        if(connect != null)
        {
            try
            {
                String sql = "select * from Users where email = ? and password = ?";
                ps = connect.prepareStatement(sql);
                
                ps.setString(1, email);
                ps.setString(2, password);
                
                rs = ps.executeQuery();
                
                if(rs.next())
                {
                    user.setId(rs.getString(1));
                    user.setFirst_name(rs.getString(2));
                    user.setLast_name(rs.getString(3));
                    user.setId_number(rs.getString(4));
                    user.setDate_of_birth(rs.getString(5));
                    user.setGender(rs.getString(6));
                    user.setEmail(rs.getString(7));
                    user.setPhone_number(rs.getString(8));
                    user.setAddress(rs.getString(9));
                    user.setRole(rs.getString(10));
                    user.setPassword(rs.getString(11));
                    
                    return user; 
                }
            }
            catch(SQLException ex)
            {
                System.out.println("\nUser Login Error => " + ex.getMessage());
            }
            finally
            {
                if (ps != null)
                {
                    try
                    {
                        ps.close();
                    }
                    catch(SQLException ex)
                    {
                        System.out.println("\nUser Login close connection error => " + ex.getMessage());
                    }
                }
            }
        }
    return null;
    }
}
