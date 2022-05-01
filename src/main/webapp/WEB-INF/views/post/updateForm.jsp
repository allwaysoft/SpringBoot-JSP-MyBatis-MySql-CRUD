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

        <form action="/post/update" method="POST">
            <input type="hidden" name="id" value="${post.id}">
            <input type="text" value="${post.title}" name="title" placeholder="title"/><br/>
            <textarea rows="5" cols="20" name="content">${post.content}</textarea><br/>
            <input type="submit" value="Update"/>
        </form>

    </body>
</html>