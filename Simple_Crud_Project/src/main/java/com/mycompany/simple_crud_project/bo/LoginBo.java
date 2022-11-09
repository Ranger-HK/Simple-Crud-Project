/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.bo;

import com.mycompany.simple_crud_project.dao.LoginDao;
import java.security.InvalidKeyException;
import java.sql.SQLException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/**
 *
 * @author Ravindu
 */
public class LoginBo {

    LoginDao loginDao = new LoginDao();

    public boolean equalityUser(String userName, String password) throws ClassNotFoundException, SQLException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
        boolean equal = loginDao.checkEqualityUser(userName, password);
        if (equal) {
            return true;
        } else {
            return false;
        }
    }
}
