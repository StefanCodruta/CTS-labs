package ro.ase.csie.cts.seminar2.modele;

import ro.ase.csie.cts.seminar2.exceptii.ExceptieFonduriInsuficiente;

//pornim de la nivel generic 
//ne indreptam catre niveluri concrete prin derivare mostenire
//ce ar putea descrie orice cont 
//up-casting - elemente gestionate printr-o referinta de tipul parinte

public abstract class Cont {
	
	public abstract void alimenteaza(Double suma); //Object valoare -- daca nu stim sau pe double -- merge si pe criptomonede
	
	public abstract void extrage(Double suma) throws ExceptieFonduriInsuficiente;
	public abstract double getBalanta();
	public abstract void transfera(Double suma, Cont destinatieDetrasfer)throws ExceptieFonduriInsuficiente, ExceptieTransferIlegal;
	
}
