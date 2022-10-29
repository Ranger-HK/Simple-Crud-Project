/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */
$("#btnLog").click(function (){
//   console.log("Hello"); 
    var userName = $("#userName").val();
    var password = $("#password").val();
    
//    console.log(userName+" :"+password);

//invoked ajax
    $.ajax({
        url: 'http://localhost:8084/Simple_Crud_Project/Login',
        method: 'GET',
        async: true,
        data: {"userName":userName,"password":password},
        dataType: json,
        success: function (response, textState, xhr){
            console.log(response);
            
        }
    });
});