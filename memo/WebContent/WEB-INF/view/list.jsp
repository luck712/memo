<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="mdto" items="${list}">
<h3>
${mdto.when},
</h3>
<h3>
${mdto.content }</h3>
</c:forEach>