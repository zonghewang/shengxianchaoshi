<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="供应商添加">
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>添加供应商界面</title>
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/sweetalert/sweetalert.css"
	rel="stylesheet">
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
						<h5>添加供应商</h5>
					</div>

					<div class="ibox-content clearfix">
						<form role="form">
							<div class="form-group">
								<label>供应商商品名称</label> <input type="text"
									placeholder="请输入您要添加的供应商名称" class="form-control"
									name="supplierName">
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label>供应商所在地</label> <input type="text"
									placeholder="请输入您要添加的会员家庭住址" class="form-control"
									name="supplierAddr">
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label>供应商联系电话</label> <input type="text"
									placeholder="请输入您要添加的会员联系方式" class="form-control"
									name="supplierTel">
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label>供应商商品：</label>
							</div>
							<div class="clearfix">

								<div class="col-sm-6 ">
									<div class="form-group ">
										<label class="col-sm-4 control-label">一级分类</label>
										<div class="col-sm-8">
											<select class="form-control m-b" id="firstselect">
												<c:forEach var="firstProductCategory"
													items="${firstProductCategorys }">
													<option value="${firstProductCategory.pkPcid}"
														${firstProductCategory.pkPcid==pproductCategory.pid?'selected':''}>${firstProductCategory.productCategoryName}</option>
												</c:forEach>

											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group ">
										<label class="col-sm-4 control-label">二级分类</label>
										<div class="col-sm-8">
											<select class="form-control m-b"  id="secondselect">
												
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group ">
										<label class="col-sm-4 control-label">三级分类</label>
										<div class="col-sm-8">
											<select class="form-control m-b" id="threadselect">
												
											</select>
										</div>
									</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group ">
										<label class="col-sm-4 control-label">商品名称</label>
										<div class="col-sm-8">
											<select class="form-control m-b" id="productselect" name="pkPid">

											</select>
										</div>
									</div>
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div>
								<button class="demo2 btn btn-sm btn-primary pull-right m-t-n-xs"
									type="button">
									<strong>提交</strong>
								</button>

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

	<script type="text/javascript">
		var ctxpath = '${pageContext.request.contextPath}';
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
										url : "${pageContext.request.contextPath}/admin/supplier/add?getdata="
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
								url : "${pageContext.request.contextPath}/admin/supplier/add?getdata2="
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
		$('#threadselect')
		.click(
				function() {
					console.log($(this).val())
					$
							.ajax({
								url : "${pageContext.request.contextPath}/admin/supplier/add?getdata3="
										+ $(this).val(),
								type : "POST",
								success : function(d) {
									$('#productselect').empty();
									for ( var s in d.setdata) {
										$("<option></option>")
												.val(
														d.setdata[s].pkPid)
												.text(
														d.setdata[s].productCategoryName)
												.appendTo(
														$('#productselect'));
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
												$
														.ajax({
															url : "${pageContext.request.contextPath}/admin/supplier/add",
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
																							+ '/admin/supplier/show';
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