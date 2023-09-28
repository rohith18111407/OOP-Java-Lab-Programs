import java.util.Scanner;

class Student
{
	String name,dept;
	int id,mark1,mark2,mark3;
	
	public void Student(){
	}
	
	public void assignInputs()
	{
		System.out.println("Assigning inputs..");
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name: ");
		this.name=scanner.nextLine();
		System.out.println("Enter the department: ");
		this.dept=scanner.nextLine();
		System.out.println("Enter the id:");
		this.id=scanner.nextInt();
		System.out.println("Enter the mark 1:");
		this.mark1=scanner.nextInt();
		System.out.println("Enter the mark 2:");
		this.mark2=scanner.nextInt();
		System.out.println("Enter the mark 3:");
		this.mark3=scanner.nextInt();
		System.out.println("Details entered successfully...");
	}
	
	public void calculateGrade()
	{
		float avg=(float)((this.mark1+this.mark2+this.mark3)/3);
		System.out.println("Average="+avg);
		if(avg>90 && avg<=100) System.out.println("Grade A");
		else if(avg>80 && avg<=90) System.out.println("Grade B");
		else if(avg>70 && avg<=80) System.out.println("Grade C");
		else if(avg>60 && avg<=70) System.out.println("Grade D");
		else System.out.println("Grade E");
	}
	
	public void display()
	{
		System.out.println("Displaying the output...");
		System.out.println("Name: "+this.name);
		System.out.println("Department: "+this.dept);
		System.out.println("Marks :");
		System.out.println("Mark 1 = "+this.mark1);
		System.out.println("Mark 2 = "+this.mark2);
		System.out.println("Mark 3 = "+this.mark3);
	}
	
	public void search(int id1)
	{
		if(id1==id)
		{
			System.out.println("Student found...");
			display();
		}
		else
		{
			System.out.println("Student not found...");
		}
	}

}

class Main
{
	public static void main(String[] args)
	{
		Student student=new Student();
		student.assignInputs();
		System.out.println();
		System.out.println();
		student.calculateGrade();
		System.out.println();
		student.display();
		System.out.println();
		System.out.println("Enter the id of the student to search: ");
		Scanner scanner=new Scanner(System.in);
		int id1=scanner.nextInt();
		student.search(id1);
	}
}		
