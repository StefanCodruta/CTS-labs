package Observer;

public class TestObserver {

	public static void main(String[] args) {
		
		
		//definim observabil 
		ModulStareConexiuneServer conexiuneServer= new ModulStareConexiuneServer();
		
		ModulNotificari mNotificari=new ModulNotificari();
		ModulSarvareAutomata salAutomata= new ModulSarvareAutomata();
		
		conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
		conexiuneServer.register(salAutomata);
		//conexiuneServer.register(mNotificari);
		
		conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.INACTIVA);
		
		conexiuneServer.unregister(salAutomata);
		conexiuneServer.detectieSchimbareStareConexiune(StareConexiune.ACTIVA);
	
	}

}
