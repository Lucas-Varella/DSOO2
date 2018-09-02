package br.ufsc.Trabalho1.model;

import java.util.Date;

public class User {
	
	private String cpf;
	private String rg;
	private String name;
	private String birthday;
	private String address;
	
	public User(String cpf, String rg, String name, String birthday, String address) {
		this.setAddress(address);
		this.setBirthday(birthday);
		this.setCpf(cpf);
		this.setName(name);
		this.setRg(rg);
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
