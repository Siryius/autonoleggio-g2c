package it.unisa.tsw2.actions.utente;

import com.opensymphony.xwork2.Preparable;
import it.unisa.tsw2.domain.Utente;
import it.unisa.tsw2.domain.Cliente;
import it.unisa.tsw2.domain.Azienda;
import org.apache.struts2.config.Result;
import org.apache.struts2.config.ParentPackage;
import org.apache.struts2.dispatcher.ServletActionRedirectResult;

import java.util.List;
import java.util.ArrayList;


@ParentPackage("enterUtente")
@Result(type= ServletActionRedirectResult.class,value="enterUtenteDetails")
public class SelectUtenteTypeAction extends BaseUtenteAction implements Preparable {

    private Integer typeId;
    private List<Utente> types;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public List<Utente> getTypes() {
        return types;
    }

    public void prepare() throws Exception {
        types = new ArrayList<Utente>();
        types.add(new Azienda());
        types.add(new Cliente());
    }

    public String input() throws Exception {
        return INPUT;
    }

}
