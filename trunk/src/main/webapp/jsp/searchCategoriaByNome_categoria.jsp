<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Categoria</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_categoria"/>
		<s:textfield label="Nome" name="model.nome_categoria" />
		<s:textfield label="Descrizione" name="model.descrizione_categoria" />
		<s:textfield label="Tariffa" name="model.tariffa_categoria" />
		<s:submit value="Update" action="updateCategoria"/>
		<s:submit value="Delete" action="deleteCategoria"/>
	</s:form>
</body>
</html>