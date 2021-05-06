package Strategy;

public class StrategieZiuaCopilului implements StrategieMarketing {

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if( jucator.getClasaJucator()>5) {
			jucator.clasaJucator *= 2;
		}
	}
}
