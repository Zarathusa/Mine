<%@page pageEncoding="UTF-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	pageContext.setAttribute("path", request.getContextPath());
%>
<jsp:include page="./head.jsp"/>
<body>
<div class="container-fluid">
	<script type="text/javascript">
	$(function(){
		/* 增加项目的模态框 */
    	$("#addProject").click(function(){
    		$("#addModal").modal('show');
    	});
    	
    	
    	/* 表单验证 */
    	$("#addProjectForm").bootstrapValidator({
    		message: 'This value is not valid',
            feedbackIcons: {
             	valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
           	},
           	fields:{
           		projectName:{
                    validators: {
                        notEmpty: {
                            message: '项目名不能为空'
                        }
                    }
           		},
           		mineName:{
                    validators: {
                        notEmpty: {
                            message: '矿井名称不能为空'
                        }
                    }
           		}
           	}
    	});
	});
</script>
<div class="row">
<div class="col-sm-12">
	<div class="page-header">
  		<h4>&nbsp;&nbsp;项目展示 
  			<button type="button" id="addProject" class="btn btn-primary pull-right">增加项目</button>
  		</h4>
	</div>
</div>
</div>
<!-- 项目展示 -->
<div class="row">
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">项目名称</div>
			<div class="panel-body">
				<abbr title="点击显示项目报告">
					<a href="#">项目1</a>
				</abbr>
			</div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">矿井名称</div>
			<div class="panel-body">阳泉矿井</div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">技术特征</div>
			<div class="panel-body"><a href="javascript:void(0);" id="addTech">点击开始录入</a></div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">管理体系</div>
			<div class="panel-body"><a href="javascript:void(0);" id="addManage">点击开始录入</a></div>
		</div>
	</div>
</div>
<hr/>

<div class="row">
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">项目名称</div>
			<div class="panel-body">
				<abbr title="点击显示项目报告">
					<a href="#">项目1</a>
				</abbr>
			</div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">矿井名称</div>
			<div class="panel-body">阳泉矿井</div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">技术特征</div>
			<div class="panel-body"><a href="javascript:void(0);" id="addTech">点击开始录入</a></div>
		</div>
	</div>
	<div class="col-sm-3">
		<div class="panel panel-info">
			<div class="panel-heading">管理体系</div>
			<div class="panel-body"><a href="javascript:void(0);" id="addManage">点击开始录入</a></div>
		</div>
	</div>
</div>
<hr/>


<div class="row">
<div class="pull-right">
	<ul class="pagination ">
    <li class="disabled">
      <a href="#" >
        <span >&laquo;</span>
      </a>
    </li>
    <li class="active"><a href="#">1</a></li>
    <li><a href="#">2</a></li>
    <li><a href="#">3</a></li>
    <li><a href="#">4</a></li>
    <li><a href="#">5</a></li>
    <li>
      <a href="#" >
        <span >&raquo;</span>
      </a>
    </li>
  </ul>
</div>


</div>


<!-- 增加项目模态框 -->
<div class="modal fade" id="addModal" tabindex="-1">
	<div class="modal-dialog">
		<div class="modal-content">
			<!--模态框标题-->
			<form class="form-horizontal" id="addProjectForm">
			<div class="modal-header">
				<!--
用来关闭模态框的属性:data-dismiss="modal"
-->
				<button type="button" class="close" data-dismiss="modal">
					<span>&times; </span>
				</button>
				<h4 class="modal-title">项目信息</h4>
			</div>
			<!--模态框内容体-->
			<div class="modal-body">
					<div class="form-group">
						<label class="col-sm-2 control-label">项目名称</label>
						<div class="col-sm-10">
							<input type="text" name="projectName" id="projectName" placeholder="请输入项目名"
								class="form-control">
						</div>
					</div>
					<div class="form-group">
						<label class="col-sm-2 control-label">矿井名称</label>
						<div class="col-sm-10">
							<input type="text" name="mineName" id="mineName" placeholder="请输入矿井名"
								class="form-control">
						</div>
					</div>
				
			</div>
			<!--模态页脚-->
			<div class="modal-footer">
				<button type="submit" name="submit" id="saveProject" class="btn btn-primary">保存</button>
				<button type="button" class="btn btn-danger" data-dismiss="modal">取消
				</button>
			</div>
			</form>
		</div>
	</div>
</div>
</div>

</body>