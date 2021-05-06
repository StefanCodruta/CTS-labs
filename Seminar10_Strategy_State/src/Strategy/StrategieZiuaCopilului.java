package Strategy;

public class StrategieZiuaCopilului implements StrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if( jucator.getClasaJucator()>5) {
			jucator.clasaJucator *= 2;
		}
		System.out.println("s a aplicat bonusul de ziua copilului !");
	}
}
