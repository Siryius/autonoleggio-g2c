package it.unisa.tsw2.actions.veicolo;

import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.config.Result;
import org.apache.struts2.dispatcher.StreamResult;
import it.unisa.tsw2.util.Utils;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.sql.SQLException;

@ParentPackage("enterVeicolo")
@Result(name="success", value="inputStream", type=StreamResult.class)
public class GetPortraitAction extends BaseVeicoloAction {

    public InputStream getInputStream()throws SQLException
    {
    	long l=0;
        if( veicolo==null || veicolo.getPortrait()==null) {
            return Utils.getNoImageInputStream(getText("text.noImage"));
        } else {
        	return new ByteArrayInputStream(veicolo.getPortrait().getBytes(1,(int) l));
        }
    }

}
