<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title>Pagina Ricerca Veicolo.</title>
</head>
<body>



<h3> Ricerca </h3>


<s:hidden name="ord" value="%{ord}" />
<s:hidden name="campoOrd" value="%{campoOrd}" />
<s:hidden name="pagina" value="" />
<s:hidden name="ricerca" value="si" />


<script src="http://italian.jotform.com/js/form.js?v2.0.998" type="text/javascript"></script>
<table width="100%" cellpadding="2" cellspacing="0" >
<tr>
	<td class="topleft" width="10" height="10">&nbsp;</td>
	<td class="topmid">&nbsp;</td>
	<td class="topright" width="10" height="10">&nbsp;</td>
 </tr>
<tr>
	<td class="midleft" width="10">&nbsp;&nbsp;&nbsp;</td>
	<td class="midmid" valign="top">
		<s:form  action="ricercaVeicolo"  method="post" name="q_form_92501751173" >
			<input type="hidden" name="formID" value="92501751173" />
			<div id="main" > 
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
				<div id="div_q8" style="display:block" class="formScomparsa">
 					<table width="520" cellpadding="5" cellspacing="0">
  						<tr><td colspan="2"></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="nome" key="veicolo.nome"/></td>
 						
 						<td class="left" ><s:textfield  name="descrizione" key="veicolo.descrizione"/></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="tipo" key="veicolo.tipo"/></td></tr>
 
 						<tr><td class="left" ><s:textfield  name="cambio" key="veicolo.cambio"/></td></tr>
 						
 						<tr><td class="left" ><s:textfield  name="alimentazione" key="veicolo.alimentazione"/></td></tr>
 						
 						<tr >
 							<td width="150" class="left" >&nbsp;</td>
  							<td class="right"><s:submit key="veicolo.ricerca" name="veicolo_ricerca"/></td>
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


<s:if  test="veicoli.size>0">  


 <table  class="tabellaVeicolo"  >  

   <tr class="tabListaVeicoloHeader">
<th width="20">&nbsp;&nbsp;&nbsp;</th>
<th width="50">&nbsp;&nbsp;&nbsp;</th>

<th >
<s:text name="veicolo.nome"/>
<img onclick="ordina('nome','up');" src="../images/up.gif" width="10" height="10" />
<img onclick="ordina('nome','dw');"  src="../images/down.gif" width="10" height="10" />
</th>

<th >
<s:text name="veicolo.descrizione"/>
<img onclick="ordina('descrizione','up');"  src="../images/up.gif" width="10" height="10" />
<img onclick="ordina('descrizione','dw');"  src="../images/down.gif" width="10" height="10" />
</th>

<th >
<s:text name="veicolo.tipo"/>
<img onclick="ordina('tipo','up');" src="../images/up.gif" width="10" height="10" />
<img onclick="ordina('tipo','dw');" src="../images/down.gif" width="10" height="10" />
</th>

<th>
<s:text name="veicolo.cambio"/>
<img onclick="ordina('cambio','up');" src="../images/up.gif" width="10" height="10" />
<img onclick="ordina('cambio','dw');" src="../images/down.gif" width="10" height="10" />
</th>
<th width="5" colspan="2">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</th>
</tr> 

 
     <s:iterator  status="stato" value="veicoli">  

		<tr class="tabListaVeicolo">
			
			<!-- 	<td width="5%"> <s:property value="id" /> </td> -->

				<td width="120">
				<s:url escapeAmp="false" id="image"  action="getImmagine.action"  > <s:param  name="idV" value="veicoli[#stato.index].idVeicolo" /></s:url>
				<img src="<s:property  value="%{image}" />" alt=""  width="100" height="100" /> 
				</td>
				
				<td width="150"><s:property value="veicoli[#stato.index].nome" /></td>
				<td width="150"><s:property value="veicoli[#stato.index].descrizione" /></td>
				<td width="50"><s:property value="veicoli[#stato.index].tipo" /></td>
				<td width="50"><s:property value="veicoli[#stato.index].cambio" /></td>
				
				<td width="20"> <s:url id="modUrlId"  action="NuovaVoceMenu">
					<s:param name="id" value="veicoli[#stato.index].id" />
				</s:url>
				<s:a  href="%{modUrlId}"><img src="../images/edit.png" /></s:a>
				</td>
				
				<!--  visualizza veicolo -->
				<td width="20">
				<s:url  id="testUrlId"  action="MostraVeicolo" >
					<s:param name="idV" value="veicoli[#stato.index].idVeicolo" />
				</s:url> 
				<s:a  href="%{testUrlId}"> <img src="../images/browse2.png" /></s:a>
				</td>
				
				<!--  elimina veicolo -->
				<td width="20"><s:url id="testUrlId_"  action="EliminaVoceMenu">
					<s:param name="id" value="menu[#stato.index].idVeicolo" />
				</s:url> 
				<s:a  href="javascript:deleteElement('%{menu[#stato.index].descrizione}','%{testUrlId_}');" > <img src="../images/supprime.gif" width="16" height="16" /> </s:a>
				</td>

			</tr>
	</s:iterator>
 
 			<tr>
 			<td colspan="7" align="right"> 
 		
 			Pagina <s:property value="pagina" />  di <s:property value="pagine" /> 

 			<s:if test="pagina>1">
 			
 		
		    <s:a href="javascript:paginazione(%{pagina-1});" ><img  src="../images/paginasx.gif" /></s:a>
 			
 		</s:if>
 			
 			<s:if test="pagine>1 && pagina < pagine">
 			
		    <s:a href="javascript:paginazione(%{pagina+1});"  > <img    src="../images/paginadx.gif" /></s:a>
 			
 			</s:if>
 			
 			</td></tr>
</table>

</s:if>
<s:else>
	<s:if test="ricerca!=null"><s:text  name="La ricerca non ha prodotto risultati." /></s:if>
	
</s:else>

						<s:url id="addVeicoloFlow" action="addVeicoloFlow" namespace="/veicolo" />
						<li><s:a href="%{addVeicoloFlow}">Inserisci Veicolo</s:a></li>

</body>
</html>