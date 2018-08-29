package br.ufsc.Trabalho1.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Trainee extends User{

	private List<String> train;
	
	public Trainee(String cpf, String rg, String name, Date birthday, String address) {
		super(cpf, rg, name, birthday, address);
		this.setTrain(new ArrayList());
	}

	public List<String> getTrain() {
		return train;
	}

	public void setTrain(List<String> train) {
		this.train = train;
	}

}
