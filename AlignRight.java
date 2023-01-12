package SPLab5;

public class AlignRight implements AlignStrategy {
	public AlignRight() {
	};

	public void render(Paragraph p) {
		System.out.print("##");
		System.out.print(p.getText());
		System.out.println();
	}

}
