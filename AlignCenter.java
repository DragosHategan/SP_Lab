package SPLab5;

public class AlignCenter implements AlignStrategy {
	public AlignCenter() {
	};

	public void render(Paragraph p) {
		System.out.print("##");
		System.out.print(p.getText());
		System.out.print("##");
		System.out.println();

	}

}
