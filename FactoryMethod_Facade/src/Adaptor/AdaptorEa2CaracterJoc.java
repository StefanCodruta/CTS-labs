package Adaptor;

public class AdaptorEa2CaracterJoc extends InterfataCaracterEA{

	InterfataCaracterEA caracterEa;

	public AdaptorEa2CaracterJoc(InterfataCaracterEA caracterEa) {
		super();
		this.caracterEa = caracterEa;
	}
	
	@Override
	public void seDeplaseaza() {
		caracterEa.move();
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}
}
