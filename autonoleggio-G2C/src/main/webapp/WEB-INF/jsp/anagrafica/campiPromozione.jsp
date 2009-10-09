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
		<s:textfield key="promozione.nome" name="nome" required="true"/>
		<s:textfield  key="promozione.descrizione" name="descrizione" required="true"/>
		<s:textfield  key="promozione.dataInizio" name="dataInizio" required="true"/>
		<s:textfield  key="promozione.dataFine" name="dataFine" required="true"/>
		<s:textfield  key="promozione.sconto" name="sconto" required="true"/>
		<s:submit key="promozione.Register" value="Register"/>
	</s:form>
</body>
</html>