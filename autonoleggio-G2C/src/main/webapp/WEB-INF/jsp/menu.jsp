<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Menu</title>
	<s:head />
</head>
<body>
	Menu
	<table>
	<tr><td><a href="allOptional.action"> Optional </a></td></tr>
	<tr><td><a href="allCategoria.action"> Categoria </a></td></tr>
	<tr><td><a href="allSede.action"> Sede </a></td></tr>
	<tr><td><a href="allPromozione.action"> Promozione </a></td></tr>
	<tr><td><a href="allAssicurazione.action"> Assicurazione </a></td></tr>
	<tr><td><a href="allPratica.action"> Pratica </a></td></tr>
	<tr><td><a href="allVeicolo.action"> Veicolo </a></td></tr>
	<tr><td><a href="allCliente.action"> Cliente </a></td></tr>
	<tr><td><a href="allStaff.action"> Staff </a></td></tr>
	
	<s:url id="addVeicoloFlow" action="addVeicoloFlow" namespace="/veicolo" />
	<tr><td><s:a href="%{addVeicoloFlow}"><s:text name="link.completeVeicolo" />Veicolo</s:a></td></tr>
	
	
	<s:url id="addPrenotazioneFlow" action="addPrenotazioneFlow" namespace="/prenotazione" />
	<tr><td><s:a href="%{addPrenotazioneFlow}"><s:text name="link.completePrenotazione" />Prenotazione</s:a></td></tr>
	
	<s:url id="addUtenteFlow" action="addUtenteFlow" namespace="/utente" />
	<tr><td><s:a href="%{addUtenteFlow}"><s:text name="link.completeUtente" />Utente</s:a></td></tr>
	
	
	</table>
	
	
	addUtenteFlow
</body>
</html>