<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Promozione</title>
	<s:head />
</head>
<body>
	<s:form >
		<s:textfield label="ID" name="model.id_promozione"/>
		<s:textfield label="Nome" name="model.nome_promozione" />
		<s:textfield label="Descrizione" name="model.descrizione_promozione" />
		
		<s:textfield label="Data Inizio" name="model.datainizio_promozione" />
		<s:textfield label="Data Fine" name="model.datafine_promozione" />
		
		<s:textfield label="Sconto" name="model.sconto_promozione" />
		<s:submit value="Update" action="updatePromozione"/>
		<s:submit value="Delete" action="deletePromozione"/>
	</s:form>
</body>
</html>