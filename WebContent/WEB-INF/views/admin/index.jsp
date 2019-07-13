<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/5/18 0018
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="renderer" content="webkit">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<title>生鲜超市后台 - 主页</title>

<meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
<meta name="description"
	content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

<!--[if lt IE 8]>
    <meta http-equiv="refresh" content="0;ie.html" />
    <![endif]-->

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
</head>

<body class="fixed-sidebar full-height-layout gray-bg"
	style="overflow: hidden">
	<div id="wrapper">
		<!--左侧导航开始-->
		<nav class="navbar-default navbar-static-side" role="navigation">
			<div class="nav-close">
				<i class="fa fa-times-circle"></i>
			</div>
			<div class="sidebar-collapse">
				<ul class="nav" id="side-menu">
					<li class="nav-header">
						<div class="dropdown profile-element">
							<span><img alt="image" class="img-circle"
								src="${pageContext.request.contextPath}/resources/lib/hplus/img/profile_small.jpg" /></span>
							<a data-toggle="dropdown" class="dropdown-toggle" href="#"> <span
								class="clear"> <span class="block m-t-xs"><strong
										class="font-bold">${userName }</strong></span> <span
									class="text-muted text-xs block">${roleName }<b class="caret"></b></span>
							</span>
							</a>
							<ul class="dropdown-menu animated fadeInRight m-t-xs">
								<!--                                 <li><a class="J_menuItem" href="form_avatar.html">修改头像</a> -->
								<!--                                 </li> -->
								<!--                                 <li><a class="J_menuItem" href="profile.html">个人资料</a> -->
								<!--                                 </li> -->
								<!--                                 <li><a class="J_menuItem" href="contacts.html">联系我们</a> -->
								<!--                                 </li> -->
								<!--                                 <li><a class="J_menuItem" href="mailbox.html">信箱</a> -->
								<!--                                 </li> -->
								<!--                                 <li class="divider"></li> -->
								<li><a
									href="${pageContext.request.contextPath}/admin/login?methord=loginout">安全退出</a>
								</li>
							</ul>
						</div>
						<div class="logo-element">
							生鲜<br>超市<br>管理<br>系统
						</div>
					</li>
					<shiro:hasPermission name="首页">
						<li><a class="J_menuItem"
							href="${pageContext.request.contextPath}/admin/indexShow"> <i
								class="fa fa-home"></i> <span class="nav-label">首页</span>

						</a></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="商品分类管理">
						<li><a href="#"> <i class="fa fa fa-pie-chart"></i> <span
								class="nav-label">商品分类管理</span> <span class="fa arrow"></span>
						</a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="一级分类管理">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/productcategory/first/show">一级分类管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="二级分类管理">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/productcategory/second/show">二级分类管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="三级分类管理">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/productcategory/thread/show">三级分类管理</a>
									</li>
								</shiro:hasPermission>
							</ul></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="货物管理">
						<li><a href="#"> <i class="fa fa fa-cubes"></i> <span
								class="nav-label">货物管理</span> <span class="fa arrow"></span>
						</a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="采购管理">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/product/buy/show">采购管理</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="销售管理">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/product/sales/show">销售管理</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="退货管理">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/product/refunds/show">退货管理</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="货物盘点">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/product/show">货物盘点</a></li>
								</shiro:hasPermission>
							</ul></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="库存管理">
						<li><a href="#"><i class="fa fa-database"></i> <span
								class="nav-label">库存管理</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="仓库管理">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/storehouse/name/show">仓库管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="出入库管理">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/storehouse/outgoing/show">出入库管理</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="库存报表">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/storehouse/show">库存报表</a>
									</li>
								</shiro:hasPermission>
								<shiro:hasPermission name="预警信息">
									<li><a class="J_menuItem"
										href="${pageContext.request.contextPath}/admin/storehouse/alert/show">预警信息</a>
									</li>
								</shiro:hasPermission>

							</ul></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="员工管理">

						<li><a href="#"><i class="fa fa-user"></i> <span
								class="nav-label">员工管理</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="用户添加">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/user/add">添加用户</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="用户列表">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/user/show">用户列表</a></li>
								</shiro:hasPermission>
							</ul></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="供应商管理">

						<li><a href="#"><i class="fa fa-truck"></i> <span
								class="nav-label">供应商管理</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="供应商添加">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/supplier/add">添加供应商</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="供应商列表">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/supplier/show">供应商列表</a></li>
								</shiro:hasPermission>
							</ul></li>
					</shiro:hasPermission>
					<shiro:hasPermission name="客户管理">

						<li><a href="#"><i class="fa fa-male"></i> <span
								class="nav-label">客户管理</span><span class="fa arrow"></span></a>
							<ul class="nav nav-second-level">
								<shiro:hasPermission name="会员添加">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/customer/add">添加会员</a></li>
								</shiro:hasPermission>
								<shiro:hasPermission name="会员列表">
									<li><a class="J_menuItem" href="${pageContext.request.contextPath}/admin/customer/show">会员列表</a></li>
								</shiro:hasPermission>
							</ul></li>
					</shiro:hasPermission>
				</ul>
			</div>
		</nav>
		<!--左侧导航结束-->
		<!--右侧部分开始-->
		<div id="page-wrapper" class="gray-bg dashbard-1">
			<div class="row border-bottom">
				<nav class="navbar navbar-static-top" role="navigation"
					style="margin-bottom: 0">
					<div class="navbar-header">
						<a class="navbar-minimalize minimalize-styl-2 btn btn-primary "
							href="#"><i class="fa fa-bars"></i> </a>
						<form role="search" class="navbar-form-custom" method="post"
							action="search_results.html"></form>
					</div>

				</nav>
			</div>
			<div class="row content-tabs">
				<button class="roll-nav roll-left J_tabLeft">
					<i class="fa fa-backward"></i>
				</button>
				<nav class="page-tabs J_menuTabs">
					<div class="page-tabs-content">
						<a href="javascript:;" class="active J_menuTab"
							data-id="${pageContext.request.contextPath}/admin/indexShow">首页</a>
					</div>
				</nav>

				<a
					href="${pageContext.request.contextPath}/admin/login?methord=loginout"
					class="roll-nav roll-right J_tabExit"><i
					class="fa fa fa-sign-out"></i> 退出</a>
			</div>
			<div class="row J_mainContent" id="content-main">
				<iframe class="J_iframe" name="iframe0" width="100%" height="100%"
					src="${pageContext.request.contextPath}/admin/indexShow"
					frameborder="0"
					data-id="${pageContext.request.contextPath}/admin/indexShow"
					seamless></iframe>
			</div>
			<div class="footer"></div>
		</div>
		<!--右侧部分结束-->

	</div>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/jquery.min.js?v=2.1.4"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/bootstrap.min.js?v=3.3.5"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/metisMenu/jquery.metisMenu.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/layer/layer.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/hplus.min.js?v=4.0.0"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/contabs.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/pace/pace.min.js"></script>
</body>

</html>