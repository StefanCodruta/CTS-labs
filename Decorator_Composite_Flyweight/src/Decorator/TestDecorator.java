package Decorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		SuperErou dragon = new Dragon("Dragonul albastru",1000);
		System.out.println(dragon);
		
		dragon.alearga();
		dragon.esteLovit(800);
		dragon.seVindeca(100);
		
		
		SuperErou dragon2 = new Dragon("Dragonul lila",1000);
		System.out.println(dragon2);
		dragon2.alearga();
		dragon2.esteLovit(200);
		dragon2.seVindeca(100);
		
		//aplicam decoratori pe primul dragon 
		
		dragon = new DecoratorArmura(dragon,300);
		dragon.esteLovit(400);
		
		dragon = new DecoratorEsteRanit(dragon);
		dragon.esteLovit(400);
		dragon.alearga();
	}
}
