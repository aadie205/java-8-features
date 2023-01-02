package com.java8.random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Employee  {

	private int empId;
	private String empName;
	private String empDept;
	private double empSal;

	public Employee() {
		
	}
	
	public Employee(int empId, String empName, String empDept, double empSal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		this.empSal = empSal;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	
	
	@Override
	public String toString() {
		return "empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSal=" + empSal
				+ "";
	}

	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(new Employee(8, "Naveen Kumar", "IT", 556666),new Employee(3, "Sanjay k", "Hr", 534343),new Employee(1, "Pawan G", "Sales", 43222),new Employee(4, "Srimanthi", "IT", 34555),new Employee(6, "Naveen kumar", "IT", 556666),new Employee(5, "Junior D.", "IT", 44555),new Employee(7, "Preetam kumar", "Sales", 98700),new Employee(2, "Naveen Kumar", "IB", 986556));
		
		System.err.println("All Objects :"+empList);
		

		Collections.sort(empList, (o1, o2) -> o1.empId - o2.empId);
		List<Employee> collect = empList.stream().sorted((o1, o2) -> o2.empId - o1.empId).collect(Collectors.toList());
		System.err.println("Decending order By stream API : "+collect);

		System.out.println("Ascending order sorting based on ID :" + empList);

		Collections.sort(empList, (o1, o2) -> o2.empId - o1.empId);
		
		System.out.println("Decending order sorting based on ID :" + empList);
		
		Collections.sort(empList, (o1, o2)  -> o1.getEmpName().compareTo(o2.getEmpName()));
		
		System.err.println("Ascending order sorting based on Name :" + empList);
		
		Collections.sort(empList, (o1, o2)  -> o2.getEmpName().compareTo(o1.getEmpName()));
		
		System.err.println("Decending order sorting based on Name :" + empList);

		Collections.sort(empList, (o1, o2)  -> o1.getEmpDept().compareTo(o1.getEmpDept()));
		
		System.out.println("Ascending order sorting based on Department :" + empList);
		
		Collections.sort(empList, (o1, o2)  -> o2.getEmpDept().compareTo(o2.getEmpDept()));
		
		System.out.println("Decending order sorting based on Department :" + empList);
		
		Collections.sort(empList, (o1, o2)  -> (int)(o1.getEmpSal() - o2.getEmpSal()));
		
		System.err.println("Ascending order sorting based on Salary :" + empList);

		Collections.sort(empList, (o1, o2)  -> {return (int)(o2.getEmpSal() - o1.getEmpSal());});
		
		System.err.println("Decending order sorting based on Salary :" + empList);
		
		
		// Collections.sort(empList, new Employee());  //Sample way
		// System.out.println("Sorting based on Condition: "+empList);

		// Based on some condition sorting
		Collections.sort(empList, (o1, o2) -> {
			if (o1.getEmpName().equals(o2.getEmpName())) {
				return o1.getEmpId() - o2.getEmpId();
			} else {
				return (int) (o1.getEmpSal() - o2.getEmpSal());
			}
		});

		System.out.println("Sorting based on Condition: " + empList);

	}


}
