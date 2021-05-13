package Command;

import java.util.ArrayList;
import java.util.List;

public class MnagerTaskuri {

	List<InterfataTaskAsincron> taskuri=new ArrayList<>();
	
	public void adaugaTask(InterfataTaskAsincron task) {
		taskuri.add(task);
		
	}
	
	public void executaUrmatorulTask() {
//		for(int i=0;i<taskuri.size(); i++) {
//			if()
//		}
		if(taskuri.size()>0) {
			InterfataTaskAsincron task= taskuri.get(0);
			task.startTaskAsicron();
			taskuri.remove(0);
		}
	}
}
