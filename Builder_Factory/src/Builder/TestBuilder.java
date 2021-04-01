package Builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//varianta rapida 
		//devine o capcana atunci cand costruim cu constr default
		//procesul de creare ar trebui sa se intample intr-un sing pas 
		//dar ..pas 1 Creare
		//privatizam const din clasa pt stergere pos de creare astfel 
		
		//SuperErou superErou = new SuperErou();
		
		//pas2 Initializare (mai ales la ob cu atribute multiple)
		//.. taiam aceasta posibilitate de initializare
		//superErou.nume="Superman";
		
		
		//var 2
		//l-am initializat gresit , dar nu iti poti da seama la o prima vedere
//		SuperErou superErou2 =
//				new SuperErou("supermen", 100, 
//						false,false,
//						new ArmaSupererou(), 
//						null, 
//						new Laser(),
//						null);
		
		//Cum construiesc un supererou?
		
		SuperErou superman = new SuperErou.SuperErouBuilder("superman",100).build();
		SuperErou joker = new SuperErou.SuperErouBuilder("joker", 200).setArmaDreapta(new ArmaSupererou())
				.esteNegativ()
				.esteRanit()
				.build();
		
		//sa-l facem negativ -> nu ai cum 
		//cine vrea sa creeze un ob trb sa l creeze cum trb de la inceput 
		
		
		
		
	}
	
}
