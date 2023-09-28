import java.util.Scanner;

abstract class Person
{
	//class variables
	private String name,address;
	
	//default constructor
	Person()
	{
	}
	
	//argument constructor
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	//getters
	public String getName()
	{
		return this.name;
	}
	
	//getter
	public String getAddress()
	{
		return this.address;
	}
	
	//setter
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	//setter
	public void setName(String name)
	{
		this.name=name;
	}
}

//Derived class
class Employee extends Person
{
	//class variables
	private String dept;
	private int empid;
	private float basic;
	
	//default constructor
	Employee()
	{
	}
	
	//argument constructor
	Employee(String name,String address,int empid,String dept,float basic)
	{
		super(name,address);
		this.empid=empid;
		this.dept=dept;
		this.basic=basic;
	}
	
	//getters
	public int getEmpid()
	{
		return this.empid;
	}
	
	public String getDept()
	{
		return this.dept;
	}
	
	
	//setters
	public void setDept(String dept)
	{
		this.dept=dept;
	}
	
	public void setBasic(float basic)
	{
		this.basic=basic;
	}
	
	public void setId(int empid)
	{
		this.empid=empid;
	}
	
	//getters
	public float getBasic()
	{
		return this.basic;
	}
	
	public float calSalary()
	{
		return (float) (((0.6 * getBasic()) + (0.1 * getBasic())) -((0.085 * getBasic()) + (0.08 * getBasic())));
	}
}

class Faculty extends Employee
{
	//class variables
	private String designation,course;
	
	//default constructor
	Faculty()
	{
	}
	
	//argument constructor
	Faculty(String name,String address,int empid,String dept,int basic,String desig,String course)
	{
		super(name,address,empid,dept,basic);
		this.designation=desig;
		this.course=course;
	}
	
	//getters
	public String getDesig()
	{
		return this.designation;
	}
	
	//setters	
	public void setDesig(String desig)
	{
		this.designation=desig;
	}
	
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	//getters
	public String getCourse()
	{
		return this.course;
	}
}

interface Student
{
	float[] getMarks();
	float calcGPA();
}

class TeachingAssistant extends Employee implements Student
{
	//class variables
	private String project,course;
	private float gpa;
	private float[] marks=new float[5];
	
	//default constructor
	TeachingAssistant()
	{
	}	
	
	//argument constructor
	TeachingAssistant(String name,String address,int empid,String dept,int basic,String project,String course,float marks)
	{
		super(name,address,empid,dept,basic);
		this.project=project;
		this.course=course;
		//marks
	}
	
	//getters
	public String getProject()
	{
		return this.project;
	}
	
	public String getCourse()
	{
		return this.course;
	}
	
	//setters
	public void setCourse(String course)
	{
		this.course=course;
	}
	
	//getters
	public float[] getMarks()
	{
		int sum=0;
		Scanner scanner=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the mark for subject "+(i+1)+": ");
			this.marks[i]=scanner.nextFloat();
			sum+=this.marks[i];
		}

		System.out.println("Sum = "+sum);
		this.gpa=(float)((sum/500)*10);
		System.out.println("gpa = "+gpa);
		return marks;
	}
	
	public float calcGPA()			
	{
		return this.gpa;
	}
	
	public float calSalary()
	{
		return (float) (((0.6 * getBasic()) + (0.1 * getBasic())) -((0.085 * getBasic()) + (0.08 * getBasic())));
	}
}	

class Main
{
	public static void main(String[] args)
	{
		
		Faculty faculty=new Faculty();
		setDetails(faculty);
		System.out.println();
		displayDetails(faculty);
		System.out.println();
		
		TeachingAssistant teachingassistant=new TeachingAssistant("Vimal","No.5, West Tambaram, OMR Road, Chennai-8",211055,"Computer Science and Engineering",50000,"Assistant Professor","OOP Java",100);
		float[] receivedmarks=teachingassistant.getMarks();
		System.out.println("The marks obtained are: ");
		for(int i=0;i<5;i++)
			System.out.println(receivedmarks[i]+" ");
		System.out.println();
		displayDetails(teachingassistant);
	}
	
	public static void setDetails(Faculty faculty)
	{
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("Enter the faculty name: ");
		String name=scanner.nextLine();
		System.out.print("Enter the faculty address: ");
		String address=scanner.nextLine();
		System.out.print("Enter the faculty employee ID: ");
		int empid=scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter the faculty department: ");
		String dept=scanner.nextLine();
		System.out.print("Enter the faculty basic pay: ");
		float basic=scanner.nextFloat();
		scanner.nextLine();
		System.out.print("Enter the faculty designation: ");
		String desig=scanner.nextLine();
		System.out.print("Enter the faculty course: ");
		String course=scanner.nextLine();
		
		faculty.setName(name);
		faculty.setAddress(address);
		faculty.setId(empid);
		faculty.setDept(dept);
		faculty.setBasic(basic);
		faculty.setDesig(desig);
		faculty.setCourse(course);
	}
	
	public static void displayDetails(Faculty faculty)
	{
		System.out.println("Faculty name: "+faculty.getName());
		System.out.println("Faculty address: "+faculty.getAddress());
		System.out.println("Faculty employee ID: "+faculty.getEmpid());
		System.out.println("Faculty department: "+faculty.getDept());
		System.out.println("Faculty designation: "+faculty.getDesig());
		System.out.println("Faculty course: "+faculty.getCourse());
		System.out.println("Faculty salary: "+faculty.calSalary());
	}

	public static void displayDetails(TeachingAssistant teachingAssistant)
	{
		System.out.println("Teaching assistant name: "+teachingAssistant.getName());
		System.out.println("Teaching assistant address: "+teachingAssistant.getAddress());
		System.out.println("Teaching assistant employee ID: "+teachingAssistant.getEmpid());
		System.out.println("Teaching assistant department: "+teachingAssistant.getDept());
		System.out.println("Teaching assistant project: "+teachingAssistant.getProject());
		System.out.println("Teaching assistant course: "+teachingAssistant.getCourse());
		System.out.println("Teaching assistant GPA: "+teachingAssistant.calcGPA());
		System.out.println("Teaching assistant salary: "+teachingAssistant.calSalary());
	}
}
	
