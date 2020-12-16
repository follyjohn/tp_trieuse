package dip;

public class OracleDb implements DataBase {
	public void connecter() {
		System.out.println("Connexion a la Oracle");
	}

	public void deconnecter() {
		System.out.println("deconnexion a la Oracle");
	}
}
