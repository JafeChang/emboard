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

目前所有的视图在WebContent目录下，包括jsp、js与css文件；
后台java源文件在src下。临时目录结构，很快会有变化。

@jafechang 2015-10-11

src

    src
    |	src/.DS_Store
    |	src/applicationContext.xml
    |	src/db.properties
    |	src/hibernate.cfg.xml
    |	src/info
    |	|	src/info/jafe
    |	|	|	src/info/jafe/emboard
    |	|	|	|	src/info/jafe/emboard/controller
    |	|	|	|	|	src/info/jafe/emboard/controller/PagesController.java
    |	|	|	|	|	src/info/jafe/emboard/controller/PostController.java
    |	|	|	|	|	src/info/jafe/emboard/controller/UserController.java
    |	|	|	|	src/info/jafe/emboard/dao
    |	|	|	|	|	src/info/jafe/emboard/dao/impl
    |	|	|	|	|	|	src/info/jafe/emboard/dao/impl/PostDaoImpl.java
    |	|	|	|	|	|	src/info/jafe/emboard/dao/impl/UserDaoImpl.java
    |	|	|	|	|	src/info/jafe/emboard/dao/PostDao.java
    |	|	|	|	|	src/info/jafe/emboard/dao/UserDao.java
    |	|	|	|	src/info/jafe/emboard/entity
    |	|	|	|	|	src/info/jafe/emboard/entity/Post.hbm.xml
    |	|	|	|	|	src/info/jafe/emboard/entity/Post.java
    |	|	|	|	|	src/info/jafe/emboard/entity/Repost.hbm.xml
    |	|	|	|	|	src/info/jafe/emboard/entity/Repost.java
    |	|	|	|	|	src/info/jafe/emboard/entity/User.hbm.xml
    |	|	|	|	|	src/info/jafe/emboard/entity/User.java
    |	|	|	|	src/info/jafe/emboard/exceptions
    |	|	|	|	|	src/info/jafe/emboard/exceptions/FullPostsException.java
    |	|	|	|	|	src/info/jafe/emboard/exceptions/FullUsersException.java
    |	|	|	|	|	src/info/jafe/emboard/exceptions/IncorrectUserException.java
    |	|	|	|	src/info/jafe/emboard/service
    |	|	|	|	|	src/info/jafe/emboard/service/impl
    |	|	|	|	|	|	src/info/jafe/emboard/service/impl/PostServiceImpl.java
    |	|	|	|	|	|	src/info/jafe/emboard/service/impl/UserServiceImpl.java
    |	|	|	|	|	src/info/jafe/emboard/service/PostService.java
    |	|	|	|	|	src/info/jafe/emboard/service/UserService.java
    |	|	|	src/info/jafe/util
    |	|	|	|	src/info/jafe/util/AbstractTree.java
    |	|	|	|	src/info/jafe/util/BinaryTree.java
    |	src/test
    |	|	src/test/SpringHibernateTest.java

webContent
  
    webContent
    |	webContent/.DS_Store
    |	webContent/blogdemo.html
    |	webContent/css
    |	|	webContent/css/.DS_Store
    |	|	webContent/css/bootstrap-modal-bs3patch.css
    |	|	webContent/css/bootstrap-modal.css
    |	|	webContent/css/bootstrap-theme.css
    |	|	webContent/css/bootstrap-theme.min.css
    |	|	webContent/css/bootstrap.css
    |	|	webContent/css/bootstrap.min.css
    |	|	webContent/css/editor
    |	|	|	webContent/css/editor/.DS_Store
    |	|	|	webContent/css/editor/bootstrap-combined.no-icons.min.css
    |	|	|	webContent/css/editor/bootstrap-responsive.min.css
    |	|	|	webContent/css/editor/editor.css
    |	|	|	webContent/css/editor/font
    |	|	|	|	webContent/css/editor/font/fontawesome-webfont.eot
    |	|	|	|	webContent/css/editor/font/fontawesome-webfont.ttf
    |	|	|	|	webContent/css/editor/font/fontawesome-webfont.woff
    |	|	|	webContent/css/editor/font-awesome.css
    |	webContent/error
    |	|	webContent/error/error.jsp
    |	webContent/external
    |	|	webContent/external/.DS_Store
    |	|	webContent/external/google-code-prettify
    |	|	|	webContent/external/google-code-prettify/lang-apollo.js
    |	|	|	webContent/external/google-code-prettify/lang-basic.js
    |	|	|	webContent/external/google-code-prettify/lang-clj.js
    |	|	|	webContent/external/google-code-prettify/lang-css.js
    |	|	|	webContent/external/google-code-prettify/lang-dart.js
    |	|	|	webContent/external/google-code-prettify/lang-erlang.js
    |	|	|	webContent/external/google-code-prettify/lang-go.js
    |	|	|	webContent/external/google-code-prettify/lang-hs.js
    |	|	|	webContent/external/google-code-prettify/lang-lisp.js
    |	|	|	webContent/external/google-code-prettify/lang-llvm.js
    |	|	|	webContent/external/google-code-prettify/lang-lua.js
    |	|	|	webContent/external/google-code-prettify/lang-matlab.js
    |	|	|	webContent/external/google-code-prettify/lang-ml.js
    |	|	|	webContent/external/google-code-prettify/lang-mumps.js
    |	|	|	webContent/external/google-code-prettify/lang-n.js
    |	|	|	webContent/external/google-code-prettify/lang-pascal.js
    |	|	|	webContent/external/google-code-prettify/lang-proto.js
    |	|	|	webContent/external/google-code-prettify/lang-r.js
    |	|	|	webContent/external/google-code-prettify/lang-rd.js
    |	|	|	webContent/external/google-code-prettify/lang-scala.js
    |	|	|	webContent/external/google-code-prettify/lang-sql.js
    |	|	|	webContent/external/google-code-prettify/lang-tcl.js
    |	|	|	webContent/external/google-code-prettify/lang-tex.js
    |	|	|	webContent/external/google-code-prettify/lang-vb.js
    |	|	|	webContent/external/google-code-prettify/lang-vhdl.js
    |	|	|	webContent/external/google-code-prettify/lang-wiki.js
    |	|	|	webContent/external/google-code-prettify/lang-xq.js
    |	|	|	webContent/external/google-code-prettify/lang-yaml.js
    |	|	|	webContent/external/google-code-prettify/prettify.css
    |	|	|	webContent/external/google-code-prettify/prettify.js
    |	|	|	webContent/external/google-code-prettify/run_prettify.js
    |	webContent/fonts
    |	|	webContent/fonts/glyphicons-halflings-regular.eot
    |	|	webContent/fonts/glyphicons-halflings-regular.svg
    |	|	webContent/fonts/glyphicons-halflings-regular.ttf
    |	|	webContent/fonts/glyphicons-halflings-regular.woff
    |	|	webContent/fonts/glyphicons-halflings-regular.woff2
    |	webContent/images
    |	|	webContent/images/.DS_Store
    |	|	webContent/images/calendar-icon.png
    |	|	webContent/images/category-icon.png
    |	|	webContent/images/category-main-icon.png
    |	|	webContent/images/comment.png
    |	|	webContent/images/Descr.WD3
    |	|	webContent/images/devine-art.png
    |	|	webContent/images/facebook.png
    |	|	webContent/images/faq-minus.png
    |	|	webContent/images/faq-plus.png
    |	|	webContent/images/favicon.png
    |	|	webContent/images/flickr.png
    |	|	webContent/images/footer-bg.png
    |	|	webContent/images/glyphicons-halflings-white.png
    |	|	webContent/images/glyphicons-halflings.png
    |	|	webContent/images/google.png
    |	|	webContent/images/image-large.png
    |	|	webContent/images/image.png
    |	|	webContent/images/li-arrow.png
    |	|	webContent/images/like-btn.png
    |	|	webContent/images/like.png
    |	|	webContent/images/linked-in.png
    |	|	webContent/images/loading.gif
    |	|	webContent/images/logo-emboard.png
    |	|	webContent/images/logo.png
    |	|	webContent/images/main-bg.jpg
    |	|	webContent/images/plus-minus.png
    |	|	webContent/images/question-large.png
    |	|	webContent/images/question.png
    |	|	webContent/images/quote.png
    |	|	webContent/images/rss.png
    |	|	webContent/images/scroll-top.png
    |	|	webContent/images/search-loader.gif
    |	|	webContent/images/skype.png
    |	|	webContent/images/standard-large.png
    |	|	webContent/images/standard.png
    |	|	webContent/images/stumble.png
    |	|	webContent/images/support.png
    |	|	webContent/images/temp
    |	|	|	webContent/images/temp/.DS_Store
    |	|	|	webContent/images/temp/Descr.WD3
    |	|	|	webContent/images/temp/living-room-770x501.jpg
    |	|	|	webContent/images/temp/man.png
    |	|	webContent/images/twitter.png
    |	|	webContent/images/user.png
    |	|	webContent/images/video-large.png
    |	|	webContent/images/video.png
    |	webContent/inputresult.jsp
    |	webContent/js
    |	|	webContent/js/.DS_Store
    |	|	webContent/js/blog-post-frame.js
    |	|	webContent/js/bootstrap-wysiwyg.js
    |	|	webContent/js/bootstrap.js
    |	|	webContent/js/bootstrap.min.js
    |	|	webContent/js/editor
    |	|	|	webContent/js/editor/bootstrap-wysiwyg.js
    |	|	|	webContent/js/editor/bootstrap.min.js
    |	|	|	webContent/js/editor/editor.js
    |	|	|	webContent/js/editor/jquery.hotkeys.js
    |	|	|	webContent/js/editor/jquery.min.js
    |	|	|	webContent/js/editor/jquery.min.map
    |	|	webContent/js/ie10-viewport-bug-workaround.js
    |	|	webContent/js/jquery.hotkeys.js
    |	webContent/jsp
    |	|	webContent/jsp/allposts.jsp
    |	|	webContent/jsp/index.jsp
    |	|	webContent/jsp/post.jsp
    |	|	webContent/jsp/search.jsp
    |	|	webContent/jsp/write.jsp
    |	webContent/META-INF
    |	|	webContent/META-INF/MANIFEST.MF
    |	webContent/ptest.jsp
    |	webContent/register.bak.jsp
    |	webContent/WEB-INF
    |	|	webContent/WEB-INF/.DS_Store
    |	|	webContent/WEB-INF/lib
    |	|	|	webContent/WEB-INF/lib/.DS_Store
    |	|	|	webContent/WEB-INF/lib/antlr-2.7.7.jar
    |	|	|	webContent/WEB-INF/lib/aopalliance.jar
    |	|	|	webContent/WEB-INF/lib/asm-3.3.jar
    |	|	|	webContent/WEB-INF/lib/asm-commons-3.3.jar
    |	|	|	webContent/WEB-INF/lib/asm-tree-3.3.jar
    |	|	|	webContent/WEB-INF/lib/aspectj-1.8.7.jar
    |	|	|	webContent/WEB-INF/lib/aspectjrt.jar
    |	|	|	webContent/WEB-INF/lib/aspectjtools.jar
    |	|	|	webContent/WEB-INF/lib/aspectjweaver.jar
    |	|	|	webContent/WEB-INF/lib/c3p0-0.9.1.2.jar
    |	|	|	webContent/WEB-INF/lib/cglib-3.1.jar
    |	|	|	webContent/WEB-INF/lib/commons-fileupload-1.3.1.jar
    |	|	|	webContent/WEB-INF/lib/commons-io-2.2.jar
    |	|	|	webContent/WEB-INF/lib/commons-lang3-3.2.jar
    |	|	|	webContent/WEB-INF/lib/commons-logging-1.2.jar
    |	|	|	webContent/WEB-INF/lib/dom4j-1.6.1.jar
    |	|	|	webContent/WEB-INF/lib/freemarker-2.3.22.jar
    |	|	|	webContent/WEB-INF/lib/geronimo-jta_1.1_spec-1.1.1.jar
    |	|	|	webContent/WEB-INF/lib/hamcrest-core-1.3.jar
    |	|	|	webContent/WEB-INF/lib/hibernate-commons-annotations-4.0.5.Final.jar
    |	|	|	webContent/WEB-INF/lib/hibernate-core-4.3.11.Final.jar
    |	|	|	webContent/WEB-INF/lib/hibernate-jpa-2.1-api-1.0.0.Final.jar
    |	|	|	webContent/WEB-INF/lib/jandex-1.1.0.Final.jar
    |	|	|	webContent/WEB-INF/lib/jandex-1.2.2.Final.jar
    |	|	|	webContent/WEB-INF/lib/javassist-3.18.1-GA.jar
    |	|	|	webContent/WEB-INF/lib/javassist.jar
    |	|	|	webContent/WEB-INF/lib/jboss-logging-3.1.3.GA.jar
    |	|	|	webContent/WEB-INF/lib/jboss-logging-annotations-1.2.0.Beta1.jar
    |	|	|	webContent/WEB-INF/lib/jboss-transaction-api_1.2_spec-1.0.0.Final.jar
    |	|	|	webContent/WEB-INF/lib/jstl-1.2.jar
    |	|	|	webContent/WEB-INF/lib/junit-4.12.jar
    |	|	|	webContent/WEB-INF/lib/log4j-api-2.2.jar
    |	|	|	webContent/WEB-INF/lib/log4j-core-2.2.jar
    |	|	|	webContent/WEB-INF/lib/mysql.jar
    |	|	|	webContent/WEB-INF/lib/ognl-3.0.6.jar
    |	|	|	webContent/WEB-INF/lib/org.aspectj.matcher.jar
    |	|	|	webContent/WEB-INF/lib/spring-aop-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-aspects-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-beans-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-context-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-context-support-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-core-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-expression-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-instrument-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-instrument-tomcat-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-jdbc-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-jms-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-messaging-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-orm-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-oxm-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-test-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-tx-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-web-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-webmvc-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-webmvc-portlet-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/spring-websocket-4.2.1.RELEASE.jar
    |	|	|	webContent/WEB-INF/lib/standard-1.1.2.jar
    |	|	|	webContent/WEB-INF/lib/struts2-core-2.3.24.jar
    |	|	|	webContent/WEB-INF/lib/xwork-core-2.3.24.jar
    |	|	webContent/WEB-INF/web.xml
    |	webContent/welcome.jsp