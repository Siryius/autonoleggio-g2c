<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Pratica</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchPraticaByExample">
		<s:textfield  name="nome_pratica" label="Nome"/>
		<s:textfield  name="descrizione_pratica" label="Descrizione"/>
		<s:textfield  name="scadenza_pratica" label="Scadenza"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Scadenza</th><th></th> </tr>
	<s:iterator value="allPraticaIterator">
		
		<tr> 
			<td>
				<s:url id="searchPraticaByNome_pratica" action="searchPraticaByNome_pratica">
					<s:param name="nome_pratica" value="nome_pratica"> <s:property value="nome_pratica" /></s:param>
				</s:url>
				
				<s:a href="%{searchPraticaByNome_pratica}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_pratica"/>  </td> 
			<td> <s:property value="descrizione_pratica"/>  </td>
			<td> <s:property value="scadenza_pratica"/> </td>
			
			<td>
				<s:url id="deletePratica" action="deletePratica">
					<s:param name="nome_pratica" value="nome_pratica"> <s:property value="nome_pratica" /></s:param>
				</s:url>
				<s:a href="%{deletePratica}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Pratica" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiPratica.action'" />
	
</body>
</html>