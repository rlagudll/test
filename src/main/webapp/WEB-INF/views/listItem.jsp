<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Shopping List!</title>
</head>
<body>
	<table border="1" align="center" style="width: 250; text-align: center; ">
	<c:forEach items="${listItem }" var="item">
		<tr>
			<td>${item.itemId }</td>
			<td><a href="detailItem.shop?itemId=${item.itemId }">${item.itemName }</a></td>
			<td>${item.price }</td>
		</tr>
	</c:forEach>
	</table>
</body>
</html>
