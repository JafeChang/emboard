<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
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
<script src="http://cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
<title>emboard</title>
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
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
				<a class="navbar-brand" href="#">emboard</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav">
					<li><a href="#">Home</a></li>
					<li><a href="#about">All post</a></li>
					<li><a href="input.jsp">New post</a></li>
					<li class="dropdown active"><a href="#"
						class="dropdown-toggle" data-toggle="dropdown" role="button"
						aria-haspopup="true" aria-expanded="false">Setting <span
							class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Setting 1</a></li>
							<li><a href="#">Setting 2</a></li>
							<li><a href="#">Setting 3</a></li>
							<li role="separator" class="divider"></li>
							<li class="dropdown-header"><img src="images/user.png"></li>
							<li><a href="#">$$$Account$$$</a></li>
							<li><a href="#">Log out</a></li>
						</ul></li>
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

		<div class="row">
			<div class="register-div"></div> 
			<div class="col-sm-8 register-div jumbotron">
				<form class="register-form">
					<div class="form-group">
						<input type="text" class="form-control" name="email"
							placeholder="邮箱" />
					</div>
					<div class="form-group">

						<input type="text" class="form-control" name="password"
							placeholder="密码" />
					</div>
					<div class="form-group">
						<input type="text" class="form-control" name="invitationcode"
							placeholder="邀请码" />
					</div>
					<div class="form-group">
						<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button>
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

			<div class="col-sm-3 col-sm-offset-1 blog-sidebar span3 offset2">
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






	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->

	<script
		src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script
		src="//cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
