package Strategy;

public class StrategieJucatorNou implements StrategieMarketing{

	@Override
	public void aplicaStrategieBonus(Jucator jucator) {
		if(jucator.getTotalOreJucate()>100) {
			jucator.clasaJucator +=1;
		}
		
	}

}
