<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title><s:text name="createEvent.enterEvent.title" /></title> 
</head>
<body>
	<s:form action="enterVeicoloDetails" namespace="/veicolo" method="post">
		
		<s:textfield name="nome_veicolo" label="Nome"/>
		<s:textfield name="tipo_veicolo" label="Tipo"/>
		<s:textfield name="descrizione_veicolo" label="Descrizione"/>
		<s:textfield name="nposti_veicolo" label="N° Posti"/>
		<s:textfield name="cilindrata_veicolo" label="Cilindrata"/>
		<s:datetimepicker name="immatricolazione_veicolo" label="Immatricolazione"/>
		<s:textfield name="cambio_veicolo" label="Cambio"/>
		<s:textfield name="alimentazione_veicolo" label="Alimentazione"/>
		<s:textfield name="portata_veicolo" label="Portata"/>
		<s:textfield name="bagagliaio_veicolo" label="Bagagliaio"/>
		<s:textfield name="targa_veicolo" label="Targa"/>
		
		<s:submit label="Registra" />
	</s:form>
</body>
</html>