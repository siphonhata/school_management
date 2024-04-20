/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abuti-Small
 */


 import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Base64;

public class PasswordHashingExample 
{

    // Method to hash the password using SHA-256
    public static String hashPassword(String password) throws NoSuchAlgorithmException 
    {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashBytes);
    }

    // Method to generate a salt
    public static byte[] generateSalt() 
    {
        SecureRandom random = new SecureRandom();
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return salt;
    }

    // Method to hash the password using a salt and SHA-256
    public static String hashPasswordWithSalt(String password, byte[] salt) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(salt);
        byte[] hashBytes = md.digest(password.getBytes());
        return Base64.getEncoder().encodeToString(hashBytes);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        String password = "Snhata2?";

        // Hash the password
        String hashedPassword = hashPassword(password);
        System.out.println("Hashed Password: " + hashedPassword);

        // Generate a salt and hash the password with salt
        byte[] salt = generateSalt();
        String hashedPasswordWithSalt = hashPasswordWithSalt(password, salt);
        System.out.println("Hashed Password with Salt: " + hashedPasswordWithSalt);
    }
}