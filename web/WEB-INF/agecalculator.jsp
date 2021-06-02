<%-- 
    Document   : agecalculator
    Created on : Jun 2, 2021, 12:24:24 AM
    Author     : 839217
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AGE CALCULATOR</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age"> 
            <label>Enter your age: </label>
            <input type="text" name="enteredAge">
            <br />
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <p>${result}</p>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>
