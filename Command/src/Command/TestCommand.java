package Command;

public class TestCommand {

	public static void main(String[] args) {

		
	//manage taskuri
		MnagerTaskuri manager=new MnagerTaskuri();
		
		manager.adaugaTask(new TaskAsincron(new ModulUpdate(),"versiune 10.1",5));
		manager.adaugaTask(new TaskAsincron(new ModulBackup(),"salvare automata nivel",1));
		
		System.out.println("jocul continua");
		
		manager.executaUrmatorulTask();
		
		System.out.println("jocul continua");
		
		manager.executaUrmatorulTask();
		
	}

}
