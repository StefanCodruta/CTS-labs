package Composite;

public class TestComposite {

	public static void main (String [] args) {
		
		UnitateAbstractaJoc grup1 = new GrupCaractere();
		UnitateAbstractaJoc grup2 = new GrupCaractere();
		
		grup1.adaugaCaracter(new CaracterNPC("Soldat ",100));
		grup1.adaugaCaracter(new CaracterNPC("Soldat ",100));

		grup2.adaugaCaracter(new CaracterNPC("Soldat ",100));
		grup2.adaugaCaracter(new CaracterNPC("tanc ",100));
		
		
		UnitateAbstractaJoc grupNivel1 = new GrupCaractere();
		grupNivel1.adaugaCaracter(new CaracterNPC("level boss", 500));
		grupNivel1.adaugaCaracter(grup1);
		grupNivel1.adaugaCaracter(grup2);
		
		grupNivel1.atacaJucator(200);
		grupNivel1.seRetrage();
	}
}
