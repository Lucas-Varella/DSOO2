package components.RegistryHandler;

import java.util.ArrayList;

public class DataHandler {

	public DataHandler() {
		
	}
	
	public <T> boolean exists(ArrayList<T> expectedlist, Object actual) {
	
		for (T item : expectedlist) {
			
			if (actual.equals(item)) 
				return true;
			
		}
		return false;
	}
	
	

}
