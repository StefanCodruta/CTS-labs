
public class FactoryMod4Kids extends FactoryAbstractCaracter{
	
	@Override
	public CaracterJoc getCaracter(TipCaracter tip, String nume) {
		CaracterJoc caracter =null;
		
		switch(tip) {
		case DISNEY: 
			caracter =  new CaracterDisney4Kids();
			break;
		case MARVEL:
			caracter =  new CaracterMarvel4Kids();
			break;
		case DC:
			caracter =  new CaracterDc4Kids();
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return caracter;
		
	}


}
