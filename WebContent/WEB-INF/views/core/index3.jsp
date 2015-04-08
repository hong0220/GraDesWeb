<%@ page contentType="text/html;charset=UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线测试-分词、标注、情感正负面</title>
<script type="text/javascript" src="resource/js/jquery.min.js"></script>
<script type="text/javascript" src="resource/js/jquery-ui.js"></script>
<!-- 公共js -->
<script type="text/javascript" src="resource/js/common.js"></script>
<link rel="stylesheet" href="resource/css/jquery-ui.css">
<script>
	$(function() {
		$("#tabs").tabs();
	});
</script>
<script type="text/javascript">
    function doFocus(objId){
       document.getElementById(objId).focus();
    }

    //限制可以提交进后台的查询串的长度的最大值
	var max_query_length = 200;
	var urlAction="analyzer";
	
    function doSub(formId,inputPrefix,inputIndex){
        var inputId=inputPrefix+inputIndex;
        var resultId="onlineResult_"+inputIndex;
        
    	var queryValue = document.getElementById(inputId).value;
    	
		queryValue = queryValue.replace(/\s/g, "");
		
		if (queryValue == "") {
			window.alert("查询值不可为空!");
			document.getElementById(inputId).value = "";
			document.getElementById(inputId).focus();
			return;
		}
		
      if(inputId=="input_3"){
        	//截取前指定的最大长度
    		queryValue =queryValue.substr(0, max_query_length);
    		
        	setElementId('realInput',queryValue);
        	setElementId('operType',3);

        	doSubAndFillResult(formId,urlAction,resultId);
        }
    }

    function doSubAndFillResult(formId,urlAction,fillResultDivId){
		jQuery.ajax({
            url: urlAction,   // 请求地址
            data: $('#'+formId).serialize(), // 序列化数据
            type: "POST",             // 请求类型为"POST"，默认为"GET"
            beforeSend: function(){
               turnon('loading');
		    },
            success: function(data) {
		    	turnoff('loading');
			    setElementBeVisible(fillResultDivId);
              	setElementInnerHTML(fillResultDivId,data);
            }
        });
	}

	//给每个文本框架置默认置
	function setDefaultValue(){
		var defaultValue="LESS为CSS赋予了动态语言的特性，如变量、继承、运算、函数。LESS既可以在客户端上运行 (支持IE 6+、Webkit、Firefox)，也可以借助Node.js或者Rhino在服务端运行。";
		setElementId("input_3",defaultValue);
	}
</script>
</head>
<body onload="doFocus(&#39;input_3&#39;)">
	<!-- 遮罩层 -->
	<div id="loading"
		style="top: 0px; left: 0px; height: 100%; width: 100%; z-index: 999; opacity: 0.6; font-size: 14px; line-height: 20px; position: fixed !important; display: none; background: url(http://www.yuqing36524.com:8888/EntityEvalPlatform/images/loading.gif) 50% 50% no-repeat rgb(0, 0, 0);">
		<p id="loading-one"
			style="color: #fff; position: absolute; top: 50%; left: 50%; margin: 30px 0 0 -50px; padding: 3px 10px;">
			页面载入中</p>
	</div>
	<!-- 遮罩层 -->

	<div
		style="font-size: 35px; font-weight: bold; text-align: center; padding: 30px; color: blue;">
		在线测试</div>

	<!--隐藏的form表单定义 -->
	<form id="onlineForm" style="visibility: hidden;">
		<input id="realInput" type="hidden" name="input" value=""> <input
			id="operType" type="hidden" name="operatorType" value="">
	</form>

	<div id="tabs"
		class="ui-tabs ui-widget ui-widget-content ui-corner-all">
		<ul
			class="ui-tabs-nav ui-helper-reset ui-helper-clearfix ui-widget-header ui-corner-all"
			role="tablist">
			<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1"
				aria-controls="tabs-1" aria-labelledby="ui-id-1"
				aria-selected="false"><a onclick="changeTab('index')"
				class="ui-tabs-anchor" role="presentation" tabindex="-1"
				id="ui-id-1">分词</a></li>
			<li class="ui-state-default ui-corner-top" role="tab" tabindex="-1"
				aria-controls="tabs-2" aria-labelledby="ui-id-2"
				aria-selected="false"><a onclick="changeTab('index2')"
				class="ui-tabs-anchor" role="presentation" tabindex="-1"
				id="ui-id-2">词性标注</a></li>
			<li
				class="ui-state-default ui-corner-top ui-tabs-active ui-state-active ui-state-focus"
				role="tab" tabindex="0" aria-controls="tabs-3"
				aria-labelledby="ui-id-3" aria-selected="true"><a
				class="ui-tabs-anchor" role="presentation" tabindex="-1"
				id="ui-id-3">情感正负性</a></li>
		</ul>
		<div id="tabs-3" aria-labelledby="ui-id-3"
			class="ui-tabs-panel ui-widget-content ui-corner-bottom"
			role="tabpanel" aria-expanded="true" aria-hidden="true"
			style="display: block;">
			<!-- 输入串 -->
			<div style="text-align: center;">
				<textarea id="input_3" rows="4" cols="50"
					style="width: 100%; border-style: solid; border-width: 2px; border-color: orange; height: 100px;"></textarea>
				<div style="margin: 20px;">
					<span
						onclick="doSub(&#39;onlineForm&#39;,&#39;input_&#39;,&#39;3&#39;)"
						style="background-color: olive; font-size: 25px; font-weight: bold; padding: 15px; cursor: pointer;">提交</span>
				</div>
			</div>

			<!-- 输出串-->
			<div style="">
				<div id="onlineResult_3"
					style="border-style: solid; border-width: 2px; border-color: red; visibility: hidden; height: 150px;"></div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
	  //实际去给每个文本框默认值
	   setDefaultValue();
	   //关掉遮罩层
	   turnoff('loading');
	</script>
	<script type="text/javascript">
	function changeTab(obj) {
		window.location.href=obj;
	}
	</script>
</body>
</html>