package SPLab5;

public class AlignLeft implements AlignStrategy {
	public AlignLeft() {
	};

	public void render(Paragraph p) {
		System.out.print(p.getText());
		System.out.print("##");
		System.out.println();
	}

}
