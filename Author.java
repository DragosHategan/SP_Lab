package SPLab5;

public class Author {
	private String name;
	private String surname;

	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public Author(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Author: " + name;
	}

}
