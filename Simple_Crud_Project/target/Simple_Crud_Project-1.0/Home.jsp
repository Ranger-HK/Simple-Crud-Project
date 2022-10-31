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
        <link rel="stylesheet" href="assets/fonts/css/all.css"/>
        <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Lato:ital@1&family=Roboto:wght@300&family=Work+Sans:ital,wght@1,500&display=swap" rel="stylesheet">

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
                top:-30px;

            }


            #back{
                position: relative;
                font-size: 60px;
                left: 1830px;
                top: 23px;
            }



            .btn-danger{
                position: relative;
                font-size: 25px;
                border-radius: 10px;
                left: -35px;
                top: 5px;
                background-color: #e74c3c;
            }

            .btn-secondary{
                position: relative;
                font-size: 25px;
                border-radius: 10px;
                left:15px;
                top: 5px;
                background-color: #1abc9c;
                color: #ecf0f1;

            }

            .btn-secondary:hover{
                background-color: #16a085;
                color: #ecf0f1;
            }

            .btn-danger:hover{
                background-color: #c0392b;
            }

            h1{
                position: relative;
                top: -68px;
                left: 870px;
                font-family: 'Lato', sans-serif;
                font-size: 45px;
                font-weight: 800;
                
            }




        </style>
    </head>

    <body>

        <!--        <div class="row align-items-end">-->
        <div class="col-5">
            <a href="Login.jsp"><span><i class="fa-solid fa-circle-arrow-left" id="back"></i></span></a>
            <button type="button" class="btn btn-danger btn-sm">Delete</button>
            <button type="button" class="btn btn-secondary btn-sm">Update</button>
            <h1>Users Details</h1>
        </div>




        <!--        <div class="row align-items-center">-->
        <div class="col-12 mt-2">

            <table class="table table-success table-striped">

                <thead class="table-dark">
                    <tr>
                        <th scope="col">User Id</th>
                        <th scope="col">Name</th>
                        <th scope="col">Address</th>
                        <th scope="col">Email</th>
                        <th scope="col">Contact</th>
                        <th scope="col">Password</th>
                    </tr>
                </thead>
                <tbody id="userTable">
                    <tr>
                        <th>U001</th>
                        <th>Ravindu</th>
                        <th>Bandaragama</th>
                        <th>Ravindu@gmail.com</th>
                        <th>+94 764618605</th>
                        <th>R1999</th>


                    </tr>

                </tbody>
            </table>
        </div>


        <script src="assets/jQuery/jquery-3.6.0.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="controller/UserController.js"></script>    


    </body>

</html>
