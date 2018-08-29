package br.ufsc.Trabalho1.model;

import java.util.Date;

public class Employee extends User{
	
	private String position;
	private int salary;
	private String username;
	private String password;

	public Employee(String cpf, String rg, String name, Date birthday, String address, 
			String position, int salary, String username, String password) {
		
		super(cpf, rg, name, birthday, address);
		this.setSalary(salary);
		this.setPosition(position);
		this.password = password;
		this.username = username;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
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