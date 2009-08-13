<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Assicurazione</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchAssicurazioneByExample">
		<s:textfield  name="nome_assicurazione" label="Nome"/>
		<s:textfield  name="descrizione_assicurazione" label="Descrizione"/>
		<s:textfield  name="costo_assicurazione" label="Costo"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Costo</th><th></th> </tr>
	<s:iterator value="allAssicurazioneIterator">
		
		<tr> 
			<td>
				<s:url id="searchAssicurazioneByNome_assicurazione" action="searchAssicurazioneByNome_assicurazione">
					<s:param name="nome_assicurazione" value="nome_assicurazione"> <s:property value="nome_assicurazione" /></s:param>
				</s:url>
				
				<s:a href="%{searchAssicurazioneByNome_assicurazione}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_assicurazione"/>  </td> 
			<td> <s:property value="descrizione_assicurazione"/>  </td>
			<td> <s:property value="costo_assicurazione"/> </td>
			
			<td>
				<s:url id="deleteAssicurazione" action="deleteAssicurazione">
					<s:param name="nome_assicurazione" value="nome_assicurazione"> <s:property value="nome_assicurazione" /></s:param>
				</s:url>
				<s:a href="%{deleteAssicurazione}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Assicurazione" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiAssicurazione.action'" />
	
</body>
</html>