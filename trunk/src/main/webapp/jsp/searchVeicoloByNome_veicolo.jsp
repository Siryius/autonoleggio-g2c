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
		<s:textfield label="ID" name="model.id_veicolo"/>
		<s:textfield  name="model.nome_veicolo" label="Nome"/>
		<s:textfield  name="model.descrizione_veicolo" label="Descrizione"/>
		<s:textfield  name="model.targa_veicolo" label="Targa"/>
		<s:textfield  name="model.tipo_veicolo" label="Tipo"/>
		<s:textfield  name="model.nposti_veicolo" label="N° Posti"/>
		<s:textfield  name="model.cilindrata_veicolo" label="Cilindrata"/>
		<s:textfield  name="model.disponibile_veicolo" label="Disponibilita"/>
		<s:textfield  name="model.immatricolazione_veicolo" label="Immatricolazione"/>
		<s:textfield  name="model.cambio_veicolo" label="Cambio"/>
		<s:textfield  name="model.alimentazione_veicolo" label="Alimentazione"/>
		<s:textfield  name="model.portata_veicolo" label="Portata"/>
		<s:textfield  name="model.bagagliaio_veicolo" label="Bagagliaio"/>
		
		<s:submit value="Update" action="updateVeicolo"/>
		<s:submit value="Delete" action="deleteVeicolo"/>
	</s:form>
</body>
</html>