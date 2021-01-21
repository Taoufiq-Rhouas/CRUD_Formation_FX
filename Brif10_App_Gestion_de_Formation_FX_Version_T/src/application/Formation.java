package application;

public class Formation {

	private int id;
	private String libelle;
	private String description;
	private int statut;
	
	public Formation(int id, String libelle, String description, int statut) {
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.statut = statut;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getStatut() {
		return statut;
	}

	public void setStatut(int statut) {
		this.statut = statut;
	}
	
	
}
