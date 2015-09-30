<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
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
<link rel='stylesheet' id='editor' href='css/editor.css' type='text/css'
	media='all' />
<link rel='stylesheet' id='editor'
	href='css/bootstrap-combined.no-icons.min.css' type='text/css'
	media='all' />
<link
	href="http://netdna.bootstrapcdn.com/font-awesome/3.0.2/css/font-awesome.css"
	rel="stylesheet">
	<!-- <link href="http://twitter.github.com/bootstrap/assets/js/google-code-prettify/prettify.css" rel="stylesheet"> -->
<!-- <link href="http://netdna.bootstrapcdn.com/twitter-bootstrap/2.3.1/css/bootstrap-responsive.min.css" rel="stylesheet"> -->
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
				<li class="active"><a href="input.jsp">New post</a></li>
				<li><a href="#">&nbsp;&nbsp;<span
						class="glyphicon glyphicon-user" aria-hidden="true"></span></a></li>
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


		<div class="hero-unit">
			<!-- <div class="pull-right">
				<div class="fb-like" data-href="http://facebook.com/mindmupapp"
					data-send="false" data-layout="button_count" data-width="100"
					data-show-faces="false"></div>
				<br/> <a href="https://twitter.com/mindmup"
					class="twitter-follow-button" data-show-count="true"
					data-show-screen-name="true" data-lang="en">Follow @mindmup</a>
			</div> -->
			<h1>
				bootstrap-wysiwyg <br> <small>为Bootstrap定制的微型所见即所得（What
					you see is what you get）富文本编辑器</small>
			</h1>
			<input type="title" data-edit="inserttext" />
			<hr>
			<div class="btn-toolbar" data-role="editor-toolbar"
				data-target="#editor">
				<div class="btn-group">
					<a class="btn dropdown-toggle" data-toggle="dropdown" title=""
						data-original-title="Font"><i class="icon-font"></i><b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a data-edit="fontName Serif"
							style="font-family: 'Serif'">Serif</a></li>
						<li><a data-edit="fontName Sans" style="font-family: 'Sans'">Sans</a></li>
						<li><a data-edit="fontName Arial"
							style="font-family: 'Arial'">Arial</a></li>
						<li><a data-edit="fontName Arial Black"
							style="font-family: 'Arial Black'">Arial Black</a></li>
						<li><a data-edit="fontName Courier"
							style="font-family: 'Courier'">Courier</a></li>
						<li><a data-edit="fontName Courier New"
							style="font-family: 'Courier New'">Courier New</a></li>
						<li><a data-edit="fontName Comic Sans MS"
							style="font-family: 'Comic Sans MS'">Comic Sans MS</a></li>
						<li><a data-edit="fontName Helvetica"
							style="font-family: 'Helvetica'">Helvetica</a></li>
						<li><a data-edit="fontName Impact"
							style="font-family: 'Impact'">Impact</a></li>
						<li><a data-edit="fontName Lucida Grande"
							style="font-family: 'Lucida Grande'">Lucida Grande</a></li>
						<li><a data-edit="fontName Lucida Sans"
							style="font-family: 'Lucida Sans'">Lucida Sans</a></li>
						<li><a data-edit="fontName Tahoma"
							style="font-family: 'Tahoma'">Tahoma</a></li>
						<li><a data-edit="fontName Times"
							style="font-family: 'Times'">Times</a></li>
						<li><a data-edit="fontName Times New Roman"
							style="font-family: 'Times New Roman'">Times New Roman</a></li>
						<li><a data-edit="fontName Verdana"
							style="font-family: 'Verdana'">Verdana</a></li>
					</ul>
				</div>
				<div class="btn-group">
					<a class="btn dropdown-toggle" data-toggle="dropdown" title=""
						data-original-title="Font Size"><i class="icon-text-height"></i>&nbsp;<b
						class="caret"></b></a>
					<ul class="dropdown-menu">
						<li><a data-edit="fontSize 5"><font size="5">Huge</font></a></li>
						<li><a data-edit="fontSize 3"><font size="3">Normal</font></a></li>
						<li><a data-edit="fontSize 1"><font size="1">Small</font></a></li>
					</ul>
				</div>
				<div class="btn-group">
					<a class="btn" data-edit="bold" title=""
						data-original-title="Bold (Ctrl/Cmd+B)"><i class="icon-bold"></i></a>
					<a class="btn" data-edit="italic" title=""
						data-original-title="Italic (Ctrl/Cmd+I)"><i
						class="icon-italic"></i></a> <a class="btn" data-edit="strikethrough"
						title="" data-original-title="Strikethrough"><i
						class="icon-strikethrough"></i></a> <a class="btn"
						data-edit="underline" title=""
						data-original-title="Underline (Ctrl/Cmd+U)"><i
						class="icon-underline"></i></a>
				</div>
				<div class="btn-group">
					<a class="btn" data-edit="insertunorderedlist" title=""
						data-original-title="Bullet list"><i class="icon-list-ul"></i></a>
					<a class="btn" data-edit="insertorderedlist" title=""
						data-original-title="Number list"><i class="icon-list-ol"></i></a>
					<a class="btn" data-edit="outdent" title=""
						data-original-title="Reduce indent (Shift+Tab)"><i
						class="icon-indent-left"></i></a> <a class="btn" data-edit="indent"
						title="" data-original-title="Indent (Tab)"><i
						class="icon-indent-right"></i></a>
				</div>
				<div class="btn-group">
					<a class="btn" data-edit="justifyleft" title=""
						data-original-title="Align Left (Ctrl/Cmd+L)"><i
						class="icon-align-left"></i></a> <a class="btn"
						data-edit="justifycenter" title=""
						data-original-title="Center (Ctrl/Cmd+E)"><i
						class="icon-align-center"></i></a> <a class="btn"
						data-edit="justifyright" title=""
						data-original-title="Align Right (Ctrl/Cmd+R)"><i
						class="icon-align-right"></i></a> <a class="btn"
						data-edit="justifyfull" title=""
						data-original-title="Justify (Ctrl/Cmd+J)"><i
						class="icon-align-justify"></i></a>
				</div>
				<div class="btn-group">
					<a class="btn dropdown-toggle" data-toggle="dropdown" title=""
						data-original-title="Hyperlink"><i class="icon-link"></i></a>
					<div class="dropdown-menu input-append">
						<input class="span2" placeholder="URL" type="text"
							data-edit="createLink">
						<button class="btn" type="button">Add</button>
					</div>
					<a class="btn" data-edit="unlink" title=""
						data-original-title="Remove Hyperlink"><i class="icon-cut"></i></a>

				</div>
				<div class="btn-group">
					<a class="btn" title="" id="pictureBtn"
						data-original-title="Insert picture (or just drag &amp; drop)"><i
						class="icon-picture"></i></a> <input type="file"
						data-role="magic-overlay" data-target="#pictureBtn"
						data-edit="insertImage"
						style="opacity: 0; position: absolute; top: 0px; left: 0px; width: 41px; height: 30px;"/>
				</div>
				<div class="btn-group">
					<a class="btn" data-edit="undo" title=""
						data-original-title="Undo (Ctrl/Cmd+Z)"><i class="icon-undo"></i></a>
					<a class="btn" data-edit="redo" title=""
						data-original-title="Redo (Ctrl/Cmd+Y)"><i class="icon-repeat"></i></a>
				</div>
				<input type="text" data-edit="inserttext" id="voiceBtn"
					x-webkit-speech="" style="display: none;"/>
			</div>

			<div id="editor" contenteditable="true">
				<blockquote style="margin: 0 0 0 40px; border: none; padding: 0px;">
					<div style="text-align: justify;">
						<span style="color: inherit;">Go ahead…</span>
					</div>
				</blockquote>
			</div>
		</div>
	</div>







	<!-- /.container -->





	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script
		src="http://cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script
		src="//cdn.bootcss.com/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
	<script src="//cdn.bootcss.com/wysihtml5/0.3.0/wysihtml5.min.js"></script>
	<script src="js/jquery.hotkeys.js" type="text/javascript"></script>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="js/ie10-viewport-bug-workaround.js"></script>
	<script type="text/javascript">
		function initToolbarBootstrapBindings() {
			var fonts = [ 'Serif', 'Sans', 'Arial', 'Arial Black', 'Courier',
					'Courier New', 'Comic Sans MS', 'Helvetica', 'Impact',
					'Lucida Grande', 'Lucida Sans', 'Tahoma', 'Times',
					'Times New Roman', 'Verdana' ], fontTarget = $(
					'[title=Font]').siblings('.dropdown-menu');
			$
					.each(
							fonts,
							function(idx, fontName) {
								fontTarget
										.append($('<li><a data-edit="fontName ' + fontName +'" style="font-family:\''+ fontName +'\'">'
												+ fontName + '</a></li>'));
							});
			$('a[title]').tooltip({
				container : 'body'
			});
			$('.dropdown-menu input').click(function() {
				return false;
			}).change(
					function() {
						$(this).parent('.dropdown-menu').siblings(
								'.dropdown-toggle').dropdown('toggle');
					}).keydown('esc', function() {
				this.value = '';
				$(this).change();
			});

			$('[data-role=magic-overlay]').each(
					function() {
						var overlay = $(this), target = $(overlay
								.data('target'));
						overlay.css('opacity', 0).css('position', 'absolute')
								.offset(target.offset()).width(
										target.outerWidth()).height(
										target.outerHeight());
					});
			if ("onwebkitspeechchange" in document.createElement("input")) {
				var editorOffset = $('#editor').offset();
				$('#voiceBtn').css('position', 'absolute').offset({
					top : editorOffset.top,
					left : editorOffset.left + $('#editor').innerWidth() - 35
				});
			} else {
				$('#voiceBtn').hide();
			}
		};
		function showErrorAlert(reason, detail) {
			var msg = '';
			if (reason === 'unsupported-file-type') {
				msg = "Unsupported format " + detail;
			} else {
				console.log("error uploading file", reason, detail);
			}
			$(
					'<div class="alert"> <button type="button" class="close" data-dismiss="alert">&times;</button>'
							+ '<strong>File upload error</strong> '
							+ msg
							+ ' </div>').prependTo('#alerts');
		};
		initToolbarBootstrapBindings();
		$('#editor').wysiwyg({
			fileUploadError : showErrorAlert
		});
	</script>
</body>
</html>