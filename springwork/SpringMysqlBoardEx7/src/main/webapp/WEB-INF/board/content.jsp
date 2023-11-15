<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Jua&family=Lobster&family=Nanum+Pen+Script&family=Permanent+Marker&family=Single+Day&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<style>
   body * {
       font-family: 'Jua';
   }
  
   .day{
   		color: gray;
   		font-size: 0.8em;
   		float: right;
   }
</style>
</head>
<body>
<div style="margin: 30px;width:500px;">
	<h3><b>${dto.subject}</b></h3>
	<div style="width:500px;">
		<span>${dto.writer}</span>
		<span class="day">
			조회 ${dto.readcount}&nbsp;&nbsp;&nbsp;
			<fmt:formatDate value="${dto.writeday}" pattern="yyyy-MM-dd HH:mm"/>
		</span>
		<hr>
		<pre>${dto.content}</pre>
		<c:if test="${dto.photo!='no'}">
			<br><br>
			<img src="../upload/${dto.photo}" style="max-width: 400px;">
		</c:if>
		<br><br>
		<button type="button" class="btn btn-outline-info btn-sm"
		style="width:80px" onclick="location.href='./writeform'">글쓰기</button>
		
		<button type="button" class="btn btn-outline-info btn-sm"
		style="width:80px" onclick="location.href='./list'">목록</button>
		
		<button type="button" class="btn btn-outline-info btn-sm"
		style="width:80px" onclick="location.href='./updateform?num=${dto.num}'">수정</button>
		
		<button type="button" class="btn btn-outline-info btn-sm"
		style="width:80px" onclick="location.href='./delete?num=${dto.num}'">삭제</button>
	</div>
</div>

</body>
</html>



















