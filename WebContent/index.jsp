<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<body>
	<%
		hasLogin = (Boolean) session.getAttribute("hasLogin");
		System.out.println("hasLogin: " + hasLogin);
	%>
	<!-- Static navbar -->
	<nav class="navbar navbar-default navbar-static-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand " href="index.jsp"><img
				class="navbar-logo" alt="emboard" src="images/logo-emboard.png"></a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav">
				<li class="active"><a href="./">首页</a></li>
				<li><a href="#about">所有文章</a></li>
				<%
					String loginDom;
					if (hasLogin == null) {
						loginDom = "<li><a href='#myModal1' data-toggle='modal'>注册</a></li><li><a href='#myModal2' data-toggle='modal'>登陆</a></li>";
					} else {
						loginDom = "<li><a href='newpost.jsp'>发表文章</a></li><li><a href='setting'>设置</a></li>";
					}
				%>
				<%=loginDom%>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<form class="navbar-form form-search">
						<input type="text" class="form-control input-medium search-query"
							placeholder="Search..." />
						<button type="submit" class="btn  btn-info">
							<span class="glyphicon glyphicon-search" aria-hidden="true"></span>
						</button>

					</form>
				</li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
	</nav>

	<div class="container">

		<div class="blog-header">
			<h1 class="blog-title">The Bootstrap Blog</h1>
			<p class="lead blog-description">The official example template of
				creating a blog with Bootstrap.</p>
		</div>

		<div class="row">

			<div class="col-sm-8 blog-main">
				<!-- /.blog-main -->
				<div class="blog-post">
					<iframe src="blogdemo.html" frameborder="0" width="100%"
						height="100%" scrolling="no" id="post-iframe-1"> </iframe>
					<script type="text/javascript">
						$("#post-iframe-1").load(
								function() {
									var mainheight = $(this).contents().find(
											"body").height() + 30;
									$(this).height(mainheight);
								});
					</script>
				</div>


				<nav>
				<ul class="pager">
					<li><a href="#"><span
							class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span></a></li>
					<li><a href="#"><span
							class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span></a></li>
				</ul>
				</nav>

			</div>



			<div class="col-sm-3 col-sm-offset-1 blog-sidebar">
				<div class="sidebar-module sidebar-module-inset">
					<h4>About</h4>
					<p>
						Etiam porta <em>sem malesuada magna</em> mollis euismod. Cras
						mattis consectetur purus sit amet fermentum. Aenean lacinia
						bibendum nulla sed consectetur.
					</p>
				</div>
				<div class="sidebar-module">
					<h4>Archives</h4>
					<ol class="list-unstyled">
						<li><a href="#">March 2014</a></li>
						<li><a href="#">February 2014</a></li>

					</ol>
				</div>
				<div class="sidebar-module">
					<h4>Elsewhere</h4>
					<ol class="list-unstyled">
						<li><a href="#">GitHub</a></li>
						<li><a href="#">Twitter</a></li>
						<li><a href="#">Facebook</a></li>
					</ol>
				</div>
			</div>
			<!-- /.blog-sidebar -->

		</div>
		<!-- /.row -->

	</div>
	<!-- /.container -->

	<!-- Modal -->
	<div id="myModal1" class="modal  fade" tabindex="-1" role="dialog">
		<!-- <div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h3 id="myModalLabel">Modal header</h3>
				</div>  -->
		<div class="modal-body ">
			<div class="register-div">

				<form class="register-form" action="register">
					<div class="form-group">
						<input type="text" class="form-control" name="email"
							placeholder="邮箱" />
					</div>
					<div class="form-group">

						<input type="password" class="form-control" name="password"
							placeholder="密码" />
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="invitationcode"
							placeholder="邀请码" />
					</div>
					<div class="form-group">
						<button class="btn btn-lg btn-info btn-block" type="submit">注册</button>
					</div>
				</form>
				<script type="text/javascript">
					$(document).ready(function() {
						$('.register-form').bootstrapValidator({
							message : '非法邮箱',
							feedbackIcons : {
								valid : 'glyphicon glyphicon-ok',
								invalid : 'glyphicon glyphicon-remove',
								validating : 'glyphicon glyphicon-refresh'
							},
							fields : {
								email : {
									validators : {
										notEmpty : {
											message : '请输入正确的邮箱地址。'
										},
										emailAddress : {
											message : '请输入正确的邮箱地址。'
										}
									}
								},
								password : {
									message : '非法密码',
									validators : {
										notEmpty : {
											message : '请输入6~18位密码'
										},
										stringLength : {
											min : 6,
											max : 18,
											message : '请输入6~18位密码'
										}
									}
								},
								invitationcode : {
									message : '错误的邀请码',
									validators : {
										regexp : {
											regexp : /^[a-zA-Z0-9_]{6}$/,
											message : '错误的邀请码'
										},
										notEmpty : {
											message : '错误的邀请码'
										}
									}
								}
							}
						});
					});
				</script>
			</div>
		</div>
		<div id="myModal2" class="modal  fade" tabindex="-1" role="dialog">
			<!-- <div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h3 id="myModalLabel">Modal header</h3>
				</div>  -->
			<div class="modal-body ">
				<div class="register-div">

					<form class="login-form">
						<div class="form-group">
							<input type="text" class="form-control" name="email"
								placeholder="邮箱" />
						</div>
						<div class="form-group">

							<input type="password" class="form-control" name="password"
								placeholder="密码" />
						</div>
						<div class="form-group ">

							<label> <input type="checkbox"> 记住账号
							</label> <a class="navbar-right no-margin-right" href="#">找回密码</a>
						</div>
						<div class="form-group ">
							<button class="btn btn-lg btn-info btn-width " type="submit">登陆</button>
						</div>
					</form>
					<script type="text/javascript">
						$(document).ready(function() {
							$('.login-form').bootstrapValidator({
								message : '非法邮箱',
								feedbackIcons : {
									valid : 'glyphicon glyphicon-ok',
									invalid : 'glyphicon glyphicon-remove',
									validating : 'glyphicon glyphicon-refresh'
								},
								fields : {
									email : {
										validators : {
											notEmpty : {
												message : '请输入正确的邮箱地址。'
											},
											emailAddress : {
												message : '请输入正确的邮箱地址。'
											}
										}
									}
								}
							});
						});
					</script>
				</div>
			</div>
			<!-- <div class="modal-footer">
			<button class="btn" data-dismiss="modal" aria-hidden="true">关闭</button>
			<button class="btn btn-primary">Save changes</button>
		</div> -->
		</div>


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