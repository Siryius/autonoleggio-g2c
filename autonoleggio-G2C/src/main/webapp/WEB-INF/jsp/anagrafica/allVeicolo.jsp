<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Veicoli</title>
	<s:head />
</head>
<body>
	
	<s:form name="ricerca_form" action="searchVeicoloByExample">
		<s:textfield  name="nome_veicolo" label="Nome"/>
		<s:textfield  name="descrizione_veicolo" label="Descrizione"/>
		
		<s:textfield  name="targa_veicolo" label="Targa"/>
		<s:textfield  name="tipo_veicolo" label="Tipo"/>
		<s:textfield  name="nposti_veicolo" label="N° Posti"/>
		<s:textfield  name="cilindrata_veicolo" label="Cilindrata"/>
		<s:textfield  name="disponibile_veicolo" label="Disponibilita"/>
		<s:textfield  name="immatricolazione_veicolo" label="Immatricolazione"/>
		<s:textfield  name="cambio_veicolo" label="Cambio"/>
		<s:textfield  name="alimentazione_veicolo" label="Alimentazione"/>
		<s:textfield  name="portata_veicolo" label="Portata"/>
		<s:textfield  name="bagagliaio_veicolo" label="Bagagliaio"/>
		
		<s:submit key="ricerca" value="Ricerca"/>
	</s:form>

	<table border="1">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Targa</th><th></th> </tr>
	<s:iterator value="allVeicoloIterator">
		
		<tr> 
			<td>
				<s:url id="searchVeicoloByNome_veicolo" action="searchVeicoloByNome_veicolo">
					<s:param name="nome_veicolo" value="nome_veicolo"> <s:property value="nome_veicolo" /></s:param>
				</s:url>
				
				<s:a href="%{searchVeicoloByNome_veicolo}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_veicolo"/>  </td> 
			<td> <s:property value="descrizione_veicolo"/>  </td>
			<td> <s:property value="targa_veicolo"/> </td>
			
			<td>
				<s:url id="deleteVeicolo" action="deleteVeicolo">
					<s:param name="nome_veicolo" value="nome_veicolo"> <s:property value="nome_veicolo" /></s:param>
				</s:url>
				<s:a href="%{deleteVeicolo}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<input type="button" value="New Veicolo" onclick="javascript:location.href='/autonoleggioG2C/jsp/campiVeicolo.action'" />
	
</body>
</html>