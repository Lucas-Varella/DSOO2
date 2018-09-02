package br.ufsc.Trabalho1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends User{

	private List<String> training;
	
	public Member(String cpf, String rg, String name, String birthday, String address, String phone) {
		super(cpf, rg, name, birthday, address, phone);
		this.setTrain(new ArrayList());
	}
	public String toString() {
		return getName() + " / " + getCpf();
	}
	public List<String> getTrain() {
		return training;
	}

	public void setTrain(List<String> train) {
		this.training = train;
	}
	//thecommit

}
