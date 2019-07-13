<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    

    <title>删除会员</title>

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="css/font-awesome.min.css?v=4.4.0" rel="stylesheet">
    <!-- Sweet Alert -->
    <link href="css/plugins/sweetalert/sweetalert.css" rel="stylesheet">

    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min.css?v=4.0.0" rel="stylesheet"><base target="_blank">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content  animated fadeInRight">
        <div class="row">
            <div class="col-sm-12">
                <div class="ibox ">
                    <div class="ibox-title">
                        <h5>删除会员</h5>
                    </div>

                    <div class="ibox-content">

                        <div class="row text-center">
                            <div class="col-sm-6 h-100 p-lg">  
                                会员名称：<input type="text" name="" placeholder="请输入要删除的会员名称   " >
                            </div>
                           
                            <div class="col-sm-6 h-100 p-lg">  
                                <button class="btn btn-warning btn-sm demo3">删除该会员</button>
                            </div>
                
                        </div>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.5"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/sweetalert/sweetalert.min.js"></script>
    <script>
        $(document).ready(function(){$(".demo1").click(function(){swal({title:"欢迎使用SweetAlert",text:"Sweet Alert 是一个替代传统的 JavaScript Alert 的漂亮提示效果。"})});$(".demo2").click(function(){swal({title:"太帅了",text:"小手一抖就打开了一个框",type:"success"})});$(".demo3").click(function(){swal({title:"您确定要删除这个会员吗",text:"删除后将无法恢复，请谨慎操作！",type:"warning",showCancelButton:true,confirmButtonColor:"#DD6B55",confirmButtonText:"删除",closeOnConfirm:false},function(){swal("删除成功！","您已经永久删除了这个会员。","success")})});$(".demo4").click(function(){swal({title:"您确定要删除这个会员吗",text:"删除后将无法恢复，请谨慎操作！",type:"warning",showCancelButton:true,confirmButtonColor:"#DD6B55",confirmButtonText:"是的，我要删除！",cancelButtonText:"让我再考虑一下…",closeOnConfirm:false,closeOnCancel:false},function(isConfirm){if(isConfirm){swal("删除成功！","您已经永久删除了这条信息。","success")}else{swal("已取消","您取消了删除操作！","error")}})})});
    </script>
</body>

</html>