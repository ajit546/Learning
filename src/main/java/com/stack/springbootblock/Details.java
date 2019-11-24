package com.stack.springbootblock;

public class Details {
	
	private String Name;
	
	private String company;
	
	private int salary;
	
	

	public Details(String name, String company, int salary) {
		super();
		Name = name;
		this.company = company;
		this.salary = salary;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
