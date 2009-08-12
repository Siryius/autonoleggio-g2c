<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Campi Promozione</title>
	<s:head />
</head>
<body>
	<s:form action="newPromozione" method="post" enctype="multipart/form-data">
		<s:textfield label="Nome" name="nome_promozione" required="true"/>
		<s:textfield  label="Descrizione" name="descrizione_promozione" required="true"/>
		<s:textfield  label="Data Inizio" name="datainizio_promozione" required="true"/>
		<s:textfield  label="Data Fine" name="datafine_promozione" required="true"/>
		<s:textfield  label="Sconto" name="sconto_promozione" required="true"/>
		<s:submit key="Register" value="Register"/>
	</s:form>
</body>
</html>