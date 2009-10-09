<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createUtente.enterUtenteDetails.azienda.title" /></title>
</head>
<body>

<s:form action="flashedSelectUtenteType" namespace="/utente" method="post" >

	<b>Contratto</b>

    <s:submit key="button.create" />

</s:form>

</body>
</html>