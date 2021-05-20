package Observer;

public class ModulSarvareAutomata implements InterfataStatusConexiuneServer{

	@Override
	public void conexiuneIntrerupta() {
		System.out.println("salvare automata date joc");
		
	}

	@Override
	public void conexiuneActiva() {
	 System.out.println("afisare istoric salvari");
		
	}

}
