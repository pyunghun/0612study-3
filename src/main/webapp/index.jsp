<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <h1 style="text-align: center">session</h1>
    <form action="session" method="post">
        <label>firstName : </label>
        <input type="text" name="firstName">
        <br>
        <label>lastName : </label>
        <input type="text" name="lastName">
        <br>
        <input type="submit" value="전송">
    </form>
    <br>
    <a href="delete">세션의 데이터 지우기</a>
</body>
</html>