<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
    href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
<script
    src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<title>Mortgage Calculator</title>
</head>
<body>
<h1>Simple Mortgage Calculator</h1>
    <form action="CalculatorServlet" method="post">
        <p>
            <label for="Principal">Enter Principal (Amount in $):</label>
                <input id="Principal" name="Principal" value="${param.Principal}"><br>
                <label for="AnnualIR">Enter Annual Interest Rate (APR):</label>
                <input type="number" min="1" max= "50" step="0.5" id="AnnualIR" name="AnnualIR" value="${param.AnnualIR}"><br>
                <label for="years">Enter No. of Years (Term):</label>
                <input type="number" min="1" max= "50" step="1" id="years" name="years" value="${param.years}"><br>
                <input type="hidden" name="click" value="1">
               
                <input type="submit" class="btn btn-default">
        </p>
    </form>
    <h1>Total amount</h1>
    <p>
    <label for="total amount">total amount (in $):</label>
    $${res}
    <p>
</body>
</html>