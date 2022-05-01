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
        Title: ${post.title} <br/>
        UserId: ${post.userId} <br/>
        Content: ${post.content} <br/>
        CreateDate: ${post.createDate}
        <br/>
        <a href="/post/updateForm/${post.id}">Update</a><br/>
        <a href="/post/delete/${post.id}">Delete</a>
    </body>
</html>