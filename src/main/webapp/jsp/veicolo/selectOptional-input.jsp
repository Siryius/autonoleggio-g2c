<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createEvent.selectLocation.title" /></title>
</head>
<body>

<s:form action="selectCategoria" namespace="/veicolo" method="post" >

    <s:select size="10" name="selectedOptional"
            list="optionals" listKey="id_optional" listValue="nome_optional" />
    <s:submit key="button.select" />

</s:form>

<s:url id="saveVeicolo" action="saveVeicolo" namespace="/veicolo" />
<s:a href="%{saveVeicolo}"><s:text name="link.completeVeicolo" /></s:a>

</body>
</html>