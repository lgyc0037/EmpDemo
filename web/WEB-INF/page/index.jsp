<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
  <head>
    <title></title>
  </head>
  <body>
     <table border="1" align="center">
       <tr>
         <td>id</td>
         <td>姓名</td>
         <td>性别</td>
         <td>年龄</td>
         <td>出生日期</td>
         <td>删除</td>
         <td>修改</td>
         <td><a href="toAdd">添加</a></td>
       </tr>
       <c:forEach items="${eployeeAll}" var="eployee">
         <tr>
           <td>${eployee.id}</td>
           <td>${eployee.xm}</td>

           <td><c:if test="${eployee.xb==1}">男</c:if>
             <c:if test="${eployee.xb==2}">女</c:if>
            </td>

           <td>${eployee.nl}</td>
           <td><fmt:formatDate value="${eployee.csrq}" pattern="yyyy-MM-dd"/></td>
           <td> <a href="doDelete?id=${eployee.id}">删除</a> </td>
           <td><a href="toUpdate?id=${eployee.id}">修改</a></td>
         </tr>

       </c:forEach>
     </table>
  </body>
</html>
