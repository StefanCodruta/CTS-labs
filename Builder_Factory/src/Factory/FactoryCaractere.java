package Factory;


//conform diagramei uml trb sa am o metoda t creare caractere fara a lucra cu frameworkul direct
//Ascunde detalii (este o clasa scrisa de cei care genreaza freameworkuri 
//Dezvoltarea presupune includerea acestei facilitati 
//construire de ob fara sa vezi constructorii 
//..ne bazam pe aceasta interfata 

public class FactoryCaractere {

	
	public static CaracterAbstract getCaracter(TipCaracter tip,String nume) {
		//!! aceea valoare de distingere intre elemente ^ (elem cheie factory)
		CaracterAbstract caracter=null;
		
		switch(tip) {
		case DISNEY:
			caracter= new CaracterDisney("alb",nume,true);
			break;
		case MARVEL:
			caracter=new CaracterMarvel(nume,50);
			break;
		 default: 
			 throw new UnsupportedOperationException();	
			 //mai ok decat intoarcerea uni tip generic
			 
		}
		return caracter;
		
	}
}
