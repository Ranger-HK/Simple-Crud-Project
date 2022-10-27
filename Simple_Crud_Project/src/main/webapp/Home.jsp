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
    </head>
    <body>
       <div  style="align-items: center;display: flex;height: 80vh;flex-direction: column">

    <div class="col-md-8">
        <table class="table table-success table-striped">
            <thead>
            <tr>
                <th>User Id</th>
                <th>Name</th>
                <th>Address</th>
                <th>Email</th>
                <th>Contact</th>
                <th>Password</th>
                <th>Update</th>
                <th>Delete</th>
            </tr>
            </thead>
            <tbody id="tblRegistration" name="tblRegistration" style=";cursor: pointer;">
            </tbody>
        </table>

    </div>
    </body>
</html>
