/*
Copyright 2010 kiddy
*/
package junit;

public class EmpBussinessLogic {
	//Calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary()*12;
		return yearlySalary;
	}
	
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if(employeeDetails.getMonthlySalary() > 10000) {
			appraisal = 1000;
		} else {
			appraisal = 500;
		}
		return appraisal;
	}
}
