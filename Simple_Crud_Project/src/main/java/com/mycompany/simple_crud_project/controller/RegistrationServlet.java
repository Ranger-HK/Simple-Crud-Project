/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.controller;

import com.mycompany.simple_crud_project.bo.RegistrationBo;
import com.mycompany.simple_crud_project.dto.RegistrationDTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;
import javax.json.JsonReader;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ravindu
 * 
 */
@WebServlet(name = "RegistrationServlet", urlPatterns = {"/Registration"})
public class RegistrationServlet extends HttpServlet {
    
    //    create object in BO layer
    RegistrationBo registrationBo = new RegistrationBo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {  //Read

        resp.setContentType("application/json");

        try {

            PrintWriter writer = resp.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

            ArrayList<RegistrationDTO> details = registrationBo.getAllUser();
            for (RegistrationDTO registrationDTO : details) {
                JsonObjectBuilder obj = Json.createObjectBuilder();
                obj.add("userID", registrationDTO.getUserID());
                obj.add("userName", registrationDTO.getUserName());
                obj.add("address", registrationDTO.getAddress());
                obj.add("email", registrationDTO.getEmail());
                obj.add("contact", registrationDTO.getContact());
                obj.add("password", registrationDTO.getPassword());

                arrayBuilder.add(obj.build());
            }

            writer.print(arrayBuilder.build());
            con.close();

            //System.out.println(check);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
//        PrintWriter writer = resp.getWriter();
//        writer.write("Hi");
    }


    /*
//    create object in BO layer
    RegistrationBo registrationBo = new RegistrationBo();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {  //Read

        resp.setContentType("application/json");

        try {

            PrintWriter writer = resp.getWriter();
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();

            ArrayList<RegistrationDTO> details = registrationBo.getAllUser();
            for (RegistrationDTO registrationDTO : details) {
                JsonObjectBuilder obj = Json.createObjectBuilder();
                obj.add("userID", registrationDTO.getUserID());
                obj.add("userName", registrationDTO.getUserName());
                obj.add("address", registrationDTO.getAddress());
                obj.add("email", registrationDTO.getEmail());
                obj.add("contact", registrationDTO.getContact());
                obj.add("password", registrationDTO.getPassword());

                arrayBuilder.add(obj.build());
            }

            writer.print(arrayBuilder.build());
            con.close();

            //System.out.println(check);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
//        PrintWriter writer = resp.getWriter();
//        writer.write("Hi");
    }
*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException { //Create
//           System.out.print("Helloeee");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        JsonReader reader = Json.createReader(req.getReader());
        JsonObject obj = reader.readObject();
        String userID = obj.getString("userID");
        String userName = obj.getString("userName");
        String address = obj.getString("address");
        String email = obj.getString("email");
        String contact = obj.getString("contact");
        String password = obj.getString("password");

//             System.out.print(password);

        RegistrationDTO registrationDTO = new RegistrationDTO(userID, userName, address, email, contact, password);
        try {
            if (registrationBo.registrationUser(registrationDTO)) {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 200);
                response.add("message", "Successfully Added");
                response.add("data", "");
                writer.print(response.build());
            } else {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 500);
                response.add("message", "Can't add the user");
                response.add("data", "");
                writer.print(response.build());
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {  //Update
        resp.setContentType("application/json");

        //System.out.println("Ravindu");
        PrintWriter writer = resp.getWriter();

        /*get user information from json Request Using JsonReader */
        JsonReader reader = Json.createReader(req.getReader());
        JsonObject jsonObject = reader.readObject();
        String userID = jsonObject.getString("userID");
        String userName = jsonObject.getString("userName");
        String address = jsonObject.getString("address");
        String email = jsonObject.getString("email");
        String contact = jsonObject.getString("contact");
        String password = jsonObject.getString("password");
        /*System.out.println(userID+" "+userName+" "+address+" "+email);*/

        RegistrationDTO registrationDTO = new RegistrationDTO(userID, userName, address, email, contact, password);
        try {
            if (registrationBo.updateUser(registrationDTO)) {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 200);
                response.add("message", "Successfuly Updated");
                response.add("data", "");
                writer.print(response.build());
            } else {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 500);
                response.add("message", "Can't update user");
                response.add("data", "");
                writer.print(response.build());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws IOException { //Delete
        resp.setContentType("application/json");

        //get userID Using getParameter Method
        String userID = req.getParameter("userID");
        System.out.println(userID);

        PrintWriter writer = resp.getWriter();
        try {
            if (registrationBo.deleteUser(userID)) {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 200);
                response.add("message", "Successfuly deleted...");
                response.add("data", "");
                writer.print(response.build());
            } else {
                JsonObjectBuilder response = Json.createObjectBuilder();
                response.add("status", 500);
                response.add("message", "Wrong ID inserted...");
                response.add("data", "");
                writer.print(response.build());
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(RegistrationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
