package SPLab5;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {

	private String titlu;
	private List<Element> el = new ArrayList<>();
	private List<Author> autori = new ArrayList<>();

	public Book(String titlu) {
		this.titlu = titlu;
	}

	public void addAuthor(Author a) {
		this.autori.add(a);
	}

	public void addContent(Element e) {
		this.el.add(e);
	}

	public void print() {
		System.out.println("Book: " + this.titlu);
		System.out.println();
		System.out.println("Authors: ");
		for (Author a : autori) {
			System.out.println(a);
		}
		System.out.println();
		for (Element e : this.el) {
			e.print();
		}
	}

}
