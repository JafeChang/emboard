# emboard

----
emboard是一个简单的面向小型团队的留言板开源解决方案，目前正在紧张编写中。（"emboard"源于electro master。美琴赛高！）

emboard采用MVC设计模式，前端使用bootstrap框架（@javictory），后端主要采用spring mvc+hibernate框架，使用MySQL作为数据库管理系统（@jafechang）。

由于编写团队水平有限，emboard可能会出现未能预计的bug与效率限制，我们会将会不断完善emboard，同时也欢迎批评与指导。

<hr style="border-bottom:1px dotted #e8e8e8"/>

emboard is a simple message board open source solutions for small teams, currently under intense preparation. (Emboard came from the electro master. Mikoto saikou!)

emboard was using MVC design pattern, whose front-end using bootstrap framework (@javictory),and whose rear-end using spring mvc + hibernate framework with MySQL(@jafechang).

Because of our limited capability, emboard may appear unforeseen bugs and some limitations. We will continue to improve emboard, and of course, we need your criticism and guidance.

----


<span id="dir"></span>
####目录结构
@jafechang 2015-09-30

目前所有的视图在webContent目录下，包括jsp、js与css文件；
后台java源文件在src下。临时目录结构，很快会有变化。

@jafechang 2015-10-12

src

    src
    |	.DS_Store
    |	applicationContext.xml
    |	db.properties
    |	hibernate.cfg.xml
    |	info
    |	|	jafe
    |	|	|	emboard
    |	|	|	|	controller
    |	|	|	|	|	PagesController.java
    |	|	|	|	|	PostController.java
    |	|	|	|	|	UserController.java
    |	|	|	|	dao
    |	|	|	|	|	impl
    |	|	|	|	|	|	PostDaoImpl.java
    |	|	|	|	|	|	UserDaoImpl.java
    |	|	|	|	|	PostDao.java
    |	|	|	|	|	UserDao.java
    |	|	|	|	entity
    |	|	|	|	|	Post.hbm.xml
    |	|	|	|	|	Post.java
    |	|	|	|	|	Repost.hbm.xml
    |	|	|	|	|	Repost.java
    |	|	|	|	|	User.hbm.xml
    |	|	|	|	|	User.java
    |	|	|	|	exceptions
    |	|	|	|	|	FullPostsException.java
    |	|	|	|	|	FullUsersException.java
    |	|	|	|	|	IncorrectUserException.java
    |	|	|	|	service
    |	|	|	|	|	impl
    |	|	|	|	|	|	PostServiceImpl.java
    |	|	|	|	|	|	UserServiceImpl.java
    |	|	|	|	|	PostService.java
    |	|	|	|	|	UserService.java
    |	|	|	util
    |	|	|	|	AbstractTree.java
    |	|	|	|	BinaryTree.java
    |	test
    |	|	SpringHibernateTest.java

webContent

    webContent
    |	.DS_Store
    |	blogdemo.html
    |	css
    |	|	.DS_Store
    |	|	bootstrap-modal-bs3patch.css
    |	|	bootstrap-modal.css
    |	|	bootstrap-theme.css
    |	|	bootstrap-theme.min.css
    |	|	bootstrap.css
    |	|	bootstrap.min.css
    |	|	editor
    |	|	|	.DS_Store
    |	|	|	bootstrap-combined.no-icons.min.css
    |	|	|	bootstrap-responsive.min.css
    |	|	|	editor.css
    |	|	|	font
    |	|	|	|	fontawesome-webfont.eot
    |	|	|	|	fontawesome-webfont.ttf
    |	|	|	|	fontawesome-webfont.woff
    |	|	|	font-awesome.css
    |	error
    |	|	error.jsp
    |	external
    |	|	.DS_Store
    |	|	google-code-prettify
    |	|	|	lang-apollo.js
    |	|	|	lang-basic.js
    |	|	|	lang-clj.js
    |	|	|	lang-css.js
    |	|	|	lang-dart.js
    |	|	|	lang-erlang.js
    |	|	|	lang-go.js
    |	|	|	lang-hs.js
    |	|	|	lang-lisp.js
    |	|	|	lang-llvm.js
    |	|	|	lang-lua.js
    |	|	|	lang-matlab.js
    |	|	|	lang-ml.js
    |	|	|	lang-mumps.js
    |	|	|	lang-n.js
    |	|	|	lang-pascal.js
    |	|	|	lang-proto.js
    |	|	|	lang-r.js
    |	|	|	lang-rd.js
    |	|	|	lang-scala.js
    |	|	|	lang-sql.js
    |	|	|	lang-tcl.js
    |	|	|	lang-tex.js
    |	|	|	lang-vb.js
    |	|	|	lang-vhdl.js
    |	|	|	lang-wiki.js
    |	|	|	lang-xq.js
    |	|	|	lang-yaml.js
    |	|	|	prettify.css
    |	|	|	prettify.js
    |	|	|	run_prettify.js
    |	fonts
    |	|	glyphicons-halflings-regular.eot
    |	|	glyphicons-halflings-regular.svg
    |	|	glyphicons-halflings-regular.ttf
    |	|	glyphicons-halflings-regular.woff
    |	|	glyphicons-halflings-regular.woff2
    |	images
    |	|	.DS_Store
    |	|	calendar-icon.png
    |	|	category-icon.png
    |	|	category-main-icon.png
    |	|	comment.png
    |	|	Descr.WD3
    |	|	devine-art.png
    |	|	facebook.png
    |	|	faq-minus.png
    |	|	faq-plus.png
    |	|	favicon.png
    |	|	flickr.png
    |	|	footer-bg.png
    |	|	glyphicons-halflings-white.png
    |	|	glyphicons-halflings.png
    |	|	google.png
    |	|	image-large.png
    |	|	image.png
    |	|	li-arrow.png
    |	|	like-btn.png
    |	|	like.png
    |	|	linked-in.png
    |	|	loading.gif
    |	|	logo-emboard.png
    |	|	logo.png
    |	|	main-bg.jpg
    |	|	plus-minus.png
    |	|	question-large.png
    |	|	question.png
    |	|	quote.png
    |	|	rss.png
    |	|	scroll-top.png
    |	|	search-loader.gif
    |	|	skype.png
    |	|	standard-large.png
    |	|	standard.png
    |	|	stumble.png
    |	|	support.png
    |	|	temp
    |	|	|	.DS_Store
    |	|	|	Descr.WD3
    |	|	|	living-room-770x501.jpg
    |	|	|	man.png
    |	|	twitter.png
    |	|	user.png
    |	|	video-large.png
    |	|	video.png
    |	inputresult.jsp
    |	js
    |	|	.DS_Store
    |	|	blog-post-frame.js
    |	|	bootstrap-wysiwyg.js
    |	|	bootstrap.js
    |	|	bootstrap.min.js
    |	|	editor
    |	|	|	bootstrap-wysiwyg.js
    |	|	|	bootstrap.min.js
    |	|	|	editor.js
    |	|	|	jquery.hotkeys.js
    |	|	|	jquery.min.js
    |	|	|	jquery.min.map
    |	|	ie10-viewport-bug-workaround.js
    |	|	jquery.hotkeys.js
    |	jsp
    |	|	_blogshort.jsp
    |	|	_blogsidebar.jsp
    |	|	_modal.jsp
    |	|	_nav.jsp
    |	|	index.jsp
    |	|	post.jsp
    |	|	posts.jsp
    |	|	search.jsp
    |	|	userposts.jsp
    |	|	write.jsp
    |	META-INF
    |	|	MANIFEST.MF
    |	ptest.jsp
    |	register.bak.jsp
    |	WEB-INF
    |	|	.DS_Store
    |	|	lib
    |	|	|	.DS_Store
    |	|	|	antlr-2.7.7.jar
    |	|	|	aopalliance.jar
    |	|	|	asm-3.3.jar
    |	|	|	asm-commons-3.3.jar
    |	|	|	asm-tree-3.3.jar
    |	|	|	aspectj-1.8.7.jar
    |	|	|	aspectjrt.jar
    |	|	|	aspectjtools.jar
    |	|	|	aspectjweaver.jar
    |	|	|	c3p0-0.9.1.2.jar
    |	|	|	cglib-3.1.jar
    |	|	|	commons-fileupload-1.3.1.jar
    |	|	|	commons-io-2.2.jar
    |	|	|	commons-lang3-3.2.jar
    |	|	|	commons-logging-1.2.jar
    |	|	|	dom4j-1.6.1.jar
    |	|	|	freemarker-2.3.22.jar
    |	|	|	geronimo-jta_1.1_spec-1.1.1.jar
    |	|	|	hamcrest-core-1.3.jar
    |	|	|	hibernate-commons-annotations-4.0.5.Final.jar
    |	|	|	hibernate-core-4.3.11.Final.jar
    |	|	|	hibernate-jpa-2.1-api-1.0.0.Final.jar
    |	|	|	jandex-1.1.0.Final.jar
    |	|	|	jandex-1.2.2.Final.jar
    |	|	|	javassist-3.18.1-GA.jar
    |	|	|	javassist.jar
    |	|	|	jboss-logging-3.1.3.GA.jar
    |	|	|	jboss-logging-annotations-1.2.0.Beta1.jar
    |	|	|	jboss-transaction-api_1.2_spec-1.0.0.Final.jar
    |	|	|	jstl-1.2.jar
    |	|	|	junit-4.12.jar
    |	|	|	log4j-api-2.2.jar
    |	|	|	log4j-core-2.2.jar
    |	|	|	mysql.jar
    |	|	|	ognl-3.0.6.jar
    |	|	|	org.aspectj.matcher.jar
    |	|	|	spring-aop-4.2.1.RELEASE.jar
    |	|	|	spring-aspects-4.2.1.RELEASE.jar
    |	|	|	spring-beans-4.2.1.RELEASE.jar
    |	|	|	spring-context-4.2.1.RELEASE.jar
    |	|	|	spring-context-support-4.2.1.RELEASE.jar
    |	|	|	spring-core-4.2.1.RELEASE.jar
    |	|	|	spring-expression-4.2.1.RELEASE.jar
    |	|	|	spring-instrument-4.2.1.RELEASE.jar
    |	|	|	spring-instrument-tomcat-4.2.1.RELEASE.jar
    |	|	|	spring-jdbc-4.2.1.RELEASE.jar
    |	|	|	spring-jms-4.2.1.RELEASE.jar
    |	|	|	spring-messaging-4.2.1.RELEASE.jar
    |	|	|	spring-orm-4.2.1.RELEASE.jar
    |	|	|	spring-oxm-4.2.1.RELEASE.jar
    |	|	|	spring-test-4.2.1.RELEASE.jar
    |	|	|	spring-tx-4.2.1.RELEASE.jar
    |	|	|	spring-web-4.2.1.RELEASE.jar
    |	|	|	spring-webmvc-4.2.1.RELEASE.jar
    |	|	|	spring-webmvc-portlet-4.2.1.RELEASE.jar
    |	|	|	spring-websocket-4.2.1.RELEASE.jar
    |	|	|	standard-1.1.2.jar
    |	|	|	struts2-core-2.3.24.jar
    |	|	|	xwork-core-2.3.24.jar
    |	|	web.xml
    |	welcome.jsp