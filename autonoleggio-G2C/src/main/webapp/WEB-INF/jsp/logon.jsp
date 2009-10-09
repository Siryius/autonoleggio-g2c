<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
	<head>
		<title>Login</title>
	</head>
	<body>
		<s:form action="logon" method="post" enctype="multipart/form-data">
			<s:textfield name="username" key="logon.username"/>
			<s:textfield name="password" key="logon.password"/>
			<s:submit type="submit" key="logon.submit" />
			<s:submit type="reset" key="logon.reset" />
		</s:form>
	</body>
</html>