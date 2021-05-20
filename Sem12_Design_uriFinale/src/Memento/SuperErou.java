package Memento;


public class SuperErou {

	String nume;
	int puncteViata;
	String mesaje;
	
	public SuperErou(String nume, int puncteViata, String mesaje) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.mesaje = mesaje;
	}
	
	public void ataca() {
		System.out.println("este atacat");
	}
	public void esteLovit(int puncte) {
		this.puncteViata -=puncte;
	}
	public void seVindeca(int puncte) {
		this.puncteViata +=puncte;
	}
	
	public MementoErou salvare() {
		return new MementoErou(nume, puncteViata, mesaje);
	}
	public void incarcaSalvare(MementoErou memento) {
		this.nume=memento.nume;
		this.puncteViata = memento.puncteViata;
		this.mesaje = memento.mesaje;
	}
	
}
