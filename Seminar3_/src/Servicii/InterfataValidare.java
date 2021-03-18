package Servicii;

import Exceptii.PretInvalid;
import Exceptii.VechimeClient;

public interface InterfataValidare {

	public  void validare_pret(float pretInitial) throws PretInvalid ;

	public  void validare_client(int vechimeClientiInAni) throws VechimeClient; 

}
