package Chain;

public abstract class ModulProcesareMesaj {

	ModulProcesareMesaj next = null;
	
	public abstract void procesareMesaj(MesajChat mesaj);
	
}
