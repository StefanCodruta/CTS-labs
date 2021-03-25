package Seminar5VersiuneStatica;

import Seminar5.ConexiuneBD;

public class TestSingletonStatic {

	public static void main(String[] args) {
		
		
		ConexiuneBD conexiune1 = ConexiuneBD.conexiune;
		ConexiuneBD conexiune2 = ConexiuneBD.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("conexiunile sunt identice");
		}
		else {
			System.out.println("conexiuni diferite");
		}

	}

}
