<%@page import="java.text.SimpleDateFormat"%>
<%@page import="simpleboard.data.SimpleBoardDto"%>
<%@page import="java.util.List"%>
<%@page import="simpleboard.data.SimpleBoardDao"%>
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
<%
	//dao 선언
	SimpleBoardDao dao=new SimpleBoardDao();
	//전체 데이타 가져오기
	List<SimpleBoardDto> list=dao.getAllList();
	//날짜 형식
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy.MM.dd.");
%>
<body>
<div style="margin: 30px 50px;">
	<button type="button" class="btn btn-success btn-sm"
	onclick="location.href='boardform.jsp'">글쓰기</button>
	<br>
	<h5><b>총 <%=list.size() %>개의 게시글이 있습니다</b></h5>
	<br>
	<table class="table table-striped" style="width:600px;">
		<thead>
			<tr>
				<th width="50">번호</th>
				<th width="300">제목</th>
				<th width="80">작성자</th>
				<th width="100">작성일</th>
				<th width="70">조회</th>				
			</tr>
		</thead>
		<tbody>
		<%
		if(list.size()==0){%>
			<tr height="50">
				<td colspan="5" align="center">
					<h5>등록된 글이 없습니다</h5>
				</td>
			</tr>
		<%}else{
			
		}
		%>
		</tbody>
	</table>
</div>
</body>
</html>
















