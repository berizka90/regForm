<%@ page import="aplication.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Iruna
  Date: 21.07.2018
  Time: 17:02
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>Регістраційна форма</title>
</head>
<body>
<h2>Всі користувачі<br></h2>
//видає HTTP Status 500 – Internal Server Error
<%--<c:forEach var="user" items="${requestScope.users}">--%>
    <%--<ul>--%>
        <%--<li>Ім'я: <c:out value="${user.firstName}"></c:out> </li>--%>
    <%--</ul>--%>
<%--</c:forEach>--%>

<h2>Додати нового користувача<br></h2>
<form method="post" action="">
    <table>
        <tr>
            <td>Ім'я:</td>
            <td><input type="text" name="firstName"><br></td>
        </tr>
        <tr>
            <td>Прізвище: </td>
            <td><input type="text" name="lastName"><br></td>
        </tr>
        <tr>
            <td>По батькові: </td>
            <td><input type="text" name="patronimic"><br></td>
        </tr>
        <tr>
            <td>Логин: </td>
            <td><input type="text" name="login"><br></td>
        </tr>
        <tr>
            <td>посада: </td>

        <tr><td><input type="radio" name="group" value="верстальщик">верстальщик<br></td></tr>
        <tr> <td><input type="radio" name="group" value="тестувальник">тестувальник<br></td></tr>
        <tr> <td><input type="radio" name="group" value="програміст">програміст<br></td></tr>
        <tr> <td><input type="radio" name="group" value="бізнес-аналітик">бізнес-аналітик<br></td></tr>
        </tr>
        <tr>
            <td>домашній тел.: </td>
            <td><input type="text" name="homePhone"><br></td>
        </tr>
        <tr>
            <td>мобільний тел.: </td>
            <td><input type="text" name="mobilePhone"><br></td>
        </tr>
        <tr>
            <td>додатковий тел.: </td>
            <td><input type="text" name="addPhone"><br></td>
        </tr>
        <tr>
            <td>скайп : </td>
            <td><input type="text" name="skype"><br></td>
        </tr>
        <tr>
            <td>Е-мейл: </td>
            <td><input type="text" name="eMail"><br></td>
        </tr>
        <tr>
            <td>місто: </td>
            <td><input type="text" name="city"><br></td>
        </tr>
        <tr>
            <td>поштовий індекс: </td>
            <td><input type="text" name="postIndex"><br></td>
        </tr>
        <tr>
            <td>вулиця: </td>
            <td><input type="text" name="street"><br></td>
        </tr>
        <tr>
            <td>номер будинку: </td>
            <td><input type="text" name="houseNumber"><br></td>
        </tr>
        <tr>
            <td>номер квартири: </td>
            <td><input type="text" name="apartmentNumber"><br></td>
        </tr>
        <tr>
            <td>коментар: </td>
            <td><input type="text" name="comment"><br></td>
        </tr>
        <tr>
            <td align="right" colspan="2">
                <input type="submit" value="Відправити">
            </td>
        </tr>


    </table>
</form>
</body>
</html>

