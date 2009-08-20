<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title><s:text name="createSede.selectSede.title" /></title>
</head>
<body>

<s:form action="selectSede" namespace="/veicolo" method="post" >

    <s:select size="10" name="selectedSede"
            list="sedi" listKey="id_sede" listValue="nome_sede" />
    <s:submit key="button.select" />

</s:form>



</body>
</html>