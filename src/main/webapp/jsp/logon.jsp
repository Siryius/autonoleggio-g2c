<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<link href="<s:url value='/styles/logon.css'/>" rel="stylesheet" type="text/css" media="all" />
		<title>Login</title>
	</head>
	<body>
	<s:div id="header" ><img height="180px" style="margin: 5px 2px 5px 5px" width="250px" src="images/logo.jpg"/></s:div>
	<s:div id="left"></s:div>
	<s:div id="right"></s:div>
	<s:div id="center">
		<s:form action="logon" method="post" enctype="multipart/form-data">
			<s:textfield name="login" label="Login"/>
			<s:textfield name="password" label="Password"/>
			<s:submit type="submit" key="button.submit" />
			<s:submit type="reset" key="button.reset" />
		</s:form>
	</s:div>
	<s:div id="foot"></s:div>
	</body>
</html>