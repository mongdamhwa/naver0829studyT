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
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.0/font/bootstrap-icons.css">

<style>
   body * {
       font-family: 'Jua';
   }
   
   .memoform{
   		position: absolute;
   		top:150px;
   		left:50px;
   }
   
   .memolist{
   		position: absolute;
   		top:150px;
   		left:400px;
   }
   
   .photo{
   		width:120px;
		height: 120px;
		border: 1px solid gray;
		border-radius:30px;
		box-shadow: 5px 5px 5px gray;
   }
   
   .cameraupload{
   		font-size: 30px;
   		cursor: pointer;
   }
</style>
<script type="text/javascript">
	$(function(){
		$(".cameraupload").click(function(){
			$("#upload").trigger("click");
		});
	});
</script>
</head>
<body>
<h3 class="alert alert-success">간단한 메모를 남겨봅시다</h3>
<div class="memoform">
	<i class="bi bi-camera-fill cameraupload"></i>
	<input type="file" name="upload" id="upload" style="display: none;">
	<br>
	<img src="../res/upload/noimage.png" class="photo">
</div>

<div class="memolist">
	memo list
</div>
</body>
</html>
















