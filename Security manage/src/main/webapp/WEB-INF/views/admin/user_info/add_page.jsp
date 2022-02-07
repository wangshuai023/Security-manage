<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <script type="text/javascript">
    var uri='${uri}';
        </script>
        <!--[if lt IE 9]>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/html5shiv.js"></script>
            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/respond.min.js"></script>
                <![endif]-->
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui/css/H-ui.min.css" />
                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/H-ui.admin.css" />
                        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/icheck/icheck.css" />
                            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/lib/Hui-iconfont/1.0.8/iconfont.css" />
                                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
                                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/style.css" />
                                        
                                        <style type="text/css">
                                        
                                        .loadingModel {
                                            position: absolute;
                                            top: 0;
                                            left: 0;
                                            display: none;
                                            background-color: rgba(9, 9, 9, 0.63);
                                            width: 100%;
                                            height: 100%;
                                            z-index: 1000;
                                        }
                                        .loading-content {
                                            width: 50%;
                                            text-align: center;
                                            background: #ffffff;
                                            border-radius: 6px;
                                            line-height: 30px;
                                            z-index: 10001;
                                        }
                                        </style>
                                        
                                        <!--[if IE 6]>
                                        <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
                                        <script>DD_belatedPNG.fix('*');</script>
                                        
                                        <![endif]-->
                                        <title></title>
                                        
                                        
                                        </head>
                                        <body>
                                        <div id="loadingDiv"></div>
                                        
                                        <div id="imgModal"></div>
                                        <div class="page-container">
                                        
                                        
                                        <div class="row cl" id="loginNameParentContent" style="margin-top:20px;margin-left:20px;" >
                                        <label class="form-label col-xs-4 col-sm-2">
                                        登录名
                                        </label>
                                        <div class="formControls col-xs-8 col-sm-9">
                                        <input type="text" class="input-text"  style="width:500px;"  placeholder="请输入登录名（登录名只能为为英文或者数字、最长为八位）" id="loginName" maxlength="8" onkeyup="value=value.replace(/[\W]/g,'') "onbeforepaste=”clipboardData.setData(‘text’,clipboardData.getData(‘text’).replace(/[^\d]/g,”))”/>	<span style="color:red">*必填</span>
                                        
                                        </div>
                                        </div>
                                        
                                        <div class="row cl" id="passwordParentContent" style="margin-top:20px;margin-left:20px;" >
                                        <label class="form-label col-xs-4 col-sm-2">
                                        密码
                                        </label>
                                        <div class="formControls col-xs-8 col-sm-9">
                                        <input type="text" class="input-text"  style="width:500px;"  placeholder="请输入密码（密码只能为英文或数字、最长为八位）" id="password" maxlength="8" onkeyup="value=value.replace(/[\W]/g,'') "onbeforepaste=”clipboardData.setData(‘text’,clipboardData.getData(‘text’).replace(/[^\d]/g,”))”/>	<span style="color:red">*必填</span>
                                        
                                        </div>
                                        </div>
                                        
                                        <div class="row cl" id="realNameParentContent" style="margin-top:20px;margin-left:20px;" >
                                        <label class="form-label col-xs-4 col-sm-2">
                                        姓名
                                        </label>
                                        <div class="formControls col-xs-8 col-sm-9">
                                        <input type="text" class="input-text"  style="width:500px;"  placeholder="请输入姓名(姓名只能为汉字)" id="realName" onkeyup="value=value.replace(/[^\u4E00-\u9FA5]/g,'')"
                                               onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\u4E00-\u9FA5]/g,''))">	<span style="color:red">*必填</span>
                                        
                                        </div>
                                        </div>
                                        
                                        <div class="row cl" id="celPhoneParentContent" style="margin-top:20px;margin-left:20px;" >
                                        <label class="form-label col-xs-4 col-sm-2">
                                        联系电话
                                        </label>
                                        <div class="formControls col-xs-8 col-sm-9">
                                        <input type="text" class="input-text"  style="width:500px;"  placeholder="请输入联系电话" id="celPhone">	<span style="color:red">*必填</span>
                                        
                                        </div>
                                        </div>
                                            <div class="row cl" id="sexParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    性别
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <select  id="sex" style="height:30px;width:500px;" >
                                                        <c:forEach items="${sexList}" var="item">
                                                            <option value="${item.id}">${item.name}</option>
                                                        </c:forEach>
                                                    </select>
                                                    <span style="color:red">*必填</span>

                                                </div>
                                            </div>
                                            <div class="row cl" id="departmentParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    部室
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <input type="text" class="input-text"  style="width:500px;" value="${data.department}" placeholder="请输入所属部室" id="department">	<span style="color:red">*必填</span>

                                                </div>
                                            </div>
                                            <div class="row cl" id="regionParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    区域
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <input type="text" class="input-text"  style="width:500px;" value="${data.region}" placeholder="请输入所属区域" id="region">	<span style="color:red">*必填</span>

                                                </div>
                                            </div>
                                            <div class="row cl" id="levelsParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    层级
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <input type="text" class="input-text"  style="width:500px;" value="${data.levels}" placeholder="请输入所属层级" id="levels">	<span style="color:red">*必填</span>

                                                </div>
                                            </div>
                                            <div class="row cl" id="banzuParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    班组
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <input type="text" class="input-text"  style="width:500px;" value="${data.banzu}" placeholder="请输入所属班组" id="banzu">	<span style="color:red">*必填</span>

                                                </div>
                                            </div>
                                            <div class="row cl" id="postParentContent" style="margin-top:20px;margin-left:20px;" >
                                                <label class="form-label col-xs-4 col-sm-2">
                                                    职务
                                                </label>
                                                <div class="formControls col-xs-8 col-sm-9">
                                                    <input type="text" class="input-text"  style="width:500px;" value="${data.post}" placeholder="请输入目前职务" id="post">	<span style="color:red">*必填</span>

                                                </div>
                                            </div>

                                                </div>
                                                
                                                <hr>
                                                
                                                <div class="page-container">
                                                
                                                <div class="row cl" style="margin-top:20px;">
                                                <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-2">
                                                <button onClick="submitData();" class="btn btn-primary radius" type="button"><i class="Hui-iconfont"></i> 保存并提交</button>
                                                <button onClick="javascript:history.back(-1);" class="btn btn-default radius" type="button">返回</button>
                                                
                                                </div>
                                                </div>
                                                </div>
                                                <div style="height:200px"></div>
                                                
                                                
                                                
                                                <!--_footer 作为公共模版分离出去-->
                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    
                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/layer/2.4/layer.js"></script>
                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui/js/H-ui.min.js"></script>
                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer /作为公共模版分离出去-->
                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=7157"></script>
                                                                    
                                                                    
                                                                    
                                                                    <script type="text/javascript">
                                                                    
                                                                    
                                                                    
                                                                    $(function(){
                                                                        
                                                                        
                                                                        
                                                                    })
                                                                    
                                                                    
                                                                    
                                                                    function submitData(){
                                                                        var loginName= $('#loginName').val();
                                                                        var password= $('#password').val();
                                                                        var realName= $('#realName').val();
                                                                        var celPhone= $('#celPhone').val();
                                                                        var sex= $('#sex').val();
                                                                        var department= $('#department').val();
                                                                        var region= $('#region').val();
                                                                        var levels= $('#levels').val();
                                                                        var banzu= $('#banzu').val();
                                                                        var post= $('#post').val();
                                                                        $.ajax({
                                                                            type: 'post',
                                                                            url: '${pageContext.request.contextPath}/admin/user_info/add_submit',
                                                                                data:{
                                                                                    
                                                                                    "loginName":loginName,
                                                                                    "password":password,
                                                                                    "realName":realName,
                                                                                    "celPhone":celPhone,
                                                                                    "sex":sex,
                                                                                    "department":department,
                                                                                    "region":region,
                                                                                    "levels":levels,
                                                                                    "banzu":banzu,
                                                                                    "post":post
                                                                                },
                                                                                success: function(result) {
                                                                                    if(result.code == 0){
                                                                                        alert(result.msg);
                                                                                        }else{
                                                                                            alert(result.msg);
                                                                                            self.location=document.referrer;
                                                                                        }
                                                                                    }
                                                                                });
                                                                            }
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            
                                                                            </script>
                                                                            
                                                                            </body>
                                                                            </html>
