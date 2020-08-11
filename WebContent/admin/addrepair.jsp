<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("ul li:eq(2)").addClass("active");
	});
	function selectFunction() { 
		  var dormBuild = document.getElementById("dormBuildId");
		  var secSelect = document.getElementById("secSelect");
		  secSelect.options.length = 0; 
			var value =dormBuild.options[dormBuild.selectedIndex].label; 
			if (value !=-1) {
				
				 $.post("${pageContext.request.contextPath}/getdorm",
						    {
						         "value" : value,
						 		 dataType: "json"
						     }, function(data) { 
						         if(data.length >0){ 
							  		for ( var i = 0; i < data.length; i++) { 
							          var oOption = document.createElement("OPTION");
							          oOption.value = data[i].dormName;
							          oOption.text = data[i].dormName;  
							          secSelect.options.add(oOption);
							         }
						  		}else{ 
						  			var oOption = document.createElement("OPTION");
									  oOption.text = "暂无宿舍";   
									  secSelect.options.add(oOption);
						  		}
						        }); 
				
				
				
			}
		  
		  
	}

</script>
<div class="data_list">
		<div class="data_list_title">
				添加维修 
		</div>
		<form action="addrepair" method="post" onsubmit="return checkForm()">
			<div class="data_form" >
				
					<table align="center">
						<tr>
							<td><font color="red">*</font>楼栋号：</td>
							<td>
							<select onchange="selectFunction()" id="dormBuildId" name="dormbuildname" style="width: 90px;"> 
									<option  value="-1" selected="selected" >-请选择-</option> 
									<c:forEach var="dormBuild" items="${dormBuilds }"> 
										<option  value="${dormBuild.dormBuildName }" label="${dormBuild.dormBuildId }" >${dormBuild.dormBuildName }</option>
									</c:forEach>
								</select> 
							</td> 
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍号：</td>
							<td>
							<!-- <input type="number" id="dormNumber" placeholder="请输入宿舍号"   style="margin-top:5px;height:30px;" /> -->
							<select name="dormname"  id="secSelect" style="width: 155px"> 
							<option  value="-1" selected="selected" >-请选择-</option> 
							</select>
							</td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍电话：</td>
							<td><input type="number" id="repairtel" name="repairtel"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>备注：</td>
							<td>
							<textarea id="detail" name="remarks" rows="10">${repair.remarks}</textarea>
							</td>
						</tr>
					</table>
					<div align="center">
						<input type="submit" class="btn btn-primary" value="添加"/>
						&nbsp;<button class="btn btn-primary" type="button" onclick="javascript:window.location='student'">返回</button>
					</div>
					<div align="center">
						<font id="error" color="red">${error }</font>
					</div>
			</div>
		</form>
</div>
