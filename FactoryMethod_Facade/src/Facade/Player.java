package Facade;

public class Player {

	public void logIn(ConexiuneServerJoc conexiune)
	{
		System.out.println("login player");
	}
	
	public ProfilPlayer getProfil() {
		return new ProfilPlayer();
	}

}
