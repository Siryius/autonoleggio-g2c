<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createUtente.enterUtenteDetails.cliente.title" /></title>
</head>
<body>

<s:form action="enterUtenteDetails" namespace="/utente" method="post" >

    <s:textfield key="cliente.CF_utente" name="cliente.codicefiscale" />
    <s:textfield key="cliente.login_utente" name="cliente.username" />
    <s:textfield key="cliente.password_utente" name="cliente.password" />
    <s:textfield key="cliente.indirizzo_utente.via" name="cliente.indirizzo.via" />
    <s:textfield key="cliente.indirizzo_utente.CAP" name="cliente.indirizzo.cap" />
    <s:textfield key="cliente.indirizzo_utente.n_civico" name="cliente.indirizzo.ncivico" />
    <s:textfield key="cliente.indirizzo_utente.citta" name="cliente.indirizzo.citta" />
    <s:textfield key="cliente.indirizzo_utente.provincia" name="cliente.indirizzo.provincia" />
    
    <s:textfield key="cliente.nome_cliente" name="cliente.nome" />
    <s:textfield key="cliente.cognome_cliente" name="cliente.cognome" />
    <s:textfield key="cliente.cartaCredito_cliente" name="cliente.cartacredito" />
    <s:textfield key="cliente.tipologia_cliente" name="cliente.tipologia" />
    <s:textfield key="cliente.validita_cliente" name="cliente.validita" />
    
    <s:hidden name="typeClass"/>
    
    <s:submit key="button.create" />

</s:form>

</body>
</html>