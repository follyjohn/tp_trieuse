package methodeun;

public class TriInsertion extends Trieuse {

	@Override
	protected void tri() {
		System.out.println("tri insertion");

	}

	public TriInsertion() {
		super.typeTri = TypeTri.TRIINSERTION;
	}

}