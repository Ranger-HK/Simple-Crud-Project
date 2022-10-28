<%-- 
    Document   : Home
    Created on : Oct 27, 2022, 6:01:39 PM
    Author     : Ravindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
        <link rel="stylesheet" href="assets/boostrap/css/bootstrap.min.css"/>
        <!--                 <link rel="stylesheet" href="assets/css/stylesheet.css"/>-->
        <link rel="stylesheet" href="assets/fonts/css/all.css"/>

        <style>


            html,body{
                background-image: url('assets/img/pexels-henry-&-co-2341290.jpg');
                background-size: cover;
                background-repeat: no-repeat;
                height: 100%;
                font-family: 'Roboto', sans-serif;

            }

            .table-success{
                position: relative;
                top: 100px;
                border: 2px solid black
            }

            .btn-primary{
                position: relative;
                color: black;
                background-color: #ffbf01;
                border-radius: 11px;
                top: -376px;
                left: 1747px;
                font-size: 25px;
                font-weight: 800;
            }

            .btn-success{
                position: relative;
                color: black;
                background-color: #ffbf01;
                border-radius: 11px;
                top: -321px;
                left: 25px;
                font-size: 25px;
                font-weight: 800;
            }
        </style>
    </head>

    <body>

        <table class="table table-success table-striped">

            <thead class="table-dark">
                <tr>
                    <th scope="col">User Id</th>
                    <th scope="col">Name</th>
                    <th scope="col">Address</th>
                    <th scope="col">Email</th>
                    <th scope="col">Contact</th>
                    <th scope="col">Password</th>
                    <th scope="row">Update</th>
                    <th scope="row">Delete</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
                <tr>
                    <th>U001</th>
                    <th>Ravindu</th>
                    <th>Bandaragama</th>
                    <th>Ravindu@gmail.com</th>
                    <th>+94 764618605</th>
                    <th>R1999</th>
                    <th>Update</th>
                    <th>Delete</th>
                </tr>
            </tbody>
        </table>

        <a href="Update.jsp"><button type="button" class="btn btn-success">Update</button></a>
        <div class="form-group ">
            <a href="Login.jsp"  <button type="button" class="btn btn-primary btn-lg btn-block login-button">Log Out</button></a>
        </div>




</html>
