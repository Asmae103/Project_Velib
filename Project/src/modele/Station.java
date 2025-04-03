package modele;

public class Station {
	private int arrondissement, deparetement, capacité, velosDispo, attachesDispo;
	private String nom, ville, numero, cb, statutOuvert;
	private boolean mobile;

	public Station() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Station(int arrondissement, int deparetement, int capacité, int velosDispo, int attachesDispo, String numero,
			String nom, String ville, String cb, boolean statutOuvert, boolean mobile) {
		super();
		numero = numero;
		arrondissement = arrondissement;
		deparetement = deparetement;
		capacité = capacité;
		velosDispo = velosDispo;
		attachesDispo = attachesDispo;
		nom = nom;
		ville = ville;
		cb = cb;
		statutOuvert = statutOuvert;
		mobile = mobile;
	}

	public Station(String numero, String nom, String cb, boolean statutOuvert) {
		super();
		numero = numero;
		nom = nom;
		cb = cb;
		statutOuvert = statutOuvert;
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

	public void setArrondissement(int arrondissement) {
		arrondissement = arrondissement;
	}

	public int getDeparetement() {
		return deparetement;
	}

	public void setDeparetement(int deparetement) {
		deparetement = deparetement;
	}

	public int getCapacité() {
		return capacité;
	}

	public void setCapacité(int capacité) {
		capacité = capacité;
	}

	public int getVelosDispo() {
		return velosDispo;
	}

	public void setVelosDispo(int velosDispo) {
		velosDispo = velosDispo;
	}

	public int getAttachesDispo() {
		return attachesDispo;
	}

	public void setAttachesDispo(int attachesDispo) {
		attachesDispo = attachesDispo;
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
		ville = ville;
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
		mobile = mobile;
	}

	@Override
	public String toString() {
		return "Station [Numero=" + numero + ", Arrondissement=" + arrondissement + ", Deparetement=" + deparetement
				+ ", Capacité=" + capacité + ", VelosDispo=" + velosDispo + ", AttachesDispo=" + attachesDispo
				+ ", Nom=" + nom + ", Ville=" + ville + ", CB=" + cb + ", StatutOuvert=" + statutOuvert + ", Mobile="
				+ mobile + "]";
	}

}
