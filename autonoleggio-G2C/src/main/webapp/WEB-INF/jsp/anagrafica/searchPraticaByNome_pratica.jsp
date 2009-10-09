<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Pratica</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_pratica"/>
		<s:textfield label="Nome" name="model.nome_pratica" />
		<s:textfield label="Descrizione" name="model.descrizione_pratica" />
		<s:textfield label="Scadenza" name="model.scadenza_pratica" />
		<s:submit value="Update" action="updatePratica"/>
		<s:submit value="Delete" action="deletePratica"/>
	</s:form>
</body>
</html>