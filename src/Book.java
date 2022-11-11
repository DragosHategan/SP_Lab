
import java.util.ArrayList;
import java.util.List;

public class Book {
	
	private String title;
	private List<String> paragraphs = new ArrayList<String>();
	private List<String> images = new ArrayList<String>();
	private List<String> tables = new ArrayList<String>();
	private List<Author> authors = new ArrayList<Author>();
	private List<Chapter> chapters = new ArrayList<Chapter>();

	public Book(String title) {
		this.title = title;
	}

	public void addAuthor(Author author){
		this.authors.add(author);
	}

	public void createChapter(Chapter chapter){
		this.chapters.add(chapter);
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
