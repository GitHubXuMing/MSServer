<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息详情页</title>
</head>
<body>
	<h3>更新用户信息</h3>
	<form action="${pageContext.request.contextPath}/UserUpdateServlet" 
	method="post" onsubmit="return confirm('确认更新信息吗?')">
	<table>
		<tr>
			<td>用户编号</td>
			<td>${userFromServer.id}
			<input type="hidden" value="${userFromServer.id}" name="id"/>
			</td>
		</tr>
		<tr>
			<td>用户名</td>
			<td><input type="text" value="${userFromServer.username}" name="username"/></td>
		</tr>
		<tr>
			<td>密码</td>
			<td><input type="password" value="${userFromServer.password}" name="password"/></td>
		</tr>
		<tr>
			<td>余额</td>
			<td><input type="text" value="${userFromServer.sal}" name="sal"/></td>
		</tr>
		<tr>
			<td><input type="submit" value="更新"></td>
			<td><input type="reset" value="重置"></td>
		</tr>
	</table>
	</form>
</body>
</html>