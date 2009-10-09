package it.unisa.tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.StreamResult;

import com.opensymphony.xwork2.Preparable;

import it.unisa.tsw2.util.Utils;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.sql.SQLException;

@ParentPackage("enterVeicolo")
@Result(name="success", value="inputStream", type=StreamResult.class)
public class GetImmagineAction extends BaseVeicoloAction implements Preparable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String idV;
	
	
	
	public String getIdV() {
		return idV;
	}



	public void setIdV(String id) {
		this.idV = id;
	}


	public void prepare() throws Exception {
		
		System.out.println("Id veicolo "+idV);
		
	}
	

	public InputStream getInputStream() throws SQLException {
	long l=0;	
	
	
		if(idV!=null){
			veicolo=veicoloService.findById(new Long(idV));
		}
	
        if( veicolo==null || veicolo.getPortrait()==null) {
        	
            return Utils.getNoImageInputStream(getText("text.noImage"));
        } else {
        	l=veicolo.getPortrait().length();
        	return new ByteArrayInputStream(veicolo.getPortrait().getBytes(1,(int) l));
        	//return new ByteArrayInputStream(vocemenu.getPortrait());
        }
    }


}


