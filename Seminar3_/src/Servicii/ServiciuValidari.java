package Servicii;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;

public class ServiciuValidari implements InterfataValidare{

	
	//evitare boolean -> genereaza uitari de verificare -> face puf
	
	@Override
	public void validare_pret(float pretInitial) throws PretInvalid {
		{
			if (pretInitial <= 0) {
				throw new PretInvalid();
			}
		}
	}

	@Override
	public void validare_client(int vechimeClientiInAni) throws VechimeClient {
		{
			if (vechimeClientiInAni < 0) {
				throw new VechimeClient();
			}
		}
		
	}

}
