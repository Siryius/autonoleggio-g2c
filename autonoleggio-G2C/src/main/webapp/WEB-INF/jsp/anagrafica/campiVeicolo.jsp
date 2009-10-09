<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Veicolo</title>
	<s:head />
</head>
<body>
	<s:form action="newVeicolo" method="post" enctype="multipart/form-data">
		
		<s:textfield  name="nome_veicolo" label="Nome" required="true"/>
		<s:textfield  name="descrizione_veicolo" label="Descrizione" required="true"/>
		
		<s:textfield  name="targa_veicolo" label="Targa" required="true"/>
		<s:textfield  name="tipo_veicolo" label="Tipo" required="true"/>
		<s:textfield  name="nposti_veicolo" label="N° Posti" required="true"/>
		<s:textfield  name="cilindrata_veicolo" label="Cilindrata" required="true"/>
		<s:textfield  name="disponibile_veicolo" label="Disponibilita" required="true"/>
		<s:datetimepicker  name="immatricolazione_veicolo" label="Immatricolazione" required="true"/>
		<s:textfield  name="cambio_veicolo" label="Cambio" required="true"/>
		<s:textfield  name="alimentazione_veicolo" label="Alimentazione" required="true"/>
		<s:textfield  name="portata_veicolo" label="Portata" required="true"/>
		<s:textfield  name="bagagliaio_veicolo" label="Bagagliaio" required="true"/>
		
		<table border="1">
			<tr> <th>Sel </th> <th>Nome</th> <th>Descrizione</th> <th>Supplemento</th> </tr>
			<s:iterator value="allOptionalIterator">
		
			<tr> 
				<td> <s:checkbox name="checkOptional" label="Sel" fieldValue="id_optional"/> </td>
				<td> <s:property value="nome_optional"/>  </td> 
				<td> <s:property value="descrizione_optional"/>  </td>
				<td> <s:property value="supplemento_optional"/> </td>
				 
			</tr>
			</s:iterator>
		</table>
		
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>