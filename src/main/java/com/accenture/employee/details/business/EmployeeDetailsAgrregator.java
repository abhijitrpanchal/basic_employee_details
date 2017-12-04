/**
 * 
 */
package com.accenture.employee.details.business;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.employee.details.business.vo.Employee;

/**
 * @author abhijit.panchal
 *
 */
@SpringBootApplication
public class EmployeeDetailsAgrregator {
	/**
	 * 
	 * @param id
	 * @return Employee
	 * Mock Employee object
	 */
	public Employee getEmployeeEntity(Integer id){
		Employee emp = new Employee();
		Integer empId = id;
		
		switch (empId) {
			case 1:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Cortez Claybrook");
				emp.setEmployeeAddress("Passafic, US");
				break;
			case 2:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Ruben Rincon");
				emp.setEmployeeAddress("Mount Carroll, US");
				break;
			case 3:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Jaymie Jeff");
				emp.setEmployeeAddress("Tillatoba, US");
				break;
			case 4:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Kaitlin Kittrell");
				emp.setEmployeeAddress("White Pigeon, US");
				break;
			case 5:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Victor Sam");
				emp.setEmployeeAddress("New Jersey, US");
				break;
			case 6:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Jesse Jacoby");
				emp.setEmployeeAddress("Leyner, US");
				break;
			case 7:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Hsiu Heiman");
				emp.setEmployeeAddress("Thermalito, US");
				break;
			case 8:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Margarita Mascarenas");
				emp.setEmployeeAddress("Punta Santiago, U");
				break;
			case 9:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Nikita Nevius");
				emp.setEmployeeAddress("Pearsall, US");
				break;
			case 10:
				emp.setEmployeeId(id);
				emp.setEmployeeName("Eleonora Earlywine");
				emp.setEmployeeAddress("Edmonston, US");
				break;
			default:	
				emp.setEmployeeId(id);
				emp.setEmployeeName("Employee does not exist");
				emp.setEmployeeAddress("Employee Address not exist");
				break;
		}
		return emp;
	}


}
