package com.jayashree.assignment2;

public class Commission {
	private String name;
	private String address;
	private long phone;
	private double sales_amount;
	
	
	
	public Commission(String name, String address, long phone, double sales_amount) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.sales_amount = sales_amount;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public double getSales_amount() {
		return sales_amount;
	}
	public void setSales_amount(double sales_amount) {
		this.sales_amount = sales_amount;
	}
	
	public  double salesCom() { 
		double Com=0;
		if(sales_amount>=100000) {
			Com=sales_amount*0.10;	
		}
		else if(50000<=sales_amount && sales_amount<100000) {
			Com=sales_amount*0.05;
			
		}
		else if (30000<=sales_amount && sales_amount<500000){
			Com=sales_amount*0.03;
		}
		else if(sales_amount<30000) {
			System.out.println("No commission");
		}
		else {
			System.out.println("No Commission");
		}
		return Com;
	}
	
	@Override
	public String toString() {
		return "Commission [name=" + name + ", address=" + address + ", phone=" + phone + ", sales_amount="
				+ sales_amount + "]";
	}
	
	
	

}
