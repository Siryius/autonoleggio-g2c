<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
    <title>Pagina Ricerca Veicolo.</title>
</head>
<body>



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
		<s:form  action="ricercaVeicolo"  method="post" name="formRicerca" >
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
       							<label>Ricerca Veicolo&nbsp;</label>
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
 						
 						<s:hidden name="ord" value="%{ord}" />
						<s:hidden name="campoOrd" value="%{campoOrd}" />
						<s:hidden name="pagina" value="" />
						<s:hidden name="ricerca" value="si" />
 						
 						<tr >
 							<td class="left" ><s:reset key="button.reset" name="veicolo_reset"/></td>
  							<td class="right"><s:submit key="button.search" name="veicolo_ricerca"/></td>
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
validate("formRicerca");
</script>


<s:if  test="veicoli.size>0">  


 <table  class="tabellaVeicolo"  >  

   <tr class="tabListaVeicoloHeader">

<th width="110">
<s:text name="veicolo.foto"/>
</th>

<th width="85" align="center">
<s:text name="veicolo.nome"/>
<br><img onclick="ordina('nome','up');" src="../images/up.png" width="10" height="10" />
<img onclick="ordina('nome','dw');"  src="../images/down.png" width="10" height="10" /></br>
</th>

<th width="85" align="center">
<s:text name="veicolo.tipo"/>
<br><img onclick="ordina('tipo','up');" src="../images/up.png" width="10" height="10" />
<img onclick="ordina('tipo','dw');" src="../images/down.png" width="10" height="10" /></br>
</th>

<th width="85" align="center">
<s:text name="veicolo.alimentazione"/>
<br><img onclick="ordina('tipo','up');" src="../images/up.png" width="10" height="10" />
<img onclick="ordina('tipo','dw');" src="../images/down.png" width="10" height="10" /></br>
</th>

<th width="85" align="center">
<s:text name="veicolo.cambio" />
<br><img onclick="ordina('cambio','up');" src="../images/up.png" width="10" height="10" />
<img onclick="ordina('cambio','dw');" src="../images/down.png" width="10" height="10" /></br>
</th>

<th width="85" align="center">
<s:text name="veicolo.nposti"/>
<br><img onclick="ordina('cambio','up');" src="../images/up.png" width="10" height="10" />
<img onclick="ordina('cambio','dw');" src="../images/down.png" width="10" height="10" /></br>
</th>

<th width="20" align="center"/>
<th width="20" align="center"/>

</tr> 

 
     <s:iterator  status="stato" value="veicoli">  

		<tr class="tabListaVeicolo">
			
			<!-- 	<td width="5%"> <s:property value="id" /> </td> -->

				<td width="110">
				<s:url escapeAmp="false" id="image"  action="getImmagine.action"  > <s:param  name="idV" value="veicoli[#stato.index].idVeicolo" /></s:url>
				<img src="<s:property  value="%{image}" />" alt=""  width="100" height="80" /> 
				</td>
				
				<td width="85" align="center"><s:property value="veicoli[#stato.index].nome" /></td>
				<td width="85" align="center"><s:property value="veicoli[#stato.index].tipo" /></td>
				<td width="85" align="center"><s:property value="veicoli[#stato.index].alimentazione" /></td>
				<td width="85" align="center"><s:property value="veicoli[#stato.index].cambio" /></td>
				<td width="85" align="center"><s:property value="veicoli[#stato.index].nposti" /></td>
				
				
				<!--  visualizza veicolo -->
				<td width="20">
				<s:url  id="testUrlId"  action="mostraVeicolo" namespace="/veicolo">
					<s:param name="idV" value="veicoli[#stato.index].idVeicolo" />
				</s:url> 
				<s:a  href="%{testUrlId}"> <img src="../images/search.png"  width="20" height="20"/></s:a>
				</td>
				
				<!--  elimina veicolo -->
				<td width="20"><s:url id="testUrlId_"  action="EliminaVoceMenu">
					<s:param name="id" value="menu[#stato.index].idVeicolo" />
				</s:url> 
				<s:a  href="javascript:deleteElement('%{menu[#stato.index].descrizione}','%{testUrlId_}');" > <img src="../images/cancel.png" width="20" height="20" /> </s:a>
				</td>

			</tr>
			
	</s:iterator>
 
 			<tr>
 			<td colspan="7" align="right"> 
 		
 			Pagina <s:property value="pagina" />  di <s:property value="pagine" /> 

 			<s:if test="pagina>1">
 			
 		
		    <s:a href="javascript:paginazione(%{pagina-1});" ><img  src="../images/paginasx.png" width="17" height="17"/></s:a>
 			
 		</s:if>
 			
 			<s:if test="pagine>1 && pagina < pagine">
 			
		    <s:a href="javascript:paginazione(%{pagina+1});"  > <img    src="../images/paginadx.png" width="17" height="17" /></s:a>
 			
 			</s:if>
 			
 			</td></tr>
</table>

</s:if>
<s:else>
	<s:if test="ricerca!=null"><s:text  name="La ricerca non ha prodotto risultati." /></s:if>
	
</s:else>

						<s:url id="addVeicoloFlow" action="addVeicoloFlow" namespace="/veicolo" />
						
						<br><s:a href="%{addVeicoloFlow}"><button type="button">Inserisci Nuovo Veicolo</button></s:a>
</body>
</html>