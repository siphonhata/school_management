/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.model;

/**
 *
 * @author Abuti-Small
 */
public class User 
{
    private String id;
    private String first_name;
    private String last_name;
    private String id_number;
    private String date_of_birth;
    private String Gender;
    private String email;
    private String phone_number;
    private String address;
    private String role;
    private String password;
    
    public User()
    {
    }

    public User(String id, String first_name, String last_name, String id_number, String date_of_birth, String Gender, String email, String phone_number, String address, String role, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_number = id_number;
        this.date_of_birth = date_of_birth;
        this.Gender = Gender;
        this.email = email;
        this.phone_number = phone_number;
        this.address = address;
        this.role = role;
        this.password = password;
    }

    public String getId() 
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getFirst_name() 
    {
        return first_name;
    }

    public void setFirst_name(String first_name)
    {
        this.first_name = first_name;
    }

    public String getLast_name()
    {
        return last_name;
    }

    public void setLast_name(String last_name) 
    {
        this.last_name = last_name;
    }

    public String getId_number() 
    {
        return id_number;
    }

    public void setId_number(String id_number)
    {
        this.id_number = id_number;
    }

    public String getDate_of_birth()
    {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth)
    {
        this.date_of_birth = date_of_birth;
    }

    public String getGender() 
    {
        return Gender;
    }

    public void setGender(String Gender)
    {
        this.Gender = Gender;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPhone_number() 
    {
        return phone_number;
    }

    public void setPhone_number(String phone_number) 
    {
        this.phone_number = phone_number;
    }

    public String getAddress() 
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getRole() 
    {
        return role;
    }

    public void setRole(String role) 
    {
        this.role = role;
    }

    public String getPassword() 
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString() 
    {
        return "User{" + "id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", id_number=" + id_number + ", date_of_birth=" + date_of_birth + ", Gender=" + Gender + ", email=" + email + ", phone_number=" + phone_number + ", address=" + address + ", role=" + role + ", password=" + password + '}';
    }
    
    
}
