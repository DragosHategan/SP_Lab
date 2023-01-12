package SPLab5;

public class Table implements Element {
	private String name;

	public Table(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Tabel: " + this.name);

	}

	@Override
	public void add(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Element e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Element get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

}
