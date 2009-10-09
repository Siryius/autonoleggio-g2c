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
<link href="<s:url value='/styles/style.css'/>" rel="stylesheet" type="text/css" media="all" />
</head>
<body>
<div id="wrapper">
	<div id="logo">
		<h1><img src="images/scritta.jpg" alt="" /></h1>
	</div>
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
		<div id="content">
			<div id="banner"><img src="images/img09.jpg" alt="" /></div>
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
						<li><a href="#">Veicoli</a></li>
						<li><a href="#">Sedi</a></li>
						
						<s:url id="addPrenotazioneFlow" action="addPrenotazioneFlow" namespace="/prenotazione" />
						<li><s:a href="%{addPrenotazioneFlow}">Prenotazione</s:a></li>
						
						
						<li><a href="#">Promozioni</a></li>
					</ul>
				</li>
				<li>
					<h2>Area Login</h2>
					<ul>
						<li><a href="index.action">Login</a></li>
						<s:url id="addUtenteFlow" action="addUtenteFlow" namespace="/utente" />
						<li><s:a href="%{addUtenteFlow}">Registrati</s:a></li>					
						
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
</body>
</html>
