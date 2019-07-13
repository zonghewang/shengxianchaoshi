<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<shiro:guest>
	<!DOCTYPE html>
	<html>

<head>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">


<title>生鲜超市管理系统</title>
<meta name="keywords"
	content="生鲜超市管理系统,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="生鲜超市管理系统是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<link rel="shortcut icon" href="favicon.ico">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/font-awesome.min.css"
	rel="stylesheet">

<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/style.min.css"
	rel="stylesheet">

<link rel="shortcut icon" href="favicon.ico">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/bootstrap.min.css?v=3.3.5"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/font-awesome.min.css?v=4.4.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/animate.min.css"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/style.min.css?v=4.0.0"
	rel="stylesheet">
<link
	href="${pageContext.request.contextPath}/resources/lib/hplus/css/plugins/toastr/toastr.min.css"
	rel="stylesheet">

<!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->
<script>
	if (window.top !== window.self) {
		window.top.location = window.location;
	}
</script>
</head>

<body class="gray-bg">

	<div class="middle-box text-center loginscreen  animated fadeInDown">
		<div>
			<div>

				<h1 class="logo-name">市</h1>

			</div>
			<h3>欢迎使用生鲜超市管理系统</h3>

			<form class="m-t" role="form" method="post"
				action="${pageContext.request.contextPath}/admin/login">
				<div class="form-group">
					<input type="text" name="userName" class="form-control"
						placeholder="用户名" required="">
				</div>
				<div class="form-group">
					<input type="password" name="userPassword" class="form-control"
						placeholder="密码" required="">
				</div>
				<button type="submit" class="btn btn-primary block full-width m-b">登
					录</button>
			</form>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js?v=2.1.4"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js?v=3.3.5"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/toastr/toastr.min.js"></script>
	<script type="text/javascript">
		toastr.options = {
			"closeButton" : true,
			"debug" : false,
			"progressBar" : true,
			"positionClass" : "toast-top-full-width",
			"onclick" : null,
			"showDuration" : "400",
			"hideDuration" : "1000",
			"timeOut" : "7000",
			"extendedTimeOut" : "1000",
			"showEasing" : "swing",
			"hideEasing" : "linear",
			"showMethod" : "fadeIn",
			"hideMethod" : "fadeOut"
		}
		if ('${tips}' != '')
			toastr.error("${tips}", "错误提示");
	</script>
</body>

	</html>
</shiro:guest>