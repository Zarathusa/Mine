<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>阳泉矿区瓦斯差异化防控项目管理系统</title>
    <link rel="stylesheet" href="${path}/boot/css/bootstrap.min.css">
    <link rel="stylesheet" href="${path}/boot/css/back.css">
    <link rel="stylesheet" href="${path}/boot/css/bootstrapValidator.min.css">
    <script src="${path}/boot/js/jquery-3.3.1.min.js"></script>
    <script src="${path}/boot/js/bootstrap.min.js"></script>
    <script src="${path}/boot/js/bootstrapValidator.min.js"></script>
</head>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!--导航标题-->
        <div class="navbar-header ">
            <a href="javascript:location.reload(true);" class="navbar-brand"><strong>阳泉矿区瓦斯差异化防控项目管理系统 </strong></a>
        </div>
        <!--导航内容-->
        <ul class="nav navbar-nav navbar-right">
            <li><a >欢迎: <span class="text-primary">小黑 </span></a></li>
            <li><a href="#">退出登录 <span class="glyphicon glyphicon-log-out"></span></a></li>
        </ul>
        <form action="" method="post" class="navbar-form navbar-right" >
			  <div class="form-group">
			    <input type="text" name="projectName" class="form-control" placeholder="请输入项目名">
			  </div>
			  <input type="submit" class="btn btn-default" value="搜索">
		</form>
    </div>
</nav>
<!-- 导航结束 -->
