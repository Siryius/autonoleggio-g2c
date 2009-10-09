<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Categoria</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchCategoriaByExample">
		<s:textfield  name="nome_categoria" label="Nome"/>
		<s:textfield  name="descrizione_categoria" label="Descrizione"/>
		<s:textfield  name="tariffa_categoria" label="Tariffa"/>
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Tariffa</th><th></th> </tr>
	<s:iterator value="allCategoriaIterator">
		
		<tr> 
			<td>
				<s:url id="searchCategoriaByNome_categoria" action="searchCategoriaByNome_categoria">
					<s:param name="nome_categoria" value="nome_categoria"> <s:property value="nome_categoria" /></s:param>
				</s:url>
				
				<s:a href="%{searchCategoriaByNome_categoria}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_categoria"/>  </td> 
			<td> <s:property value="descrizione_categoria"/>  </td>
			<td> <s:property value="tariffa_categoria"/> </td>
			
			<td>
				<s:url id="deleteCategoria" action="deleteCategoria">
					<s:param name="nome_categoria" value="nome_categoria"> <s:property value="nome_categoria" /></s:param>
				</s:url>
				<s:a href="%{deleteCategoria}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Categoria" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiCategoria.action'" />
	
</body>
</html>