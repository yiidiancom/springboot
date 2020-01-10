<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>一点教程网-用户列表展示</title>
</head>
<body>

<h3>用户列表展示</h3>
		<table border="1">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>年龄</th>
			</tr>
			<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.id}</td>
				<td>${user.name}</td>
				<td>${user.age}</td>
			</tr>
			</c:forEach>
		</table>
</body>
</html>