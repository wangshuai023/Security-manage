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
<!--[if lt IE 9]>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/html5shiv.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/css/style.css" />
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
<title>会议室使用统计</title>
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
<nav class="breadcrumb"><i class="Hui-iconfont"></i>会议室使用统计<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont"></i></a></nav>
<div class="page-container">
	<div class="cl pd-5 bg-1 bk-gray mt-20"  style="margin-bottom:30px">
会议室统计
</div>

<div style="display:inline">
          <p style="display:inline-block;margin-top:30px"> 
              <span style="margin-left:50px;">预约日期</span>
              <input type="text" class="input-text Wdate"  readonly="readonly"  style="width:150px;"   onFocus="WdatePicker({startDate: '%y-%M-%d' })"  placeholder="请输入预约日期最小值进行查询" id="meOrderDate1">~<input type="text" class="input-text Wdate"  readonly="readonly"  style="width:150px;"   onFocus="WdatePicker({startDate: '%y-%M-%d' })"  placeholder="请输入预约日期最大值进行查询" id="meOrderDate2">
           </p>
      </div>

<button type="button" onclick="roomGather();" style="margin-left:30px" class="btn btn-success" ><i class="Hui-iconfont"></i> 查询</button>
<div id="roomGather" style="width: 1100px;height:400px;margin-top:30px;"></div>

</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/jquery-1.11.1.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/page/myPagination.js"></script>

<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui/js/H-ui.min.js"></script> 
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/static/h-ui.admin/js/H-ui.admin.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/admin/lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/echarts/echarts.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/My97DatePicker/4.8/WdatePicker.js"></script> 



<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/utils/listutils.js?v=2214"></script>


<script type="text/javascript">

 $(function(){
 roomGather();

	 
 });
 

 
 function roomGather() {
	showLoading('${pageContext.request.contextPath}/static/common/loading.gif');	
	$.ajax({
		type : 'get',
		url : "${pageContext.request.contextPath}/commonapi/meetingUsedGather/roomGatherSubmit",
		data : {
					'meroomId':${rid},
					'meorderDate1':$("#meOrderDate1").val(),
					'meorderDate2':$("#meOrderDate2").val()	},
	success : function(result) {
		 hideLoading();
  var myChart = echarts.init(document.getElementById('roomGather'));
var option = {
    title : {
        text: '会议室统计',
        subtext: '会议室统计'
    },
    tooltip : {
        trigger: 'axis'
    },
    legend: {
        data:['会议室统计']
    },
     toolbox: {
        show : false,
        feature : {
            mark : {show: true},
            magicType : {
            	show: true, 
            	type: ['line', 'bar'],
            	title:['转为折线图','转为柱状图']
            },
            saveAsImage : {
            	show: true,
            	title :'保存为图片'
            }
        }
    },
    calculable : true,
    xAxis : [
        {
            type : 'category',
            boundaryGap : false
        }
    ],
    yAxis : [
        {
            type : 'value',
            axisLabel : {
                formatter: '{value} '
            }
        }
    ],
    series : [
         {
            name:'会议室统计',
            type:'line',
            markPoint : {
                data : [
                    {type : 'max', name: '最大值'},
                    {type : 'min', name: '最小值'}
                ]
            },
            markLine : {
                data : [
                    {type : 'average', name: '平均值'}
                ]
            }
  }

    ]
};
 var rsList1X=[];
 var rsList1Y=[];
 for(var i=0;i<result.orderDateXList.length;i++){
   rsList1X.push(result.orderDateXList[i]);
 }
rsList1X.sort((a, b) => a - b);
 for(var i=0;i<rsList1X.length;i++){
 	var isFound=0;
 	for(var j=0;j<result.rsList1.length;j++){
			if(result.rsList1[j].col1==rsList1X[i]){
   			rsList1Y.push(result.rsList1[j].col2);
   			isFound=1;
			}
	 	}
 	if(isFound==0){
 		rsList1Y.push(0);
 	}
 }
   option.xAxis[0].data=rsList1X;
   option.series[0].data=rsList1Y;
myChart.setOption(option);
			}
		});
 }


function gotoPage(e){
	var pageName = $(e).attr("page-name");
	var url = $(e).attr("data-url");
	creatIframe(url,pageName);
}



</script>
</body>
</html>