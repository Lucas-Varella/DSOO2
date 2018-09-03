package br.ufsc.Trabalho1.control;

import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.text.Position;

import br.ufsc.Trabalho1.model.Member;
import br.ufsc.Trabalho1.model.Positions;
import br.ufsc.Trabalho1.model.Staff;
import components.RegistryHandler.DataHandler;
import components.authentication.Authenticator;

public class MainController {
	
	private static final MainController instance = new MainController();
	private Authenticator auth;
	private DataHandler dataHandler;
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
		
		boolean isValid = false;
		ArrayList<Staff> staffList = PersistanceCtrl.getInstance().getStaffList();
		boolean exists = dataHandler.exists(PersistanceCtrl.getInstance().
				getUsernameList(),username);
		
		if(exists) {
			for (Staff s :staffList) {
				if (auth.authentication(s.getUsername(),username)) {
					if (auth.authentication(s.getPassword(), password)) {
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


	public boolean userIsAdmin() {
		if (loggedStaff.getPosition().equals(Positions.ADMIN))
			return true;
		else
			return false;
	}


	public Positions stringToPosition(String selectedItem) {
		
		if (selectedItem.equals("ADMIN")) 
			return Positions.ADMIN;
		else if (selectedItem.equals("INSTRUCTOR"))
			return Positions.INSTRUCTOR;
		else
			return Positions.RECEPCIONIST;
	}
	
}
