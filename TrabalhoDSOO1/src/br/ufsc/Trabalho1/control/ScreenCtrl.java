package br.ufsc.Trabalho1.control;

import br.ufsc.Trabalho1.model.Member;
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
    private ManageEmployeeScreen manageEmployeeScreen;
    private FrequencyScreen frequencyScreen;
	
	public ScreenCtrl() {
		loginScreen = new LoginScreen();
		mainScreen = new MainScreen();
		memberScreen = new MemberScreen();
		trainingScreen = new TrainingScreen();
		newEmployeeScreen = new NewEmployeeScreen();
		manageMemberScreen = new ManageMemberScreen();
		employeeScreen = new EmployeeScreen();
		newMemberScreen = new NewMemberScreen();
        manageEmployeeScreen = new ManageEmployeeScreen();
        frequencyScreen = new FrequencyScreen();
	}

	public static ScreenCtrl getInstance() {
		return instance;
	}
	
	public void showLoginScreen() {
		loginScreen.setVisible(true); 
	}

	public void showMainScreen() {
		mainScreen.labelEnable();
		mainScreen.setVisible(true);
		
	}

	public void showMemberScreen() {
		memberScreen.setVisible(true);
	}
	
	public void showTrainingScreen(Member member) {
		
		trainingScreen.setMember(member);
		trainingScreen.updateData();
		trainingScreen.setVisible(true);
		
	}
	
	public void showNewEmployeeScreen() {
		newEmployeeScreen.setVisible(true);
	}
	
	public void showManageMemberScreen() {
		manageMemberScreen.updateData();
		manageMemberScreen.setVisible(true);
	}

	public void showEmployeeScreen() {
		employeeScreen.setVisible(true);
		
	}
	
	public void showNewMemberScreen() {
		newMemberScreen.setVisible(true);
		
	}

    public void showManageEmployeeScreen() {
    	manageEmployeeScreen.updateData();
    	manageEmployeeScreen.setVisible(true);
    }

	public void showFrequencyScreen(Member member) {
		frequencyScreen.setMember(member);
		frequencyScreen.setVisible(true);
		
	}

	
}
