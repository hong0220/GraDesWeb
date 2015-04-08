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
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品1</strong>
				<p>Jquery实现js/css代码在线压缩/格式化/混淆/解混淆|jqueryschool-插件教程分享
					此工具是漫画综合了网络上比较流行的一些JS混淆、压缩、格式化、CSS压缩、CSS格式化等流行的辅助工具改编而成，为了让网友方便使用，漫画把所有功能都分离出来，完全可以脱机使用，无需考虑到要联网
					点击查看》》》</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
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