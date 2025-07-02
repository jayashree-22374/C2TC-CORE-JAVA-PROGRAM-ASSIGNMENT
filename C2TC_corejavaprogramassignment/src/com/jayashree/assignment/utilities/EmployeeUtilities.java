package com.jayashree.assignment.utilities;
import com.jayashree.assignment.employees.*;

public class EmployeeUtilities {

	public static double bonuscalc(Employee em) {
		double bonus =0;
		if(em.getSalary()>50000) {
			bonus=em.getSalary()*0.10;
		}
		return bonus;
	}

}
