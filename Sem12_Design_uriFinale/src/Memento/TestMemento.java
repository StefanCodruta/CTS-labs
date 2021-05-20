package Memento;

public class TestMemento {

	public static void main(String[] args) {
		
		ManagerIstoric istoric=new ManagerIstoric();
		SuperErou superErou=new SuperErou("superman", 200, "sa dau un pumn vreau");
		

		istoric.adaugaSalvare(superErou.salvare());
		superErou.esteLovit(10);
		superErou.esteLovit(50);
		
		System.out.println("puncte viata"+superErou.puncteViata);
		
		superErou.incarcaSalvare(istoric.getUltimaSalvare());
		System.out.println("puncte viata" +superErou.puncteViata);
	}

}
