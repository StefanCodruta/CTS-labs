package Servicii;

public class StrategieMarketing2021 implements InterfataMarketing{

	@Override
	public float getDiscountFidelitate(int vechimeClientiInAni) {
		return (vechimeClientiInAni > VECHIME_CLIENT_MAXIMA) ? DISCOUNT_CLIENT_MAXIM : (float)vechimeClientiInAni/100;
	}
	
	
}
