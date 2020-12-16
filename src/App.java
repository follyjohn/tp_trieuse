import dip.GestionnaireDb;
import dip.OracleDb;
import methodedeux.GestionnaireTri;
import methodedeux.TriFusion;
import methodedeux.TriBulle;

public class App {
    public static void main(String[] args) throws Exception {
        // GestionnaireTri gestionnaireTri = new GestionnaireTri();

        // TriFusion choixUn = new TriFusion();
        // TriBulle choixDeux = new TriBulle();

        // gestionnaireTri.trier(choixDeux);

        GestionnaireDb gestionnaireDb = new GestionnaireDb(new OracleDb());
        gestionnaireDb.connecter();
        gestionnaireDb.deconnecter();

    }

}
