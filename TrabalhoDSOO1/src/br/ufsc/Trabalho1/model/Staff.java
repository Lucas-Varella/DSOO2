package br.ufsc.Trabalho1.model;

import java.util.Date;

public class Staff extends User{
	
	private Positions position;
	private String salary;
	private String username;
	private String password;

	public Staff(String cpf, String rg, String name, String birthday, String address, String phone,
			Positions position, String salary, String username, String password) {
		
		super(cpf, rg, name, birthday, address, phone);
		this.setSalary(salary);
		this.setPosition(position);
		this.password = password;
		this.username = username;
	}

	public Positions getPosition() {
		return position;
	}

	public void setPosition(Positions position) {
		this.position = position;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
