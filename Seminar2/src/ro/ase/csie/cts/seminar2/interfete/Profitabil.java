package ro.ase.csie.cts.seminar2.interfete;

//interfata contine metode abstracte 
//poate contine atribute statice
//NU POATE CONTINTE NIMIC ALTCEVA
public interface Profitabil {
	//final pt metode -- nu poate fi suprascrisa
	//final pt o clasa -- nu paote fi derivata
	
	public static final int MAX_PROCENT_DOBANDA = 5;
	
		public abstract void adaugaDobanda(double RataDobanziiProcente);
	}

