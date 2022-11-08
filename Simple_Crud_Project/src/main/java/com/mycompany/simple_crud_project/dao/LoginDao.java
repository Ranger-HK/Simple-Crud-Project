/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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

}
