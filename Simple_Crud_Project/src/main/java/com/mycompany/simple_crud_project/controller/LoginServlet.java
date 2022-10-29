/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.controller;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.json.Json;
//import javax.json.JsonArrayBuilder;
//import javax.json.JsonObjectBuilder;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// *
// * @author Ravindu
// */
//@WebServlet(urlPatterns = "/Login")
//public class LoginServlet extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("application/json");
//
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Simple_Crud_Project", "root", "19990202Ravi@:&pra");
//            PreparedStatement pstm = con.prepareStatement("select * from Registration");
//            ResultSet rst = pstm.executeQuery();
//
//            JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
//            PrintWriter writer = resp.getWriter();
//
//            while (rst.next()) {
//                JsonObjectBuilder objBuilder = Json.createObjectBuilder();
//                objBuilder.add("id", rst.getString(1));
//                objBuilder.add("name", rst.getString(2));
//                objBuilder.add("address", rst.getString(3));
//                objBuilder.add("salary", rst.getDouble(4));
//
//                arrayBuilder.add(objBuilder.build()); //add to the array of json
//
//            }
//            /*---------------------------objectBuilder for generate Response----------------------------*/
//            JsonObjectBuilder response = Json.createObjectBuilder();
//            response.add("status", 200);
//            response.add("message", "Done");
//            response.add("data", arrayBuilder.build());
//
//           
//            writer.print(response.build());
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(LoginServlet.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//}
