<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>New Categoria</title>
	<s:head />
</head>
<body>
	<s:form action="enterLocationDetails" namespace="/veicolo" method="post" enctype="multipart/form-data">
		<s:textfield label="Nome" name="nome_categoria" required="true"/>
		<s:textfield  label="Descrizione" name="descrizione_categoria" required="true"/>
		<s:textfield  label="Tariffa" name="tariffa_categoria" required="true"/>
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>