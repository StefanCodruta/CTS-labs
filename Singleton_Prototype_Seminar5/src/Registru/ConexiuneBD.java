package Registru;

import java.util.Hashtable;


//mai multe obiecte singleton 

public class ConexiuneBD {

	String ip;
	String denumire;
	
	private static Hashtable <String, ConexiuneBD> conexiuni = new Hashtable<>();

	private ConexiuneBD(String ip, String denumire) {
		super();
		this.ip = ip;
		this.denumire = denumire;
		
	}
	
	
	public static ConexiuneBD getConexiune(String ip, String denumire) {
		ConexiuneBD conexiune = conexiuni.get(ip);
		if(conexiune == null) {
			conexiune = new ConexiuneBD(ip,denumire);
			conexiuni.put(ip, conexiune);
			
		}
		return conexiune;
	}
	
	
	
}
