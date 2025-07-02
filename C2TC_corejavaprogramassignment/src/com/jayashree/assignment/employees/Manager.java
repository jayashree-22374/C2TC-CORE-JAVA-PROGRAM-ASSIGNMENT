package com.jayashree.assignment.employees;

public class Manager extends Employee{
	private int managerId;
	private int experience;
	
	
	public Manager(String name, int employeeId, int salary, int managerId, int experience) {
		super(name, employeeId, salary);
		this.managerId = managerId;
		this.experience = experience;
	}
	public int getManagerId() {
		return managerId;
	}
	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Manager ["+super.toString()+ "managerId=" + managerId + ", experience=" + experience + "]";
	}

}
