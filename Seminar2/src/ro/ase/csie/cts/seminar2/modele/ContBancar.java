package ro.ase.csie.cts.seminar2.modele;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;

public abstract class ContBancar extends Cont {

	protected double balanta;
	protected final String Iban;

	// source -> implement methods (as in intell with generate)
	@Override
	public double getBalanta() {
		return this.balanta;
	}



	public ContBancar(double balanta, String Iban) {
		this.balanta=balanta;
		this.Iban=Iban;	}

	
		
	}

	
}
