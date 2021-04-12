package PrototypeTest;
import java.util.ArrayList;

public class Model3D implements Cloneable {

	protected String id;
	protected ArrayList<Object> poligoane = new ArrayList<>();
	protected String tip;

	public Model3D(String tip) {
		try {
			System.out.println("working ...");
			Thread.currentThread().sleep(2000);

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		this.tip = tip;

	}

	private Model3D() {
	}

	private String getType() {
		return tip;
	}

	private String getId() {
		return id;
	}

	private void setId(String id) {
		this.id = id;
	}

	public ArrayList<Object> getVertices() {
		return this.poligoane;
	}

	@Override
	public String toString() {
		return "Model3D cu id-ul " + id + ", are  poligoane" + poligoane + ", iar tipul este " + tip;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		Model3D copie = new Model3D();
		copie.id = id;
		copie.poligoane = (ArrayList<Object>) this.poligoane.clone();
		copie.tip = this.tip;

		return copie;

	}

}
