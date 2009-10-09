<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Veicolo</title>
	<s:head />
</head>
<body>
	<s:form >

		<table>
	
		<td> <s:textfield  name="model.nome" label="Nome"/></td> 
		<td> <s:textfield  name="model.descrizione" label="Descrizione"/></td>
		</table>
		<br><br>
	
		<fieldset>
			<legend>Info Tecniche </legend>
		<table>
		<tr><td><s:textfield  name="model.targa" label="Targa"/></td>
		<td><s:textfield  name="model.tipo" label="Tipo"/></td> </tr>
		
		<tr><td><s:textfield  name="model.nposti" label="N° Posti"/></td>
		<td><s:textfield  name="model.cilindrata" label="Cilindrata"/></td> </tr>
		
		<td><s:textfield  name="model.disponibile" label="Disponibilita"/></td>
		<td><s:textfield  name="model.immatricolazione" label="Immatricolazione"/></td>
		<td><s:textfield  name="model.cambio" label="Cambio"/></td>
		<td><s:textfield  name="model.alimentazione" label="Alimentazione"/></td>
		<td><s:textfield  name="model.portata" label="Portata"/></td>
		<td><s:textfield  name="model.bagagliaio" label="Bagagliaio"/></td>
		
		<td width="110">
				<s:url escapeAmp="false" id="image"  action="getImmagine.action"  > <s:param  name="idV" value="veicoli[#stato.index].idVeicolo" /></s:url>
				<img src="<s:property  value="%{image}" />" alt=""  width="100" height="80" /> 
		</td>
		
		</table>
		</fieldset>
		
		<table>
		<tr><td><s:submit value="Update" action="updateVeicolo"/></td>
		<td><s:submit value="Delete" action="deleteVeicolo"/></td></tr>
		</table>
	</s:form>
</body>
</html>