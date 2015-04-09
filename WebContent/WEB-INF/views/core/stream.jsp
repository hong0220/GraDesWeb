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
			<c:forEach var="o" items="${vo}" varStatus="status">
				<div class="grid">
					<strong>${o.userId }</strong>
					<p>${o.content }</p>
					<br>
					<p>${o.createtime }</p>
					<div class="meta">
						<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
					</div>
				</div>
			</c:forEach>
		</div>
	</div>

	<script type="text/javascript">
		$(function() {
			$("img.lazy").lazyload({
				load : function() {
					$('#container').BlocksIt({
						numOfCol : 5,
						offsetX : 8,
						offsetY : 8
					});
				}
			});
			$(window).scroll(
					function() {
						// 当滚动到最底部以上50像素时， 加载新内容
						if ($(document).height() - $(this).scrollTop()
								- $(this).height() < 50) {

							$('#container').append($("#test").html());
							$('#container').BlocksIt({
								numOfCol : 5,
								offsetX : 8,
								offsetY : 8
							});
							$("img.lazy").lazyload();
						}
					});

			//window resize
			var currentWidth = 1100;
			$(window).resize(function() {
				var winWidth = $(window).width();
				var conWidth;
				if (winWidth < 660) {
					conWidth = 440;
					col = 2
				} else if (winWidth < 880) {
					conWidth = 660;
					col = 3
				} else if (winWidth < 1100) {
					conWidth = 880;
					col = 4;
				} else {
					conWidth = 1100;
					col = 5;
				}

				if (conWidth != currentWidth) {
					currentWidth = conWidth;
					$('#container').width(conWidth);
					$('#container').BlocksIt({
						numOfCol : col,
						offsetX : 8,
						offsetY : 8
					});
				}
			});
		});
	</script>
</body>
</html>