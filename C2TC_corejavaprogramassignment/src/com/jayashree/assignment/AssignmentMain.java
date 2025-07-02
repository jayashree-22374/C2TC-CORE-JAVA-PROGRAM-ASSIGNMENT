package com.jayashree.assignment;
import com.jayashree.assignment.employees.*;
import com.jayashree.assignment.utilities.*;

public class AssignmentMain {
	public static void main(String[]args) {
		Manager mg=new Manager("Jayashree",4368748,60000,678989,7);
		Developer dp=new Developer("Jash",5778888,100000,8643,"Java");
		System.out.println(mg);
		System.out.println(dp);
		EmployeeUtilities.bonuscalc(dp);
		System.out.println("This is the bonus for employee under 50000 : "+EmployeeUtilities.bonuscalc(dp));
	}

}
