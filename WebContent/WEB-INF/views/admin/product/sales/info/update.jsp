<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
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
					<div class="ibox-title">
						<h5>销售单详情修改页面</h5>
					</div>
					<div class="ibox-content">
						<form method="get" class="form-horizontal">							
							<div class="form-group">
								<label class="col-sm-2 control-label">销售名称</label>

								<div class="col-sm-10">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">销售金额</label>

								<div class="col-sm-10">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>

							<div class="form-group">
								<label class="col-sm-2 control-label">销售时间</label>

								<div class="col-sm-10">
									<input type="date" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">销售人</label>

								<div class="col-sm-10">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">销售客户</label>

								<div class="col-sm-10">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">备注</label>

								<div class="col-sm-10">
									<input type="text" class="form-control">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<table class="table table-bordered table-hover ">
									<thead>
										<tr>


											<th>商品名称</th>
											<th>销售数量</th>
											<th>单价</th>
											<th>总价</th>
											<th>备注</th>
											<th>编辑</th>

										</tr>
									</thead>
									<tbody>
										<tr>

											<td><select class="form-control m-b" name="account">
													<option>选项 1</option>
													<option>选项 2</option>
													<option>选项 3</option>
													<option>选项 4</option>
											</select></td>
											<td>
												<div class="form-group col-sm-10">
													<input type="number" class="form-control">
												</div>
											</td>
											<td>
												<div class="form-group col-sm-10">
													<input type="text" class="form-control">
												</div>
											</td>
											<td>
												<div class="form-group col-sm-10">
													<input type="text" class="form-control">
												</div>
											</td>
											<td>
												<div class="form-group col-sm-10">
													<input type="text" class="form-control">
												</div>
											</td>
											<td></td>

										</tr>


									</tbody>
								</table>


							</div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm  " type="button"
										onclick="addrow();">添加数据</button>

								</div>
							</div>


							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm demo2" type="button">提交</button>
									<a
										href="${pageContext.request.contextPath}/admin/product/sales/info/show"
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
		$(document).ready(
				function() {
					$(".demo2").click(
							function() {
								swal({
									title : "成功",
									text : "修改成功",
									type : "success",

								},/*   swal({
								title : "失败",
								text : "修改失败",
								type : "error",

							},  */ function(isConfirm) {
									if (isConfirm) {
										window.location.href = ctxpath
												+ '/admin/product/sales/info/show';
									} else {

									}
								});

							})
				});
	</script>
	<script type="text/javascript">
		function addrow() {

			var tables = $('.table');

			var addtr = $("<tr>"
					+ "<td>"
					+ "<select class='form-control m-b' name='account'>"
					+ "<option>选项 1</option>"
					+ "<option>选项 2</option>"
					+ "<option>选项 3</option>"
					+ "<option>选项 4</option>"
					+ "</select>"
					+ "</td>"
					+ "<td>"
					+"<div class='form-group col-sm-10'>"
					+"<input type='number' class='form-control'>"
					+"</div >"
					+"</td>"
					+ "<td>"
					+"<div class='form-group col-sm-10'>"
					+"<input type='text' class='form-control'>"
					+"</div >"
					+"</td>"
					+ "<td>"
					+"<div class='form-group col-sm-10'>"
					+"<input type='text' class='form-control'>"
					+"</div >"
					+"</td>"
					+ "<td>"
					+"<div class='form-group col-sm-10'>"
					+"<input type='text' class='form-control'>"
					+"</div >"
					+"</td>"
					+ "<td><a class='del' onclick='deleteTrRow(this);'>删除</a></td>"
					+ "</tr>");

			addtr.appendTo(tables);

		}

		function deleteTrRow(tr) {
			//多一个parent就代表向前一个标签,
			//本删除范围为<td><tr>两个标签,即向前两个parent
			//如果多一个parent就会删除整个table
			$(tr).parent().parent().remove();
		}
	</script>
</body>

</html>