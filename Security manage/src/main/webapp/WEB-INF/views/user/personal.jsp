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
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/html5shiv.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/respond.min.js"></script>
        <![endif]-->
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui/css/H-ui.min.css" />
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/H-ui.admin.css" />
                <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/lib/Hui-iconfont/1.0.8/iconfont.css" />
                    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
                        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/style.css" />
                            <!--[if IE 6]>
                            <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
                            <script>DD_belatedPNG.fix('*');</script>
                            <![endif]-->
                            <title>个人中心</title>
                            </head>
                            <body>
                            <div class="page-container">
                            <table class="table table-border table-bordered table-bg mt-20">
                            <thead>
                            <tr>
                            <th colspan="2" scope="col">个人中心</th>
                            </tr>
                            </thead>
                            <tbody>
                            
                            <tr>
                            <th width="10%">登录名</th>
                            <th width="90%"  >${detail.userInfo.loginName}</th>
                                </tr>
                                <tr>
                                <th width="10%">姓名</th>
                                <th width="90%"  >${detail.userInfo.realName}</th>
                                    </tr>
                                    <tr>
                                    <th width="10%">联系电话</th>
                                    <th width="90%"  >${detail.userInfo.celPhone}</th>
                                        </tr>
                                        <tr>
                                        <th width="10%">性别</th>
                                        <th width="90%"  >${detail.sexStr}</th>
                                            </tr>
                            <tr>
                                <th width="10%">部室</th>
                                <th width="90%"  >${detail.userInfo.department}</th>
                            </tr>
                            <tr>
                                <th width="10%">区域</th>
                                <th width="90%"  >${detail.userInfo.region}</th>
                            </tr>
                            <tr>
                                <th width="10%">层级</th>
                                <th width="90%"  >${detail.userInfo.levels}</th>
                            </tr>
                            <tr>
                                <th width="10%">班组</th>
                                <th width="90%"  >${detail.userInfo.banzu}</th>
                            </tr>
                            <tr>
                                <th width="10%">职务</th>
                                <th width="90%"  >${detail.userInfo.post}</th>
                            </tr>

                                            <tr>
                                            <th width="10%">注册时间</th>
                                            <th width="90%"  >${detail.userInfo.createTime}</th>
                                                </tr>
                                                
                                                
                                                </tbody>
                                                </table>
                                                </div>
                                                <div style="margin-left:30px;">
                                                <a href="${pageContext.request.contextPath}/user/user_info/update?id=${detail.userInfo.id}" class="btn btn-primary  radius">修改</a>
                                                    </div>
                                                    <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script>
                                                        <script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui/js/H-ui.min.js"></script>
                                                            <script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=#随机码#"></script>
                                                                
                                                                <script type="text/javascript">
                                                                
                                                                $(function(){
                                                                    
                                                                })
                                                                </script>
                                                                </body>
                                                                </html>
