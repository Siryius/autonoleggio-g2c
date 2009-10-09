package it.unisa.tsw2.domain;


import java.io.Serializable;
import com.opensymphony.xwork2.validator.annotations.*;
import java.util.*;

public class Optional
{
	private Long idOptional;
	private String nome;
	private String descrizione;
	private float supplemento;
	private Set<Veicolo> veicoli=new HashSet();
	public Long getIdOptional() {
		return idOptional;
	}
	public void setIdOptional(Long idOptional) {
		this.idOptional = idOptional;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public float getSupplemento() {
		return supplemento;
	}
	public void setSupplemento(float supplemento) {
		this.supplemento = supplemento;
	}
	public Set<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(Set<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}
	
	

}
