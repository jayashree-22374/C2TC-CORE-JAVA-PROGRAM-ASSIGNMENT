package com.jayashree.assignment.employees;

public class Developer extends Employee {
	private int developerId;
	private String codingLang;
	
	
	
	public Developer(String name, int employeeId, int salary, int developerId, String codingLang) {
		super(name, employeeId, salary);
		this.developerId = developerId;
		this.codingLang = codingLang;
	}
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
	public String getCodingLang() {
		return codingLang;
	}
	public void setCodingLang(String codingLang) {
		this.codingLang = codingLang;
	}
	
	@Override
	public String toString() {
		return "Developer ["+super.toString()+"developerId=" + developerId + ", codingLang=" + codingLang + "]";
	}

}
