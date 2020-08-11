<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	function checkForm(){
		var dormName=document.getElementById("dormName").value;
		var dormNumber=document.getElementById("dormNumber").value;
		var dormBuildId=document.getElementById("dormBuildId").value;
		var dormName=document.getElementById("dormName").value;
		var name=document.getElementById("name").value;
		var dormType=document.getElementById("dormType").value;
		var domTel=document.getElementById("domTel").value;
		if(dormName==""||dormNumber==""||rPassword==""||name==""||dormType==""||domTel==""||dormBuildId==""||dormName==""){
			document.getElementById("error").innerHTML="信息填写不完整！"; 
			return false;
		} else if(dormNumber!=rPassword){
			document.getElementById("error").innerHTML="密码填写不一致！";
			return false;
		}
		return true;
	}
	
	$(document).ready(function(){
		$("ul li:eq(2)").addClass("active");
	});
</script>
<div class="data_list">
		<div class="data_list_title">
		<c:choose>
			<c:when test="${dorms.dormId!=null }">
				修改宿舍信息
			</c:when>
			<c:otherwise>
				添加宿舍
			</c:otherwise>
		</c:choose>
		</div>
		<c:choose>
			<c:when test="${dorms.dormId!=null }">
		<form action="dormsave" method="post" onsubmit="return checkForm()"> 
			</c:when>
			<c:otherwise>
		<form action="adddorm" method="post" onsubmit="return checkForm()">
			</c:otherwise>
			</c:choose>
			<div class="data_form" >
				<c:if test="${dorms.dormId!=null }">
				<input type="hidden" id="dormId" name="dormId" value="${dorms.dormId }"/>
				<input type="hidden" id="dormBuildName" name="dormBuildName" value="${dormBuild}"/>
				</c:if>
					<table align="center">
						<tr>
							<td><font color="red">*</font>宿舍号：</td>
							<td><input type="number" id="dormName"  name="dormName" value="${dorms.dormName }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>几人间：</td>
							<td><input type="number" id="dormNumber"  name="dormNumber" value="${dorms.dormNumber }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍类型：</td>
							<td>
								<select id="dormType" name="dormType" style="width: 90px;">
									<option value="">请选择...</option>
									<option value="男" ${dorms.dormType eq "男"?'selected':'' }>男</option>
									<option value="女" ${dorms.dormType eq "女"?'selected':'' }>女</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍楼：</td>
							<td>
								<select id="dormBuildId" name="dormBuildId" style="width: 90px;"> 
									<c:forEach var="dormBuild" items="${dormBuilds }">
										<option value="${dormBuild.dormBuildId }" ${dorms.dormBuildId==dormBuild.dormBuildId?'selected':'' }>${dormBuild.dormBuildName }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍电话：</td> 
							<td><input type="number" id="domTel"  name="dormTel" value="${dorms.dormTel }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
					</table>
					<div align="center">
						<input type="submit" class="btn btn-primary" value="保存"/>
						&nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='student'">返回</button>
					</div>
					<div align="center">
						<font id="error" color="red">${error }</font>
					</div>
			</div>
		</form>
</div>