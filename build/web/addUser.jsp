<%-- 
    Document   : addUser
    Created on : Apr 26, 2020, 10:24:01 PM
    Author     : Chamalki Madushika
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create User Account</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <%@include file="navigationBar.jsp" %>
    </head>
    <body>
        <form action="addUser" method="GET">
            <div style="position: absolute; left: 35%; top: 12%; width: 30%; height: 80%; background-color: #cccccc">
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 17%; width: 20%; height: 15px">
                <h4>CREATE USER ACCOUNT</h4>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 25%; width: 20%; height: 15px">
                <input type="text" class="form-control" id="usr" name="usr" placeholder="User Name" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 33%; width: 20%; height: 15px">
                <input type="text" class="form-control" id="email" name="email" placeholder="Email" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 41%; width: 20%; height: 15px">
                <input type="password" class="form-control" id="pwd" name="pwd" placeholder="Password" required>
            </div>
            <div class="form-group" style="position: absolute; left: 40%; top: 47%; width: 20%; height: 15px">
                <h6>Use 8 or more characters with a mix of letters, numbers & symbols</h6>
            </div>

            <!-- Default unchecked -->
            <div class="custom-control custom-checkbox" style="position: absolute; left: 40%; top: 56%; width: 50px; height: 10px">
                <input type="checkbox" class="custom-control-input" id="defaultUnchecked">

            </div>
            <div style="position: absolute; left: 41%; top: 55%; width: 17%; height: 30px">
                <label for="defaultUnchecked"><h6>To create a User Account, you’ll need to agree to the Terms of Service.</h6></label>
            </div>

            <div class="form-group" style="position: absolute; left: 40%; top: 66%; width: 20%; height: 15px">
                <input type="submit" class="btn btn-info" value="Create Account">
            </div>



        </form>
    </body>
</html>
