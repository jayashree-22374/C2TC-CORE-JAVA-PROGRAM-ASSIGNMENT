package com.jayashree.assignment2;

public class CommissionMain {
	public static void main(String[]args) {
		Student st=new Student();
		st.display();
		Commission cs=new Commission("Jayashree","No:234,Chennai",974546634,80000);
		System.out.println(cs);
		System.out.println(cs.salesCom());
		
		
		
		
	}

}
