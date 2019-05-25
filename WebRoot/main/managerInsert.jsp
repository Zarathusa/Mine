<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<jsp:include page="./head.jsp"/>

<body>
<script type="text/javascript">
	$(function(){
		$("#back").click(function(){
			window.location.href="${path}/mineInfo/showAll";
		});
	});
</script>
<div class="container-fluid">
<div class="row">
<div class="col-sm-12">
	<div class="page-header">
  		<h4>&nbsp;&nbsp;管理体系
  			<button type="button" id="back" class="btn btn-primary pull-right">返回首页</button>
  		</h4>
	</div>
</div>
</div>

</div>
</body>