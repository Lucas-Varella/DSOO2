package br.ufsc.Trabalho1.model;

import java.util.Date;

public class Employee extends User{
	
	private String position;
	private int salary;

	public Employee(String cpf, String rg, String name, Date birthday, String address, String position, int salary) {
		super(cpf, rg, name, birthday, address);
		this.salary = salary;
		this.position = position;
	}

}
