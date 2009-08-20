<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Cliente</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_utente"/>
		
		<s:textfield  name="model.CF_utente" label="Codice Fiscale"/>	
		<s:textfield  name="model.nome_cliente" label="Nome"/>
		<s:textfield  name="model.cognome_cliente" label="Cognome"/>
		<s:textfield  name="model.login_utente" label="Login"/>
		<s:textfield  name="model.password_utente" label="Password"/>
		<s:textfield  name="model.indirizzo_utente.via" label="Via"/>
		<s:textfield  name="model.indirizzo_utente.CAP" label="CAP"/>
		<s:textfield  name="model.indirizzo_utente.citta" label="Citta"/>
		<s:textfield  name="model.indirizzo_utente.n_civico" label="N° Civico"/>
		<s:textfield  name="model.indirizzo_utente.provicia" label="Provincia"/>
		<s:textfield  name="model.cartacredito_cliente" label="Carta di Credito"/>
		<s:textfield  name="model.tipologia_cliente" label="Tipologia"/>
		<s:textfield  name="model.validita_cliente" label="Validita"/>
		
		
		<s:submit value="Update" action="updateCliente"/>
		<s:submit value="Delete" action="deleteCliente"/>
	</s:form>
</body>
</html>