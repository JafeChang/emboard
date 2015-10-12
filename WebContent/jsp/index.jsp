<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="info.jafe.emboard.entity.Post"%>
<%@ page import="java.util.List"%>
<%!Boolean hasLogin;%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
<meta name="description" content="">
<meta name="author" content="">
<link rel="icon" href="./images/favicon.png">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel='stylesheet' id='bootstrap-theme'
	href='css/bootstrap-theme.css' type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap-theme-min'
	href='css/bootstrap-theme.min.css' type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap' href='css/bootstrap.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap-min' href='css/bootstrap.min.css'
	type='text/css' media='all' />
<link rel='stylesheet' id='bootstrap-modal'
	href='css/bootstrap-modal.css' type='text/css' media='all' />
<link href="css/bootstrap-modal-bs3patch.css" rel="stylesheet">
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<title>emboard</title>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body onload="setActive('page-1')">
	<%
		hasLogin = (Boolean) session.getAttribute("hasLogin");
		List<Post> postshorts = (List<Post>) session.getAttribute("postshorts");
	%>
	<!-- Static navbar -->
	<%@include file="_nav.jsp"%>
	<div class="container">
		<div class="row">
			<div class="col-sm-8 blog-main">
				<!-- blogshort -->
				<%@include file="_blogshort.jsp"%>
				<ul class="pager">
					<li><a href="allposts?current=1">更多</a></li>
				</ul>
				<br /> <br /> <br />
			</div>
			<!-- blog-sidebar -->
			<%@include file="_blogsidebar.jsp"%>
		</div>
	</div>
	<!-- Modal -->
	<%@include file="_modal.jsp"%>
	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap-modal/2.2.6/js/bootstrap-modalmanager.min.js"></script>
	<script
		src="http://cdn.bootcss.com/bootstrap-modal/2.2.6/js/bootstrap-modal.js"></script>
	<script
		src="//cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>