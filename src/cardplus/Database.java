/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardplus;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {
    public static Connection con;
    public Database()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url="jdbc:mysql://www.db4free.net:3306/id1416_smartcard";
            String username="id_smartcard";
            String password="smart@123";
            con=DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String[] args) {
        Database d=new Database();
    }
}
