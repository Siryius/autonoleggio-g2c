<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createEvent.selectLocation.title" /></title>
</head>
<body>

<s:form action="saveVeicolo" namespace="/veicolo" method="post" >

	<s:checkboxlist name="selectedOptional" 
          list="optionals_1" listKey="nome" listValue="nome+' - '+descrizione" />
	<s:submit key="Register" value="Register"/>
	
</s:form>

<s:url id="addCategoria" action="addCategoria" namespace="/veicolo" method="input" />
<s:a href="%{addCategoria}"><s:text name="link.addCategoria" /></s:a>

</body>
</html>