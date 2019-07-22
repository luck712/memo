<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:forEach var="itemDto" items="${list}">
<a href="#"> <img src="img/keyboard.jpg">${itemDto.name}</a>
<br>

<a href="#"> <img src="img/mouse.jpg">${itemDto.price}</a>

</c:forEach>