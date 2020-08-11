<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<script type="text/javascript">
	function repairBuildDelete(repairid) {
		if(confirm("您确定要删除这个维修吗？")) {
			window.location="delsturepair?repairid="+repairid;
		}
	} 
	$(document).ready(function(){
		$("ul li:eq(3)").addClass("active");
	});
	
	function openWindow(url, width, height)
	{
	    width = width || 600;
	    height = height || 400;
	    var left = (window.screen.width - width) / 2;
	    var top = (window.screen.height - height) / 2;
	    window.open(url, "_blank", "toolbar=no, location=yes, directories=no, status=no, menubar=no, scrollbars=yes, resizable=no, copyhistory=yes, left="+left+", top="+top+", width="+width+", height="+height);
	}
	
</script>
<div class="data_list">
		<div class="data_list_title" style="text-align: center;">
			维修管理
		</div>
		<form name="myForm" class="form-search" method="post" action="repairBuild?action=search">
				<span class="data_search">
				</span>
		</form>
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
						<th>查看流程图</th>
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
						<c:if test="${repair.flag == null ||repair.flag == 1  }">
						<button class="btn btn-mini btn-info" type="button" 
						onclick="javascript:openWindow('getindexpic?id=${repair.piid}','1000','500')">查看  
						</button>&nbsp;  
						</c:if>
						<c:if test="${repair.flag == 2 ||repair.flag == 3  }">
							流程已结束
						</c:if>
						 </td> 
						<td>
						<c:if test="${repair.flag == null||repair.flag ==0 }">待处理</c:if>
						<c:if test="${repair.flag == 1 }">待维修人员维修</c:if>
						<c:if test="${repair.flag == 2 }"><span style="color: red;">待评价</span></c:if>
						<c:if test="${repair.flag == 3 }">已完成</c:if>
						
						</td>  
						
						<td>
							<c:if test="${repair.flag == 2}">
							<button class="btn btn-mini btn-info" type="button" onclick="javascript:window.location='topingjiarepair?repairid=${repair.repairid}'">评价</button>&nbsp;
							</c:if>
							<c:if test="${repair.flag == null||repair.flag ==0 }">
							<button class="btn btn-mini btn-danger" type="button" onclick="repairBuildDelete(${repair.repairid})">删除</button></td> 
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