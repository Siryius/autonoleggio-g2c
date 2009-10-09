<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createVeicolo.enterVeicolo.title" /></title>   
</head>
<body>
	<s:form action="enterVeicoloDetails" namespace="/veicolo"  method="post"  enctype="multipart/form-data">
		
		<s:textfield name="nome" key="veicolo.nome"/>
		<s:textfield name="tipo" key="veicolo.tipo"/>
		<s:textfield name="descrizione" key="veicolo.descrizione"/>
		<s:textfield name="nposti" key="veicolo.nposti"/>
		<s:textfield name="cilindrata" key="veicolo.cilindrata"/>
		<s:textfield name="immatricolazione" key="veicolo.immatricolazione"/>
		<s:textfield name="cambio" key="veicolo.cambio"/>
		<s:textfield name="alimentazione" key="veicolo.alimentazione"/>
		<s:textfield name="portata" key="veicolo.portata"/>
		<s:textfield name="bagagliaio" key="veicolo.bagagliaio"/>
		<s:textfield name="targa" key="veicolo.targa"/>
		
		<s:file name="upload" key="veicolo.targa" />
  
		
		<s:submit key="button.create" />
	</s:form>
</body>
</html>