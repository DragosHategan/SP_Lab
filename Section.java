package SPLab5;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element {
	private String title;
	private List<Element> elemente = new ArrayList<Element>();

	public Section(String title, List<Element> elemente) {
		this.title = title;
		this.elemente = elemente;
	}

	public Section() {
	};

	public Section(String title) {
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(this.title);
		for (Element e : elemente) {
			e.print();
		}

	}

	@Override
	public void add(Element e) {
		this.elemente.add(e);

	}

	@Override
	public void remove(Element e) {
		this.elemente.remove(e);

	}

	@Override
	public Element get(int index) {
		if (index <= this.elemente.size()) {
			return this.elemente.get(index);
		} else
			return null;
	}

}
