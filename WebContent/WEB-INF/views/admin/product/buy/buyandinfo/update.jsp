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
<script type="text/javascript">
	var i = 1;
</script>
</head>

<body class="gray-bg">
	<div class="wrapper wrapper-content animated fadeInRight">


		<div class="row">
			<div class="col-sm-12">
				<div class="ibox float-e-margins">
					<div class="ibox-title">
						<h5>采购单修改页面</h5>
					</div>
					<div class="ibox-content">
						<form method="get" class="form-horizontal">
							<div class="form-group">
								<label class="col-sm-2 control-label">采购名称</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" name="buyName" value="${buy.buyName }">
								</div>
							</div>
							<div class="hr-line-dashed"></div>

							<div class="form-group">
								<label class="col-sm-2 control-label">采购时间</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" id="buydate"
										name="buyTime" value="${buy.buyTime }">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">采购人</label>

								<div class="col-sm-10">
									<input type="hidden" name="pkUid" value="${uId }"> <input
										type="text" class="form-control" disabled value="${userName}">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">备注</label>

								<div class="col-sm-10">
									<input type="text" class="form-control" name="buyInfo" value="${buy.buyInfo }">
									<input type="hidden" name="isInStorehouse" id="isInStorehouse" value="${buy.isInStorehouse }">
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<label class="col-sm-2 control-label">是否应季采购</label>

								<div class="radio i-checks">
									<label class="">
										<div class="iradio_square-green " style="position: relative;">
											<input type="radio" ${buy.isSeasonal==1?"checked":"" }  value="1" name="isSeasonal"
												style="position: absolute; opacity: 0;">
											<ins class="iCheck-helper"
												style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
										</div> <i></i> 是
									</label> <label class="">
										<div class="iradio_square-green" style="position: relative;">
											<input type="radio" ${buy.isSeasonal==0?"checked":"" } value="0" name="isSeasonal"
												style="position: absolute; opacity: 0;">
											<ins class="iCheck-helper"
												style="position: absolute; top: 0%; left: 0%; display: block; width: 100%; height: 100%; margin: 0px; padding: 0px; background: rgb(255, 255, 255); border: 0px; opacity: 0;"></ins>
										</div> <i></i> 否
									</label>
								</div>
							</div>
							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<table class="table table-bordered table-hover ">
									<thead>
										<tr>


											<th>采购商品</th>
											<th>采购商名称</th>
											<th>采购数量</th>
											<th>备注</th>
											<th>编辑</th>

										</tr>
									</thead>
									<tbody>
										<c:forEach var="buyInfo" items="${buyInfos}" varStatus="i">
											<script type="text/javascript">
												i++;
											</script>
											<tr>

												<td>
													<div class="clearfix">
														<input type="hidden" name="pkBiid"
															value="${ buyInfo.pkBiid }">
														<div class="col-sm-6">
															<div class="form-group ">
																<label class="col-sm-4 control-label">一级</label>
																<div class="col-sm-8">
																	<select class="form-control m-b firstselect"
																		id="firstselect" g="0">
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
																<label class="col-sm-4 control-label">二级</label>
																<div class="col-sm-8">
																	<select class="form-control m-b secondselect" g="0">

																	</select>
																</div>
															</div>
														</div>
														<div class="col-sm-6">
															<div class="form-group ">
																<label class="col-sm-4 control-label">三级</label>
																<div class="col-sm-8">
																	<select class="form-control m-b threadselect" g="0">

																	</select>
																</div>
															</div>
														</div>
														<div class="col-sm-6">
															<div class="form-group ">
																<label class="col-sm-4 control-label">名称</label>
																<div class="col-sm-8">
																	<select class="form-control m-b productselect" g="0"
																		name="buyInfos[${i.count-1}].pkPid">
																		<option value="${buyInfo.pkPid}">若无修改请勿点击</option>
																	</select>
																</div>
															</div>
														</div>
													</div>
												</td>
												<td>
													<div class="form-group col-sm-10">
														<select class="form-control m-b supplierselect"
															name="buyInfos[${i.count-1}].pkSpid" id="firstselect"
															g="0">
															<option value="${buyInfo.pkSpid}">若无修改请勿点击</option>
														</select>
													</div>
												</td>
												<td>
													<div class="form-group col-sm-10">
														<input type="number" class="form-control buyInfoNum"
															name="buyInfos[${i.count-1}].buyInfoNum"
															value="${buyInfo.buyInfoNum}">
													</div>
												</td>
												<td>
													<div class="form-group col-sm-10">
														<input type="text" class="form-control"
															name="buyInfos[${i.count-1}].buyInfoOther"
															value="${buyInfo.buyInfoOther}">
													</div>
												</td>
												<td></td>

											</tr>
										</c:forEach>
									</tbody>
								</table>


							</div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm  " type="button"
										onclick="addrow();">添加数据</button>

								</div>
							</div>


							<div class="hr-line-dashed"></div>
							<div class="form-group">
								<div class="col-sm-4 col-sm-offset-2">
									<button class="btn btn-success btn-sm demo2" type="button">提交</button>
									<a
										href="${pageContext.request.contextPath}/admin/product/buy/show"
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
	<script
		src="${pageContext.request.contextPath}/resources/lib/hplus/js/plugins/layer/laydate/laydate.js"></script>
	<script>
		laydate.render({
			elem : '#buydate', //指定元素，
			type : 'datetime'
		});
		$('body')
		.on(
				"change",
				".buyInfoNum",
				function() {
					$('#isInStorehouse').val(0);
				}
		)
		$('body')
				.on(
						"click",
						".firstselect",
						function(e) {

							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/buy/buyandinfo/add?getdata="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											var next = $(e.target).parents(
													".col-sm-6").next().find(
													"select");
											console.log(next)
											next.empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(
																d.setdata[s].pkPcid)
														.text(
																d.setdata[s].productCategoryName)
														.appendTo($(next));
												//										console
												//												.log(d.setdata[s].pkPcid);
												//										console
												//												.log(d.setdata[s].productCategoryName);
											}
										}
									});

						});
		$('body')
				.on(
						"click",
						".secondselect",
						function(e) {
							console.log($(this).val())
							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/buy/buyandinfo/add?getdata2="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											var next = $(e.target).parents(
													".col-sm-6").next().find(
													"select");
											console.log(next)
											next.empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(
																d.setdata[s].pkPcid)
														.text(
																d.setdata[s].productCategoryName)
														.appendTo($(next));
												//										console
												//												.log(d.setdata[s].pkPcid);
												//										console
												//												.log(d.setdata[s].productCategoryName);
											}
										}
									});

						});
		$('body')
				.on(
						"click",
						".threadselect",
						function(e) {
							console.log($(this).val())
							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/buy/buyandinfo/add?getdata3="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											var next = $(e.target).parents(
													".col-sm-6").next().find(
													"select");
											console.log(next)
											next.empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(d.setdata[s].pkPid)
														.text(
																d.setdata[s].productCategoryName)
														.appendTo($(next));
												//										console
												//												.log(d.setdata[s].pkPcid);
												//										console
												//												.log(d.setdata[s].productCategoryName);
											}
										}
									});

						});
		$('body')
				.on(
						"click",
						".productselect",
						function(e) {
							console.log($(this).val())
							$
									.ajax({
										url : "${pageContext.request.contextPath}/admin/product/buy/buyandinfo/add?getdata4="
												+ $(this).val(),
										type : "POST",
										success : function(d) {
											console.log(d)
											var next = $(e.target)
													.parents("td").next().find(
															"select");
											console.log(next)
											next.empty();
											for ( var s in d.setdata) {
												$("<option></option>")
														.val(
																d.setdata[s].pkSpid)
														.text(
																d.setdata[s].supplierName)
														.appendTo($(next));
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
												console.log(JSON.stringify($(
														"form").serialize()))
												$
														.ajax({
															url : "${pageContext.request.contextPath}/admin/product/buy/buyandinfo/add",
															type : "POST",
															data : $("form")
																	.serialize(),
															success : function(
																	d) {
																console
																		.log(JSON
																				.stringify($(
																						"form")
																						.serialize()))
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
																							+ '/admin/product/buy/show';
																				} else {

																				}
																			});
																}
															}
														});

											})
						});
	</script>
	<script type="text/javascript">
		function addrow() {

			var tables = $('.table');

			var addtr = $('<tr><td>'
					+ '<div class="clearfix">'

					+ '<div class="col-sm-6 ">'
					+ '<div class="form-group ">'
					+ '<label class="col-sm-4 control-label">一级</label>'
					+ '<div class="col-sm-8">'
					+ "<select class='form-control m-b firstselect' g='"+i+"'><c:forEach var='firstProductCategory'	items='${firstProductCategorys }'>	<option value='${firstProductCategory.pkPcid}'		${firstProductCategory.pkPcid==pproductCategory.pid?'selected':''}>${firstProductCategory.productCategoryName}</option></c:forEach>"

					+ '</select>'
					+ '</div>'
					+ '</div>'
					+ '</div>'
					+ '<div class="col-sm-6">'
					+ '	<div class="form-group ">'
					+ '		<label class="col-sm-4 control-label">二级</label>'
					+ '		<div class="col-sm-8">'
					+ '			<select class="form-control m-b secondselect" g="'+i+'">'

					+ '			</select>'
					+ '		</div>'
					+ '	</div>'
					+ '</div>'
					+ '<div class="col-sm-6">'
					+ '	<div class="form-group ">'
					+ '		<label class="col-sm-4 control-label">三级</label>'
					+ '		<div class="col-sm-8">'
					+ '			<select class="form-control m-b threadselect" g="'+i+'">'

					+ '			</select>'
					+ '		</div>'
					+ '	</div>'
					+ '</div>'
					+ '<div class="col-sm-6">'
					+ '	<div class="form-group ">'
					+ '		<label class="col-sm-4 control-label">名称</label>'
					+ '		<div class="col-sm-8">'
					+ '			<select class="form-control m-b productselect" g="'+i+'"'
	+		'				name="buyInfos['+i+'].pkPid">'

					+ '			</select>'
					+ '		</div>'
					+ '	</div>'
					+ '</div>'
					+ '</div>'
					+ '</td>'
					+ '		<td>'
					+ '			<div class="form-group col-sm-10">'
					+ '	<select class="form-control m-b supplierselect" name="buyInfos['+i+'].pkSpid" '
					+ '		id="firstselect" g="'+i+'"> '

					+ '	</select> '
					+ '			</div>'
					+ '		</td>'
					+ '		<td>'
					+ '			<div class="form-group col-sm-10">'
					+ '				<input type="number" class="form-control buyInfoNum" name="buyInfos['+i+'].buyInfoNum">'
					+ '			</div>'
					+ '		</td>'
					+ '		<td>'
					+ '			<div class="form-group col-sm-10">'
					+ '				<input type="text" class="form-control"  name="buyInfos['+i+'].buyInfoOther">'
					+ '			</div>'
					+ '		</td>'
					+ '		<td><a class="del" onclick="deleteTrRow(this);">删除</a></td>'

					+ '	</tr>');
			i++;

			addtr.appendTo(tables);

		}

		function deleteTrRow(tr) {
			//多一个parent就代表向前一个标签,
			//本删除范围为<td><tr>两个标签,即向前两个parent
			//如果多一个parent就会删除整个table
			$(tr).parent().parent().remove();
		}
	</script>
</body>

</html>