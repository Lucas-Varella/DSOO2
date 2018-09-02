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
	private Staff loggedStaff;
	
	public MainController () {
		this.auth = new Authenticator();
		this.dataHandler = new DataHandler();
		loggedStaff = null;
	}


	public static MainController getInstance() {
		return instance;
	}
	
	public void showLoginScreen() {
		ScreenCtrl.getInstance().showLoginScreen();
	}


	public void showMainScreen() {
		
	}
	

	public boolean isValid(String username, String password) throws Exception {
		
		Staff logged = null;
		boolean isValid = false;
		ArrayList<Staff> staffList = PersistanceCtrl.getInstance().getStaffList().getList();
		boolean exists = dataHandler.exists(PersistanceCtrl.getInstance().
				getUsernameList().getList(), username);
		
		if(exists) {
			for (Staff s :staffList) {
				if (s.getUsername().equals(username)) {
					if (s.getPassword().equals(password)) {
						isValid = true;
						this.loggedStaff = s;
					}
				}
			}
		return isValid;
		}else {
			throw new Exception("No usernames match the field");
		}
	}


	public Staff getLogged() {
		return loggedStaff;
	}


	public void setLogged(Staff logged) {
		this.loggedStaff = logged;
	}
	
}
