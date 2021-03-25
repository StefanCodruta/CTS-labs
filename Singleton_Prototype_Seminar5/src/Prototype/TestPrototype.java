package Prototype;

public class TestPrototype {

	public static void main(String [] args) throws CloneNotSupportedException {
	
	Caracter3D car1 = new Caracter3D(" model1.3d");
	//Caracter3D car2 = new Caracter3D(" model1.3d");
	//Caracter3D car3 = new Caracter3D(" model1.3d");
	
	Caracter3D car2 = (Caracter3D) car1.clone();
	Caracter3D car3 = (Caracter3D) car1.clone();
	
	System.out.println("sfarsit");
	//System.out.println(car3);
	//System.out.println(car2);

}
}