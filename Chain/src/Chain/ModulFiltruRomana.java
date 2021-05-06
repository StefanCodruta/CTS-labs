package Chain;

public class ModulFiltruRomana extends ModulProcesareMesaj{

	public static final String[] dictionar = new String[] {"rau","violent","neprietenos"};
	
	@Override
	public void procesareMesaj(MesajChat mesaj) {
	
		boolean esteValid = true;
		for(String cuvant: dictionar) {
			if(mesaj.text.toLowerCase().contains(cuvant)) {
				esteValid=true;
				break;
			}
		}
		if(esteValid && this.next !=null)
			this.next.procesareMesaj(mesaj);
		
	}

}