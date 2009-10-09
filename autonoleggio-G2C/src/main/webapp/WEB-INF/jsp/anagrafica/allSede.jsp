<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Sede</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchSedeByExample">
		<s:textfield  name="nome_sede" label="Nome"/>
		<s:textfield  name="apertura_matt" label="Apertura mattutina"/>
		<s:textfield  name="chiusura_matt" label="Chiusura mattutina"/>
		<s:textfield  name="apertura_pom" label="Apertura pomeridiana"/>
		<s:textfield  name="chiusura_pom" label="Chiusura pomeridiana"/>
		<s:textfield  name="indirizzo_sede.via" label="Via"/>
		<s:textfield  name="indirizzo_sede.CAP" label="CAP"/>
		<s:textfield  name="indirizzo_sede.n_civico" label="N° Civico"/>
		<s:textfield  name="indirizzo_sede.stato" label="Stato"/>
		<s:textfield  name="indirizzo_sede.citta" label="Citta"/>
		<s:textfield  name="indirizzo_sede.provincia" label="Provincia"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Citta</th> <th>Provincia</th><th></th> </tr>
	<s:iterator value="allSedeIterator">
		
		<tr> 
			<td>
				<s:url id="searchSedeByNome_sede" action="searchSedeByNome_sede">
					<s:param name="nome_sede" value="nome_sede"> <s:property value="nome_sede" /></s:param>
				</s:url>
				
				<s:a href="%{searchSedeByNome_sede}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_sede"/>  </td> 
			<td> <s:property value="descrizione_sede"/>  </td>
			<td> <s:property value="provincia_sede"/> </td>
			
			<td>
				<s:url id="deleteSede" action="deleteSede">
					<s:param name="nome_sede" value="nome_sede"> <s:property value="nome_sede" /></s:param>
				</s:url>
				<s:a href="%{deleteSede}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Sede" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiSede.action'" />
	
</body>
</html>