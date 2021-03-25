package Seminar5VersiuneStatica;

import Seminar5VersiuneStatica.ConexiuneBD_VersiuneStatica;

public class TestSingletonStatic {

	public static void main(String[] args) {
		
		
		ConexiuneBD_VersiuneStatica conexiune1 =  ConexiuneBD_VersiuneStatica.conexiune;
		ConexiuneBD_VersiuneStatica conexiune2 =  ConexiuneBD_VersiuneStatica.conexiune;
		
		if(conexiune1 == conexiune2) {
			System.out.println("conexiunile sunt identice");
		}
		else {
			System.out.println("conexiuni diferite");
		}

	}

}
