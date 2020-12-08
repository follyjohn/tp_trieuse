package methodeun;

public class GestionnaireTri {
	public void trier(Trieuse trieuse) {
		if (trieuse.typeTri == TypeTri.TRIFUSION) {
			faireTriFusion(trieuse);
		} else if (trieuse.typeTri == TypeTri.TRIINSERTION) {
			faireTriInsertion(trieuse);
		} else if (trieuse.typeTri == TypeTri.TRIBULLE) {
			faireTriBulle(trieuse);
		}
	}

	private void faireTriBulle(Trieuse trieuse) {
		trieuse.tri();
	}

	private void faireTriFusion(Trieuse trieuse) {
		trieuse.tri();
	}

	private void faireTriInsertion(Trieuse trieuse) {
		trieuse.tri();
	}

}
