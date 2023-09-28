
import java.util.*;
class MinorCitizenException extends Exception
{
	MinorCitizenException()
	{
		super("MinorCitizenException : Age less than 18");
	}
	
}

class Person
{
    private String name;
    private int age;
    private String aadhar;

    Person(String name, int age, String aadhar)
	{
		this.name = name;
		this.age = age;
		this.aadhar = aadhar;
	}
	
	void canVote() throws MinorCitizenException 
	{
		if(age<18)
			throw new MinorCitizenException();
		else
			System.out.println("Can vote");
	}
	
	void hasAadhar()
	{
		if(aadhar.length() < 12)
			throw new NullPointerException();
		else
			System.out.println("Has valid aadhar");
	}
		

    void display()
    {
		System.out.println("***Displaying Details***");
        System.out.println("Name : "+this.name);
        System.out.println("Age :"+this.age);
        System.out.println("Aadhaar :"+this.aadhar);
    }
}


class Main
{
    public static void main(String args[])
    {
        int age;  
		Scanner scan = new Scanner(System.in);
        System.out.print("Enter name :");
		String name = scan.next();
		System.out.print("Enter age :");
		try
		{
			age = scan.nextInt();
		}
		catch(InputMismatchException ex)
		{
			System.out.println("Enter valid number!!");
			scan.nextLine();
			System.out.print("Enter age :");
			age = scan.nextInt();
		}
		
		System.out.print("Enter aadhar :");
		String aadhar = scan.next();
		
		
		Person p = new Person(name, age, aadhar);
		p.display();
		try
		{
			p.canVote();
		}
		catch(MinorCitizenException e)
		{
			System.out.println(e);
		}
		
		try
		{
			p.hasAadhar();
		}
		catch(NullPointerException e)
		{
			System.out.print(e);
		}
    }
}
