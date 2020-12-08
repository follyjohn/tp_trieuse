package methodeun;

public class TriBulle extends Trieuse {

	@Override
	protected void tri() {
		System.out.println("tri par bulle");

	}

	public TriBulle() {
		super.typeTri = TypeTri.TRIBULLE;
	}

}
