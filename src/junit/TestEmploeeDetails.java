/*
Copyright 2010 kiddy
*/
package junit;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestEmploeeDetails {
	EmployeeDetails employeeDetails = new EmployeeDetails();
	EmpBussinessLogic bussinessLogic = new EmpBussinessLogic();
	
	@Test
	public void testCalculateAppraisal() {
		employeeDetails.setAge(21);
		employeeDetails.setName("kid");
		employeeDetails.setMonthlySalary(30000);
		
		double appraisal = bussinessLogic.calculateAppraisal(employeeDetails);
		assertEquals(1000, appraisal, 0.0);
	}
}
