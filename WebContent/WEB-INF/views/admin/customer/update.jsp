<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="会员修改">
	<!DOCTYPE html>
	<html>
<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>会员界面</title>
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
			<div class="ibox float-e-margins">
				<div class="ibox-title">
					<h5>会员列表修改界面</h5>
				</div>


				<div class="ibox-content">
					<div class="row">
						<div class="col-sm-12">
							<form role="form">
								<input type="hidden" class="form-control" name="pkCid"
									value="${customer.pkCid}">
								<div class="form-group">
									<label>用户名</label> <input type="text"
										placeholder="请输入您要添加的会员用户名" class="form-control"
										name="customerName" value="${customer.customerName }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>性别</label>
									<div class="radio i-checks">
										<label class="">
											<div class="iradio_square-green " style="position: relative;">
												<input type="radio" ${customer.customerSex==1?'checked':'' }
													value="1" name="customerSex" class="showother"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 男
										</label> <label class="">
											<div class="iradio_square-green" style="position: relative;">
												<input type="radio" ${customer.customerSex==0?'checked':'' }
													value="0" name="customerSex" class="showother"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 女
										</label>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>年龄</label> <input type="number" minlength="1"
										maxlength="2" name="multiple" class="form-control"
										placeholder="请输入您要添加的会员年龄" min="1" max="100"
										name="customerAge" value="${customer.customerAge }" />
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>身份证号</label> <input type="number"
										oninput="value=value.replace(/[^\d]/g,'')"
										placeholder="请输入您要添加的会员身份证号" class="form-control"
										name="customerIdNo" value="${customer.customerIdNo }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>地址</label> <input type="text"
										placeholder="请输入您要添加的会员家庭住址" class="form-control"
										name="customerAddr" value="${customer.customerAddr }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>联系方式</label> <input type="tel"
										oninput="value=value.replace(/[^\d]/g,'')"
										placeholder="请输入您要添加的会员联系方式" class="form-control"
										name="customerTel" value="${customer.customerTel }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>是否添加为本店会员</label>
									<div class="radio i-checks">
										<label class="">
											<div class="iradio_square-green " style="position: relative;">
												<input type="radio" ${customer.isVip==1?'checked':'' }
													value="1" name="isVip"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 是
										</label> <label class="">
											<div class="iradio_square-green" style="position: relative;">
												<input type="radio" ${customer.isVip==0?'checked':'' }
													value="0" name="isVip"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 否
										</label>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>会员卡编号</label> <input type="text"
										placeholder="请设置您要添加的会员编号" class="form-control" name="vipNo"
										value="${customer.vipNo }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>会员办卡日期</label> <input type="date"
										placeholder="请输入您要添加的会员卡办卡日期" class="form-control"
										name="vipDate" value="${customer.vipDate }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>会员卡商品编号</label> <input type="text"
										placeholder="请输入您要添加的会员商品编号" class="form-control"
										name="vipPcid" value="${customer.vipPcid }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>会员积分</label> <input type="number"
										oninput="value=value.replace(/[^\d]/g,'')"
										placeholder="请输入您要添加的会员卡会员积分" class="form-control"
										name="vipGread" value="${customer.vipGread }">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<div class="col-sm-4 col-sm-offset-2">
										<button class="btn btn-success btn-sm demo2" type="button">提交</button>
										<a
											href="${pageContext.request.contextPath}/admin/customer/show"
											class="btn btn-white" target="_self">取消</a>


									</div>
								</div>
							</form>
						</div>
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
		$(".i-checks").on('ifChecked', function(event) {

			if ($(event.target).val() == "0") {
				$("#otherinfo").attr("hidden", "hidden")
			} else {
				$("#otherinfo").removeAttr("hidden")
			}
		});
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
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/layer/laydate/laydate.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/sweetalert/sweetalert.min.js"></script>
	<script>
		laydate.render({
			elem : '#vipdate', //指定元素，
			type : 'datetime'
		});
		$(document)
				.ready(
						function() {
							$(".demo2")
									.click(
											function() {
												$
														.ajax({
															url : "${pageContext.request.contextPath}/admin/customer/update?methord=update",
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
																							+ '/admin/customer/show';
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