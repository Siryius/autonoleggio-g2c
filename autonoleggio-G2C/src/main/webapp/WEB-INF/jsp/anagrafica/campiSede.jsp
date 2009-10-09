<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Sede</title>
	<s:head />
</head>
<body>
	<s:form action="newSede" method="post" enctype="multipart/form-data">
		<s:textfield label="Nome" name="nome_sede" required="true"/>
		<s:textfield  name="apertura_matt" label="Apertura mattutina"/>
		<s:textfield  name="chiusura_matt" label="Chiusura mattutina"/>
		<s:textfield  name="apertura_pom" label="Apertura pomeridiana"/>
		<s:textfield  name="chiusura_pom" label="Chiusura pomeridiana"/>
		<s:textfield  name="indirizzo_sede.via" label="Via" required="true"/>
		<s:textfield  name="indirizzo_sede.CAP" label="CAP" required="true"/>
		<s:textfield  name="indirizzo_sede.n_civico" label="N° Civico" required="true"/>
		<s:textfield  name="indirizzo_sede.stato" label="Stato" required="true"/>
		<s:textfield  name="indirizzo_sede.citta" label="Citta" required="true"/>
		<s:textfield  name="indirizzo_sede.provincia" label="Provincia"required="true"/>
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>