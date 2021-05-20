package Testare;

import Exceptii.ExceptieImpartireLaZero;

public class OperatiiMatematice {

	
	public static int adunare(int a, int b) {
		return a+b;
	}
	public static double impartire(int a, int b) throws ExceptieImpartireLaZero {
		
		if(b==0) {
			throw new ExceptieImpartireLaZero();
		}
		
		return a/b;
		
	}
}
