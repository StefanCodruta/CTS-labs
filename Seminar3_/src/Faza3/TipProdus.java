package Faza3;

//enumerarile sunt clase 
//referinte catre obiecte
public enum TipProdus {

	NOU(0),CU_DISCOUNT(0.1f),STOC_LIMITAT(0.25f),VECHI(0.35f);
	
	private final  float discount;
	
	//nu putem public -> pt a nu adauga simblouri 
	private TipProdus(float discount) {
		this.discount=discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
	
}
