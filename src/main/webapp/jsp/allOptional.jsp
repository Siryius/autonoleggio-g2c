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

	<table>
	<s:iterator value="allOptionIterator">
		<tr> <td> 
			<s:url id="searchOptional" action="searchOptional">
				<s:param name="nome_optional"><s:property value="nome_optional"/></s:param>
			</s:url> 
			<li><s:a href="%{searchOptional}">
				<s:property value="nome_optional"/>
			</s:a></li>
		</td> </tr>	
	</s:iterator>
	</table>
	
	
	
	
	
	<input type="button" value="New Optional" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiOptional.action'" />
	
</body>
</html>