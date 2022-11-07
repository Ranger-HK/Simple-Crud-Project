/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.dao;

//import com.mycompany.simple_crud_project.model.Registration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author Ravindu
 */
public class LoginDao {

    public boolean checkEqualityUser(String userID, String password) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
        String query = "select * from Registration where userID=? && password=md5(?)";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setObject(1, userID);
        pstm.setObject(2, password);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {
            return true;
        } else {
            return false;
        }
    }

    /*   public Registration getuser (String userID) throws SQLException, ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
        String query = "select * from Registration where userID=? ";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setObject(1,userID);
        ResultSet rst = pstm.executeQuery();
        rst.next();
           return new Registration(rst.getString("userID"),rst.getString("userName"),rst.getString("address"),rst.getString("email"),rst.getString("contact"),rst.getString("password"));
            
         
       
    } */
}
