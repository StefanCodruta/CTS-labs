
public class TestFactory {

	public static void main(String[] args) {
		
		boolean isModJoc4Kids = true;
		
		if(isModJoc4Kids) {
			//dezvlotare doar cu caractere 4kids
			
		}
		else{ 
			//dezvoltare normala 
			
		}
		
		FactoryAbstractCaracter factoryCaracter = null;
		factoryCaracter = (isModJoc4Kids) ? new FactoryMod4Kids() : new FactoryModNormal();
		
		//dezvoltarea jocului la runtime nu mai tine cont de caracter
		//individual prn factory nu suntem dependenti de if
		CaracterJoc superman = factoryCaracter.getCaracter(TipCaracter.MARVEL, "spider");
		

	}

}
