package SPLab5;

public class Paragraph implements Element {
	private String text;
	private AlignStrategy as = null;

	public Paragraph(String text) {
		this.text = text;
	}

	void setAlignStrategy(AlignStrategy a) {
		this.as = a;
	}

	@Override
	public String getText() {
		return this.text;
	}

	public void print() {
		if (as != null) {
			as.render(this);
		} else
			System.out.println(this.text);

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
