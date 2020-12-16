package dip;

public class MySqlDb implements DataBase{

	public void connecter() {
		System.out.println("Connexion a la BD MySql");
	}
	public void deconnecter() {
		System.out.println("deconnexion a la BD MySql");
	}
}
