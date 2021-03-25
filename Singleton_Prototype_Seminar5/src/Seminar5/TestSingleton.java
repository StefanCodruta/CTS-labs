package Seminar5;

public class TestSingleton {

	public static void main(String[] args) {
		ConexiuneBD conex1 = ConexiuneBD.getConexiune();
		ConexiuneBD conex2 = ConexiuneBD.getConexiune();

		if (conex1 == conex2) {
			System.out.println("referinte identice");
		} else {
			System.out.println("referinte diferite");
		}

		// utilitate Singleton here
		ModuleUI modulUi = new ModuleUI();
		ModulProfil modulProfil = new ModulProfil();

	}
}
