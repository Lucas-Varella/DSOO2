package br.ufsc.Trabalho1.control;

import br.ufsc.Trabalho1.view.*;

public class ScreenCtrl {

	private static final ScreenCtrl instance = new ScreenCtrl();
	private LoginScreen loginScreen;
	private MainScreen mainScreen;
	private MemberScreen memberScreen;
	private TrainingScreen trainingScreen;
	private NewEmployeeScreen newEmployeeScreen;
	private ListMemberScreen listMemberScreen;
	private EmployeeScreen employeeScreen;
	private CreateMemberScreen createMemberScreen;
	
	public ScreenCtrl() {
		loginScreen = new LoginScreen(this);
		//pra que atribuir o negocio? tu nem usa
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

	public void showMemberScreen() {
		// TODO Auto-generated method stub
		
	}

}
