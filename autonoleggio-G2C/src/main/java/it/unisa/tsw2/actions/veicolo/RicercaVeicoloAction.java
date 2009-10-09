package it.unisa.tsw2.actions.veicolo;

import com.opensymphony.xwork2.Preparable;

import it.unisa.tsw2.domain.Veicolo;
import it.unisa.tsw2.services.VeicoloService;
import it.unisa.tsw2.services.VeicoloServiceImpl;

import java.util.List;
import java.util.Vector;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.Results;
import org.apache.struts2.dispatcher.ServletDispatcherResult;


@ParentPackage("enterVeicolo")
@Results( value={
@Result(type= ServletDispatcherResult.class,value="/WEB-INF/jsp/veicolo/ricercaVeicolo.jsp",name="success")
})

public class RicercaVeicoloAction extends BaseVeicoloAction implements Preparable
{
	private static final long serialVersionUID = 1L;
    protected VeicoloService serviceVeicolo;
	private List<Veicolo> veicoli=new Vector<Veicolo>();
	private static List<Veicolo> temp;
	

	//Gestione ordinamento
	private  String ord="";
	private  String campoOrd="";
	
	//paginazione
	private int pageSize=2;
	private int pagine=1;
	private int pagina=1;
	
	

	
	public void prepare() throws Exception {
	
	if(veicolo==null)	
	veicolo=new Veicolo();
	
	serviceVeicolo=new VeicoloServiceImpl();
		
	temp=serviceVeicolo.findByExample(veicolo,campoOrd,ord);

			
			veicoli.clear();  	
		  	pagine=Math.round(temp.size() / pageSize );
		  	
		  	System.out.println("Temp "+temp.size());
		  	
		  	if(temp.size() % pageSize !=0 ) pagine++;
	  	
	  		System.out.println("calcolate "+pagine+" pagine");
	  		
	  		for(int i= ((pagina-1)*pageSize) ; i<pageSize*pagina ;i++)
	  			if(i>=temp.size()) break;
	  			else{
	  				
	  					veicoli.add(temp.get(i));
	  			}
	  		
	}
	
	public int getPagina() {
		return pagina;
	}

	public void setPagina(int pagina) {
		this.pagina = pagina;
	}
	
	public int getPagine() {
		return pagine;
	}

	
	public String getOrd() {
		return ord;
	}

	public void setOrd(String ord) {
		this.ord = ord;
	}

	public String getCampoOrd() {
		return campoOrd;
	}

	public void setCampoOrd(String campoOrd) {
		this.campoOrd = campoOrd;
	}
	
	

	public String execute() throws Exception {

		System.out.println("pagina richiesta "+pagina);	
		System.out.println("Campo ord "+campoOrd);
		System.out.println("ord "+ord);
		
		Thread.sleep(100);
		
		return SUCCESS;
	}

	public VeicoloService getServiceVeicolo() {
		return serviceVeicolo;
	}

	public void setServiceVeicolo(VeicoloService serviceVeicolo) {
		this.serviceVeicolo = serviceVeicolo;
	}

	public List<Veicolo> getVeicoli() {
		return veicoli;
	}

	public void setVeicoli(List<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}

	
}



