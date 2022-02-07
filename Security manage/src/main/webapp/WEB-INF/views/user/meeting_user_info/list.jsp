<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<c:set var="uri" value="${pageContext.request.contextPath}" />
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/html5shiv.js"></script>
        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/respond.min.js"></script>
            <![endif]-->
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui/css/H-ui.min.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/H-ui.admin.css" />
                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/lib/Hui-iconfont/1.0.8/iconfont.css" />
                        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/skin/green/skin.css" id="skin" />
                            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/style.css" />
                                <!--[if IE 6]>
                                <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
                                <script>DD_belatedPNG.fix('*');</script>
                                <![endif]-->
                                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/common/page/myPagination.css?t=4" />
                                    
                                    <style type="text/css">
                                    .btnStyle{
                                        margin-left:8px;
                                        margin-top:8px
                                    }
                                    .loadingModel {
                                        position: absolute;
                                        top: 0;
                                        left: 0;
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
                                    
                                    <script>DD_belatedPNG.fix('*');</script>
                                    <![endif]-->
                                    <title>参会人员</title>
                                    </head>
                                    <body>
                                    <div id="loadingDiv"></div>
                                    <div id="bodyModal" class="modal fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                                    <div class="modal-dialog">
                                    <div class="modal-content radius">
                                    <div class="modal-header">
                                    <h3 class="modal-title" id="bodyModalTile"></h3>
                                    <a class="close" data-dismiss="modal" aria-hidden="true" href="javascript:void();">×</a>
                                    </div>
                                    <div class="modal-body" id="bodyModalContent">
                                    </div>
                                    <div class="modal-footer">
                                    <button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
                                    </div>
                                    </div>
                                    </div>
                                    </div>
                                    <nav class="breadcrumb"><i class="Hui-iconfont"></i>参会人员<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont"></i></a></nav>
                                    <div class="page-container">
                                    
                                    <div style="display:inline">
                                    <p style="display:inline-block;margin-top:30px">
                                    <span style="margin-left:50px;">签到状态</span>
                                    <select  id="signStatus" style="height:30px;width:250px;" >
                                    <option value="">全部</option>
                                    <c:forEach items="${signStatusList}" var="item">
                                        <option value="${item.id}">${item.name}</option>
                                            </c:forEach>
                                            </select>
                                            
                                            </p>
                                            </div>
                                            
                                            <button type="button" onclick="ajaxList(1);" style="margin-left:30px" class="btn btn-success" ><i class="Hui-iconfont"></i> 查询</button>
                                            
                                            
                                            <div class="cl pd-5 bg-1 bk-gray mt-20">
                                            <span class="l" id="globalBtns">
                                            
                                             <c:if test="${isFQ==1}">
                                               <a href="${pageContext.request.contextPath}/user/meeting_user_info/add?meetingId=${data.meetingId}&userId=${data.userId}" class="btn btn-success radius">添加参会人员</a>
                                                <a href="javascript:;" onclick="$('#import_user_input').click()" class="btn btn-warning radius">导入人员</a>
                                                <a href="${pageContext.request.contextPath}/user/meeting_user_info/import_user_model" class="btn btn-warning radius" style="background-color:#D4F2E7;color:black">下载导入人员模板</a>
                                                    <form id="import_userForm"  style="margin:0px;display: inline" action="${pageContext.request.contextPath}/user/meeting_user_info/import_user?meetingId=${data.meetingId}&userId=${data.userId}" enctype="multipart/form-data" method="post">
                                                        <div style="display:none;"><input type="file" name="file" onclick="this.form.reset();" id="import_user_input" /></div>
                                                        </form>
                                             </c:if>
                                          
                                                        
                                                        
                                                        
                                                        
                                                        </span>
                                                        <span id="batchUpdateDiv">
                                                        
                                                        </span>
                                                        </div>
                                                        
                                                        <table class="table table-border table-bordered table-hover table-bg table-sort" style="">
                                                        <thead>
                                                        <tr style="text-align:center">
                                                        <th>会议ID</th>
                                                        <th>会议发起人</th>
                                                        <th>参会人员</th>
                                                        <th>姓名</th>
                                                        <th>用户手机号</th>
                                                        <th>会议日期</th>
                                                        <th>会议时间</th>
                                                        <th>签到状态</th>
                                                        <th>发起时间</th>
                                                        <th style="width:200px;">操作</th>
                                                        
                                                        </tr>
                                                        </thead>
                                                        <tbody id="meeting_user_info_body">
                                                        </tbody>
                                                        </table>
                                                        
                                                        <div id="meeting_user_info_bar" class="pagination" style="margin-top:20px;">
                                                        </div>
                                                        <div>
                                                        </div>
                                                        </div>
                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>
                                                                
                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-form.js"></script>
                                                                    
                                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/layer/2.4/layer.js"></script>
                                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui/js/H-ui.min.js"></script>
                                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->
                                                                                <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/jquery.contextmenu/jquery.contextmenu.r2.js"></script>
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    
                                                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=9231"></script>
                                                                                        
                                                                                        
                                                                                        <script type="text/javascript">
                                                                                        
                                                                                        $(function(){
                                                                                            $('input[id=import_user_input]').on('change',function() {
                                                                                                showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                                                                    $('#import_userForm').ajaxSubmit({
                                                                                                        success: function (data) {
                                                                                                            hideLoading();
                                                                                                            alert(data.msg);
                                                                                                            ajaxList(1);
                                                                                                        }
                                                                                                    });
                                                                                                });
                                                                                                
                                                                                                ajaxList(1);
                                                                                                
                                                                                                
                                                                                            });
                                                                                            
                                                                                            
                                                                                            
                                                                                            
                                                                                            
                                                                                            
                                                                                            function ajaxList(page) {
                                                                                                var signStatus = $("#signStatus").val();
                                                                                                
                                                                                                showLoading('${pageContext.request.contextPath}/static/common/loading.gif');
                                                                                                    $.ajax({
                                                                                                        type : 'get',
                                                                                                        url : "${pageContext.request.contextPath}/user/meeting_user_info/queryList",
                                                                                                            data : {
                                                                                                                "meetingId":"${data.meetingId}",
                                                                                                                    "userId":"${data.userId}",
                                                                                                                        
                                                                                                                        "page":page,
                                                                                                                        "signStatus":signStatus
                                                                                                                        
                                                                                                                    },
                                                                                                                    success : function(result) {
                                                                                                                        hideLoading();
                                                                                                                        var rows = result.list;//得到数据列
                                                                                                                        var total = result.count;//得到数据总数
                                                                                                                        lastPage=result.totalPage;
                                                                                                                        totalCount=total;
                                                                                                                        var html = '';
                                                                                                                        for (var i = 0; i < rows.length; i++) {
                                                                                                                            html += '<tr>' ;
                                                                                                                            var meetingIdVal=setNullToEmpty(rows[i].meetingIdStr);
                                                                                                                            html+='<td>'+ meetingIdVal+'</td>';
                                                                                                                            var meetingUserIdVal=setNullToEmpty(rows[i].meetingUserIdStr);
                                                                                                                            html+='<td>'+ meetingUserIdVal+'</td>';
                                                                                                                            var userIdVal=setNullToEmpty(rows[i].userIdStr);
                                                                                                                            html+='<td>'+ userIdVal+'</td>';
                                                                                                                            var userNameVal=setNullToEmpty(rows[i].meetingUserInfo.userName);
                                                                                                                            html+='<td>'+ userNameVal+'</td>';
                                                                                                                            var userCelVal=setNullToEmpty(rows[i].meetingUserInfo.userCel);
                                                                                                                            html+='<td>'+ userCelVal+'</td>';
                                                                                                                            var orderDateVal=setNullToEmpty(rows[i].meetingUserInfo.orderDate);
                                                                                                                            html+='<td>'+ orderDateVal+'</td>';
                                                                                                                            var orderTimeVal=setNullToEmpty(rows[i].orderTimeStr);
                                                                                                                            orderTimeVal ='<span class="badge badge-success radius">'+orderTimeVal+'</span>'
                                                                                                                            
                                                                                                                            html+='<td>'+orderTimeVal+'</td>';
                                                                                                                            var signStatusVal=setNullToEmpty(rows[i].signStatusStr);
                                                                                                                            if(rows[i].meetingUserInfo.signStatus=='1'){
                                                                                                                                signStatusVal ='<span class="badge badge-secondary radius">'+signStatusVal+'</span>';
                                                                                                                                
                                                                                                                                
                                                                                                                            }
                                                                                                                            if(rows[i].meetingUserInfo.signStatus=='2'){
                                                                                                                                signStatusVal ='<span class="badge badge-success radius">'+signStatusVal+'</span>';
                                                                                                                                
                                                                                                                                
                                                                                                                            }
                                                                                                                            if(rows[i].meetingUserInfo.signStatus=='3'){
                                                                                                                                signStatusVal ='<span class="badge badge-warning radius">'+signStatusVal+'</span>';
                                                                                                                                
                                                                                                                                
                                                                                                                            }
                                                                                                                            if(rows[i].meetingUserInfo.signStatus=='4'){
                                                                                                                                signStatusVal ='<span class="badge badge-danger radius">'+signStatusVal+'</span>';
                                                                                                                                
                                                                                                                                
                                                                                                                            }
                                                                                                                            html+='<td>'+signStatusVal+'</td>';
                                                                                                                            var createTimeVal=setNullToEmpty(rows[i].meetingUserInfo.createTime);
                                                                                                                            html+='<td>'+ createTimeVal+'</td>';
                                                                                                                            html+='<td>';
                                                                                                                            if(rows[i].meetingUserInfo.meetingUserId=='${user.id}'){
                                                                                                                                html+='<a href="javascript:void(0)" onclick="del(this)" data-id="'+rows[i].meetingUserInfo.id+'" class="btn btn-danger  radius btnStyle">删除</a>';
                                                                                                                            }
                                                                                                                            if(rows[i].meetingUserInfo.userId=='${user.id}'&&rows[i].meetingUserInfo.signStatus=='1'){
                                                                                                                                html+='<a href="javascript:void(0)" onclick="sign(this)" data-id="'+rows[i].meetingUserInfo.id+'" act-type="1" class="btn btn-warning radius btnStyle">签到</a>';
                                                                                                                            }
                                                                                                                            html+='</td>';
                                                                                                                            html+='</tr>';
                                                                                                                        }
                                                                                                                        if (rows.length == 0) {
                                                                                                                            html += '<tr><td></td><td></td><td></td><td></td><td></td><td>无数据</td><td></td><td></td><td></td><td></td></tr>';
                                                                                                                        }
                                                                                                                        $("#meeting_user_info_body").html(html);
                                                                                                                        
                                                                                                                        
                                                                                                                        new myPagination({
                                                                                                                            id: 'meeting_user_info_bar',
                                                                                                                            curPage:page, //初始页码
                                                                                                                            pageTotal: result.totalPage, //总页数
                                                                                                                            pageAmount: 10,  //每页多少条
                                                                                                                            dataTotal: total, //总共多少条数据
                                                                                                                            pageSize: 5, //可选,分页个数
                                                                                                                            showPageTotalFlag:true, //是否显示数据统计
                                                                                                                            showSkipInputFlag:false, //是否支持跳转
                                                                                                                            getPage: function (page) {
                                                                                                                                ajaxList(page);
                                                                                                                            }
                                                                                                                        })
                                                                                                                        
                                                                                                                    }
                                                                                                                });
                                                                                                            }
                                                                                                            
                                                                                                            function sign(e){
                                                                                                                var r=confirm("确认签到该参会人员？");
                                                                                                                if(r==true){
                                                                                                                    var id = $(e).attr("data-id");
                                                                                                                    $.ajax({
                                                                                                                        type : 'get',
                                                                                                                        url : "${pageContext.request.contextPath}/user/meeting_user_info/sign",
                                                                                                                            data : {
                                                                                                                                "id":id
                                                                                                                            },
                                                                                                                            success : function(result) {
                                                                                                                                alert(result.msg);
                                                                                                                                if(result.code==1){
                                                                                                                                    ajaxList(1);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        });
                                                                                                                    }
                                                                                                                }
                                                                                                                function del(e){
                                                                                                                    if(window.confirm('你确定要删除该参会人员吗')){
                                                                                                                        var id = $(e).attr("data-id");
                                                                                                                        $.ajax({
                                                                                                                            type : 'get',
                                                                                                                            url : "${pageContext.request.contextPath}/user/meeting_user_info/del",
                                                                                                                                data : {
                                                                                                                                    "id":id
                                                                                                                                },
                                                                                                                                success : function(result) {
                                                                                                                                    alert(result.msg);
                                                                                                                                    if(result.code==1){
                                                                                                                                        ajaxList(1);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            });
                                                                                                                            return true;
                                                                                                                            }else{
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        
                                                                                                                        
                                                                                                                        function gotoPage(e){
                                                                                                                            var pageName = $(e).attr("page-name");
                                                                                                                            var url = $(e).attr("data-url");
                                                                                                                            creatIframe(url,pageName);
                                                                                                                        }
                                                                                                                        
                                                                                                                        
                                                                                                                        
                                                                                                                        </script>
                                                                                                                        </body>
                                                                                                                        </html>
