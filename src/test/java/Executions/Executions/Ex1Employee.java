package Executions.Executions;

public class Ex1Employee {

	int EmpID;
	String Ename;
	double ESal;
	String Job;
	
	void getEmpData(int I, String N, double S, String J ) {
		
		EmpID=I;
		Ename=N;
		ESal=S;
		Job=J;
	}
	
	void displayEmpData() {
		System.out.println(EmpID +" " +Ename +" " +ESal +" " +Job);
	}
	
}
