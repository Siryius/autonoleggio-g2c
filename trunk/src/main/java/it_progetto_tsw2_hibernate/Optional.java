package it_progetto_tsw2_hibernate;

import java.io.Serializable;
import java.util.*;

public class Optional implements Serializable
{
	private Long id_optional;
	private String nome_optional;
	private String descrizione_optional;
	private float supplemento_optional;
	private Set<Veicolo> veicoli=new HashSet();
	
	
	public Long getId_optional() {
		return id_optional;
	}
	public void setId_optional(Long id_optional) {
		this.id_optional = id_optional;
	}
	public String getNome_optional() {
		return nome_optional;
	}
	public void setNome_optional(String nome_optional) {
		this.nome_optional = nome_optional;
	}
	public String getDescrizione_optional() {
		return descrizione_optional;
	}
	public void setDescrizione_optional(String descrizione_optional) {
		this.descrizione_optional = descrizione_optional;
	}
	public float getSupplemento_optional() {
		return supplemento_optional;
	}
	public void setSupplemento_optional(float supplemento_optional) {
		this.supplemento_optional = supplemento_optional;
	}
	public Set<Veicolo> getVeicoli() {
		return veicoli;
	}
	public void setVeicoli(Set<Veicolo> veicoli) {
		this.veicoli = veicoli;
	}

}
