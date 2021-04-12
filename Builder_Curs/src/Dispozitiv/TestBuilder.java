package Dispozitiv;

public class TestBuilder {

	public static void main(String[]args) {
		DispozitivMobil smart=new DispozitivMobil(
				"1",
				"2",
				true,
				new Sim(),
				new GPSIntegrat(),
				new DisplaySuperAmoled(5.0),
				new SDCard(65));
		
		DispozitivMobil smart2 = new DispozitivMobil();
		smart2.isAreWifi();
		smart2.setProducator("nokiuta");
		smart2.setModel("2850");
		
	}
}
