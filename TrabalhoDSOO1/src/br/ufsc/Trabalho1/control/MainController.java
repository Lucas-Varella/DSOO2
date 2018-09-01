package br.ufsc.Trabalho1.control;

import java.util.ArrayList;

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
	

	public static boolean isValid(String username, String password) throws Exception {
		
		ArrayList memberList = PersistanceCtrl.getInstance().getMemberList().getList();
		boolean exists = dataHandler.exists(PersistanceCtrl.getInstance().
				getUsernameList().getList(), username);
		
		if(exists) 
			return auth.authentication(username, password, memberList);
		else {
			throw new Exception("No usernames match the field");
		}
	}
	
}
