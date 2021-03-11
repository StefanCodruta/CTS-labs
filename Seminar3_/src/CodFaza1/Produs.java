package CodFaza1;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;

public class Produs{
	//statice pt a nu fi schimbate la runtime 
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	
	public float CalculeazaPretFinal(TipProdus tipprodus, float pretInitial, int vechimeClientiInAni) throws PretInvalid, VechimeClient
	{
		if(pretInitial <=0 ) {
			throw new PretInvalid();
		}
		if(vechimeClientiInAni <0) {
			throw new VechimeClient();
		}
		
	    float pretFinal = 0;
	    float Discount_fidelitate = (vechimeClientiInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientiInAni/100; 
	   float discount=TipProdus.NOU.getDiscount();
	    
	    switch (tipprodus) {
	    case NOU:
	    	pretFinal = pretInitial;
	    	break;
	    case CU_DISCOUNT:
	    	 discount=TipProdus.CU_DISCOUNT.getDiscount();
		      pretFinal = (pretInitial - (discount* pretInitial)) - Discount_fidelitate * (pretInitial - (discount * pretInitial));
	    	break;
	    case STOC_LIMITAT:
	    	 discount=TipProdus.STOC_LIMITAT.getDiscount();
		      pretFinal = (pretInitial - (discount * pretInitial)) - Discount_fidelitate * (pretInitial - (discount * pretInitial));
	    	break;
	    case VECHI:
	    	 discount=TipProdus.VECHI.getDiscount();
		      pretFinal = (pretInitial - (discount * pretInitial)) - Discount_fidelitate * (pretInitial - (discount * pretInitial));
		      break;
		 default:
			 throw new UnsupportedOperationException("un simbol al enumerarii nu a fost procesat");
	    }
	    return pretFinal;
      }
   }
	   
	