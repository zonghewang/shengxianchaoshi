<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="用户修改">
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>用户修改界面</title>
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
					<h5>添加用户</h5>
				</div>
				<div class="ibox-content">
					<div class="row">
						<div class="col-sm-12 b-r">
							<form role="form">
							<input type="hidden" class="form-control" name="pkUid"
								value="${user.pkUid}">
								<div class="form-group">
									<label>员工编号</label> <input type="text"
										placeholder="请输入您要添加的员工编号" class="form-control" name="empNo" value="${ employee.empNo}">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>员工名称</label> <input type="text"
										placeholder="请输入您要添加的员工名称" class="form-control" name="empName" value="${ employee.empName}">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>员工性别</label>
									<div class="radio i-checks">
										<label class="">
											<div class="iradio_square-green " style="position: relative;">
												<input type="radio" ${ employee.empSex==1?"checked":""} value="1" name="empSex"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 男
										</label> <label class="">
											<div class="iradio_square-green" style="position: relative;">
												<input type="radio" ${ employee.empSex==0?"checked":""} value="0" name="empSex"
													style="position: absolute; opacity: 0;">
												<ins class="iCheck-helper"
													style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
											</div> <i></i> 女
										</label>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>员工年龄</label> <input type="number" minlength="1"
										maxlength="2" name="empAge" class="form-control"
										placeholder="请输入您要添加的会员年龄" min="1" max="100"  value="${ employee.empAge}" />
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>员工电话</label> <input type="text"
										oninput="value=value.replace(/[^\d]/g,'')" name="empTel"
										placeholder="请输入您要添加的员工电话" class="form-control"  value="${ employee.empTel}">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>用户账号</label> <input type="text"
										placeholder="请输入您要添加的用户账号" class="form-control"
										name="userName"  value="${ user.userName}">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<label>用户密码</label> <input type="password"
										placeholder="请输入您要添加的用户密码" class="form-control"
										name="userPassword"  value="${ user.userPassword}">
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group clearfix">
									<label class="col-sm-2">用户角色</label>
									<div class="col-sm-8">
										<select class="form-control m-b" name="pkRid">
											<c:forEach var="role" items="${roles }">
												<option value="${role.pkRid}"  ${ userRole.pkRid==role.pkRid?'selected':''}>${role.roleName}</option>
											</c:forEach>

										</select>
									</div>
								</div>
								<div class="hr-line-dashed"></div>
								<div class="form-group">
									<div class="col-sm-4 col-sm-offset-2">
										<button class="btn btn-success btn-sm demo2" type="button">提交</button>
										<a href="${pageContext.request.contextPath}/admin/user/show"
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
		$(document).ready(function() {
			$(".i-checks").iCheck({
				checkboxClass : "icheckbox_square-green",
				radioClass : "iradio_square-green",
			})
		});
	</script>

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

		$(document)
				.ready(
						function() {
							$(".demo2")
									.click(
											function() {
												$
														.ajax({
															url : "${pageContext.request.contextPath}/admin/user/update?methord=update",
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
																							+ '/admin/user/show';
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