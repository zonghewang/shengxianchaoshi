<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<shiro:hasPermission name="预警信息">
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
					<h5>库存预警</h5>

				</div>
				<div class="ibox-content">
					<table class="table table-bordered table-hover ">
						<thead>
							<tr>
								<th>#</th>
								<th>仓库名称</th>
								<th>商品名称</th>
								<th>商品数量</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="storehouse" items="${storehouses}" varStatus="i">
								<tr>

									<td>${i.count }</td>
									<td>${storehouse.storehouseName }</td>
									<td>${productsIndex[storehouse.pkPid].productCategoryName }</td>
									<td>${storehouse.storehouseNum }</td>

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
</body>
	</html>
</shiro:hasPermission>