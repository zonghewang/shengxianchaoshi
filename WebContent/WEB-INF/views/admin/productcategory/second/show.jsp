<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="二级分类管理">
	<!DOCTYPE html>
	<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>生鲜超市</title>


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
					<h5>二级分类</h5>
					<div class="ibox-tools">
						<a
							href="${pageContext.request.contextPath}/admin/productcategory/second/add"
							class="btn btn-success btn-sm">添加</a>
					</div>
				</div>
				<div class="ibox-content">
					<table class="table table-bordered table-hover ">
						<thead>
							<tr>
								<th>#</th>
								<th>一级分类名称</th>
								<th>二级分类名称</th>

								<th>操作</th>

							</tr>
						</thead>
						<tbody>
							<c:forEach var="second" items="${seconds}" varStatus="i">
								<tr>

									<td>${i.count}</td>
									<td><c:out value="${firsts[second.pid]}"></c:out></td>
									<td>${second.productCategoryName }</td>

									<td>
										<div class="col-sm-12 h-100 p-lg">
											<shiro:hasPermission name="二级分类修改">
												<a
													href="${pageContext.request.contextPath}/admin/productcategory/second/update?pkPcid=${second.pkPcid}"
													class="btn btn-primary btn-sm ">修改</a>
											</shiro:hasPermission>
											<shiro:hasPermission name="二级分类删除">
												<button class="btn btn-danger btn-sm demo4"
													data="${second.pkPcid}">删除</button>
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
																			url : "${pageContext.request.contextPath}/admin/productcategory/second/delete?pkPcid="
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
																								window.location.href = '${pageContext.request.contextPath}/admin/productcategory/second/show';
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