<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<script type="text/javascript">
	function dormBuildDelete(dormBuildId) {
		if(confirm("您确定要删除这个宿舍吗？")) {
			window.location="deldorm?dormBuildId="+dormBuildId;
		}
	}
	$(document).ready(function(){
		$("ul li:eq(3)").addClass("active");
	});
</script>
<div class="data_list">
		<div class="data_list_title" style="text-align: center;">
			宿舍管理
		</div>
		<form name="myForm" class="form-search" method="post" action="dormBuild?action=search">
				<button class="btn btn-success"  type="button" style="margin-right: 50px;" onclick="javascript:window.location='adddormui?dormBuildName=${dormBuildName}'" >添加</button>
				<span class="data_search">
				</span>
		</form>
		<div>
				<c:if test="${dorms!=null &&  fn:length(dorms) > 0 }">
			<table class="table table-striped table-bordered table-hover datatable">
				<thead>  
					<tr>
						<th>宿舍楼</th>
						<th>宿舍号</th>
						<th>性别</th>
						<th>几人间</th>
						<th>宿舍电话</th>
						<th width="20%">操作</th>
					</tr>
				</thead>
				<tbody>
				
					<c:forEach  varStatus="i" var="dorm" items="${dorms }">
					<tr>
						<td>${dormBuildName}</td> 
						<td>${dorm.dormName }</td>
						<td>${dorm.dormType }</td>
						<td>${dorm.dormNumber }</td>
						<td>${dorm.dormTel}</td>
						<td>
							<button class="btn btn-mini btn-info" type="button" onclick="javascript:window.location='updatedorm?dormId=${dorm.dormId}&dormBuildName=${dormBuildName}'">修改</button>&nbsp;
							<button class="btn btn-mini btn-danger" type="button" onclick="dormBuildDelete(${dorm.dormId})">删除</button></td>  
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
					<c:if test="${dorms== null || fn:length(dorms) == 0}">
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