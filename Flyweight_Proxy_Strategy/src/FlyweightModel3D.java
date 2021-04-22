import java.util.ArrayList;
import java.util.List;

public class FlyweightModel3D implements InterfataFlyweightModel3D{

	public String numeModel;
	List<Integer> puncteModel= new ArrayList<>();
	
	
	public FlyweightModel3D(String numeModel) {
		super();
		this.numeModel = numeModel;
		
	}

	public void afisareEcran(DateEcran date) {
		System.out.println(
				String.format("afisare %s la coordonatele %d %d %d cu %s",numeModel,date.x,date.y,date.z,date.textura));
	}
	

}
