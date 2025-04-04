package modele;

public class Station {
	private int  deparetement, capacite, velosDispo, attachesDispo;
	private String nom, ville, numero, cb, statutOuvert, arrondissement;
	private boolean mobile;

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(String arrondissement, int deparetement, int capacite, int velosDispo, int attachesDispo, String numero,
			String nom, String ville, String cb, String statutOuvert, boolean mobile) {
		super();
		this.numero = numero;
		this.arrondissement = arrondissement;
		this.deparetement = deparetement;
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

	public String getArrondissement() {
		return arrondissement;
	}

	public void setArrondissement(String arrondissement) {
		this.arrondissement = arrondissement;
	}

	public int getDeparetement() {
		return deparetement;
	}

	public void setDeparetement(int deparetement) {
		this.deparetement = deparetement;
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

	public boolean isMobile() {
		return mobile;
	}

	public void setMobile(boolean mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Station [Numero=" + numero + ", Arrondissement=" + arrondissement + ", Deparetement=" + deparetement
				+ ", Capacité=" + capacite + ", VelosDispo=" + velosDispo + ", AttachesDispo=" + attachesDispo
				+ ", Nom=" + nom + ", Ville=" + ville + ", CB=" + cb + ", StatutOuvert=" + statutOuvert + ", Mobile="
				+ mobile + "]";
	}

}
