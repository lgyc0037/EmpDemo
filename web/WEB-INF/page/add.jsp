<%--
  Created by IntelliJ IDEA.
  User: 27566
  Date: 2019/10/16
  Time: 14:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="doAdd">
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="xm"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><input type="radio" name="xb" value="1">男
                    <input type="radio" name="xb" value="2">女</td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="nl"></td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="date" name="csrq"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"> </td>

            </tr>
        </table>
    </form>
</body>
</html>
