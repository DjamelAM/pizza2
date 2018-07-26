package fr.pizzeria.model;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	CategoriePizza categorie;

	public Pizza(String nvCode, String nvLibelle, double nvPrix, CategoriePizza categorie) {
		code = nvCode.toUpperCase();
		libelle = nvLibelle;
		prix = nvPrix;
		this.categorie = categorie;
	}

	public Pizza(int nvId, String nvCode, String nvLibelle, double nvPrix) {
		id = nvId;
		code = nvCode.toUpperCase();
		libelle = nvLibelle;
		prix = nvPrix;

	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public CategoriePizza getCategorie() {
		return categorie;
	}

	public void setCategorie(CategoriePizza categorie) {
		this.categorie = categorie;
	}

	public String toString() {
		return code + " -> " + libelle + "(" + prix + " \u20ac)" + "catégorie : " + categorie;
	}

}
