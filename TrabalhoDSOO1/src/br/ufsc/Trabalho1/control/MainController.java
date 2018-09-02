package br.ufsc.Trabalho1.control;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import br.ufsc.Trabalho1.model.Member;
import br.ufsc.Trabalho1.model.Staff;
import components.RegistryHandler.DataHandler;
import components.authentication.Authenticator;

public class MainController {
	
	private static final MainController instance = new MainController();
	private static Authenticator auth;
	private static DataHandler dataHandler;
	
	public MainController () {
		this.auth = new Authenticator();
		this.dataHandler = new DataHandler();
	}


	public static MainController getInstance() {
		return instance;
	}
	
	public void showLoginScreen() {
		ScreenCtrl.getInstance().menu();
	}


	public void showMainScreen() {
		
	}
	

	public static boolean isValid(String username, String password) throws Exception {
		
		boolean isValid = false;
		ArrayList<Staff> staffList = PersistanceCtrl.getInstance().getStaffList().getList();
		boolean exists = dataHandler.exists(PersistanceCtrl.getInstance().
				getUsernameList().getList(), username);
		
		if(exists) {
			for (Staff s :staffList) {
				if (s.getUsername().equals(username)) {
					if (s.getPassword().equals(password)) {
						isValid = true;
					}
				}
			}
		return isValid;
		}else {
			throw new Exception("No usernames match the field");
		}
	}
	
}
