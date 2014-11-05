<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
<title>Detail Item</title>
</head>
<body>
	<table border="1" align="center" style="width: 250; text-align: center; ">
		<tr>
			<td>Id</td>
			<td>${detailItem.itemId }</td>
		</tr>
		<tr>
			<td>Name</td>
			<td>${detailItem.itemName }</td>
		</tr>
		<tr>
			<td>Price</td>
			<td>${detailItem.price }</td>
		</tr>
		<tr>
			<td>Description</td>
			<td>${detailItem.description }</td>
		</tr>
		<tr>
			<td>PictureUrl</td>
			<td>${detailItem.pictureUrl }</td>
		</tr>
		<tr>
			<td colspan="2">
				<a href="orderItems.shop?itemId=${detailItem.itemId }">주문하기</a>
			</td>
		</tr>
	</table>
</body>
</html>