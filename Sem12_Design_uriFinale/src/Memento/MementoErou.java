package Memento;

import java.util.Date;

public class MementoErou {

	String nume;
	int puncteViata;
	String mesaje;
	
	Date dateSalvare;

	public MementoErou(String nume, int puncteViata, String mesaje) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.mesaje = mesaje;
		this.dateSalvare = new Date();
	}

	
	
}
