package components.authentication;

public class Authenticator {
	
	public Authenticator() {
	}
	
	public <T> boolean authentication(Object obj1, String obj2) {
		
		if (obj1.equals(obj2))
			return true;
		else
			return false;
	}
	
}
