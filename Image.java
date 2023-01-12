package SPLab5;

import java.util.concurrent.TimeUnit;

public class Image implements Element {
	private String url;

	public Image(String name) {
		this.url =name;
		try {
		TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		}


	@Override
	public void print() {
		System.out.println("Image with name: " + this.url);

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
