/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


$("#btnSave").click(function () {
    //console.log("Hello"); 
    registrationUser();
});

function registrationUser() {
    let userID = $("#txtuserID").val();
    let userName = $("#txtuserName").val();
    let address = $("#txtaddress").val();
    let email = $("#txtemail").val();
    let contact = $("#txtcontact").val();
    let password = $("#txtpassword").val();

    user = {
        userID: userID,
        userName: userName,
        address: address,
        email: email,
        contact: contact,
        password: password
    };



    /*----------------------ajax for saveCustomer function---------------------------*/
    $.ajax({
        url: "http://localhost:8080/Simple_Crud_Project/Registration",
        method: "POST",
        data: JSON.stringify(user),
        success: function (res) {
            if (res.status == 200) {
                swal("Operation success!", "You clicked the button!", "success");

//                alert(res.message);
//                swal("Operation success!", "You clicked the button!", "success");

            } else {
                swal("Operation failed!", "You clicked the button!", "error");

//                alert(res.data);
//                swal("Operation failed!", "You clicked the button!", "error");

            }

        },
        error: function (ob, textStatus, error) {
            alert(textStatus);
        }
    });
}









//
//
/////* global CryptoJS */
//$("#btnSave").click(function () {
//    //console.log("Hello"); 
//    registrationUser();
//});
//
//function registrationUser() {
//    let userID = $("#txtuserID").val();
//    let userName = $("#txtuserName").val();
//    let address = $("#txtaddress").val();
//    let email = $("#txtemail").val();
//    let contact = $("#txtcontact").val();
//    let password = $("#txtpassword").val();
//
//   
//    var cipher = CryptoJS.AES.encrypt(password, "CIPHERKEY").toString();
//    
//    var user = {
//        userID: userID,
//        userName: userName,
//        address: address,
//        email: email,
//        contact: contact,
//        password: cipher
//    };
//
// console.log(user.password);
//    /*----------------------ajax for saveCustomer function---------------------------*/
//    $.ajax({
//        url: "http://localhost:8080/Simple_Crud_Project/Registration",
//        method: "POST",
//        data: JSON.stringify(user),
//        success: function (res) {
//            if (res.status == 200) {
//                alert(res.message);
//
//            } else {
//                alert(res.data);
//            }
//
//        },
//        error: function (ob, textStatus, error) {
//            alert(textStatus);
//        }
//    });
//}




