/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.bo;

import com.mycompany.simple_crud_project.dao.RegistrationDao;
import com.mycompany.simple_crud_project.dto.RegistrationDTO;
import com.mycompany.simple_crud_project.model.Registration;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Ravindu
 */
public class RegistrationBo {
       RegistrationDao registrationDao = new RegistrationDao();

    public boolean registrationUser(RegistrationDTO registrationDTO) throws ClassNotFoundException{
        return registrationDao.registerUser(new Registration(
                registrationDTO.getUserID(),
                registrationDTO.getUserName(), 
                registrationDTO.getAddress(),
                registrationDTO.getEmail(),
                registrationDTO.getContact(),
                registrationDTO.getPassword()
        ));
    }
    
    public ArrayList<RegistrationDTO> getAllUser() throws SQLException, ClassNotFoundException {
        ArrayList<Registration> all = registrationDao.getAllUser();
        ArrayList<RegistrationDTO> registrationList = new ArrayList<>();
        for (Registration registration : all) {
            registrationList.add(
                    new RegistrationDTO(
                            registration.getUserID(),
                            registration.getUserName(),
                            registration.getAddress(),
                            registration.getEmail(),
                            registration.getContact(),
                            registration.getPassword()
                    )
            );
        }
        return registrationList;

    }
    
      public boolean updateUser(RegistrationDTO registrationDTO) throws ClassNotFoundException, SQLException{
        return registrationDao.updateUser(new Registration(
                registrationDTO.getUserID(),
                registrationDTO.getUserName(),
                registrationDTO.getAddress(),
                registrationDTO.getEmail(),
                registrationDTO.getContact(),
                registrationDTO.getPassword()
        ));
    }
      
        public boolean deleteUser(String userID) throws ClassNotFoundException, SQLException{
        return registrationDao.deleteUser(userID);
    }
    
//    public RegistrationDTO searchUser(String userID) throws ClassNotFoundException, SQLException{
//        Registration searchUser = registrationDao.searchUser(userID);
//        if (searchUser==null){
//            return null;
//        }else{
//            return new RegistrationDTO(
//                    searchUser.getUserID(),
//                    searchUser.getUserName(),
//                    searchUser.getAddress(),
//                    searchUser.getEmail(),
//                    searchUser.getContact(),
//                    searchUser.getPassword()
//            );
//        }
//    }
}
