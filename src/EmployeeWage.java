
public class EmployeeWage {
	public static void main(String[] args) {
		
		double randomNumber = Math.floor(Math.random()*10)%2; 
		Employee checkAttendance=new Employee(randomNumber);
		checkAttendance.attendance();
        
		
	}
}
