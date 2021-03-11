package Faza2;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;

public class Produs{
	//statice pt a nu fi schimbate la runtime 
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	public static void validare_pret(float pretInitial) throws PretInvalid {
		if(pretInitial <=0 ) {
			throw new PretInvalid();
		}
	}
	public static void validare_client(int vechimeClientiInAni) throws VechimeClient {
		if(vechimeClientiInAni <0) {
			throw new VechimeClient();
		}
	}
	public static float getDiscountFidelitate(int vechimeClientiInAni) {
		return (vechimeClientiInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientiInAni/100; 

	}
	public static float getPretCuDiscount(float pretInitial, float discount) {
		return pretInitial - (discount* pretInitial);
	}
	
	public float CalculeazaPretFinal(TipProdus tipprodus, float pretInitial, int vechimeClientiInAni) throws PretInvalid, VechimeClient
	{
		validare_pret(pretInitial);
		validare_client(vechimeClientiInAni);
		
	    float pretFinal = 0;
	    float Discount_fidelitate = getDiscountFidelitate(vechimeClientiInAni);
	    float discount=TipProdus.NOU.getDiscount();
	    float valoarediscountTipProdus=0;
	    
	    switch (tipprodus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    case CU_DISCOUNT:
	    	 discount=TipProdus.CU_DISCOUNT.getDiscount();
	    	 valoarediscountTipProdus= getPretCuDiscount(pretInitial,discount);
		      pretFinal =  valoarediscountTipProdus * (1-Discount_fidelitate);
	    	break;
	    case STOC_LIMITAT:
	    	 discount=TipProdus.STOC_LIMITAT.getDiscount();
	    	 valoarediscountTipProdus= getPretCuDiscount(pretInitial,discount);
		      pretFinal = valoarediscountTipProdus * (1-Discount_fidelitate)
	    	break;
	    case VECHI:
	    	 discount=TipProdus.VECHI.getDiscount();
	    	 valoarediscountTipProdus= getPretCuDiscount(pretInitial,discount);
		      pretFinal =  valoarediscountTipProdus * (1-Discount_fidelitate)
		      break;
		 default:
			 throw new UnsupportedOperationException("un simbol al enumerarii nu a fost procesat");
	    }
	    return pretFinal;
      }
   }
	   
	