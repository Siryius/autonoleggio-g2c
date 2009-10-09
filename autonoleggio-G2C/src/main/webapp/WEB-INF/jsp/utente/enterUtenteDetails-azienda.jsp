<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createUtente.enterUtenteDetails.azienda.title" /></title>
</head>
<body>

<s:form action="enterUtenteDetails" namespace="/utente" method="post" >

	<s:textfield key="azienda.CF_utente" name="azienda.CF_utente" />
    <s:textfield key="azienda.login_utente" name="azienda.login_utente" />
    <s:textfield key="azienda.password_utente" name="azienda.password_utente" />
    <s:textfield key="azienda.indirizzo_utente.via" name="azienda.indirizzo_utente.via" />
    <s:textfield key="azienda.indirizzo_utente.CAP" name="azienda.indirizzo_utente.CAP" />
    <s:textfield key="azienda.indirizzo_utente.n_civico" name="azienda.indirizzo_utente.n_civico" />
    <s:textfield key="azienda.indirizzo_utente.citta" name="azienda.indirizzo_utente.citta" />
    <s:textfield key="azienda.indirizzo_utente.provincia" name="azienda.indirizzo_utente.provincia" />

	<s:textfield key="azienda.ragionesociale_azienda" name="azienda.ragionesociale_azienda" />
	<s:textfield key="azienda.partitaiva_azienda" name="azienda.partitaiva_azienda" />

	<s:textfield key="azienda.indirizzo_operativo.via" name="azienda.indirizzo_operativo.via" />
    <s:textfield key="azienda.indirizzo_operativo.CAP" name="azienda.indirizzo_operativo.CAP" />
    <s:textfield key="azienda.indirizzo_operativo.n_civico" name="azienda.indirizzo_operativo.n_civico" />
    <s:textfield key="azienda.indirizzo_operativo.citta" name="azienda.indirizzo_operativo.citta" />
    <s:textfield key="azienda.indirizzo_operativo.provincia" name="azienda.indirizzo_operativo.provincia" />

    <s:hidden name="typeClass"/>

    <s:submit key="button.create" />

</s:form>

</body>
</html>