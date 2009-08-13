<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Staff</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchStaffByExample">
	
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
		<s:textfield  name="competenza_staff" label="Competenza"/>

		
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>CF</th> <th>Nome</th> <th>Cognome</th> <th>Competenza</th><th></th> </tr>
	<s:iterator value="allStaffIterator">
		
		<tr> 
			<td>
				<s:url id="searchStaffByNome_cliente" action="searchStaffByNome_cliente">
					<s:param name="CF_utente" value="CF_utente"> <s:property value="CF_utente" /></s:param>
				</s:url>
				
				<s:a href="%{searchStaffByCF_utente}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="cf_utente"/>  </td> 
			<td> <s:property value="nome_utente"/>  </td>
			<td> <s:property value="cognome_utente"/> </td>
			<td> <s:property value="competenza_staff"/> </td>
			
			<td>
				<s:url id="deleteStaff" action="deleteStaff">
					<s:param name="cf_utente" value="cf_utente"> <s:property value="cf_utente" /></s:param>
				</s:url>
				<s:a href="%{deleteStaff}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Staff" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiStaff.action'" />
	
</body>
</html>