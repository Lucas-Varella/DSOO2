package br.ufsc.Trabalho1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends User{

	private ArrayList<String> training;
	private boolean[][][] frequency; 
	
	public Member(String cpf, String rg, String name, String birthday, String address, String phone) {
		super(cpf, rg, name, birthday, address, phone);
		this.training = new ArrayList<String>();
		this.training.add("Treadmill");
		this.frequency = new boolean[31][12][41];
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
	public void setFrequency(int day, int month, int year, boolean bool) {
		frequency[day][month][year] = bool;
	}
	public boolean getFrequency(int day, int month, int year) {
		return frequency[day][month][year];
	}
	//thecommit

}
