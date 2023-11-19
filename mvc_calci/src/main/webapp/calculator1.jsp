 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
display:flex;
align-item:center;
 }
</style>
</head>
<body>
<form>
<fieldset>
<legend>calculator</legend>
<table>
<tr>
<td colspan="2"><input type="number" name="x"></td>
<td colspan="2"><input type="number" name="y"></td>
</tr>
<tr>
<td colspan="4"><input type="number" name="z"></td>
</tr>
<td><button formaction="add1">+</button></td>
<td><button formaction="sub1">-</button></td>
<td><button formaction="mul1">*</button></td>
<td><button formaction="sub1">+/</button></td>
<tr>
</table>
</fieldset>
</form>
</body>
</html>