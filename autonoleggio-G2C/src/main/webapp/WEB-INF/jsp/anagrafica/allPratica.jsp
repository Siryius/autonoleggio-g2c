<!DOCTYPE html PUBLIC 
	"-//W3C//DTD XHTML 1.1 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
	
<%@taglib prefix="s" uri="/struts-tags" %>

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>All Pratica</title>
	<s:head />
</head>
<body>

<script src="http://italian.jotform.com/js/form.js?v2.0.998" type="text/javascript"></script>
<table width="100%" cellpadding="2" cellspacing="0" class="tbmain">
<tr>
	<td class="topleft" width="10" height="10">&nbsp;</td>
	<td class="topmid">&nbsp;</td>
	<td class="topright" width="10" height="10">&nbsp;</td>
 </tr>
<tr>
	<td class="midleft" width="10">&nbsp;&nbsp;&nbsp;</td>
	<td class="midmid" valign="top">
		<s:form  action="searchPraticaByExample"  method="post" name="q_form_92501751173">
			<input type="hidden" name="formID" value="92501751173" />
			<div id="main"> 
				<div class="pagebreak"> 
					<input type="hidden" id="spc" name="spc" value="spc" />
					<script type="text/javascript">
   						document.getElementById('spc').value = '8d3d674e9ba4f4cb835f46244b7e4aa3';
					</script>
					<table width="520" cellpadding="5" cellspacing="0">
 						<tr><td colspan="2"></td></tr>
					</table>
				</div>
  				<table width="520" border="0" cellpadding="0" cellspacing="0">
   					<tr onclick="closeDiv('q8');" >
    					<td width="20" height="20" style="background-image:url('http://italian.jotform.com/images/splitter_left.gif')"></td>
    					<td style="background-image:url('http://italian.jotform.com/images/splitter_mid.gif')">
     						<div class="pagebreak">
       							<label>Campi Ricerca&nbsp;</label>
     						</div>
    					</td>
    					<td id="td_q8" width="20" style="background-image:url('http://italian.jotform.com/images/splitter_right_show.gif')"></td>
 					</tr>
 					<tr>
  						<td height="2"></td>
  						<td></td>
  						<td></td>
 					</tr>
				</table>
				<div id="div_q8" style="display:block">
 					<table width="520" cellpadding="5" cellspacing="0">
  						<tr><td colspan="2"></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="nome" key="pratica.nome"/></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="descrizione" key="pratica.descrizione"/></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="scadenza" key="pratica.scadenza"/></td></tr>
 
 						<tr >
 							<td width="150" class="left" >&nbsp;</td>
  							<td class="right"><s:submit key="pratica.ricerca" name="pratica_ricerca"/></td>
 						</tr>
					</table>
				</div>
			</div>
		</s:form>
	</td>
	<td class="midright" width="10">&nbsp;&nbsp;&nbsp;</td>
</tr>
<tr>
 <td class="bottomleft" width="10" height="10">&nbsp;</td>
 <td class="bottommid">&nbsp;</td>
 <td class="bottomright" width="10" height="10">&nbsp;</td>
</tr>
</table>
<script type="text/javascript">
validate("q_form_92501751173");
</script>

	<s:form action="campiPratica"  method="post" name="campiPratica">
	<table class="tabella">
	<tr><th> </th> <th>Nome</th> <th>Descrizione</th> <th>Scadenza</th><th></th> </tr>
	<s:iterator value="allPraticaIterator">
		
		<tr> 
			<td>
				<s:url id="searchPraticaByNome_pratica" action="searchPraticaByNome_pratica">
					<s:param name="nome_pratica" value="nome_pratica"> <s:property value="nome_pratica" /></s:param>
				</s:url>
				
				<s:a href="%{searchPraticaByNome_pratica}"> <img src="../images/info.png" WIDTH="30" HEIGHT="30"/> </s:a> 
			</td>
			
			<td> <s:property value="nome_pratica"/>  </td> 
			<td> <s:property value="descrizione_pratica"/>  </td>
			<td> <s:property value="scadenza_pratica"/> </td>
			
			<td>
				<s:url id="deletePratica" action="deletePratica">
					<s:param name="nome_pratica" value="nome_pratica"> <s:property value="nome_pratica" /></s:param>
				</s:url>
				<s:a href="%{deletePratica}"><img src="../images/delete.png" WIDTH="30" HEIGHT="30"></s:a>
			</td>	 
		</tr>
	</s:iterator>
	</table>
	
	<s:submit key="pratica.inserisci" name="pratica_inserisci" />
	
	</s:form>
</body>
</html>