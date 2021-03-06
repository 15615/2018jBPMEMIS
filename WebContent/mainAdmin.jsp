<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="com.bwlk.pojo.Admin" %> 
<%@ page import="com.bwlk.pojo.DormManager" %>
<%@ page import="com.bwlk.pojo.Student" %>
<html lang="zh">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>学生宿舍管理系统</title>
<link href="${pageContext.request.contextPath}/style/dorm.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-responsive.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/bootstrap-datetimepicker-master/css/bootstrap-datetimepicker.min.css" rel="stylesheet" media="screen">
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-datetimepicker-master/js/bootstrap-datetimepicker.js" charset="UTF-8"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/bootstrap-datetimepicker-master/js/locales/bootstrap-datetimepicker.fr.js" charset="UTF-8"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/bootstrap/js/jQuery.js"></script> 
 
<script type="text/javascript">
//document.getElementsByName("zidingyi").addClass("blue").siblings().removeClass("blue");
function liclick(self){//这里self接收节点中定义的this
   //alert(self.id);//获取当前点击的li的id，这里会弹出id的值是test
   self.addClass("lansede").siblings().removeClass("lansede");  
} 

</script> 
<style type="text/css">
	  .bs-docs-sidenav {
    background-color: #fff;
    border-radius: 6px;
    box-shadow: 0 1px 4px rgba(0, 0, 0, 0.067);
    padding: 0;
    width: 170px;
}

.bs-docs-sidenav > li > a {
    border: 1px solid #e5e5e5;
    display: block;
    padding: 8px 14px;
    margin: 0 0 -1px;
}
.bs-docs-sidenav > li:first-child > a {
    border-radius: 6px 6px 0 0;
}
.bs-docs-sidenav > li:last-child > a {
    border-radius: 0 0 6px 6px;
}
.bs-docs-sidenav > .active > a {
    border: 0 none;
    box-shadow: 1px 0 0 rgba(0, 0, 0, 0.1) inset, -1px 0 0 rgba(0, 0, 0, 0.1) inset;
    padding: 9px 15px;
    position: relative;
    text-shadow: 0 1px 0 rgba(0, 0, 0, 0.15);
    z-index: 2;
}
.bs-docs-sidenav .icon-chevron-right {
    float: right;
    margin-right: -6px;
    margin-top: 2px;
    opacity: 0.25;
}
.bs-docs-sidenav > li > a:hover {
    background-color: #f5f5f5;
}
.bs-docs-sidenav a:hover .icon-chevron-right {
    opacity: 0.5;
}
.bs-docs-sidenav .active .icon-chevron-right, .bs-docs-sidenav .active a:hover .icon-chevron-right {
    background-image: url("../img/glyphicons-halflings-white.png");
    opacity: 1;
}
</style>

</head>
<body>
<div class="container-fluid" style="padding-right: 0px;padding-left: 0px;">
	<div region="north" style="height: 100px;background-image: url('images/bg.jpg')">
		<div align="left" style="width: 80%;height:100px ;float: left;padding-top: 40px;padding-left: 30px;" ><font color="white" size="6" >学生宿舍管理系统</font></div>
		<div style="padding-top: 70px;padding-right: 20px;">当前用户：&nbsp;<font color="red" >${currentUser.userName }</font></div>
	</div>
</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<div class="span2 bs-docs-sidebar" > 
				<ul class="nav bs-docs-sidenav" >  
					<li><a href="blank"  >首页</a></li>
					<li><a href="student?action=list"  >学生管理</a></li>
					<li><a href="repairersquery" >维修人员管理</a></li>
					<li><a href="dormBuild?action=list"  >宿舍管理</a></li>
					<li><a href="repairquery"  >维修管理</a></li>
					<li><a href="password?action=preChange"  >修改密码</a></li> 
					<li><a href="login.jsp" >退出系统</a></li>
				</ul>  
			</div>   
					<div class="span10">
						<jsp:include page="${mainPage==null?'admin/blank.jsp':mainPage}"></jsp:include>
					</div>
			</div>
		</div>
</body>
</html>