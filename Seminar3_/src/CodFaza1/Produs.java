package CodFaza1;

public class Produs{
	
	public float CalculeazaPretFinal(int tipprodus, float pretInitial, int vechimeClientiInAni)
	{
	    float pretFinal = 0;
	    
	    float Discount_fidelitate = (vechimeClientiInAni > 10) ? (float)15/100 : (float)vechimeClientiInAni/100; 
	    
	    if (tipprodus == 1)
	    {
	      pretFinal = pretInitial;
	    }
	    else if (tipprodus == 2)
	    {
	      pretFinal = (pretInitial - (0.1f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.1f * pretInitial));
	    }
	    else if (tipprodus == 3)
	    {
	      pretFinal = (pretInitial - (0.25f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.25f * pretInitial));
	    }
	    else if (tipprodus == 4)
	    {
	      pretFinal = (pretInitial - (0.35f * pretInitial)) - Discount_fidelitate * (pretInitial - (0.35f * pretInitial));
	    }
	    return pretFinal;
	  }
}