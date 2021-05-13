package Command;

public class TaskAsincron implements InterfataTaskAsincron{

	//clasa wrapper
	//am nev de stare si implem metoda
	
	InterfataModulJoc modul=null;
	
	private String detalii;
	private int ptioritati;
	
	
	public TaskAsincron(InterfataModulJoc modul, String detalii, int ptioritati) {
		super();
		this.modul = modul;
		this.detalii = detalii;
		this.ptioritati = ptioritati;
	}


	@Override
	public void startTaskAsicron() {
		
		this.modul.executaTask(detalii);
	}

	
}
