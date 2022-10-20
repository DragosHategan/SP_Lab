
import java.util.List;

public class Book {
	
	private String title;
	private List<String> paragraphs;
	private List<String> images;
	private List<String> tables;

	public Book(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println("The book is called: " + this.title);
	}

	public void createNewTable(String table) {
		tables.add(table);
	}

	public void createNewParagraph(String paragraph) {
		paragraphs.add(paragraph);
	}

	public void createNewImage(String image) {
		images.add(image);
	}

}
