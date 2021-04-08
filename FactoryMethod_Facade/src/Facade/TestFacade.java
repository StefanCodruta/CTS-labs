package Facade;

public class TestFacade {

	public static void main(String[] args) {
	 //ca sa obtii profilul si datele pt app 
		//creare conexiune --pas 1
		ConexiuneServerJoc conexiune=new ConexiuneServerJoc();
		conexiune.conectare();
		
		//login player -- pas2
		Player player= new Player();
		player.logIn(conexiune);
		
		//obtinem profil --pas 3
		ProfilPlayer profil = player.getProfil();
		
		//obtine date
		String dateProfil =profil.getProfil();
		
		
		//prin Facade 
		String dateProfil2 = FacadeAPIJoc.getProfil("player1","1234");
	}

}
