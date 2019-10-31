<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="hidden" name="id" value="${s.id}">
团购标题<input type="text" name="content" value="${s.content}"><br>
团购时间<input type="text" name="price" value="${s.price}"><br>
开始时间<input type="text" name="kt" value="${s.kt}"><br>
结束时间<input type="text" name="jt" value="${s.jt}"><br>
状态<input type="text" name="zt" value="${s.zt}"><br>
团购库存<input type="text" name="count" value="${s.count}"><br>
折扣<input type="text" name="zk" value="${s.zk}"><br>
<input type="submit" value="提交">
</form>
</body>
</html>