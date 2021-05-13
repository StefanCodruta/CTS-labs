package Chain;

public class TestChain {

	public static void main(String[] args) {
			
		//definire module apoi inlantuire
		
		ModulProcesareMesaj modulFiltru= new ModulFiltruRomana();
		ModulProcesareMesaj modulPrivat =new ModulMesajePrivate();
		ModulProcesareMesaj modulGrup= new ModulMesajeGrup();
		
		modulFiltru.setNext(modulPrivat);
		modulPrivat.setNext(modulGrup);
		
		//alias capat
		ModulProcesareMesaj serverChat=modulFiltru;
		
		serverChat.procesareMesaj(new MesajChat("salut. ok ", 3, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("esti un om neprietenos", 0, "@gigel"));
		serverChat.procesareMesaj(new MesajChat("hay everyone ", 0, "@everyone"));
	}

}
