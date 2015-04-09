<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 导入自己的css -->
<link type="text/css" href="${ctx}/resource/css/css.css"
	rel="stylesheet">
<!-- 公共js -->
<script type="text/javascript" src="${ctx}/resource/js/common.js"></script>
<!-- 翻页 -->
<script type="text/javascript" src="${ctx}/resource/js/pageSplit.js"></script>
<title>微博博主主页</title>
</head>
<body>
	<!-- 遮罩层 -->
	<div id="loading"
		style="top: 0px; left: 0px; height: 100%; width: 100%; z-index: 999; opacity: 0.6; font-size: 14px; line-height: 20px; position: fixed !important; display: none; background: url(resource/images/loading.gif) 50% 50% no-repeat rgb(0, 0, 0);">
		<p id="loading-one"
			style="color: #fff; position: absolute; top: 50%; left: 50%; margin: 30px 0 0 -50px; padding: 3px 10px;">
			页面载入中</p>
	</div>
	<!-- 遮罩层 -->

	<div style="text-align: center; font-size: 20px; font-weight: bold;"
		class="">
		<span title="normal" class="index_tags_span_block"
			style="width: 100px;">股评家</span>
	</div>

	<!-- 数据显示部分 -->
	<div style="padding: 50px;">
		<!-- 输出博主类型的搜索结果集 -->
		<table style="width: 80%" cellpadding="8px;">
			<tbody>
				<tr style="background: gray;">
					<td>昵称</td>
					<td>个人签名备注</td>
					<td>粉丝数</td>
					<td>微博数</td>
					<td>操作</td>
				</tr>

				<c:forEach var="o" items="${vo}" varStatus="status">
					<div class="grid">
						<tr>
							<td style="vertical-align: middle; border-bottom: 1px dotted red">
								<div style="text-align: left;">
									<a target="_blank" href="${ctx}/stream?userId=${o.userId }">
										${o.name }</a>
								</div>
							</td>
							<!-- 认证消息 -->
							<td style="vertical-align: middle; border-bottom: 1px dotted red">
								${o.verify }</td>
							<!-- 粉丝数 -->
							<td style="vertical-align: middle; border-bottom: 1px dotted red">
								<span>${o.fan } </span>
							</td>
							<!-- 微博数 -->
							<td style="vertical-align: middle; border-bottom: 1px dotted red">
								<span>${o.post } </span>
							</td>
							<!-- 操作 -->
							<td style="vertical-align: middle; border-bottom: 1px dotted red">
								<div
									style="font-size: 16px; font-weight: bold; background: orange; text-align: center; padding: 5px; width: 120px; cursor: pointer;">
									<a target="_blank" href="${ctx}/statistic?userId=${o.userId }">情感分析</a>
								</div>
							</td>
						</tr>
					</div>
				</c:forEach>

			</tbody>
		</table>
	</div>

	<div style="width: 80%; border: 0px; text-align: right">
		<div class="grayr">
			共找到 <font color="red">58362</font>条结果 <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpPage(1)">首页 </a> <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpFront(1)"> &lt; </a> <span class="current">1</span> <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpPage(2)">2</a> <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpPage(10)">10</a> <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpNext(1,667)"> &gt; </a> <a
				href="http://www.yuqing36524.com:8888/EntityEvalPlatform/search!personal.action#"
				onclick="jumpPage(667)"> 尾页 </a>
		</div>
	</div>

	<!-- 定义隐藏的form表单,用于请求博文情感分析时用 -->
	<form id="entityForm"
		action="http://www.yuqing36524.com:8888/EntityEvalPlatform/entity!eval.action"
		method="post" style="visibility: hidden;">
		<input type="hidden" id="queryId" name="searchParaPojo.query"
			value="normal"> <input type="hidden"
			name="searchParaPojo.evalType" id="evalType" value="3"> <input
			type="hidden" id="nickName" name="searchParaPojo.nickName" value="">
	</form>

</body>
</html>