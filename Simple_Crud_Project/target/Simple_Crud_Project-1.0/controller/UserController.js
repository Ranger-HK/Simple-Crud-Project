/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */

loadAllUsers();
function loadAllUsers() {

    /*invoked ajax for send a request*/
    $("#userTable").empty();
    $.ajax({
        url: "http://localhost:8080/Simple_Crud_Project/Registration",
        method: "GET",
        //convert to json format
        dataType: "json",
        success: function (res) {
            for (const user of res) {
                /*console.log(user.userID);*/
                let row = `<tr><td>${user.userID}</td><td>${user.userName}</td><td>${user.address}</td><td>${user.email}</td><td>${user.contact}</td><td>${user.password}</td></tr>`;
                $("#userTable").append(row);
            }
        }
    });
}

$("#userTable > tr").click(function() {
        /*console.log("row clicked");
        console.log(this);*/
        //console.log($(this));
        var userID = $(this).children(":eq(0)").text();
        var userName = $(this).children(":eq(1)").text();
        var address = $(this).children(":eq(2)").text();
        var email = $(this).children(":eq(3)").text();
        var contact = $(this).children(":eq(4)").text();
        var password = $(this).children(":eq(5)").text();

        //console.log(userID, userName, address, email);

        /*set user details for the textFields*/
        $("#txtUserID").val(userID);
        $("#txtUserName").val(userName);
        $("#txtAddress").val(address);
        $("#txtEmail").val(email);
        $("#txtContact").val(contact);
        $("#txtPassword").val(password);
});

function updateUser() {

        /*create json ob*/
        var userOb={
            userID:$("#txtUserID").val(),
            userName:$("#txtUserName").val(),
            address:$("#txtAddress").val(),
            email:$("#txtEmail").val(),
            contact:$("#txtContact").val(),
            password:$("#txtPassword").val()
        };

       /*let serialize = $("#userForm").serialize();*/
       /*implement ajax request for updateUser Function*/
        $.ajax({
          url:"http://localhost:8080/Simple_Crud_Project/Registration",
          method:"PUT",
          contentType:"application/json", //request content type json
          data:JSON.stringify(userOb) , //convert valid json String
          success:function (res){
              /*console.log(res);*/
              if (res.status==200){
                  alert(res.message);
                  loadAllUsers();
              }else if (res.status==400){
                  alert(res.message);

              }else {
                  alert(res.data);
              }
              /*alert(res);
              loadAllUsers();*/
          },
          error:function (ob, error) {
              console.log(ob);
          }
       });
    }