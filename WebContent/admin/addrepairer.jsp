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
			<c:when test="${tDormmanager.dormmanid!=null }">
				修改维修员信息
			</c:when>
			<c:otherwise>
				添加维修员
			</c:otherwise>
		</c:choose>
		</div>
		<c:choose>
			<c:when test="${tDormmanager.dormmanid!=null }">
		<form action="updatereparier" method="post" onsubmit="return checkForm()"> 
			</c:when>
			<c:otherwise>
		<form action="addrepairer" method="post" onsubmit="return checkForm()">
			</c:otherwise>
			</c:choose>
			<div class="data_form" >
				<c:if test="${tDormmanager.dormmanid!=null }">
				<input type="hidden" id="dormManId" name="dormmanid" value="${tDormmanager.dormmanid }"/>
				</c:if>
					<table align="center">
						<tr>
							<td><font color="red">*</font>维修员用户名：</td>
							<td><input type="text" id="dormName"  name="username" value="${tDormmanager.username }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>维修员密码：</td>
							<td><input type="password" id="dormNumber"  name="password" value="${tDormmanager.password }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>维修员性别：</td>
							<td>
								<select id="dormType" name="sex" style="width: 90px;">
									<option value="">请选择...</option>
									<option value="男" ${tDormmanager.sex eq "男"?'selected':'' }>男</option>
									<option value="女" ${tDormmanager.sex eq "女"?'selected':'' }>女</option>
								</select>
							</td>
						</tr>
						<tr>
							<td><font color="red">*</font>维修员姓名：</td>
							<td><input type="text" id="dormName"  name="name" value="${tDormmanager.name }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>维修员电话：</td> 
							<td><input type="number" id="domTel"  name="tel" value="${tDormmanager.tel }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
					</table>
					<div align="center">
						<input type="submit" class="btn btn-primary" value="保存"/>
						&nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='repairquery'">返回</button>
					</div>
					<div align="center">
						<font id="error" color="red">${error }</font>
					</div>
			</div>
		</form>
</div>