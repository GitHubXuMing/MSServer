<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>用户信息页面</title>
</head>
<body>
<h3>欢迎 ${sessionScope.current_user}</h3>

<form action="${pageContext.request.contextPath }/DynamicSearchServlet" method="post">
	编号:<input type="text" name="id" placeholder="根据编号精确查询"/>
   	 用户名：<input type="text" value="a" name="username" placeholder="根据姓名模糊查询"/>
   	余额范围：<input type="number" value="10000" name="minSal"/>--<input type="number" value="50000" name="maxSal"/>
    <input type="submit" value="查询"/>	
</form>
<br/>
<a href="${pageContext.request.contextPath}/RouterServlet?uri=user-newUser">新增一个用户</a>
<br/>
<br/>
<table>
	<tr>
		<td>编号</td>
		<td>用户名</td>
		<td>密码</td>
		<td>余额</td>
		<td>操作</td>		
	</tr>
	<c:forEach items="${userListFromServer}" var="user">
	<tr>
		<td>${user.id }</td>
		<td>${user.username }</td>
		<td>${user.password }</td>
		<td>${user.sal }</td>
		<td>
			<a href="${pageContext.request.contextPath }/UserDeleteServlet?userid=${user.id}" 
			onclick="return confirm('确认删除吗?')">删除</a>
			&nbsp;&nbsp;&nbsp;
			<a href="${pageContext.request.contextPath }/UserFindByIdServlet?userid=${user.id}">更新</a>
		</td>
	</tr>
	</c:forEach>
</table>
</body>
</html>