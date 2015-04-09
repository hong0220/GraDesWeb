<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>响应式jquery瀑布流结合图片延迟加载特效</title>
<link rel='stylesheet' href="${ctx}/resource/css/style.css"
	media='screen' />
<script type="text/javascript" src="${ctx}/resource/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${ctx}/resource/js/jquery.lazyload.min.js"></script>
<script type="text/javascript" src="${ctx}/resource/js/blocksit.min.js"></script>
</head>
<body>
	<div id="wrapper">
		<div id="container">
		<%-- 	<c:forEach var="o" items="${vo}" varStatus="status">
				<div class="grid">
					<strong>${o.userId }</strong>
					<p>${o.content }</p>
					<br>
					<p>${o.createtime }</p>
				</div>
			</c:forEach> --%>
		</div>
	</div>

	<script type="text/javascript">
		var page = 1;
		get();
		$(function() {
			$('#container').BlocksIt({
				numOfCol : 5,
				offsetX : 8,
				offsetY : 8
			});

			$(window).scroll(
				function() {
					// 当滚动到最底部以上50像素时， 加载新内容
					if ($(document).height() - $(this).scrollTop() - $(this).height() < 50) {
						get();
					}
				}
			);
		});
		
		function get() {
			$.ajax({
				type : "post",
				url : "${ctx}/get?userId=2178865632&page="
						+ page + "&size=20",
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				success : function(data) {
					var html = "";
					for (var i = 0; i < data.length; ++i) {
						var weibo = data[i];
						// 时间转化
						var unixTimestamp = new Date(weibo.createtime);
						var commonTime = unixTimestamp.toLocaleString();
						html += "<div class='grid'><strong>作者ID: "
								+ weibo.userId + "</strong><p><font color='#FF0000'>"
								+ weibo.content + "</font><br><p>时间: "
								+ commonTime
								+ "</p></div>"
					}
					page++;

					$('#container').append(html);
					$('#container').BlocksIt({
						numOfCol : 5,
						offsetX : 8,
						offsetY : 8
					});
				}
			});
		};
	</script>
</body>
</html>