<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<script type="text/javascript">
	
	$(document).ready(function(){
		$("ul li:eq(2)").addClass("active");
	});
</script>
<div class="data_list">
		<div class="data_list_title">
				处理维修
		</div>
		<form action="repaisave" method="post" onsubmit="return checkForm()">
			<div class="data_form" >
				<c:if test="${repair.repairid!=null }">
				<input type="hidden" id="repairid" name="repairid" value="${repair.repairid }"/>
				<input type="hidden" id="repairid" name="piid" value="${repair.piid }"/> 
				
				</c:if>
					<table align="center">
						<tr>
							<td><font color="red">*</font>楼栋号：</td>
							<td><input type="text" id="dormbuildname" readonly="readonly"  value="${repair.dormbuildname }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍号：</td>
							<td><input type="number" id="dormNumber" readonly="readonly"  value="${repair.dormname }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>宿舍电话：</td>
							<td><input type="number" id="repairtel" readonly="readonly"  value="${repair.repairtel }"  style="margin-top:5px;height:30px;" /></td>
						</tr>
						<tr>
							<td><font color="red">*</font>备注：</td>
							<td>${repair.remarks }</td>
						</tr>
						<tr>
							<td><font color="red">*</font>回复：</td>
							<td><textarea id="detail" name="answer" rows="10">${repair.answer }</textarea></td>
						</tr>
						
						<tr>
						<td><font color="red">*</font>请选择维修员：</td>
							<td>
									<select name="repairer"> 
											<option value="无" >请选择维修员</option>
											<c:forEach items="${repairers }" var="repairer">
												<option value="${repairer.name }" ${repairer.name eq repair.repairer? "selected" :"" }>${repairer.name }</option>
											</c:forEach>
									</select>
								
							 </td>
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