package Facade;

public class FacadeAPIJoc {

	
	//interfata simplificata pt a obtine profilul unui jucator
	public static String getProfil(String username, String pass) {
		ConexiuneServerJoc conexiune=new ConexiuneServerJoc();
		conexiune.conectare();
		
		//login player -- pas2
		Player player= new Player();
		player.logIn(conexiune);
		
		//obtinem profil --pas 3
		ProfilPlayer profil = player.getProfil();
		
		//obtine date
		String dateProfil =profil.getProfil();
		
		return dateProfil;
	}
}
