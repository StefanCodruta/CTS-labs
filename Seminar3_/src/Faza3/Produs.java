package Faza3;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;
import Servicii.InterfataMarketing;
import Servicii.InterfataValidare;
import Servicii.ServiciuValidari;
import Servicii.StrategieMarketing2021;


 //cate motive (externe) are clasa sa se modifice in viitor ? 


public class Produs{
	
	InterfataMarketing serviciuMK= null; 
	
	
	InterfataValidare serviciuValidare=null;
	
	public Produs(InterfataMarketing mk, InterfataValidare vd) {
		
		if(mk ==null) {
			throw new NullPointerException();
		}
		if( vd == null ) {
			throw new NullPointerException();
		}
		
		this.serviciuMK =mk;
		this.serviciuValidare = vd;
	}
	
	public Produs() {
		for(Object serviciu : TestProdus.servicii) {
			if(serviciu instanceof InterfataMarketing) {
				this.serviciuMK = (InterfataMarketing) serviciu;
			}
		}
		if( this.serviciuMK == null) {
			throw new NullPointerException();
		}
	}
	
	public void setStrategieMarketing(InterfataMarketing strategie) {
		
		if(strategie ==null) {
			throw new NullPointerException();
		}
		
	}
	
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount* pretInitial);
	}
	
	public float CalculeazaPretFinal(TipProdus tipprodus, float pretInitial, int vechimeClientiInAni) throws PretInvalid, VechimeClient
	{
		serviciuValidare.validare_pret(pretInitial);
		serviciuValidare.validare_client(vechimeClientiInAni);
		
		float Discount_fidelitate = (tipprodus == TipProdus.NOU) ? 0 : serviciuMK.getDiscountFidelitate(vechimeClientiInAni);

		float discount = tipprodus.getDiscount();
		float valoarediscountTipProdus = getPretCuDiscount(pretInitial, discount);
		float pretFinal = valoarediscountTipProdus * (1 - Discount_fidelitate);

		return pretFinal;
	}
}
	    

	    
	  
	