package Seminar5;

public class ConexiuneBD {
	String ip;
	String denumire;

	//lazy
	private static ConexiuneBD conexiune = null;
	
	//eager
	//private static ConexiuneBD conexiune = new ConexiuneBD("10.0.0.1","cts");

	private ConexiuneBD() {

	}

	public ConexiuneBD(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;

		System.out.println("apel constructorasi");
	}

	
	//versiune lazy 
	public static synchronized ConexiuneBD getConexiune() {
		if (conexiune == null) {
			// datele se pot prelua din fisiere de configurare
			conexiune = new ConexiuneBD("10.0.0.1", "cts");

		}
		return conexiune;
	}

}
