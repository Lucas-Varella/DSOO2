package br.ufsc.Trabalho1.control;

import br.ufsc.Trabalho1.view.*;

public class ScreenCtrl {

	private static final ScreenCtrl instance = new ScreenCtrl();
	private LoginScreen loginScreen;
	private MainScreen mainScreen;
	private MemberScreen memberScreen;
	private TrainingScreen trainingScreen;
	private NewEmployeeScreen newEmployeeScreen;
	private ManageMemberScreen manageMemberScreen;
	private EmployeeScreen employeeScreen;
	private NewMemberScreen newMemberScreen;
	
	public ScreenCtrl() {
		loginScreen = new LoginScreen(this);
		mainScreen = new MainScreen();
		memberScreen = new MemberScreen();
		trainingScreen = new TrainingScreen();
		newEmployeeScreen = new NewEmployeeScreen();
		manageMemberScreen = new ManageMemberScreen();
		employeeScreen = new EmployeeScreen();
		newMemberScreen = new NewMemberScreen();
	}

	public static ScreenCtrl getInstance() {
		return instance;
	}
	
	public void showLoginScreen() {
		loginScreen.setVisible(true); 
	}

	public void showMainScreen() {
		mainScreen.setVisible(true);
		
	}

	public void showMemberScreen() {
		memberScreen.setVisible(true);
	}
	
	public void showTrainingScreen() {
		trainingScreen.setVisible(true);;
	}
	
	public void showNewEmployeeScreen() {
		newEmployeeScreen.setVisible(true);
	}
	
	public void showManageMemberScreen() {
		manageMemberScreen.setVisible(true);
	}

	public void showEmployeeScreen() {
		employeeScreen.setVisible(true);
		
	}
	
	public void showNewMemberScreen() {
		newMemberScreen.setVisible(true);
		
	}
}
