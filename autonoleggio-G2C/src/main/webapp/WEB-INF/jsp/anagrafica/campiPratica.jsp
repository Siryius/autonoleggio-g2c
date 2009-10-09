<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Pratica</title>
	<s:head />
</head>
<body>
	<s:form action="newPratica" method="post" enctype="multipart/form-data">
		<s:textfield key="pratica.nome" name="nome" required="true"/>
		<s:textfield  key="pratica.descrizione" name="descrizione" required="true"/>
		<s:textfield key="pratica.scadenza" name="scadenza" required="true"/>
		<s:submit key="campiPratica.inserisci" name="campiPratica.inserisci"/>
	</s:form>
</body>
</html>