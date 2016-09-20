package qlg.tp1;



public class Animal {

	private String nom;
	private String cri;
	
	
	
	public Animal(String p_nom, String p_cri)
	{
		setNom(p_nom);
		cri = p_cri;		
	}
	
	public String crier()
	{
		return "Quand je suis vénère je cris : " + this.cri;
	}

	private String getNom()
	{
		return nom;
	}

	private void setNom(String nom) {
		this.nom = nom;
	}


}
