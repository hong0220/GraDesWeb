<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>微博瀑布流列表</title>
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
		var userId = ${userId};
		var page = 0;
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
						if ($(document).height() - $(this).scrollTop()
								- $(this).height() < 50) {
							get();
						}
					});
		});

		Date.prototype.pattern = function(fmt) {
			var o = {
				"M+" : this.getMonth() + 1, //月份           
				"d+" : this.getDate(), //日           
				"h+" : this.getHours() % 12 == 0 ? 12 : this.getHours() % 12, //小时           
				"H+" : this.getHours(), //小时           
				"m+" : this.getMinutes(), //分           
				"s+" : this.getSeconds(), //秒           
				"q+" : Math.floor((this.getMonth() + 3) / 3), //季度           
				"S" : this.getMilliseconds()
			//毫秒           
			};
			var week = {
				"0" : "/u65e5",
				"1" : "/u4e00",
				"2" : "/u4e8c",
				"3" : "/u4e09",
				"4" : "/u56db",
				"5" : "/u4e94",
				"6" : "/u516d"
			};
			if (/(y+)/.test(fmt)) {
				fmt = fmt.replace(RegExp.$1, (this.getFullYear() + "")
						.substr(4 - RegExp.$1.length));
			}
			if (/(E+)/.test(fmt)) {
				fmt = fmt
						.replace(
								RegExp.$1,
								((RegExp.$1.length > 1) ? (RegExp.$1.length > 2 ? "/u661f/u671f"
										: "/u5468")
										: "")
										+ week[this.getDay() + ""]);
			}
			for ( var k in o) {
				if (new RegExp("(" + k + ")").test(fmt)) {
					fmt = fmt.replace(RegExp.$1,
							(RegExp.$1.length == 1) ? (o[k]) : (("00" + o[k])
									.substr(("" + o[k]).length)));
				}
			}
			return fmt;
		};

		function get() {
			$.ajax({
				type : "post",
				url : "${ctx}/get?userId=" + userId + "&page=" + page
						+ "&size=23",
				dataType : "json",
				contentType : "application/json;charset=utf-8",
				success : function(data) {
					var html = "";
					for (var i = 0; i < data.length; ++i) {
						var weibo = data[i];
						// 时间转化
						var unixTimestamp = new Date(weibo.createtime);
						var commonTime = unixTimestamp
								.pattern("yyyy-MM-dd");

						html += "<div class='grid'><strong>作者ID: "
								+ weibo.name
								+ "</strong><p><font color='#FF0000'>"
								+ weibo.content + "</font><br><p>时间: "
								+ commonTime + "</p></div>"
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