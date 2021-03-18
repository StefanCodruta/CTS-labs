package Faza3;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;
import Servicii.InterfataMarketing;
import Servicii.InterfataValidare;


 //cate motive (externe) are clasa sa se modifice in viitor ? 


public class Produs{
	
	InterfataMarketing serviciuMK=null; 
	
	InterfataValidare serviciuValidare=null;
	
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
	    

	    
	  
	