<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Staff</title>
	<s:head />
</head>
<body>
	<s:form action="newStaff" method="post" enctype="multipart/form-data">
			
		<s:textfield  name="CF_utente" label="Codice Fiscale" required="true"/>	
		<s:textfield  name="nome_staff" label="Nome" required="true"/>
		<s:textfield  name="cognome_staff" label="Cognome" required="true"/>
		<s:textfield  name="login_utente" label="Login" required="true"/>
		<s:textfield  name="password_utente" label="Password" required="true"/>
		<s:textfield  name="indirizzo_utente.via" label="Via" required="true"/>
		<s:textfield  name="indirizzo_utente.CAP" label="CAP" required="true"/>
		<s:textfield  name="indirizzo_utente.citta" label="Citta" required="true"/>
		<s:textfield  name="indirizzo_utente.n_civico" label="N° Civico" required="true"/>
		<s:textfield  name="indirizzo_utente.provincia" label="Provincia" required="true"/>
		<s:textfield  name="competenza_staff" label="Competenza" required="true"/>
	
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>