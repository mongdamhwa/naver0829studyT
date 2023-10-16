<%@page import="java.text.SimpleDateFormat"%>
<%@page import="myshop.data.MyShopDto"%>
<%@page import="java.util.List"%>
<%@page import="myshop.data.MyShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
</style>
</head>
<body>
<%
	//dao 선언
	MyShopDao dao=new MyShopDao();
	//list 가져오기
	List<MyShopDto> list=dao.getAllSangpums();
	//날짜 출력하기 위한 형식
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH시");
%>
<h5 class="alert alert-danger">총 <%=list.size()%>개의 상품이 있습니다</h5>
</body>
</html>















