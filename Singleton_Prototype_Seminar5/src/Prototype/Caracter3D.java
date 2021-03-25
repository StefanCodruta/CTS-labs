package Prototype;

import java.util.ArrayList;
import java.util.Random;

public class Caracter3D implements Cloneable {

	String fisierModel3d;
	String culoare;
	int inaltime;

	public Caracter3D(String fisierModel3d) {

		System.out.println("se incarca modelul 3d din" + fisierModel3d);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.fisierModel3d = fisierModel3d;

		Random random = new Random();

		punctegrafic = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			punctegrafic.add(random.nextInt(10000));

		}

	}

	private static ArrayList<Integer> punctegrafic = null;

	public Caracter3D(String culoare, int inaltime) {
		super();
		this.culoare = culoare;
		this.inaltime = inaltime;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();
		sb.append("puncte carcater 3d");
		for (int punct : this.punctegrafic) {
			sb.append(punct + " ");
		}
		return sb.toString();
	}

	// doar aloca memorie pentru clone
	private Caracter3D() {

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Caracter3D copie= new Caracter3D();
		copie.culoare=this.culoare;
		copie.fisierModel3d=this.fisierModel3d;
		copie.inaltime=this.inaltime;
		copie.punctegrafic = (ArrayList<Integer>) this.punctegrafic.clone();
		
		//clone ul nu este prototype nici in aceasta situatie
		//-- NU ACELASI CONSTRUCTOR -- 
//		Caracter3D copie = new Caracter3D(this.fisierModel3d);
		return copie;
	
	
	}

}
