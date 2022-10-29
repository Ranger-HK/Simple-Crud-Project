/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$("#btnSave").click(function (){
    //console.log("Hello"); 
    registrationUser();
});

function registrationUser(){
    let userID = $("#txtuserID").val();
    let userName = $("#txtuserName").val();
    let address = $("#txtaddress").val();
    let email = $("#txtemail").val();
    let contact = $("#txtcontact").val();
    let password = $("#txtpassword").val();
    //console.log(userID+" "+userName+" "+address+" "+email+" "+contact+" "+password);
    user = {
        userID: userID,
        userName: userName,
        address: address,
        email: email,
        contact: contact,
        password: password
    };
    
    //var data = $("#registerForm").serialize(); //get information txtFields using form data
    /*console.log(data);*/
    /*----------------------ajax for saveCustomer function---------------------------*/
    $.ajax({
       url: "http://localhost:8084/Simple_Crud_Project/Registration",
       method: "POST",
       data:JSON.stringify(user), //if we send data with the request
       success:function (res){
           if (res.status==200){
               alert(res.message);
                console.log("Hello Sir");
               //loadAllCustomers();
           }else {
               alert(res.data);
           }
           /*console.log(res.message);*/
       },
        error:function (ob,textStatus, error){
           alert(textStatus);
        }
    });
}