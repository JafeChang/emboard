<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- /.blog-main -->
	<c:forEach var="postshort" items="${postshorts}">
		<div class="blog-post">
			<div>
				<div>
					<h1 class="blog-title">
						<a class="blog-topic" href="post?postid=${postshort.postid}"><c:out
								value="${postshort.topic}"></c:out></a>
					</h1>
				</div>
				<div class="panel-group">
					<table class="col-xs-12">
						<tr class=" text-muted ">
							<td align="left"><a class="text-muted"
								href="userposts?current=1&authorid=${postshort.id}"><c:out
										value="${postshort.author}"></c:out></a></td>
							<td><span></span></td>
							<td align="right"><fmt:formatDate value="${post.datetime}"
									pattern="yyyy-MM-dd HH:mm" /></td>
						</tr>
					</table>
				</div>
				<div>
					<br />
				</div>
			</div>

			<div class="blog-post">
				<a class="blog-shortcut" href="post?postid=${postshort.postid}">
					<c:out value="${postshort.shortcut}..."></c:out>
				</a> <br />
				<p class="text-muted text-right"></p>
			</div>
			<hr>
		</div>
	</c:forEach>
</body>
</html>