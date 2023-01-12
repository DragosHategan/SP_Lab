package SPLab5;

public class ImageProxy implements Element, Picture {
	private String url;
	private int dim;
	private Image image;

	public ImageProxy(String url) {

		this.url = url;
	}

	public Image loadImage() {
		if (image == null) {
			image = new Image(url);
		}
		return image;
	}

	@Override
	public void print() {
		loadImage().print();
		// TODO Auto-generated method stub

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
