package Seminar5VersiuneStatica;

import Seminar5.ConexiuneBD;

public class ConexiuneBD_VersiuneStatica {
	String ip;
	String denumire;

	public static final ConexiuneBD_VersiuneStatica conexiune;

	private ConexiuneBD_VersiuneStatica(String ip, String denumire) {
		
		super();
		this.ip = ip;
		this.denumire = denumire;
	}

	static {
		
		//preluare date conexiune din alte surse 
		String ip= "127.0.0.1";
		String denumire="bdtest";
		//public il poate apela oricine -- nu intra la Singleton
		conexiune = new ConexiuneBD_VersiuneStatica(ip, denumire);
		
	}
}
