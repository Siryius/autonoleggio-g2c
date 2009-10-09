<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createPrenotazione.selectSedi.title" /></title>
</head>
<body>

<s:form action="selectVeicolo" namespace="/prenotazione" method="post" >

    <table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> </tr>
	<s:iterator value="veicoliIterator">
		
		<tr> 
			<td>
				<s:url id="selectVeicolo" action="selectVeicolo">
					<s:param name="id_veicolo" value="id_veicolo"> <s:property value="nome_veicolo" /></s:param>
				</s:url>
				
				<s:a href="%{selectVeicolo}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_veicolo"/>  </td> 
			<td> <s:property value="descrizione_veicolo"/>  </td>
			
		</tr>
	</s:iterator>
	</table>
            
    <s:submit key="button.select" /> 

</s:form>



</body>
</html>