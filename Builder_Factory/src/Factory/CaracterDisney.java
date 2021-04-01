package Factory;

public class CaracterDisney extends CaracterAbstract  {

	String culoare;
	boolean okpentruCopiiMici;
	@Override
	public void alearga() {
		System.out.println("alearga ...");
		
	}

	@Override
	public void sare() {
		System.out.println("sare");
		
		
	}

	public CaracterDisney(String culoare, String nume, boolean ok) {
		super();
		this.culoare = culoare;
		this.nume=nume;
		
	}

	
}
