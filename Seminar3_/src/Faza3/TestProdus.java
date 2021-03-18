package Faza3;

import java.util.ArrayList;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;
import Servicii.InterfataMarketing;
import Servicii.InterfataValidare;
import Servicii.ServiciuValidari;
import Servicii.StrategieMarketing2021;

public class TestProdus {

	public static ArrayList<Object> servicii= new ArrayList<>();
	
	public void startUp() {
		InterfataMarketing serviciuMK= new StrategieMarketing2021();
		InterfataValidare serviciuVd= new ServiciuValidari();
		servicii.add(serviciuMK);
		servicii.add(serviciuVd);
		
	}
	public static void main(String[] args) {
		Produs produs=new Produs(new StrategieMarketing2021(), new ServiciuValidari());
		
		try {
		float pretFinal=produs.CalculeazaPretFinal(TipProdus.CU_DISCOUNT,100,12);
		
		System.out.println("pretul final este "+ pretFinal);
		
		
		produs.setStrategieMarketing( new InterfataMarketing () {
			@Override
			public float getDiscountFidelitate(int vechimeClientiInAni) {
				return 0.3f;
			}
		});
		}
		catch (PretInvalid e){
			e.printStackTrace();
		}
		catch(VechimeClient e) {
			e.printStackTrace();
		}
	}

}
