<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<script type="text/javascript">
	function repairersDelete(repairid) {
		if(confirm("您确定要删除这个维修人员吗？")) {
			window.location="delrepairer?id="+repairid; 
		}
	}
	$(document).ready(function(){
		$("ul li:eq(3)").addClass("active");
	});
</script>
<div class="data_list">
		<div class="data_list_title" style="text-align: center;">
			维修人员管理
		</div>
			<button class="btn btn-success" type="button" style="margin-right: 50px;" onclick="javascript:window.location='toaddrepairer'">添加</button>
		<!-- <form name="myForm" class="form-search" method="post" action="repairBuild?action=search">
				<span class="data_search">
				</span>
		</form> -->
		<div style="text-align: center;font-size: 20px;color: red;">${msg}</div>
		<div>
				<c:if test="${repairers!=null &&  fn:length(repairers) > 0 }">
			<table class="table table-hover table-striped table-bordered">
				<tr>
					<th>编号</th>
					<th>用户名</th>
					<th>密码</th>
					<th>姓名</th>
					<th>性别</th>
					<th>联系电话</th>
					<th>操作</th>
				</tr>
				<c:forEach  varStatus="i" var="repairer" items="${repairers }">
					<tr>
						<td>${i.count+(page-1)*pageSize }</td>
						<td>${repairer.username }</td>
						<td>${repairer.password }</td>
						<td>${repairer.name }</td>
						<td>${repairer.sex}</td>
						<td>${repairer.tel }</td>
						<td><button class="btn btn-mini btn-info" type="button" onclick="javascript:window.location='toupdaterepairer?id=${repairer.dormmanid }'">修改</button>&nbsp;
							<button class="btn btn-mini btn-danger" type="button" onclick="repairersDelete(${repairer.dormmanid})">删除</button></td> 
					</tr>
				</c:forEach>
			</table>
			</c:if>
					<c:if test="${repairers== null || fn:length(repairers) == 0}">
					<p style="text-align: center; font-size: 15px; color: #aaa">啊哦,没有数据呢~</p>
					</c:if> 
		</div> 
		<div align="center"><font color="red">${error }</font></div>
		<div class="pagination pagination-centered">
			<ul>
				${pageCode }
			</ul>
		</div>
</div>