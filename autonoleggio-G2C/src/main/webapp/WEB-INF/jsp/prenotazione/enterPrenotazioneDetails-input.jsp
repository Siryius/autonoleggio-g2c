<!DOCTYPE html PUBLIC
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="decorator"
	uri="http://www.opensymphony.com/sitemesh/decorator"%>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<title><s:text name="createPrenotazione.enterPrenotazione.title" /></title> 
</head>
<body>
	<s:form action="enterPrenotazioneDetails" namespace="/prenotazione" method="post">
		
	
		
		<s:label name="data_partenza" key="prenotazione.partenza_prenotazione"/>
		<s:textfield name="data_part" />
		
		<s:label name="oraMinuti_partenza" key="prenotazione.oraMinuti_partenza"/>
			<s:textfield name="ora_partenza"/><s:textfield name="minuti_partenza"/>
		
		<s:label name="data_arrivo" key="prenotazione.arrivo_prenotazione"/>
		<s:textfield name="data_arr" />
		
		<s:label name="oraMinuti_arrivo" key="prenotazione.oraMinuti_arrivo"/>
			<s:textfield name="ora_arrivo"/><s:textfield name="minuti_arrivo"/>
			
		<s:submit key="button.select" />
	
		
	</s:form>
		<s:datetimepicker name="date" label="date"></s:datetimepicker>
</body>
</html>