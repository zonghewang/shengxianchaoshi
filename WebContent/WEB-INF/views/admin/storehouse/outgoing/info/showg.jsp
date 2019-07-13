<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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

</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">


		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>入库查看页面</h5>
						<div class="ibox-tools">
						<a href="${pageContext.request.contextPath}/admin/storehouse/outgoing/show"
										class="btn btn-white  btn-sm " >返回</a>
						</div>
					</div>
					<div class="ibox-content">
						<form method="get" class="form-horizontal">


							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">采购单位</label>

								<div class="control-label" style="text-align:left">aaa</div>
							</div>

							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">人员</label>
                              <div class="control-label" style="text-align:left">aaa</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">入库原因</label>
								<div class="control-label" style="text-align:left">aaa</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">入库时间</label>
								<div class="control-label" style="text-align:left">aaa</div>
							</div>
							<div class="form-group">
										<table class="table table-bordered table-hover ">
											<thead>
												<tr>


													<th>商品名称</th>
													<th>商品数量</th>
													<th>编辑</th>

												</tr>
											</thead>
											<tbody>
												<tr>

													<td><div class="control-label" style="text-align:left">aaa</div></td>
													<td>
														<div class="control-label" style="text-align:left">aaa</div>
													</td>
													<td> <div class="col-sm-12 h-100 p-lg">
													 <a href="${pageContext.request.contextPath}/admin/storehouse/outgoing/add/addg" class="btn btn-primary btn-sm ">修改</a> 
													 </div>   
													  </td>

												</tr>


											</tbody>
										</table>


							
						
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



</body>

</html>