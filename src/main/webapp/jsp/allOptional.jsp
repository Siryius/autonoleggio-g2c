<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Optionals</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchOptionalByExample">
		<s:textfield  name="nome_optional" label="Nome"/>
		<s:textfield  name="descrizione_optional" label="Descrizione"/>
		<s:textfield  name="supplemento_optional" label="Supplemento"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Supplemento</th><th></th> </tr>
	<s:iterator value="allOptionIterator">
		
		<tr> 
			<td>
				<s:url id="searchOptionalByNome_optional" action="searchOptionalByNome_optional">
					<s:param name="nome_optional" value="nome_optional"> <s:property value="nome_optional" /></s:param>
				</s:url>
				
				<s:a href="%{searchOptionalByNome_optional}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_optional"/>  </td> 
			<td> <s:property value="descrizione_optional"/>  </td>
			<td> <s:property value="supplemento_optional"/> </td>
			
			<td>
				<s:url id="deleteOptional" action="deleteOptional">
					<s:param name="nome_optional" value="nome_optional"> <s:property value="nome_optional" /></s:param>
				</s:url>
				<s:a href="%{deleteOptional}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Optional" onclick="javascript:location.href='campiOptional.action'" />
	<a href="campiOptional.action"> Optional </a>
</body>
</html>