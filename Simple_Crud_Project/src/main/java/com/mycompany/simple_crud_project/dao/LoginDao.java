/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.dao;

import com.mycompany.simple_crud_project.util.Encryption;
import java.security.InvalidKeyException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 *
 * @author Ravindu
 */
public class LoginDao {

    Encryption en = new Encryption();

    public boolean checkEqualityUser(String userName, String password) throws ClassNotFoundException, SQLException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
        String query = "select * from Registration where userName=?";
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setObject(1, userName);
//        pstm.setObject(2, password);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {
            String passwordEncrypt = rst.getString(6);
            String passwordDecrypt = en.decrypt(passwordEncrypt);
            if (password.equals(passwordDecrypt)) {
                return true;
            } else {
                return false;
            }
            //return true;
        } else {
            return false;
        }
    }

}
