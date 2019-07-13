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
					<div class="ibox-title clearfix">
						<h5>入库查看页面</h5>
						<div class="ibox-tools">
<!-- 							<a -->
<%-- 								href="${pageContext.request.contextPath}/admin/storehouse/outgoing/outgoingandinfo/updateg?pkOrid=${outgoingRecord.pkOrid}" --%>
<!-- 								class="btn btn-primary btn-sm ">修改</a>  -->
								<a
								href="${pageContext.request.contextPath}/admin/storehouse/outgoing/show"
								class="btn btn-white  btn-sm ">返回</a>
						</div>
					</div>
					<div class="ibox-content">



						<div class="hr-line-dashed"></div>
						<div class="form-group">
							<label class="col-sm-2 control-label">采购单名称</label>

							<div class="control-label" style="text-align: left">${outgoingRecord.pkBid}</div>
						</div>

						<div class="hr-line-dashed"></div>
						<div class="form-group">
							<label class="col-sm-2 control-label">人员</label>
							<div class="control-label" style="text-align: left">${outgoingRecord.pkUid}</div>
						</div>

						<div class="hr-line-dashed"></div>
						<div class="form-group">
							<label class="col-sm-2 control-label">入库时间</label>
							<div class="control-label" style="text-align: left">${outgoingRecord.outgoingRecordTime}</div>
						</div>
						<div class="hr-line-dashed"></div>
						<div class="form-group">
							<label class="col-sm-2 control-label">入库原因</label>
							<div class="control-label" style="text-align: left">${outgoingRecord.outgoingRecordResult}</div>
						</div>
						<div class="form-group">
							<table class="table table-bordered table-hover ">
								<thead>
									<tr>

										<th>#</th>
										<th>商品名称</th>
										<th>商品数量</th>
										<th>编辑</th>

									</tr>
								</thead>
								<tbody>
									<c:forEach var="outgoingRecordInfo"
										items="${outgoingRecordInfos}" varStatus="i">
										<tr>

											<td><div class="control-label" style="text-align: left;">${i.count}</div></td>
											<td><div class="control-label" style="text-align: left;">${productsIndex[outgoingRecordInfo.pkPid]}</div></td>
											<td><div class="control-label" style="text-align: left;">${outgoingRecordInfo.outgoingRecordNum}</div></td>

											<td>
												<div class="col-sm-12 h-100 p-lg">

													<%-- 											<shiro:hasPermission name="货物盘点删除"> --%>
													<button class="btn btn-danger btn-sm demo4"
														data="${outgoingRecordInfo.pkOriid}">删除</button>
													<%-- 											</shiro:hasPermission> --%>
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
	<script>
		$(document).ready(function() {
			$(".demo4").click(function() {
				swal({
					title : "您确定要删除这条信息吗",
					text : "删除后将无法恢复，请谨慎操作！",
					type : "warning",
					showCancelButton : true,
					confirmButtonColor : "#DD6B55",
					confirmButtonText : "是的，我要删除！",
					cancelButtonText : "让我再考虑一下…",
					closeOnConfirm : false,
					closeOnCancel : false
				}, function(isConfirm) {
					if (isConfirm) {
						swal("删除成功！", "您已经永久删除了这条信息。", "success")
					} else {
						swal("已取消", "您取消了删除操作！", "error")
					}
				})
			})
		});
	</script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/sweetalert/sweetalert.min.js"></script>



</body>

</html>