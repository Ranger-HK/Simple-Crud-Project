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


$("#btnUpdate").click(function () {
    updateUser();
    console.log("Giya");
});

function updateUser() {

    /*create json ob*/
    var userOb = {
        userID: $("#txtUserId").val(),
        userName: $("#txtUserName").val(),
        address: $("#txtUserAddress").val(),
        email: $("#txtEmail").val(),
        contact: $("#txtContact").val(),
        password: $("#txtPassword").val()
    };
    console.log(userOb);


    /*implement ajax request for updateUser Function*/
    $.ajax({
        url: "http://localhost:8080/Simple_Crud_Project/Registration",
        method: "PUT",
        contentType: "application/json", //request content type json
        data: JSON.stringify(userOb), //convert valid json String
        success: function (res) {
            /*console.log(res);*/
            if (res.status == 200) {
                alert(res.message);
                loadAllUsers();
            } else if (res.status == 400) {
                alert(res.message);

            } else {
                alert(res.data);
            }

        },
        error: function (ob, error) {
            console.log(ob);
        }
    });
}






$("#btnDelete").click(function () {
    // console.log("Awa data");
    let userID = $("#txtUserId").val();

    $.ajax({
        url: "http://localhost:8080/Simple_Crud_Project/Registration?userID=" + userID,
        method: "DELETE",
        success: function (resp) {
            if (resp.status == 200) {
                alert("Successfully deleted the User");
//                swal("Good job!", "Successfully deleted the customer!", "success");
                loadAllUsers();
//                clearAll();
            } else {
//                swal("Error request!", "Fail to delete the customer!", "error");
                alert("Can't delete the User");
            }
        }
    });
});

//
//function clearAll() {
//    $("#txtUserId").val("");
//    $("#txtUserName").val("");
//    $("#txtUserAddress").val("");
//    $("#txtEmail").val("");
//    $("#txtContact").val("");
//    $("#txtPassword").val("");
//}