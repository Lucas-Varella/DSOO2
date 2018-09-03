package components.persistence;

import java.util.ArrayList;

public class MemoryPersistance<T> {
	private ArrayList<T> persistanceList;
	
	public MemoryPersistance (ArrayList<T> persistanceList) {
		this.persistanceList = persistanceList;
	}

	public ArrayList<T> getList() {
		return persistanceList;
	}

	public void setPersistanceList(ArrayList<T> persistanceList) {
		this.persistanceList = persistanceList;
	}
	
	public void add(T t) {
		persistanceList.add(t);
	}
	
	public void remove(T t) {
		persistanceList.remove(t);
	}
	
}
