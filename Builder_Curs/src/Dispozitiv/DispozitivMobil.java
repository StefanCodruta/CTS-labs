package Dispozitiv;

public class DispozitivMobil {

	String model;
	String producator;
	
	boolean areWifi;
	
	InterfataGPS modulGPS;
	InterfataDisplay display;
	InterfataExternalMemory cardMemorie;
	InterfataSim sim;
	
	public DispozitivMobil() {
		
	}
	public DispozitivMobil(
			String model, 
			String producator, 
			boolean WiFiIntegrat,
			InterfataSim sim,
			InterfataGPS modulGPS,
			InterfataDisplay display,
			InterfataExternalMemory cardMemorie){
	this.model = model;
	this.producator = producator;
	this.areWifi = WiFiIntegrat;
	this.sim = sim;
	this.modulGPS = modulGPS;
	this.display = display;
	this.cardMemorie = cardMemorie;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getProducator() {
		return producator;
	}

	public void setProducator(String producator) {
		this.producator = producator;
	}

	public boolean isAreWifi() {
		return areWifi;
	}

	public void setAreWifi(boolean areWifi) {
		this.areWifi = areWifi;
	}

	public InterfataGPS getModulGPS() {
		return modulGPS;
	}

	public void setModulGPS(InterfataGPS modulGPS) {
		this.modulGPS = modulGPS;
	}

	public InterfataDisplay getDisplay() {
		return display;
	}

	public void setDisplay(InterfataDisplay display) {
		this.display = display;
	}

	public InterfataExternalMemory getCaredMemorie() {
		return cardMemorie;
	}

	public void setCaredMemorie(InterfataExternalMemory cardMemorie) {
		this.cardMemorie = cardMemorie;
	}
	
	
	public static class DispozitivMobilBuilder{
		
		private DispozitivMobil dispozitiv;
		
		public DispozitivMobilBuilder(String model,String producator) {
			this.dispozitiv = new DispozitivMobil();
			this.dispozitiv.model =model;
			this.dispozitiv.producator =producator;
			
		}
		public DispozitivMobilBuilder adaugaWifi() {
			this.dispozitiv.areWifi = true;
			return this;
		}
		public DispozitivMobilBuilder adaugaDisplay(InterfataDisplay display) {
			this.dispozitiv.display = display;
		return this;
		}
		public DispozitivMobilBuilder adaugaCardMemorie(InterfataExternalMemory memorie) {
			this.dispozitiv.cardMemorie = memorie;
			return this;
		}
		public DispozitivMobilBuilder adaugaModulGPS(InterfataGPS gps){
			this.dispozitiv.modulGPS = gps;
			return this;
		}
		public DispozitivMobil build(){
			return this.dispozitiv;
		}
	}
}
