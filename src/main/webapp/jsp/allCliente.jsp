<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Cliente</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchClienteByExample">
	
		<s:textfield  name="CF_utente" label="Codice Fiscale"/>	
		<s:textfield  name="nome_utente" label="Nome"/>
		<s:textfield  name="cognome_utente" label="Cognome"/>
		<s:textfield  name="login_utente" label="Login"/>
		<s:textfield  name="password_utente" label="Password"/>
		<s:textfield  name="indirizzo_utente.via" label="Via"/>
		<s:textfield  name="indirizzo_utente.CAP" label="CAP"/>
		<s:textfield  name="indirizzo_utente.citta" label="Citta"/>
		<s:textfield  name="indirizzo_utente.n_civico" label="N° Civico"/>
		<s:textfield  name="indirizzo_utente.stato" label="Stato"/>
		<s:textfield  name="indirizzo_utente.provicia" label="Provincia"/>
		<s:textfield  name="cartacredito_cliente" label="Carta di Credito"/>
		<s:textfield  name="tipologia_cliente" label="Tipologia"/>
		<s:textfield  name="validita_cliente" label="Validita"/>
		
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>CF</th> <th>Nome</th> <th>Cognome</th> <th>Tipologia</th><th></th> </tr>
	<s:iterator value="allClienteIterator">
		
		<tr> 
			<td>
				<s:url id="searchClienteByNome_cliente" action="searchClienteByNome_cliente">
					<s:param name="CF_utente" value="CF_utente"> <s:property value="CF_utente" /></s:param>
				</s:url>
				
				<s:a href="%{searchOptionalByCF_cliente}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="cf_utente"/>  </td> 
			<td> <s:property value="nome_utente"/>  </td>
			<td> <s:property value="cognome_utente"/> </td>
			<td> <s:property value="tipologia_cliente"/> </td>
			
			<td>
				<s:url id="deleteCliente" action="deleteCliente">
					<s:param name="cf_utente" value="cf_utente"> <s:property value="cf_utente" /></s:param>
				</s:url>
				<s:a href="%{deleteCliente}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Cliente" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiCliente.action'" />
	
</body>
</html>