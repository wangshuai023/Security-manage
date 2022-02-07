<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
	<meta http-equiv="Pragma" content="no-cache"> 
	<meta http-equiv="Cache-Control" content="no-cache"> 
	<meta http-equiv="Expires" content="0"> 
	<title>轨梁厂安全网格化智能管控系统-用户-注册</title>
	<link href="${pageContext.request.contextPath}/static/login/css/login.css" rel="stylesheet" type="text/css" />
	
</head>

<body >
<div class="login_box" style="verflow-y:auto;">
      <div class="login_l_img"></div>
      <div class="login" >
          <div class="login_name">
               <p>新用户注册</p>
          </div>
          <div>
					<div>
			登录名<input id="name" name="name" type="text" placeholder="请输入登录名（登录名只能为英文或者数字、最长为八位）"  class="" maxlength="8" onkeyup="value=value.replace(/[\W]/g,'') "onbeforepaste=”clipboardData.setData(‘text’,clipboardData.getData(‘text’).replace(/[^\d]/g,”))”/>
         </div>
					  
					  <div>
			密码<input id="password" name="password" type="password" placeholder="请输入密码（密码只能为英文或数字、最长为八位）"  class="" maxlength="8" onkeyup="value=value.replace(/[\W]/g,'') "onbeforepaste=”clipboardData.setData(‘text’,clipboardData.getData(‘text’).replace(/[^\d]/g,”))”/>

         </div>
			  <div>
			姓名<input id="realName" name="realName" type="text" placeholder="请输入姓名(姓名只能为汉字)"  class="" onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')"
					 onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))">
         </div>
			  <div>
			联系电话<input id="celPhone" name="celPhone" type="text" placeholder="请输入联系电话"  class="">
         </div>

			  <div>
			性别<select  style="width:100%;height:40px"  id="sex" name="sex"  >
<c:forEach items="${sexList}" var="item"> 
  <option value="${item.id}">${item.name}</option>
</c:forEach>
 </select>

         </div>


						<div style="min-height:40px;margin-top:18px">
							图片验证码
							  <input  id="imgCode" name="imgCode" type="text" placeholder="验证码"  style="width:55%">
							 <img id="codeImg1"  name="codeImg" alt="点击更换" title="点击更换" style="height:30px;width:120px;float:right">	
						</div>

						<a  style="margin-left:10px;" href="${pageContext.request.contextPath}/commonapi/sys_login" onclick="" >前往登录</a>

              <input value="用户-注册" style="width:100%;margin-top:40px;" type="button" onclick="submitForm()">
          </div>
      </div>
      <div class="copyright">Copyright ©2022 包钢钢联股份公司轨梁轧钢厂</div>
</div>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=26573"></script>


<script>

	$(document).ready(function(e) {
		changeCode();
		$("#codeImg1").bind("click",changeCode);
		
	});

	function genTimestamp(){
		var time = new Date();
		return time.getTime();
	}
	function changeCode(){
		$("img[name='codeImg']").attr("src","${pageContext.request.contextPath}/commonapi/code?t="+genTimestamp());
	}



 function submitForm(){
 
		  $.ajax({
			    type: 'post',
			    url: '${pageContext.request.contextPath}/commonapi/userInfoRegistSubmit',
			    data: {
					'name':$("#name").val(),
'password':$("#password").val(),
'realName':$("#realName").val(),
'celPhone':$("#celPhone").val(),
'sex':$("#sex").val(),
					'department':$("#department").val(),
					'region':$("#region").val(),
					'levels':$("#levels").val(),
					'group':$("#group").val(),
					'post':$("#post").val(),
'imgCode':$('#imgCode').val()
			    },
			    success: function(result) {
			    	 
					 		alert(result.msg);
 		if(result.code==1){
 		window.location.href="${pageContext.request.contextPath}/commonapi/sys_login"; 
 	} 

			    }
			});
 }
 $(function(){

 })

</script>
</body>
</html>