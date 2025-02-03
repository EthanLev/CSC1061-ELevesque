import java.util.Scanner;

public class AccountsPayable {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Employee[] payableEmployees = new Employee[1];
		
		for (int i = 0; i < payableEmployees.length; i ++) {
			System.out.println("Enter employees first name: ");
			String firstName = input.nextLine();
			System.out.println("Enter employees last name: ");
			String lastName = input.nextLine();
			System.out.println("Enter employees SSN");
			long ssn = input.nextLong();
			System.out.println("Enter pay type (1. Salaried 2. Commission 3. Hourly 4. Base + Commission");
			int choice = input.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter weekly salary: ");
                double weeklySalary = input.nextDouble();
                input.nextLine();
                payableEmployees[i] = new SalariedEmployee(firstName, lastName, ssn, weeklySalary);
                break;
            case 2:
                System.out.print("Enter gross sales: ");
                double grossSales = input.nextDouble();
                System.out.print("Enter commission rate: ");
                double commissionRate = input.nextDouble();
                input.nextLine(); 
                payableEmployees[i] = new CommissionEmployee(firstName, lastName, ssn, grossSales, commissionRate);
                break;
            case 3:
                System.out.print("Enter hourly wage: ");
                double hourlyWage = input.nextDouble();
                System.out.print("Enter hours worked: ");
                int hoursWorked = input.nextInt();
                input.nextLine(); 
                payableEmployees[i] = new HourlyEmployee(firstName, lastName, ssn, hourlyWage, hoursWorked);
                break;
            case 4:
                System.out.print("Enter gross sales: ");
                grossSales = input.nextDouble();
                System.out.print("Enter commission rate: ");
                commissionRate = input.nextDouble();
                System.out.print("Enter base pay: ");
                double basePay = input.nextDouble();
                input.nextLine(); 
                payableEmployees[i] = new BasePlusCommissionEmployee(firstName, lastName, ssn, grossSales, commissionRate, basePay);
                break;
            default:
                System.out.println("Invalid employee type!");
                break;
			}
		}
		
		System.out.println();
		
		for (Employee employee : payableEmployees) {
			printDetails(employee);
		}
	}
	
	public static void printDetails(Employee employee) {
		//System.out.println(employee.toString());
		System.out.println(employee.getFirstName() + " " + employee.getLastName());
		System.out.println("SSN:" + employee.getSsNum());
		System.out.println("Salary: " + employee.getPaymentAmount());
	}
}
