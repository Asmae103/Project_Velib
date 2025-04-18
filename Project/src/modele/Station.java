package modele;

public class Station {
	private int  departement, capacite, velosDispo, attachesDispo , arrondissement , mobile;
	private String nom, ville, numero, cb, statutOuvert;
	

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(int arrondissement, int departement, int capacite, int velosDispo, int attachesDispo, String numero,
			String nom, String ville, String cb, String statutOuvert, int mobile) {
		super();
		this.numero = numero;
		this.arrondissement = arrondissement;
		this.departement = departement;
		this.capacite = capacite;
		this.velosDispo = velosDispo;
		this.attachesDispo = attachesDispo;
		this.nom = nom;
		this.ville = ville;
		this.cb = cb;
		this.statutOuvert = statutOuvert;
		}

	public Station(String numero, String nom, String cb, String statutOuvert) {
		super();
		this.numero = numero;
		this.nom = nom;
		this.cb = cb;
		this.statutOuvert = statutOuvert;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getArrondissement() {
		return arrondissement;
	}

	public void setArrondissement(int arrondissement2) {
		this.arrondissement = arrondissement2;
	}

	public int getDepartement() {
		return departement;
	}

	public void setDepartement(int departement) {
		this.departement = departement;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public int getVelosDispo() {
		return velosDispo;
	}

	public void setVelosDispo(int velosDispo) {
		this.velosDispo = velosDispo;
	}

	public int getAttachesDispo() {
		return attachesDispo;
	}

	public void setAttachesDispo(int attachesDispo) {
		this.attachesDispo = attachesDispo;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCb() {
		return this.cb;
	}

	public void setCB(String cb) {
		this.cb = cb;
	}

	public String getStatutOuvert() {
		return this.statutOuvert;
	}

	public void setStatutOuvert(String statutOuvert) {
		this.statutOuvert = statutOuvert;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobilite) {
		this.mobile = mobilite;
	}

	@Override
	public String toString() {
		return "Station [Numero=" + numero + ", Arrondissement=" + arrondissement + ", Departement=" + departement
				+ ", Capacité=" + capacite + ", VelosDispo=" + velosDispo + ", AttachesDispo=" + attachesDispo
				+ ", Nom=" + nom + ", Ville=" + ville + ", CB=" + cb + ", StatutOuvert=" + statutOuvert + ", Mobile="
				+ mobile + "]";
	}

}
