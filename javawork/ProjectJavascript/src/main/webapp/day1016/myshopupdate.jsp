<%@page import="myshop.data.MyShopDto"%>
<%@page import="myshop.data.MyShopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글 엔코딩
	request.setCharacterEncoding("utf-8");

	//dao,dto 선언
	MyShopDao dao=new MyShopDao();
	MyShopDto dto=new MyShopDto();
	
	//입력값을 읽어서 dto 에 담기
	int num=Integer.parseInt(request.getParameter("num"));
	String sangpum=request.getParameter("sangpum");
	String color=request.getParameter("color");
	String photo=request.getParameter("photo");
	int price=Integer.parseInt(request.getParameter("price"));
	
	dto.setNum(num);
	dto.setSangpum(sangpum);
	dto.setColor(color);
	dto.setPhoto(photo);
	dto.setPrice(price);
	
	//update 메서드 호출(db저장)
	dao.updateShop(dto);
	
	//상세 페이지로 이동(redirect)
	response.sendRedirect("myshopdetail.jsp?num="+num);
%>














