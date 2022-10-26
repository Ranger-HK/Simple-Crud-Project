/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ravindu
 */
public class DBConnection {
    public Connection connection;
    public DBConnection(){
        
    }
    
  public  Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project","root"," 19990202Ravi@:&pra");
        System.out.println("database check");
        return connection;
    }
    public  void connnectionClose() throws SQLException {
        System.out.println("connection closed successful");
        connection.close();
    }   
    
}
