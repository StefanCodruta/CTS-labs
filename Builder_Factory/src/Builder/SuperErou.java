package Builder;

public class SuperErou {

	private String nume;
	private int puncteViata;

	private boolean esteErouNegativ;
	private boolean esteRanit;

	private InterfataArma armaStanga;
	private InterfataArma armaDreapta;
	private InterfataSuperputere superPutere;
	private InterfataSuperputere superSuperPutere;

	// posibilitati pt alti programatori

	private  SuperErou() {

	}

	private SuperErou(String nume, 
			int puncteViata, 
			boolean esteErouNegativ, 
			boolean esteRanit, 
			InterfataArma armaStanga,
			InterfataArma armaDreapta, 
			InterfataSuperputere superPutere, 
			InterfataSuperputere superSuperPutere) {
		
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
		this.esteErouNegativ = esteErouNegativ;
		this.esteRanit = esteRanit;
		this.armaStanga = armaStanga;
		this.armaDreapta = armaDreapta;
		this.superPutere = superPutere;
		this.superSuperPutere = superSuperPutere;
	}
	
	public static class SuperErouBuilder {
		//nu exista obligatia unei ref catre supererou 
		SuperErou superErou=null;
		// daca nu exista aceasta ref ..nu poti salva valorile din get set ..
		//var din gof e de duplicare 
		
		
		public SuperErouBuilder(String nume, int puncteViata) {
			superErou=new SuperErou();
			superErou.nume = nume;
			superErou.puncteViata = puncteViata;
			
		}
		
		public SuperErouBuilder esteNegativ() {
			this.superErou.esteErouNegativ = true;
			return this; 
		}
		
		public SuperErouBuilder esteRanit() {
			this.superErou.esteRanit = true;
			return this; 
			
		}
		public SuperErouBuilder setArmaStanga(InterfataArma arma) {
			this.superErou.armaStanga= arma;
			return this;
		}
		
		public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
			this.superErou.armaDreapta= arma;
			return this;
		}
		
		public SuperErouBuilder setSuperPutere(InterfataSuperputere  superPutere) {
			this.superErou.superPutere = superPutere;
			
			return this;
		}
		
		public SuperErouBuilder setSuperSuperPutere(InterfataSuperputere  superSuperPutere) {
			this.superErou.superSuperPutere = superSuperPutere;
			
			return this;
		}
		
		public SuperErou build() {
			return superErou;
			
			//lazy
			//return new SuperErou(....)
		}
	}
	

}
