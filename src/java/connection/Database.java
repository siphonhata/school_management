/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;
/**
 *
 * @author Abuti-Small
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database 
{
    
    private static Connection connect;
    private static final String driverName = "org.postgresql.Driver";
    private static final String jdbcUrl = "jdbc:postgresql://localhost:5432/school_management";
    private static final String username = "postgres";
    private static final String password = "postgres";
    
    private Database(){}
    
    public static Connection getInstance()
    {
        try
        {
            if (connect == null)
            {
                Class.forName(driverName);
                connect = DriverManager.getConnection(jdbcUrl, username, password);
            }
        }
        catch (ClassNotFoundException | SQLException iex)
        {
            System.out.println("ClassNotFoundException | SQLException DB Error => " + iex.getMessage());
        }
        return connect;
    }
}
