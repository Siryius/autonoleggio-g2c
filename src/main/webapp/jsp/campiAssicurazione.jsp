<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Assicurazione</title>
	<s:head />
</head>
<body>
	<s:form action="newAssicurazione" method="post" enctype="multipart/form-data">
		<s:textfield label="Nome" name="nome_assicurazione" required="true"/>
		<s:textfield  label="Descrizione" name="descrizione_assicurazione" required="true"/>
		<s:textfield  label="Costo" name="costo_assicurazione" required="true"/>
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>