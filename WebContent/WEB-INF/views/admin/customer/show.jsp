<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="会员列表">
	<!DOCTYPE html>
	<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>H+ 后台主题UI框架 - 基础表格</title>
<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

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
<!-- Sweet Alert -->
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/sweetalert/sweetalert.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/style.min.css?v=4.0.0"
	rel="stylesheet">


</head>

<body class="gray-bg">


	<div class="row">
		<div class="col-sm-12">
			<div class="ibox float-e-margins">
				<div class="ibox-title clearfix">
					<h5>会员列表</h5>
				</div>
				<div class="ibox-content">
					<table class="table table-bordered table-hover ">
						<thead>
							<tr>
								<th>#</th>
								<th>姓名</th>
								<th>性别</th>
								<th>年龄</th>
								<th>身份证号</th>
								<th>家庭住址</th>
								<th>联系方式</th>
								<th>会员卡编号</th>
								<th>会员办卡日期</th>
								<th>会员商品编号</th>
								<th>会员积分</th>
								<th>操作</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="customer" items="${customers}" varStatus="i">
								<tr>
									<td>${i.count}</td>
									<td>${customer.customerName}</td>
									<td>${customer.customerSex}</td>
									<td>${customer.customerAge}</td>
									<td>${customer.customerIdNo}</td>
									<td>${customer.customerAddr}</td>
									<td>${customer.customerTel}</td>
									<td>${customer.vipNo}</td>
									<td>${customer.vipDate}</td>
									<td>${customer.vipPcid}</td>
									<td>${customer.vipGread}</td>
									<td>
										<div class="col-sm-12 h-100 p-lg">
											<shiro:hasPermission name="会员修改">
												<a
													href="${pageContext.request.contextPath}/admin/customer/update?pkCid=${customer.pkCid}"
													class="btn btn-primary btn-sm col-sm-6">修改</a>
											</shiro:hasPermission>
											<shiro:hasPermission name="会员删除">
												<button class="btn btn-danger btn-sm demo4 col-sm-6"
													data="${customer.pkCid}">删除</button>
											</shiro:hasPermission>
										</div>
									</td>
								</tr>
							</c:forEach>

						</tbody>
					</table>


				</div>
			</div>
		</div>


		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js?v=2.1.4"></script>
		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js?v=3.3.5"></script>
		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/peity/jquery.peity.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/content.min.js?v=1.0.0"></script>
		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/sweetalert/sweetalert.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/iCheck/icheck.min.js"></script>
		<script src="vjs/demo/peity-demo.min.js"></script>
		<script>
			$(document).ready(function() {
				$(".i-checks").iCheck({
					checkboxClass : "icheckbox_square-green",
					radioClass : "iradio_square-green",
				})
			});
		</script>
		<script>
			$(document)
					.ready(
							function() {
								$(".demo4")
										.click(
												function(e) {
													swal(
															{
																title : "您确定要删除这条信息吗",
																text : "删除后将无法恢复，请谨慎操作！",
																type : "warning",
																showCancelButton : true,
																confirmButtonColor : "#DD6B55",
																confirmButtonText : "是的，我要删除！",
																cancelButtonText : "让我再考虑一下…",
																closeOnConfirm : false,
																closeOnCancel : false
															},
															function(isConfirm) {
																if (isConfirm) {

																	$
																			.ajax({
																				url : "${pageContext.request.contextPath}/admin/customer/delete?pkCid="
																						+ $(
																								e.target)
																								.attr(
																										'data'),
																				type : "POST",
																				data : $(
																						"form")
																						.serialize(),
																				success : function(
																						d) {
																					swal(
																							{
																								title : "成功",
																								text : "修改成功",
																								type : "success",

																							},
																							function(
																									isConfirm) {
																								if (isConfirm) {
																									window.location.href = '${pageContext.request.contextPath}/admin/customer/show';
																								} else {

																								}
																							});

																				}
																			})

																} else {
																	swal(
																			"已取消",
																			"您取消了删除操作！",
																			"error")
																}
															})
												})
							});
		</script>
</body>

	</html>
</shiro:hasPermission>