<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="仓库添加">
	<!DOCTYPE html>
	<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>生鲜超市系统</title>

<link rel="shortcut icon" href="favicon.ico">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/bootstrap.min.css?v=3.3.5"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/iCheck/custom.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/style.min.css?v=4.0.0"
	rel="stylesheet">
<!-- Sweet Alert -->
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/sweetalert/sweetalert.css"
	rel="stylesheet">
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">


		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title clearfix">
						<h5>添加名称页面</h5>
					</div>
					<div class="ibox-content">
						<form method="get" class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-2 control-label">仓库名称</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" name="storehouseName">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<input type="hidden" class="form-control" name="storehouseNum"
								value="0">
							<div class="form-group">
								<label class="col-sm-2 control-label">单件商品最小库存</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" name="storehouseMin">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">单件商品最大库存</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" name="storehouseMax">
								</div>
							</div>
							<div class="hr-line-dashed"></div>

							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm demo2" type="button">提交</button>
									<a
										href="${pageContext.request.contextPath}/admin/storehouse/name/show"
										class="btn btn-white" target="_self">取消</a>


								</div>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>


	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js?v=2.1.4"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js?v=3.3.5"></script>
	<script type="text/javascript">
		var ctxpath = '${pageContext.request.contextPath}';
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/content.min.js?v=1.0.0"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/iCheck/icheck.min.js"></script>
	<script>
		$(document).ready(function() {
			$(".i-checks").iCheck({
				checkboxClass : "icheckbox_square-green",
				radioClass : "iradio_square-green",
			})
		});
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/sweetalert/sweetalert.min.js"></script>
	<script>
		$(document)
				.ready(
						function() {
							$(".demo2")
									.click(
											function() {
												$(
														"input[name='productCategoryPrice']")
														.val(
																$(
																		"input[name='productCategoryPrice']")
																		.val() * 100);
												$("input[name='vipPrice']")
														.val(
																$(
																		"input[name='vipPrice']")
																		.val() * 100);
												$
														.ajax({
															url : "${pageContext.request.contextPath}/admin/storehouse/name/add",
															type : "POST",
															data : $("form")
																	.serialize(),
															success : function(
																	d) {
																if (d.tips == "false") {

																} else if (d.tips == "true") {
																	swal(
																			{
																				title : "成功",
																				text : "添加成功",
																				type : "success",

																			},
																			function(
																					isConfirm) {
																				if (isConfirm) {
																					window.location.href = ctxpath
																							+ '/admin/storehouse/name/show';
																				} else {

																				}
																			});
																}
															}
														});

											})
						});
	</script>

</body>

	</html>
</shiro:hasPermission>