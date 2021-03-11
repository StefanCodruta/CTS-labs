package CodFaza1;

public class Produs{
	//statice pt a nu fi schimbate la runtime 
	public static final int VECHIME_CLIENT_MAXIMA = 10;
	public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
	
	
	public float CalculeazaPretFinal(TipProdus tipprodus, float pretInitial, int vechimeClientiInAni)
	{
	    float pretFinal = 0;
	    
	    float Discount_fidelitate = (vechimeClientiInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientiInAni/100; 
	    
	    if (tipprodus == TipProdus.NOU)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipprodus == TipProdus.CU_DISCOUNT)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipprodus == TipProdus.STOC_LIMITAT)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipprodus == TipProdus.VECHI )
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}