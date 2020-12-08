import methodeun.GestionnaireTri;
import methodeun.TriFusion;
import methodeun.TriInsertion;

public class App {
    public static void main(String[] args) throws Exception {
        GestionnaireTri gestionnaireTri = new GestionnaireTri();

        TriFusion choixUn = new TriFusion();
        TriInsertion choixDeux = new TriInsertion();

        gestionnaireTri.trier(choixUn);
        gestionnaireTri.trier(choixDeux);

    }
}
