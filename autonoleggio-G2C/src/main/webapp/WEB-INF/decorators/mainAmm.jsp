<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@taglib prefix="page" uri="http://www.opensymphony.com/sitemesh/page" %>
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Benvenuti in G2CAutonoleggio.it</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="<s:url value='/styles/style.css'/>" rel="stylesheet"
	type="text/css" media="all" />
</head>
<body>

<div id="wrapper">
	<div id="logo"></div>
	<hr />
	<!-- end #logo -->
	<div id="header">
		
		<div id="menu">
			<ul>
				<li><a href="#" class="first">Home</a></li>
				<li class="current_page_item"><a href="#">Preventivo</a></li>
				<li><a href="#">Sedi</a></li>
				<li><a href="#">Veicoli</a></li>
				<li><a href="#">Links</a></li>
				<li><a href="#">Contatti</a></li>
			</ul>
		</div>
		<!-- end #menu -->
		<div id="search">
			
		</div>
		<!-- end #search -->
	</div>
	<!-- end #header -->
	<!-- end #header-wrapper -->
	<div id="page">
	
	
	<s:set name="userType" value="%{#session['user'].tipo}" />
	
	<s:if test="%{#userType=='AZ'}" >
	 	Benvenuto/a <s:property value="#session['user'].ragionesociale"/>
	</s:if>
	
	<s:if test="%{#userType=='AM'}">
	 	Benvenuto/a <s:property value="#session['user'].nome+' '+#session['user'].cognome"/>
	</s:if>
	
	<s:if test="%{#userType=='CL'}">
	 	Benvenuto/a <s:property value="#session['user'].nome+' '+#session['user'].cognome"/>
	</s:if>
	
	
		<div id="content">
			<div id="banner"></div>
				<decorator:body/>
		</div>
		<!-- end #content -->
		<div id="sidebar">
			<ul>
				<li>
					<h2>Chi Siamo</h2>
					<p>L'autonoleggio G2C prende il nome dai suoi fondatori Giovanni, Claudio e Carmine. Grandi appassionati di automobili i tre amici decidono di mettere su un autonoleggio       <a href="#">More...</a></p>
				</li>
				<li>
					<h2>Menu </h2>
					<ul>
						
						<s:if test="%{#userType=='AM'}" >
						
							<s:url id="allPratica" action="allPratica" namespace="/anagrafica" />
							<li><s:a href="%{allPratica}">Pratiche</s:a></li>
							
							<s:url id="allAssicurazione" action="allAssicurazione" namespace="/anagrafica" />
							<li><s:a href="%{allAssicurazione}">Assicurazioni</s:a></li>
							
							<s:url id="allStaff" action="allStaff" namespace="/anagrafica" />
							<li><s:a href="%{allStaff}">Staff</s:a></li>
							
						</s:if>
						
						
						<s:url id="allOptional" action="allOptional" namespace="/anagrafica" />
						<li><s:a href="%{allOptional}">Optional</s:a></li>
						
						<s:url id="allSedi" action="allSedi" namespace="/anagrafica" />
						<li><s:a href="%{allSedi}">Sedi</s:a></li>
						
						<s:url id="allCategoria" action="allCategoria" namespace="/anagrafica" />
						<li><s:a href="%{allCategoria}">Categorie</s:a></li>
						
						<s:url id="allPromozione" action="allPromozione" namespace="/anagrafica" />
						<li><s:a href="%{allPromozione}">Promozioni</s:a></li>
						
						<s:url id="ricercaVeicolo" action="ricercaVeicolo" namespace="/veicolo" />
						<li><s:a href="%{ricercaVeicolo}">Ricerca Veicolo</s:a></li>
						
	
					</ul>
				</li>
				<li>
					<h2>Area Login</h2>
					<ul>
					
						<s:if test="%{#userType!='AM'&&#userType!='CL' && #userType!='ST'}" >
							<li><a href="index.action">Login</a></li>
							<s:url id="addUtenteFlow" action="addUtenteFlow" namespace="/utente" />
							<li><s:a href="%{addUtenteFlow}">Registrati</s:a></li>
						</s:if>
						<s:else>
							<s:url id="addUtenteFlow" action="addUtenteFlow" namespace="/utente" />
							<li><s:a href="%{addUtenteFlow}">Logout</s:a></li>
						</s:else>
						
						
							
						
					</ul>
				</li>
			</ul>
		</div>
		<!-- end #sidebar -->
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
	<div id="footer-bgcontent">
	<div id="footer">
		<p>Copyright (c) 2008 G2C Autonoleggio. All rights reserved. </p>
	</div>
	</div>
	<!-- end #footer -->
</div>

<script type="text/javascript">

function ordina(campoOrd,ord){ 
  document.formRicerca.campoOrd.value=campoOrd;
  document.formRicerca.ord.value=ord;
  document.formRicerca.bottone.click();
} 

function paginazione(val){ 
	  document.formRicerca.pagina.value=val;
	  document.formRicerca.bottone.click();
}

</script>

</body>
</html>
