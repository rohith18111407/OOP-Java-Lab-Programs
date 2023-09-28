import java.util.Scanner;
public class Employee
{
	String name,desgn;
	int id,years,hours;
	double bp,da,hra,lic,pf,grosspay,netpay,hourly_wage,deductions;

	public void assign(String name,int id,int years,int hours,double bp,String desgn)
	{
		Scanner scanner=new Scanner(System.in);
		this.name=name;
		this.id=id;
		this.years=years;
		this.hours=hours;
		this.bp=bp;
		this.desgn=desgn;

		switch(desgn)
		{
			case "Intern":
				System.out.println("Enter the hourly wage: ");
				this.hourly_wage=scanner.nextDouble();
				System.out.println("Enter the LIC amount: ");
				this.lic=scanner.nextDouble();
				this.da=2000.0;this.hra=1000;this.pf=500;
				this.grosspay=hours*hourly_wage+da+hra;
				this.deductions=lic+pf;
				this.netpay=grosspay-deductions;
				break;
			case "Manager":
				System.out.println("Enter the LIC amount: ");
				this.lic=scanner.nextDouble();
				this.hra=0.1*bp;this.pf=0.08*bp;
				this.da=0.4*bp;
				this.grosspay=bp+da+hra;
				this.deductions=lic+pf;
				this.netpay=grosspay-deductions;
				break;
			case "Others":
				System.out.println("Enter the LIC amount: ");
				lic=scanner.nextDouble();
				double hourly_wage2=1.0;
				hra=0.1*bp;pf=0.08*bp;
				da=0.3*bp;
				grosspay=bp+da+hra;
				deductions=lic+pf;
				netpay=grosspay-deductions;
				break;
			default:
				System.out.println("Error designation...");
		}
	}

	public void display()
	{
		System.out.println("\nName = "+name);
		System.out.println("ID = "+id);
		System.out.println("Gross Salary = "+grosspay);
		System.out.println("Deductions = "+deductions);
		System.out.println("Net Salary = "+netpay+"\n");
	}
}

class Main
{
	public static void main(String []args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the total no. of Employees: ");
		int n=scanner.nextInt();
		scanner.nextLine();
		Employee []employee=new Employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name: ");
			String name=scanner.nextLine();
			System.out.println("Enter the id: ");
			int id=scanner.nextInt();
			System.out.println("Enter the years of experience: ");
			int years=scanner.nextInt();
			System.out.println("Enter the no. of hours worked: ");
			int hours=scanner.nextInt();
			System.out.println("Enter the basic pay: ");
			double bp=scanner.nextDouble();
			scanner.nextLine();
			System.out.println("Enter the designation [Intern, Manager, Others] : ");
			String desgn=scanner.nextLine();
			employee[i]=new Employee();
			employee[i].assign(name,id,years,hours,bp,desgn);

		}
		System.out.println("Salary details for all emplyees...");
		for(int i=0;i<n;i++)
			employee[i].display();
	}
}