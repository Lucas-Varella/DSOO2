package br.ufsc.Trabalho1.control;

import javax.swing.JOptionPane;

import components.RegistryHandler.DataHandler;
import components.authentication.Authenticator;

public class MainController {
	
	private static final MainController instance = new MainController();
	private static Authenticator auth;
	private static DataHandler dataHandler;
	
	public MainController () {
		this.auth = new Authenticator();
	}


	public static MainController getInstance() {
		return instance;
	}
	
	public void showLoginScreen() {
		ScreenCtrl.getInstance().menu();
	}


	public void showMainScreen() {
		
	}
	

	public static boolean isValid(String text) throws Exception {
		
		boolean exists = dataHandler.exists(PersistanceCtrl.getInstance().
				getUsernameList().getList(), text);
		
		if(exists) 
			return auth.authentication();
		else {
			throw new Exception("No usernames match the field");
		}
	}
	
}
