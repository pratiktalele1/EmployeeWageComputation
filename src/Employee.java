import java.util.Scanner;

public class Employee {
	double randomNumber;
	double isFullTime=1;
	double wagePerHour;
	double fullDayHour;
	
	public void DailyEmployeeWage() {
		double dailyWage=wagePerHour*fullDayHour;
		System.out.println("employee wage "+dailyWage +" RS");
		
	
		
	}
	public Employee(double randomNumber,double wagePerHour,double fullDayHour) {
		super();
		this.randomNumber = randomNumber;
		this.wagePerHour=wagePerHour;
		this.fullDayHour=fullDayHour;
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
