<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="myModal1" class="modal  fade" tabindex="-1" role="dialog">
		<div class="modal-body ">
			<div class="register-div">

				<form class="register-form" action="register" method="post">
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

					<form class="login-form" action="login" method="post">
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
		</div>
	</div>

</body>
</html>