<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Cliente</title>
	<s:head />
</head>
<body>
	<s:form action="newCliente" method="post" enctype="multipart/form-data">
			
		<s:textfield  name="CF_utente" label="Codice Fiscale" required="true"/>	
		<s:textfield  name="nome_utente" label="Nome" required="true"/>
		<s:textfield  name="cognome_utente" label="Cognome" required="true"/>
		<s:textfield  name="login_utente" label="Login" required="true"/>
		<s:textfield  name="password_utente" label="Password" required="true"/>
		<s:textfield  name="indirizzo_utente.via" label="Via" required="true"/>
		<s:textfield  name="indirizzo_utente.CAP" label="CAP" required="true"/>
		<s:textfield  name="indirizzo_utente.citta" label="Citta" required="true"/>
		<s:textfield  name="indirizzo_utente.n_civico" label="N° Civico" required="true"/>
		<s:textfield  name="indirizzo_utente.provincia" label="Provincia" required="true"/>
		<s:textfield  name="cartaCredito_cliente" label="Carta di Credito" required="true"/>
		<s:textfield  name="tipologia_cliente" label="Tipologia" required="true"/>
		<s:datetimepicker name="validita_cliente" label="Validita"  required="true"/>
		
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>