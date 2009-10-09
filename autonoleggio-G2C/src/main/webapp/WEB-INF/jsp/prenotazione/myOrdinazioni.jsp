<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
    <title>Ricerca Ordinazioni</title>
</head>
<body>


<strong> Da questa pagina puoi controllare lo stato delle tue ordinazioni.</strong><br /><br />


<s:form name="formRicerca" action="gestioneHistory"  method="post"  >

	<table width="475">

	 <tr> 
	    <td><s:datetimepicker  name="dataInizio"  key="ordinazione.dataInizio" displayFormat="dd/MM/yyyy"/></td>
	    <td><s:datetimepicker  name="dataFine"  key="ordinazione.dataFine" displayFormat="dd/MM/yyyy"/></td>
	 </tr>
	 </table>  
	    <s:submit name="bottone" key="button.find" />
	</s:form>


</body>
</html>