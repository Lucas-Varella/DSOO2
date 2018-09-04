package br.ufsc.Trabalho1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends User{

	private ArrayList<String> training;
	
	public Member(String cpf, String rg, String name, String birthday, String address, String phone) {
		super(cpf, rg, name, birthday, address, phone);
		this.training = new ArrayList<String>();
		this.training.add("Treadmill");
	}
	public String toString() {
		return getName() + " / " + getCpf();
	}
	public ArrayList<String> getTrain() {
		return training;
	}
	
	public void setTrain(ArrayList<String> train) {
		this.training = train;
	}
	public void addExercise(String string) {
		this.training.add(string);
	}
	//thecommit

}
