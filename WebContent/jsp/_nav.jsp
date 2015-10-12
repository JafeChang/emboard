<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
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
				<li id="page-1"><a href="./">首页</a></li>
				<li id="page-2"><a href="allposts?current=1" >所有文章</a></li>
				<c:if test="${sessionScope.hasLogin != null}">
					<li id="page-3"><a href='write'>发表文章</a></li>
					<li id="page-4"><a href='setting'>设置</a></li>
					<li id="page-5"><a href="logoff">下线</a></li>
				</c:if>
				<c:if test="${sessionScope.hasLogin == null}">
					<li id="page-6"><a href='#myModal1' data-toggle='modal'>注册</a></li>
					<li id="page-7"><a href='#myModal2' data-toggle='modal'>登陆</a></li>
				</c:if>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li>
					<form class="navbar-form form-search" action="search">
						<input type="text" class="form-control input-medium search-query"
							placeholder="Search..." name="queryString"/>
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
	<script type="text/javascript">
		function setActive(pageid){
			$("#"+pageid).attr("class","active");
		}
	</script>
</body>
</html>