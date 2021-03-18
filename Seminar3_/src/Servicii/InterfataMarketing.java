package Servicii;

public interface InterfataMarketing {

	//statice pt a nu fi schimbate la runtime 
		public static final int VECHIME_CLIENT_MAXIMA = 10;
		public static final float DISCOUNT_CLIENT_MAXIM = 0.15f;
		
		public  float getDiscountFidelitate(int vechimeClientiInAni) ;
//		{
//			return (vechimeClientiInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientiInAni/100; 
//
//		}
}
