package Chain;

public class ModulMesajeGrup extends ModulProcesareMesaj {

	@Override
	public void procesareMesaj(MesajChat mesaj) {

		if (mesaj.destinatie.toLowerCase().equals("@everyone")) {
			System.out.println("mesaj pt grup " + mesaj.text);
		}

		// indiferent daca a fost procesat sau nu se trimite mai departe
		if (this.next != null) {
			this.next.procesareMesaj(mesaj);
		}
	}

}
