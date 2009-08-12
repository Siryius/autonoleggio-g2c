<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Promozione</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchPromozioneByExample">
		<s:textfield  name="nome_promozione" label="Nome"/>
		<s:textfield  name="descrizione_promozione" label="Descrizione"/>
		<s:textfield  name="datainizio_promozione" label="Data inizio"/>
		<s:textfield  name="datafine_promozione" label="Data fine"/>
		<s:textfield  name="sconto_promozione" label="Sconto"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th><th>Data Inizio</th><th>Data Fine</th> <th>Sconto</th><th></th> </tr>
	<s:iterator value="allPromozioneIterator">
		
		<tr> 
			<td>
				<s:url id="searchPromozioneByNome_promozione" action="searchPromozioneByNome_promozione">
					<s:param name="nome_promozione" value="nome_promozione"> <s:property value="nome_promozione" /></s:param>
				</s:url>
				
				<s:a href="%{searchPromozioneByNome_promozione}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_promozione"/>  </td> 
			<td> <s:property value="descrizione_promozione"/>  </td>
			<td> <s:property value="datainizio_promozione"/>  </td>
			<td> <s:property value="datafine_promozione"/>  </td>
			<td> <s:property value="sconto_promozione"/> </td>
			
			<td>
				<s:url id="deletePromozione" action="deletePromozione">
					<s:param name="nome_promozione" value="nome_promozione"> <s:property value="nome_promozione" /></s:param>
				</s:url>
				<s:a href="%{deletePromozione}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Promozione" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiPromozione.action'" />
	
</body>
</html>