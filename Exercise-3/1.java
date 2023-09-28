import java.util.Scanner;

class Person
{
    private int aadhaar;
    private String name,address;
    private char gender;

    Person(int aadhaar,String name,String address,char gender)
    {
        this.aadhaar=aadhaar;
        this.name=name;
        this.address=address;
        this.gender=gender;
    }

    public String getName()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        name=scanner.nextLine();
        return name;
    }    

    public String getAddress()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the address: ");
        address=scanner.nextLine();
        return address;
    }

    public void setAddress(String addresss)
    {
        this.address=address;
    }

    public char getGender()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the gender: ");
        gender=scanner.nextchar();
        return gender;
    }
}

class Student extends Person
{
    private String program;
    private int year;
    private float totalmark,gpa;

    Student(String aadhaar,String name,String address,char gender,String program,int year,float total)
    {
        super(aadhaar,name,address,gender);
        this.program=program;
        this.year=year;
        this.totalmark=total;
    }

    public String getProgram()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the program: ");
        program=scanner.nextLine();
        return program;
    }

    public int getYear()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year: ");
        year=scanner.nextInt();
        return year;
    }

    public void setYear(int year)
    {
        this.year=year;
    }

    public float getTotal()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Total mark: ");
        totalmark=scanner.nextFloat();
        return totalmark;
    }

    public void setTotal(float tot)
    {
        this.totalmark=tot;
    }

    public float calGPA()
    {
        gpa=(this.totalmark/this.year);
        return gpa;
    }

    public void display()
    {
        System.out.println("Name = "+super.name);
        System.out.println("Aadhaar = "+super.aadhaar);
        System.out.println("Address = "+super.address);
        System.out.println("Gender = "+super.gender);
        System.out.println("Year = "+year);
        System.out.println("Total mark = "+totalmark);
    }
}

class Faculty extends Person
{
    private String designation,department;
    private float basicpay,gross_salary,deductions,net_salary;

    Faculty(String aadhaar,String name,String address,char gender,String designation,String dept,float pay)
    {
        super(aadhaar,name,address,gender);
        this.designation=designation;
        this.department=dept;
        this.basicpay=pay;
    }

    public String getDesig()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the designation: ");
        designation=scanner.nextLine();
        return designation;
    }

    public void setDesig(String desig)
    {
        this.designation=desig;
    }

    public void setBasic(float basic)
    {
        this.basicpay=basic;
    }

    public float getBasic()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name: ");
        basicpay=scanner.nextFloat();
        return basicpay;
    }

    public float calSalary()
    {
        gross_salary=basicpay+(0.6*basicpay)+(0.1*basicpay);
        deductions=(0.085*basicpay)+(0.08*basicpay);
        net_salary=gross_salary-deductions;
        return net_salary;
    }
}

class TestInheritance
{
    public static void main(String[] args)
    {
        float GPA;
        Student student=new Student(3152220,"hello","chennai",'M',"program 1",2,98);
        GPA=student.calGPA();
        System.out.println("GPA = "+GPA);
    }
}