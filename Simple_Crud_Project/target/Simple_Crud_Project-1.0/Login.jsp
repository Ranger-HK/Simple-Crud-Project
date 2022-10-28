
<!--    Created on : Oct 27, 2022, 12:49:24 PM
    Author     : Ravindu

-->


<!DOCTYPE html>
<html>
    <head>
        <title>Login Form</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/boostrap/css/bootstrap.min.css"/>
        <link rel="stylesheet" href="assets/css/stylesheet.css"/>
        <link rel="stylesheet" href="assets/fonts/css/all.css"/>
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300&display=swap" rel="stylesheet">
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">


    </head>
    <body>
        <div class="container">
            <div class="d-flex justify-content-center h-100">
                <div class="card">
                    <div class="card-header">
                        <h1>Sign In</h1>  
                        <div class="d-flex justify-content-end social_icon">
                            <a href="https://github.com/"> <span><i class="fa-brands fa-square-github"></i></i></i></span></a>
                             <a href="https://www.google.com/"><span><i class="fab fa-google-plus-square"></i></span></a>
                             <a href="https://github.com/Ranger-HK?tab=repositories"><span><i class="fab fa-twitter-square"></i></span></a>
                        </div>
                    </div>
                    <div class="card-body">

                        <form>
                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-user"></i></span>
                                </div>
                                <input type="text" class="form-control" placeholder="username">

                            </div>

                            <div class="input-group form-group">
                                <div class="input-group-prepend">
                                    <span class="input-group-text"><i class="fas fa-key"></i></span>
                                </div>
                                <input type="password" class="form-control" placeholder="password">
                            </div>

                            <div class="row align-items-center remember">
                                <input type="checkbox">Remember Me
                            </div>
                            <div class="form-group">
                                <a href="Home.jsp"><input type="button" value="Login" class="btn float-right login_btn"></a> 

                            </div>
                        </form>
                    </div> 

                    <div class="card-footer">
                        <div class="d-flex justify-content-center links">
                            If You Don't Have An Account?<a href="Registration.jsp">Register</a>
                        </div>
                        <div class="rights">
                            <small>Created By Ravindu Prathibha</small>

                        </div>

                        <div class="lines">
                            <hr>
                        </div>


                    </div>
                </div>
            </div>


        </div>  
        <script src="assets/jQuery/jquery-3.6.0.min.js"></script>
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="controller/LoginController.js"></script>
    </body>
</html>

