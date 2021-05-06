package Strategy;

public class TestStrategie {

	public static void main(String[] args) {

		Jucator jucator = new Jucator(150, "gigel", 3);

		jucator.setStrategieMk(new StrategieJucatorNou());
		jucator.acordaPuncteBonus();
		
		jucator.setStrategieMk(new StrategieZiuaCopilului());
		jucator.acordaPuncteBonus();
		
		
	}

}
