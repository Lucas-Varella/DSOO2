package br.ufsc.Trabalho1.control;

public class MainController {
	
	private static final MainController instance = new MainController();
	
	public MainController () {
		
	}


	public static MainController getInstance() {
		return instance;
	}
	
	public void showMainScreen() {
		LoginScreenCtrl.getInstance().menu();
}
}
