package Observer;

public class ModulNotificari implements InterfataStatusConexiuneServer {

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("popUp: conexiune pierduta");
		
	}

	@Override
	public void conexiuneActiva() {
		System.out.println("popUp: conexiune activa");
		
	}

}
