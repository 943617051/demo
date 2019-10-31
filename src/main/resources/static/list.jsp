<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/jquery-1.7.js"></script>
</head>
<script type="text/javascript">
function goPage(page)
{
	location.href="list?page="+page;
	}
	function xiu(id)
	{
		location.href="xiu?id="+id;
	}
	function del(id)
	{
		location.href="del?id="+id;
	}
</script>
<body>
<a href="add.jsp">添加</a>
<table>
<tr>
<td>团购标题</td>
<td>团购价格</td>
<td>开始时间</td>
<td>结束时间</td>
<td>已参团</td>
<td>参团库存</td>
<td>折扣</td>
</tr>

<c:forEach items="${list}" var="a">
<tr>
<td>${a.content}</td>
<td>${a.price}</td>
<td>${a.kt}</td>
<td>${a.jt}</td>
<td>${a.zt}</td>
<td>${a.count}</td>
<td>${a.zk}</td>
<td><button onclick="xiu(${a.id})">修改</button></td>
<td><button onclick="del(${a.id})">删除</button></td>
</tr>
</c:forEach>

</table>
当前${pageUtil.curPage}页,共${pageUtil.lastPage}页,共${pageUtil.count}条记录
<input type="button" value="首页" onclick="goPage(1)">
<input type="button" value="上一页" onclick="goPage(${pageUtil.prevPage})">
<input type="button" value="下一页" onclick="goPage(${pageUtil.nextPage})">
<input type="button" value="尾页" onclick="goPage(${pageUtil.lastPage})">
</body>
</html>