<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Optional</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_sede"/>
		<s:textfield label="Nome" name="model.nome_sede" />

		<s:textfield  name="model.apertura_matt" label="Apertura mattutina"/>
		<s:textfield  name="model.chiusura_matt" label="Chiusura mattutina"/>
		<s:textfield  name="model.apertura_pom" label="Apertura pomeridiana"/>
		<s:textfield  name="model.chiusura_pom" label="Chiusura pomeridiana"/>
		<s:textfield  name="model.indirizzo_sede.via" label="Via"/>
		<s:textfield  name="model.indirizzo_sede.cap" label="CAP"/>
		<s:textfield  name="model.indirizzo_sede.n_civico" label="N° Civico"/>
		<s:textfield  name="model.indirizzo_sede.stato" label="Stato"/>
		<s:textfield  name="model.indirizzo_sede.citta" label="Citta"/>
		<s:textfield  name="model.indirizzo_sede.provincia" label="Provincia"/>

		<s:submit value="Update" action="updateOptional"/>
		<s:submit value="Delete" action="deleteOptional"/>
	</s:form>
</body>
</html>