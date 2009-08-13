<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Assicurazione</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_assicurazione"/>
		<s:textfield label="Nome" name="model.nome_assicurazione" />
		<s:textfield label="Descrizione" name="model.descrizione_assicurazione" />
		<s:textfield label="Costo" name="model.costo_assicurazione" />
		<s:submit value="Update" action="updateAssicurazione"/>
		<s:submit value="Delete" action="deleteAssicurazione"/>
	</s:form>
</body>
</html>