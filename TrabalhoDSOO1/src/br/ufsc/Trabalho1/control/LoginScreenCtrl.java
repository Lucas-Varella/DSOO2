package br.ufsc.Trabalho1.control;

import br.ufsc.Trabalho1.view.LoginScreen;

public class LoginScreenCtrl {

	private static final LoginScreenCtrl instance = new LoginScreenCtrl();
	private LoginScreen loginScreen;
	
	public LoginScreenCtrl() {
		loginScreen = new LoginScreen(this);
	}

	public static LoginScreenCtrl getInstance() {
		return instance;
	}
	
	public void menu() {
		loginScreen.setVisible(true); 
	}
}
