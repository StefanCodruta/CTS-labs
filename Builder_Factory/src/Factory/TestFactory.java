package Factory;

import java.util.ArrayList;

public class TestFactory {

	public static void main(String[] args) {
	
		
//		CaracterAbstract mickeyMouse=new CaracterDisney("rosu", "Mickey ");
//		CaracterAbstract spiderman=new CaracterMarvel("spiderman",3);
		
		CaracterAbstract mickeyMouse= FactoryCaractere.getCaracter(TipCaracter.DISNEY, "MICKEEEEY");
		
		ArrayList<CaracterAbstract> caractere= new ArrayList<>();
		
		
		
		//problema este ca suntem legati de caracter si incalcam solid
		//gestionare ref-> prin tip caracteristic not good
		//	CaracterMarvel spiderman=new CaracterMarvel("spiderman",3);

		

	}

}
