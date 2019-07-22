<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="regist" method="post">
<h3>상품 등록</h3>
<input type="radio" value="keyboard" name="type">키보드
<input type="radio" value="mouse" name="type">마우스
<br><br>
<input type="text" placeholder="상품 이름 입력" name="name"><br><br>
<input type="text" placeholder="상품 가격 입력" name="price"><br><br>
<input type="submit" value="등록">
</form>