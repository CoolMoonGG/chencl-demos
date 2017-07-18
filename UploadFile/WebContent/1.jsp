<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>plupload示例</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/jquery.plupload.queue/css/jquery.plupload.queue.css" type="text/css"></link>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/jquery-1.8.3.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/plupload.full.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/jquery.plupload.queue/jquery.plupload.queue.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/i18n/zh-CN.js"></script>
<script type="text/javascript">
	$(function() {
		$("#uploader").pluploadQueue({
			runtimes : 'html5,flash',//设置运行环境，会按设置的顺序，可以选择的值有html5,gears,flash,silverlight,browserplus,html4
			flash_swf_url : '${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/plupload.flash.swf',// Flash环境路径设置
			silverlight_xap_url : '${pageContext.request.contextPath}/jslib/plupload_1_5_7/plupload/js/plupload.silverlight.xap',//silverlight环境路径设置
			url : '${pageContext.request.contextPath}/UploadServlet',//上传文件路径
			max_file_size : '3gb',//100b, 10kb, 10mb, 1gb
			chunk_size : '1mb',//分块大小，小于这个大小的不分块
			unique_names : true,//生成唯一文件名
			// 如果可能的话，压缩图片大小
			// resize : { width : 320, height : 240, quality : 90 },
			// 指定要浏览的文件类型
			filters : [ {
				title : 'Image files',
				extensions : 'jpg,gif,png'
			}, {
				title : 'Zip files',
				extensions : 'zip,7z'
			} ],
			init : {
				FileUploaded : function(up, file, info) {//文件上传完毕触发
					console.info(up);
					console.info(file);
					console.info(info);
					var response = $.parseJSON(info.response);
					if (response.status) {
						$('#f1').append('<input type="hidden" name="fileUrl" value="'+response.fileUrl+'"/>');
						$('#f1').append('<input type="hidden" name="fileName" value="'+file.name+'"/><br/>');
					}
				}
			}
		});

		// 客户端表单验证
		$('form').submit(function(e) {
			var uploader = $('#uploader').pluploadQueue();
			if (uploader.files.length > 0) {// 判断队列中是否有文件需要上传
				uploader.bind('StateChanged', function() {// 在所有的文件上传完毕时，提交表单
					if (uploader.files.length === (uploader.total.uploaded + uploader.total.failed)) {
						$('form')[0].submit();
					}
				});
				uploader.start();
			} else {
				alert('请选择至少一个文件进行上传！');
			}
			return false;
		});

	});
</script>
</head>
<body>
	<form id="f1" action="${pageContext.request.contextPath}/DemoAction" method="post">
		<table border="1">
			<tr>
				<td colspan="2">
					<div id="uploader">您的浏览器没有安装Flash插件，或不支持HTML5！</div>
					<!-- 
					<button onclick="$('#uploader').pluploadQueue().start();">开始上传</button>
					<button onclick="$('#uploader').pluploadQueue().stop();">停止上传</button>
					 -->
				</td>
			</tr>
			<tr>
				<th>姓名</th>
				<td><input name="name" value="孙宇" /></td>
			</tr>
			<tr>
				<th>密码</th>
				<td><input name="pwd" value="123456" /></td>
			</tr>
		</table>
		<button type="submit">提交表单</button>
	</form>
</body>
</html>