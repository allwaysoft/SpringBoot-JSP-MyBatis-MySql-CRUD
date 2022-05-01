<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>


        <table border="1">
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>CreateDate</th>
            </tr>
            <c:forEach var="post" items="${posts}">
                <tr>
                    <td>${post.id}</td>
                    <td><a href="/post/${post.id}">${post.title}</a></td>
                    <td>${post.createDate}</td>
                </tr>
            </c:forEach>

        </table>

        <a href="/post/writeForm">Add</a>

    </body>
</html>