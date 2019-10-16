
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <title></title>
</head>
<body>
    <form action="doUpdate">
        <table>
            <tr>
                <td>id</td>
                <td><input type="text" name="id" readonly value="${employee.id}"></td>
            </tr>
            <tr>
                <td>姓名</td>
                <td><input type="text" name="xm" value="${employee.xm}"></td>
            </tr>
            <tr>
                <td>性别</td>
                <td><c:choose>
                        <c:when test="${employee.xb==1}">
                            <input type="radio" name="xb" value="1" checked>男
                            <input type="radio" name="xb" value="2">女

                        </c:when>
                    <c:otherwise>
                        <input type="radio" name="xb" value="1" >男
                        <input type="radio" name="xb" value="2" checked> 女

                    </c:otherwise>
                    </c:choose>
                </td>
            </tr>
            <tr>
                <td>年龄</td>
                <td><input type="text" name="nl" value="${employee.nl}"></td>
            </tr>
            <tr>
                <td>出生日期</td>
                <td><input type="date" name="csrq" value="<fmt:formatDate value="${employee.csrq}" pattern="yyyy-MM-dd"/>"></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="提交"> </td>

            </tr>
        </table>
    </form>
</body>
</html>
