<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>New Optional</title>
	<s:head />
</head>
<body>
	<s:form action="searchOptional">
		<s:textfield label="Nome" name="nome_optional" />
		<s:textfield label="Descrizione" name="descrizione_optional" />
		<s:textfield label="Supplemento" name="supplemento_optional" />
		<s:submit value="Update" action="updateOptional"/>
		<s:submit value="Delete" action="deleteOptional"/>
	</s:form>
</body>
</html>