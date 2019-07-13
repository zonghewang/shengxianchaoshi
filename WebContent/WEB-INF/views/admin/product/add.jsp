<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="货物盘点添加">
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
						<h5>货物盘点添加页面</h5>
					</div>
					<div class="ibox-content">
						<form method="get" class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-2 control-label">商品名称</label>

								<div class="col-sm-10">
									<input type="text" class="form-control"
										name="productCategoryName">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">所属类别</label>

								<div class="col-sm-3">
									<select class="form-control m-b" id="firstselect">
										<c:forEach var="firstProductCategory"
											items="${firstProductCategorys }">
											<option value="${firstProductCategory.pkPcid}"
												${firstProductCategory.pkPcid==pproductCategory.pid?'selected':''}>${firstProductCategory.productCategoryName}</option>
										</c:forEach>
									</select>
								</div>
								<div class="col-sm-3">
									<select class="form-control m-b" id="secondselect">

									</select>
								</div>
								<div class="col-sm-4">
									<select class="form-control m-b" id="threadselect"
										name="pkPcid">

									</select>
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<!-- 							<div class="form-group"> -->
							<!-- 								<label class="col-sm-2 control-label">总数量</label> -->

							<!-- 								<div class="col-sm-10"> -->
																<input type="hidden" class="form-control" name="productCategoryNum" value="0">
							<!-- 								</div> -->
							<!-- 							</div> -->
							<!-- 							<div class="hr-line-dashed"></div> -->
							<div class="form-group">
								<label class="col-sm-2 control-label">商品单价</label>

								<div class="col-sm-3">
									<div class="col-sm-10">
										<input type="text" class=" form-control"
											name="productCategoryPrice">
									</div>
									<div class="col-sm-2">元</div>
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">会员单价</label>

								<div class="col-sm-3">
									<div class="col-sm-10">
										<input type="text" class="form-control" name="vipPrice">
									</div>
									<div class="col-sm-2">元</div>
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm demo2" type="button">提交</button>
									<a href="${pageContext.request.contextPath}/admin/product/show"
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
		$('#firstselect')
				.click(
						function() {
							console.log($(this).val())
							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/add?getdata="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											$('#secondselect').empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(
																d.setdata[s].pkPcid)
														.text(
																d.setdata[s].productCategoryName)
														.appendTo(
																$('#secondselect'));
												//										console
												//												.log(d.setdata[s].pkPcid);
												//										console
												//												.log(d.setdata[s].productCategoryName);
											}
										}
									});

						});
		$('#secondselect')
				.click(
						function() {
							console.log($(this).val())
							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/add?getdata2="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											$('#threadselect').empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(
																d.setdata[s].pkPcid)
														.text(
																d.setdata[s].productCategoryName)
														.appendTo(
																$('#threadselect'));
												//										console
												//												.log(d.setdata[s].pkPcid);
												//										console
												//												.log(d.setdata[s].productCategoryName);
											}
										}
									});

						});
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
															url : "${pageContext.request.contextPath}/admin/product/add",
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
																							+ '/admin/product/show';
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