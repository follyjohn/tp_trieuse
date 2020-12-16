package dip;


public class GestionnaireDb {

	private DataBase bd;// Inteface BaseDeDonnee{connceter();deconnecter()}

	public GestionnaireDb(DataBase bd) {
		this.bd = bd;
	}

	public void connecter() {
		this.bd.connecter();
	}

	public void deconnecter() {
		this.bd.deconnecter();
	}
}
