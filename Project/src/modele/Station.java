package modele;

public class Station {
	private int Numero , Arrondissement, Deparetement ,Capacité , VelosDispo, AttachesDispo ;
	private String Nom,Ville ;
	private boolean  CB , StatutOuvert, Mobile;
	
	
	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(int numero, int arrondissement, int deparetement, int capacité, int velosDispo, int attachesDispo,
			String nom, String ville, boolean cB, boolean statutOuvert, boolean mobile) {
		super();
		Numero = numero;
		Arrondissement = arrondissement;
		Deparetement = deparetement;
		Capacité = capacité;
		VelosDispo = velosDispo;
		AttachesDispo = attachesDispo;
		Nom = nom;
		Ville = ville;
		CB = cB;
		StatutOuvert = statutOuvert;
		Mobile = mobile;
	}

	public Station(int numero, String nom, boolean cB, boolean statutOuvert) {
		super();
		Numero = numero;
		Nom = nom;
		CB = cB;
		StatutOuvert = statutOuvert;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public int getArrondissement() {
		return Arrondissement;
	}

	public void setArrondissement(int arrondissement) {
		Arrondissement = arrondissement;
	}

	public int getDeparetement() {
		return Deparetement;
	}

	public void setDeparetement(int deparetement) {
		Deparetement = deparetement;
	}

	public int getCapacité() {
		return Capacité;
	}

	public void setCapacité(int capacité) {
		Capacité = capacité;
	}

	public int getVelosDispo() {
		return VelosDispo;
	}

	public void setVelosDispo(int velosDispo) {
		VelosDispo = velosDispo;
	}

	public int getAttachesDispo() {
		return AttachesDispo;
	}

	public void setAttachesDispo(int attachesDispo) {
		AttachesDispo = attachesDispo;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public boolean isCB() {
		return CB;
	}

	public void setCB(boolean cB) {
		CB = cB;
	}

	public boolean isStatutOuvert() {
		return StatutOuvert;
	}

	public void setStatutOuvert(boolean statutOuvert) {
		StatutOuvert = statutOuvert;
	}

	public boolean isMobile() {
		return Mobile;
	}

	public void setMobile(boolean mobile) {
		Mobile = mobile;
	}

	@Override
	public String toString() {
		return "Station [Numero=" + Numero + ", Arrondissement=" + Arrondissement + ", Deparetement=" + Deparetement
				+ ", Capacité=" + Capacité + ", VelosDispo=" + VelosDispo + ", AttachesDispo=" + AttachesDispo
				+ ", Nom=" + Nom + ", Ville=" + Ville + ", CB=" + CB + ", StatutOuvert=" + StatutOuvert + ", Mobile="
				+ Mobile + "]";
	}
	
	
	
	

}
