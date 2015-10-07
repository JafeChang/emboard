<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%!Boolean hasLogin;%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>发表文章</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta name="keywords"
	content="opensource rich wysiwyg text editor jquery bootstrap execCommand html5" />
<meta name="description"
	content="This tiny jQuery Bootstrap WYSIWYG plugin turns any DIV into a HTML5 rich text editor" />
<link rel="apple-touch-icon"
	href="//mindmup.s3.amazonaws.com/lib/img/apple-touch-icon.png" />
<link rel="shortcut icon"
	href="http://mindmup.s3.amazonaws.com/lib/img/favicon.ico">
<!--  <link href="external/google-code-prettify/prettify.css" rel="stylesheet"> -->
<link href="css/editor/bootstrap-combined.no-icons.min.css"
	rel="stylesheet">
<link href="css/editor/bootstrap-responsive.min.css" rel="stylesheet">
<link href="css/editor/font-awesome.css" rel="stylesheet">
<script src="js/editor/jquery.min.js"></script>
<script src="js/editor/jquery.hotkeys.js"></script>
<script src="js/editor/bootstrap-wysiwyg.js"></script>
<script
	src="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>
<script src="external/google-code-prettify/prettify.js"></script>
<link href="css/editor/editor.css" rel="stylesheet">
<script src="js/editor/editor.js"></script>
<script type="text/javascript">
	function sub() {
		$("#divvalue").attr( "value",$("#editor").html());
		$("#addpost-form").submit();
	}
</script>
</head>
<body>

	<div class="container">
		<form action="addpost" class="addpost-form" id="addpost-form" method="post">
			<div class="hero-unit">
				<div class="input-group "></div>
				<div class="row-fluid">
					<div class="span8">
						<input type="text" class="input-title" name="topic" placeholder="标题" value="" />
					</div>
					<div class="span4">

						<button class="btn btn-large btn-block btn-primary" type="button"
							onclick="javascript:sub();">发表</button>
					</div>
				</div>
				<input type="hidden" class="divvalue" id="divvalue" value="" name="body"/>
				<div id="alerts" class="span12"></div>
				<div class="btn-toolbar" data-role="editor-toolbar"
					data-target="#editor">
					<div class="btn-group">
						<a class="btn dropdown-toggle" data-toggle="dropdown" title="Font"><i
							class="icon-font"></i><b class="caret"></b></a>
						<ul class="dropdown-menu">
						</ul>
					</div>
					<div class="btn-group">
						<a class="btn dropdown-toggle" data-toggle="dropdown"
							title="Font Size"><i class="icon-text-height"></i>&nbsp;<b
							class="caret"></b></a>
						<ul class="dropdown-menu">
							<li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
							<li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
							<li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
						</ul>
					</div>
					<div class="btn-group">
						<a class="btn" data-edit="bold" title="Bold (Ctrl/Cmd+B)"><i
							class="icon-bold"></i></a> <a class="btn" data-edit="italic"
							title="Italic (Ctrl/Cmd+I)"><i class="icon-italic"></i></a> <a
							class="btn" data-edit="strikethrough" title="Strikethrough"><i
							class="icon-strikethrough"></i></a> <a class="btn"
							data-edit="underline" title="Underline (Ctrl/Cmd+U)"><i
							class="icon-underline"></i></a>
					</div>
					<div class="btn-group">
						<a class="btn" data-edit="insertunorderedlist" title="Bullet list"><i
							class="icon-list-ul"></i></a> <a class="btn"
							data-edit="insertorderedlist" title="Number list"><i
							class="icon-list-ol"></i></a> <a class="btn" data-edit="outdent"
							title="Reduce indent (Shift+Tab)"><i class="icon-indent-left"></i></a>
						<a class="btn" data-edit="indent" title="Indent (Tab)"><i
							class="icon-indent-right"></i></a>
					</div>
					<div class="btn-group">
						<a class="btn" data-edit="justifyleft"
							title="Align Left (Ctrl/Cmd+L)"><i class="icon-align-left"></i></a>
						<a class="btn" data-edit="justifycenter"
							title="Center (Ctrl/Cmd+E)"><i class="icon-align-center"></i></a>
						<a class="btn" data-edit="justifyright"
							title="Align Right (Ctrl/Cmd+R)"><i class="icon-align-right"></i></a>
						<a class="btn" data-edit="justifyfull"
							title="Justify (Ctrl/Cmd+J)"><i class="icon-align-justify"></i></a>
					</div>
					<div class="btn-group">
						<a class="btn dropdown-toggle" data-toggle="dropdown"
							title="Hyperlink"><i class="icon-link"></i></a>
						<div class="dropdown-menu input-append">
							<input class="span2" placeholder="URL" type="text"
								data-edit="createLink" />
							<button class="btn" type="button">Add</button>
						</div>
						<a class="btn" data-edit="unlink" title="Remove Hyperlink"><i
							class="icon-cut"></i></a>

					</div>

					<div class="btn-group">
						<a class="btn" title="Insert picture (or just drag & drop)"
							id="pictureBtn"><i class="icon-picture"></i></a> <input
							type="file" data-role="magic-overlay" data-target="#pictureBtn"
							data-edit="insertImage" />
					</div>
					<div class="btn-group">
						<a class="btn" data-edit="undo" title="Undo (Ctrl/Cmd+Z)"><i
							class="icon-undo"></i></a> <a class="btn" data-edit="redo"
							title="Redo (Ctrl/Cmd+Y)"><i class="icon-repeat"></i></a>
					</div>
					<input type="text" data-edit="inserttext" id="voiceBtn"
						x-webkit-speech="">
				</div>

				<div id="editor"></div>
			</div>
		</form>
	</div>
</html>
