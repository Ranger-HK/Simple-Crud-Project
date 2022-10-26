/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simple_crud_project.model;

/**
 *
 * @author ravindu
 */
public class Registration {

    private String name;
    private String address;
    private String email;
    private String telephone_Number;
    private String user_Id;
    private String password;

    public Registration() {
    }

    public Registration(String name, String address, String email, String telephone_Number, String user_Id, String password) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.telephone_Number = telephone_Number;
        this.user_Id = user_Id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone_Number() {
        return telephone_Number;
    }

    public void setTelephone_Number(String telephone_Number) {
        this.telephone_Number = telephone_Number;
    }

    public String getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(String user_Id) {
        this.user_Id = user_Id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Registration{" + "name=" + name + ", address=" + address + ", email=" + email + ", telephone_Number=" + telephone_Number + ", user_Id=" + user_Id + ", password=" + password + '}';
    }

}
