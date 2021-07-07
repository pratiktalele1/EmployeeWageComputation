import java.util.Scanner;

public class Employee {
	double randomNumber;
	double isFullTime=1;
	double wagePerHour;
	double fullDayHour;
	double partTimeHour;
	double partTimeEmployeeWage;
	
	public void DailyEmployeeWage() {
		double dailyWage=wagePerHour*fullDayHour;
		System.out.println("employee wage "+dailyWage +" RS");
	}
	
	public void partTimeEmployeeWage() {
		double partTimeEmployeeWage=wagePerHour*partTimeHour;
		System.out.println("Part time employee wage "+ partTimeEmployeeWage +" RS");
	}
	
	 
	
	public Employee(double randomNumber,double wagePerHour,double fullDayHour,double partTimeHour) {
		super();
		this.randomNumber = randomNumber;
		this.wagePerHour=wagePerHour;
		this.fullDayHour=fullDayHour;
		this.partTimeHour=partTimeHour;
	}
	
	public void attendance() {
		if (isFullTime==randomNumber) {
        	System.out.println("Employee is present");
        	DailyEmployeeWage();
        }
        else {
        	System.out.println("Employee is absent");
        }
	}
}
