
public class FactoryModNormal  extends FactoryAbstractCaracter{

	@Override
	public CaracterJoc getCaracter(TipCaracter tip, String nume) {
		CaracterJoc caracter =null;
		
		switch(tip) {
		case DISNEY: 
			caracter = new CaracterDisney(nume);
			break;
		case MARVEL:
			caracter = new CaracterMarvel(nume,200);
			break;
		case DC:
			caracter = new CaracterDcComics(nume);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return caracter;
		
	}

}
