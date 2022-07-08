
import java.util.Random;

public class EmployeewageSwitchCase {


	public static void main(String[] args) {
		System.out.println(" Welcome to Employee Wage Computation Program ");
		Random random = new Random();
		int attendance = random.nextInt(3);
		int wagePerHour = 20;
		int fullDayHours = 8;
		int wagePerDay = 0;
		int partTimeHours = 4;

		switch (attendance) {
		case 0:
			System.out.println("Employee is absent");
			break;
		case 1:
			System.out.println("Employee is present");
			wagePerDay = fullDayHours * wagePerHour;
			System.out.println("Employee's daily wage is:" + wagePerDay);
			break;
		case 2:
			System.out.println("Employee is present for part time");
			wagePerDay = partTimeHours * wagePerHour;
			System.out.println("Employee's daily wage is:" + wagePerDay);
			break;

		}
	}

}
