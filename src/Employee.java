import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	double randomNumber;
	double isFullTime=1;
	double wagePerHour;
	double fullDayHour;
	double partTimeHour;
	double partTimeEmployeeWage;
	double workingDays;
	double dailyWage;
	double totalMonthWorkingHour;
	
	public void WagesForWorkingHourAndDays(){
		
		double totalWagesForDays = 0;
		double hourPerDay=totalMonthWorkingHour/workingDays;
		double WagesForDay=hourPerDay*wagePerHour;
		
		for(int i=0;i<20;i++) {
			totalWagesForDays=totalWagesForDays+WagesForDay;
		}
		System.out.println("total consume money for 100 hours or 20 days is - "+totalWagesForDays+" RS");
		
	}
	
	public void DailyEmployeeWage() {
		dailyWage=wagePerHour*fullDayHour;
		System.out.println("employee wage "+dailyWage +" RS");
	}
	
	public void partTimeEmployeeWage() {
		double partTimeEmployeeWage=wagePerHour*partTimeHour;
		System.out.println("Part time employee wage "+ partTimeEmployeeWage +" RS");
		System.out.println("-----------------------------------------------------");
	}
	
	public void WagesForMonth() {
		double totalWageForMonth=workingDays*dailyWage;
		System.out.println("total wages for month - "+totalWageForMonth+" RS");
		System.out.println("-----------------------------------------------------");

		
	}
	
	public void employeeWageUsingSwitch() {
		System.out.println("option 1 for employee Daily Wage");
		System.out.println("option 2 for employee Part time Wage");
		System.out.println("enter - ");
		
		Scanner getValue = new Scanner(System.in);
		int selectOption = getValue.nextInt();
		
		switch (selectOption) {
		case 1: {
			System.out.println("-----------------------------------------------------");
			double partTimeEmployeeWage=wagePerHour*partTimeHour;
			System.out.println(" employee Daily wage "+ partTimeEmployeeWage +" RS");
			System.out.println("-----------------------------------------------------");
			break;
		}
		case 2: {
			System.out.println("-----------------------------------------------------");

			double partTimeEmployeeWage=wagePerHour*partTimeHour;
			System.out.println("Part time employee wage "+ partTimeEmployeeWage +" RS");
			System.out.println("-----------------------------------------------------");
			break;
		}
		default:
			System.out.println("wrong option");
		}
	}
	 
	
	public Employee(double randomNumber,double wagePerHour,double fullDayHour,double partTimeHour,double workingDays, double totalMonthWorkingHour) {
		super();
		this.randomNumber = randomNumber;
		this.wagePerHour=wagePerHour;
		this.fullDayHour=fullDayHour;
		this.partTimeHour=partTimeHour;
		this.workingDays=workingDays;
		this.totalMonthWorkingHour=totalMonthWorkingHour;
		
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
