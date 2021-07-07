
public class EmployeeWage {
	public static void main(String[] args) {
		double wagePerHour=20;
		double fullDayHour=8;
		double partTimeHour=8;
		double randomNumber = Math.floor(Math.random()*10)%2; 
		double workingDays=20;
		double totalMonthWorkingHour=100;
		Employee checkAttendance=new Employee(randomNumber,wagePerHour,fullDayHour,partTimeHour,workingDays,totalMonthWorkingHour);
		checkAttendance.attendance();
		checkAttendance.DailyEmployeeWage();
        checkAttendance.partTimeEmployeeWage();
		checkAttendance.employeeWageUsingSwitch();
		checkAttendance.WagesForMonth();
		checkAttendance.WagesForWorkingHourAndDays();
		
	
		
	}
}
