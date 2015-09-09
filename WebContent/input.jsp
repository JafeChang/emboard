<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Input Test</title>
</head>
<body>
	<s:form action="submit"> 
		<s:textfield name="student.id" label="id"></s:textfield>
		<s:textfield name="student.name" label="name"></s:textfield>
		<s:submit label="submit"></s:submit>
	</s:form>

</body>
</html>