package br.ufsc.Trabalho1.control;

import br.ufsc.Trabalho1.view.LoginScreen;
import br.ufsc.Trabalho1.view.MainScreen;

public class ScreenCtrl {

	private static final ScreenCtrl instance = new ScreenCtrl();
	private LoginScreen loginScreen;
	private MainScreen mainScreen;
	
	public ScreenCtrl() {
		loginScreen = new LoginScreen(this);
		mainScreen = new MainScreen();
	}

	public static ScreenCtrl getInstance() {
		return instance;
	}
	
	public void menu() {
		loginScreen.setVisible(true); 
	}

	public void showMainScreen() {
		mainScreen.setVisible(true);
		
	}

}
