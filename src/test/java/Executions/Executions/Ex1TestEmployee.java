package Executions.Executions;

import java.util.Date;

public class Ex1TestEmployee {

	public static void main(String[] args) {
		
		Date date= new Date();
		System.out.println(date.toString());
		
		Ex1Employee emp1=new Ex1Employee();
		Ex1Employee emp2=new Ex1Employee();

		emp1.getEmpData(1, "Dhruv", 65000, "Automation Analyst");
		emp2.getEmpData(2, "Aesha", 45000, "Office Admin");
		
		emp1.displayEmpData();
		emp2.displayEmpData();
	}

}
