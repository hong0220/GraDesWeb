﻿<%@ page contentType="text/html;charset=UTF-8"%>
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
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品2</strong>
				<p>网友czqn8分享jquery实现图片翻牌旋转特效|jqueryschool-插件教程分享
					首先非常感谢网友czqn8的无私分享，此作品是他在逛乐蜂网站时看效果比较实用就把它整理出来第一时间与大家分享了，主要功能是jquery配合动画插件animate实现图片翻牌旋转特效，当鼠标悬浮到图片上的时候就实</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品3</strong>
				<p>网友涛涛分享原生js实现美女拼图游戏特效|jqueryschool-插件教程分享</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品4</strong>
				<p>分享一款简洁大气的jquery时间轴特效|jqueryschool-插件教程分享
					此作品是一款非常实用的jquery特效，实现了时间轴效果，应用场景很广，最适合用于描述公司成长历程，可以列出哪年、哪月、哪日公司的发展经历，整体看来非常简洁大气，以年份做为节点，具体内容作为二级节点，可</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品5</strong>
				<p>网友涛涛原创js仿jquery-lightBox插件(修正v1.0)|jqueryschool-插件教程分享
					首先非常感谢网友涛涛的无私分享，此作品是他的上款作品（网友涛涛原创js仿jquery-lightBox插件）的修正版本，修正了以下6个内容：1、使用更简单。2、修改鼠标放大作用。3、改为面向对象。4、添加重置</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品6</strong>
				<p>网友沙叶分享Jquery-UI实现Web桌面系统jWebOS|jqueryschool-插件教程分享
					首先非常感谢网友沙叶的无私分享，同时也非常感谢对这个作品做二次开发的网友们，此Web桌面系统Jquery特效是JquerySchool网站的第三款类似的作品了，每一款都有不同的特色，此作品利用了Jquery-UI实现Web</p>
				<div class="meta">
					<a href="http://www.phplearn.cn/" target="_blank">点击查看>>></a>
				</div>
			</div>
			<div class="grid">
				<div class="imgholder"></div>
				<strong>作品7</strong>
				<p>分享jquery实现仿flash圆盘抽奖特效|jqueryschool-插件教程分享
					最近jquery学堂群里面的很多网友要求分享一个用jquery实现类似flash圆盘的抽奖的特效出来，一直没有网友们分享，今天刚好看到360搜索搞活的页面有抽奖特效，于是就将它整理出来第一时间分享给大家参考用，虽然有点</p>
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