<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createPrenotazione.selectAssicurazione.title" /></title>
</head>
<body>

<s:form action="savePrenotazione" namespace="/prenotazione" method="post" >

	<s:checkboxlist name="selectedAssicurazione" 
          list="assicurazioni_1" listKey="nome_assicurazione" listValue="nome_assicurazione+' - '+descrizione_assicurazione" />
	<s:submit key="Register" value="Register"/>
	
</s:form>


</body>
</html>