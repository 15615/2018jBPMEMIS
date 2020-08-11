<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<script type="text/javascript">
	function repairBuildDelete(repairid,piid) {
		if(confirm("确定该报修订单已维修成功了么?？")) {
			window.location="repairersuccess?repairid="+repairid+"&piid="+piid;  
		}
	}
	$(document).ready(function(){
		$("ul li:eq(3)").addClass("active");
	});
</script>
<div class="data_list">
		<div class="data_list_title" style="text-align: center;">
			维修管理
		</div>
		<!-- <form name="myForm" class="form-search" method="post" action="repairBuild?action=search">
				<span class="data_search">
				</span>
		</form> -->
		<div>
				<c:if test="${repairs!=null &&  fn:length(repairs) > 0 }">
			<table class="table table-striped table-bordered table-hover datatable">
				<thead>  
					<tr>
						<th>楼栋</th>
						<th>宿舍号</th>
						<th>维修电话</th>
						<th>原因</th>
						<th>回复</th>
						<th>维修员</th>
						<th>评分</th>
						<th>评价</th>
						<th>状态</th>
						<th width="8%">操作</th>
					</tr>
				</thead> 
				<tbody>
					<c:forEach  varStatus="i" var="repair" items="${repairs }"> 
					<tr>
						<td>${repair.dormbuildname}</td>
						<td>${repair.dormname }</td>
						<td>${repair.repairtel != null?repair.repairtel:"无"  }</td>
						<td>${repair.remarks != null?repair.remarks:"无" }</td> 
						<td>${repair.answer!= null?repair.answer:"无"  }</td>
						<td>${repair.repairer!= null?repair.repairer:"无"  }</td>
						<td>${repair.marks != null?repair.marks:"无" }</td>
						<td>${repair.assess != null?repair.assess:"无"  }</td> 
						<td>
						<c:if test="${repair.flag == 1 }">待维修</c:if>
						<c:if test="${repair.flag != 1 }">已维修</c:if>
						</td>  
						
						<td>
							<c:if test="${repair.flag == 1}">
							<button class="btn btn-mini btn-danger" type="button" onclick="repairBuildDelete(${repair.repairid},'${repair.piid}')">处理完成</button></td>  
							</c:if>
							<c:if test="${repair.flag != 1}">
								无
							</c:if>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			</c:if>
					<c:if test="${repairs== null || fn:length(repairs) == 0}"> 
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