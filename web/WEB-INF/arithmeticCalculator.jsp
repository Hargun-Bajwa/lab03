<%-- 
    Document   : arithmeticCalculator
    Created on : Jun 2, 2021, 1:26:52 AM
    Author     : 839217
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First: </label>
            <input type="text" name="firstNumber">
            <br />
            <label>Second: </label>
            <input type="text" name="secondNumber">
            <br />
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        
        <p>Result: ${result}</p>
        <a href="age">Age calculator</a>
        
</html>
