package ro.ase.csie.cts.seminar2.modele;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;
import ro.ase.csie.cts.seminar2.exceptii.ExceptieTransferIlegal;
import ro.ase.csie.cts.seminar2.interfete.Profitabil;

public abstract class ContDepozit extends ContBancar implements Profitabil {

	public static final double BALANTA_MINIMA = 100;

	public ContDepozit(String Iban) {
		super(BALANTA_MINIMA,Iban);
		
	}

	@Override
	public void alimenteaza(double suma) {
		this.balanta += suma;
	}


	@Override
	public void extrage(double suma) throws ExceptieFonduriInsuficiente {
		if (this.balanta < suma) {
			throw new ExceptieFonduriInsuficiente("esti sarac");
		} else {
			this.balanta -= suma;
		}
	}

	@Override
	public void transfera(Cont destinatieDetrasfer,double suma) throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal {

		if (this == destinatieDetrasfer) {
			throw new ExceptieTransferIlegal();
		}
		this.extrage(suma);
		destinatieDetrasfer.alimenteaza(suma);
	}

	@Override
	public void adaugaDobanda(double RataDobanziiProcente) {
		this.balanta *= (1 + RataDobanziiProcente / 100);

	}

}
