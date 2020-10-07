package paquete.javafx;
import javafx.concurrent.*;
public class MiServicio extends Service<String>{

	@Override
	protected Task<String> createTask() {
		// TODO Auto-generated method stub
	
		return new Task<String>() {

			@Override
			protected String call() throws Exception {
				// TODO Auto-generated method stub
				for (int i=0; i<200; i++)
				{
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				return "Proceso terminado";
			}
			
		};
	}

}
