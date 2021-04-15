package Decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract {

	public static final int NIVEL_CRITIC = 200;
	
	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void alearga() {
		if(this.erou.getPuncteViata() < NIVEL_CRITIC) {
			System.out.println("eroul nu mai poate alerga ");
		}
		else {
			this.erou.alearga();
		}
	}

	@Override
	public int getPuncteViata() {
		return this.erou.puncteViata;
	}
	
	

}
