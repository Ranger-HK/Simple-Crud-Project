/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.bo;

import com.mycompany.simple_crud_project.dao.LoginDao;
import java.sql.SQLException;

/**
 *
 * @author Ravindu
 */
public class LoginBo {

    LoginDao loginDao = new LoginDao();

    public boolean equalityUser(String userID, String password) throws ClassNotFoundException, SQLException {
        boolean equal = loginDao.checkEqualityUser(userID, password);
        if (equal) {
            return true;
        } else {
            return false;
        }
    }
}
