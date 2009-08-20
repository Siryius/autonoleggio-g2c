package it_progetto_tsw2_hibernate;

public class Staff extends Utente
{
	private String nome_staff;
	private String cognome_staff;
	private String competenza_staff;

	public String getCompetenza_staff() {
		return competenza_staff;
	}

	public void setCompetenza_staff(String competenza) {
		this.competenza_staff = competenza;
	}

	public String getNome_staff() {
		return nome_staff;
	}

	public void setNome_staff(String nomeStaff) {
		nome_staff = nomeStaff;
	}

	public String getCognome_staff() {
		return cognome_staff;
	}

	public void setCognome_staff(String cognomeStaff) {
		cognome_staff = cognomeStaff;
	}
	

}
