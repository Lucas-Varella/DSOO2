package br.ufsc.Trabalho1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Member extends User{

	private List<String> training;
	
	public Member(String cpf, String rg, String name, Date birthday, String address) {
		super(cpf, rg, name, birthday, address);
		this.setTrain(new ArrayList());
	}

	public List<String> getTrain() {
		return training;
	}

	public void setTrain(List<String> train) {
		this.training = train;
	}
	//thecommit

}
