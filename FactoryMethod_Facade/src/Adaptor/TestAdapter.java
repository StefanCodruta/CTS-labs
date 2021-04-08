package Adaptor;

import java.util.ArrayList;

import Factory.CaracterDisney;
import Factory.CaracterJoc;
public class TestAdapter {

	
	public static void main(String[] args) {
		//solutie 1 -> colectie caractere existente
		
		ArrayList <CaracterJoc> caractere= new ArrayList<>();
		caractere.add(new CaracterDisney("donald"));
		
		//solutie 2 -> colectie caractere Ea
		ArrayList<InterfataCaracterEA> caractEa= new ArrayList<>();
		caractEa.add(new CaracterGenericEA());
		
		
		//folosind adapter 
		InterfataCaracterEA caracterea=new CaracterGenericEA();
		AdaptorEa2CaracterJoc adapt= new AdaptorEa2CaracterJoc(caracterea);
		
		caractere.add(adapt);
	}
}
