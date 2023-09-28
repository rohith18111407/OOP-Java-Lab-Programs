import java.util.Scanner;
class Student
{
	String name,grade,dept;
	int id,mark1,mark2,mark3,avg;
	
	public void assign_inputs(String name,String dept,int id,int mark1,int mark2,int mark3)
	{
		this.name=name;
		this.dept=dept;
		this.id=id;
		this.mark1=mark1;
		this.mark2=mark2;
		this.mark3=mark3;
	}
	public void grade()
	{
		avg=(mark1+mark2+mark3)/3;
		if(avg>=90 && avg<=100) grade="O";
		else if(avg>=80 && avg<90) grade="A";
		else if(avg>=70 && avg<80) grade="B";
		else if(avg>=60 && avg<70) grade="C";
		else if(avg>=50 && avg<60) grade="D";
		else grade="E";
	}
	public void display()
	{
		System.out.println();
		System.out.println("Student details");
		System.out.println("Name: "+name);
		System.out.println("Department: "+dept);
		System.out.println("Id: "+id);
		System.out.println("Mark 1: "+mark1);
		System.out.println("Mark 2: "+mark2);
		System.out.println("Mark 3: "+mark3);
		System.out.println("Average: "+avg);
		System.out.println("Grade: "+grade);
		System.out.println();
	}
	public int search(int id1,String dept1)
	{
		if((id==id1)&&(dept.equals(dept1)))	return 1;
		return 0;
	}
	public int search(int id1)
	{
		if(id==id1)	return 1;
		return 0;
	}
}

class Main
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int result;
		System.out.println("Enter the number of student details: ");
		int n=scanner.nextInt();
		Student []s=new Student[n];
		for(int i=0;i<n;i++)
		{
			s[i]=new Student();
			System.out.println("Enter the name: ");
			String name=scanner.nextLine();
			scanner.nextLine();
			System.out.println("Enter the department: ");
			String dept=scanner.nextLine();
			System.out.println("Enter the id: ");
			int id=scanner.nextInt();
			System.out.println("Enter the mark1: ");
			int mark1=scanner.nextInt();
			System.out.println("Enter the mark2: ");
			int mark2=scanner.nextInt();
			System.out.println("Enter the mark3: ");
			int mark3=scanner.nextInt();
			s[i].assign_inputs(name,dept,id,mark1,mark2,mark3);
			s[i].grade();
			s[i].display();
		}
		System.out.println("Searching Choices");
		System.out.println("1.Search using id and dept\n2.Search using id alone");
		System.out.println("Enter the choice: ");
		int ch=scanner.nextInt();
		scanner.nextLine();
		switch (ch)
		{
			case 1:
				result=0;
				System.out.println("Enter the department :");
				String dept=scanner.nextLine();
				System.out.println("Enter the id :");
				int id1=scanner.nextInt();
				for(int i=0;i<n;i++)
				{
					result=s[i].search(id1,dept);
					if(result==1)
						break;
				}
				if(result==1)	System.out.println("Student found...");
				else	System.out.println("Student not found...");
				break;
			case 2:
				result=0;
				System.out.println("Enter the id :");
				int id2=scanner.nextInt();
				for(int i=0;i<n;i++)
				{
					result=s[i].search(id2);
					if(result==1)
						break;
				}
				if(result==1)	System.out.println("Student found...");
				else	System.out.println("Student not found...");
				break;
			default:
				System.out.println("Invalid choice...");
		}
	}
}