package PrototypeTest;

public class TestModel3D {

	public static void main(String[] args) throws CloneNotSupportedException {
		Model3D ateroid1 = new Model3D("asteroid");

		Model3D ateroid2 = (Model3D) ateroid1.clone();
		Model3D ateroid3 = (Model3D) ateroid1.clone();
		Model3D ateroid4 = (Model3D) ateroid1.clone();

		System.out.println("scenariu de joc terminat");
	}
}
