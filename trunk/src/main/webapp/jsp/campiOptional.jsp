<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Optional</title>
	<s:head />
</head>
<body>
	<s:form action="newOptional" method="post" enctype="multipart/form-data">
		<s:hidden name="nome_optional" />
		<s:textfield label="Nome" name="nome_optional" required="true"/>
		<s:textfield  label="Descrizione" name="descrizione_optional" required="true"/>
		<s:textfield  label="Supplemento" name="supplemento_optional" required="true"/>
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>