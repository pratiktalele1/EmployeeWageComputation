
public class Employee {
	double randomNumber;
	double isFullTime=1;

	public Employee(double randomNumber) {
		super();
		this.randomNumber = randomNumber;
	}
	
	public void attendance() {
		if (isFullTime==randomNumber) {
        	System.out.println("Employee is present");
        }
        else {
        	System.out.println("Employee is absent");
        }
	}
}
