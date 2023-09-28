import java.util.*;
class Person
{
 // Class Members
    private long aadhar;
    private String name, address;
    private char gender;
 // Empty Constructor
    public Person(){
    }
 // Arguement Constructor
    public Person(long aadhar, String name, String address, char gender)
    {
        this.aadhar = aadhar;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }
    // Setters
    public void setAadhar(long aadhar)
    {
        this.aadhar = aadhar;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setGender(char gender)
    {
        this.gender = gender;
    }
    // Getters
    public long getAadhar()
    {
        return this.aadhar;
    }
    public String getName()
    {
        return this.name;
    }
    public String getAddress()
    {
        return this.address;
    }
    public char getGender()
    {
        return this.gender;
    }
}
class Student extends Person
{
    // Class Members
    private String program;
    private int year;
    private float totalmark;
    private int totalsem;
    
    // Empty Constructor
    public Student()
    {
    }
    // Arguement Constructor
    public Student(long aadhar, String name, String address, char gender, String program, int year, float totalmark, int totalsem)
    {
        super(aadhar, name, address, gender);
        this.program = program;
        this.year = year;
        this.totalmark = totalmark;
        this.totalsem = totalsem;
    }
    // Setters
    public void setProgram(String program)
    {
        this.program = program;
    }
    public void setYear(int year)
    {
        this.year = year;
    }
    public void setTotalMark(float totalmark)
    {
        this.totalmark = totalmark;
    }
    public void setTotalSem(int totalsem)
    {
        this.totalsem = totalsem;
    }
    // Getters
    public String getProgram()
    {
        return this.program;
    }
    public int getYear()
    {
        return this.year;
    }
    public float getTotalMark()
    {
        return this.totalmark;
    }
    public float getTotalSem()
    {
        return this.totalsem;
    }
    // Calculate GPA
    public float calGPA()
    {
        return (float) (this.getTotalMark() / this.getTotalSem());
    }
}
class Faculty extends Person
{
    // Class Members
    private String designation, department;
    private float basicpay;
    // Empty Constructor
    public Faculty()
    {
    }
    // Arguement Constructor
    public Faculty(long aadhar, String name, String address, char gender, String designation, String department, float basicpay)
    {
        super(aadhar, name, address, gender);
        this.designation = designation;
        this.department = department;
        this.basicpay = basicpay;
    }
    // Setters
    public void setDesignation(String designation)
    {
        this.designation = designation;
    }
    public void setDepartment(String department)
    {
        this.department = department;
    }
    public void setBasicPay(float basicpay)
    {
        this.basicpay = basicpay;
    }
    // Getters
    public String getDesignation()
    {
        return this.designation;
    }
    public String getDepartment()
    {
        return this.department;
    }
    public float getBasicPay()
    {
        return this.basicpay;
    }
    // Calculte Salary
    public float calSalary()
    {
        return (float) (((0.6 * getBasicPay()) + (0.1 * getBasicPay())) - ((0.085 * getBasicPay()) + (0.08 * getBasicPay())));
    }
}
class TestInheritance{
    public static void main(String[] args)
    {
        Student student1 = new Student();
        setDetails(student1);
        displayDetails(student1);
        Faculty faculty1 = new Faculty(30_232_1323, "Vikram", "No. 24, Anna Nagar, III Street,Chennai-69.", 'M',"Associate Professor", "Information Technology", (float)25000.00);
        displayDetails(faculty1);
    }
    public static void displayDetails(Student student)
    {
        System.out.println("\nThe Student's name is: " + student.getName());
        System.out.println("The Student's gender is: " + student.getGender());
        System.out.println("The Student's aadhar number is: " + student.getAadhar());
        System.out.println("The Student's address is: " + student.getAddress());
        System.out.println("The Student's opted program is: " + student.getProgram());
        System.out.println("The Student's current year is: " + student.getYear());
        System.out.println("The Student's CGPA is: " + student.calGPA());
    }
    public static void displayDetails(Faculty faculty)
    {
        System.out.println("\nThe Faculty's name is: " + faculty.getName());
        System.out.println("The Faculty's gender is: " + faculty.getGender());
        System.out.println("The Faculty's aadhar number is: " + faculty.getAadhar());
        System.out.println("The Faculty's address is: " + faculty.getAddress());
        System.out.println("The Faculty's designation is: " + faculty.getDesignation());
        System.out.println("The Faculty's department is: " + faculty.getDepartment());
        System.out.println("The Faculty's basicpay is: " + faculty.getBasicPay());
    }
    public static void setDetails(Student student)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter Student's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student's gender: ");
        char gender = scanner.next().charAt(0);
        System.out.print("Enter Student's aadhar: ");
        long aadhar = scanner.nextLong();
        System.out.print("Enter Student's address: ");
        String address = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Student's program: ");
        String program = scanner.nextLine();
        System.out.print("Enter Student's current year: ");
        int year = scanner.nextInt();
        System.out.print("Enter Student's total GPA: ");
        float GPA = scanner.nextFloat();
        System.out.print("Enter number of semesters attended by student: ");
        int totalsem = scanner.nextInt();
        student.setName(name);
        student.setGender(gender);
        student.setAadhar(aadhar);
        student.setAddress(address);
        student.setProgram(program);
        student.setYear(year);
        student.setTotalMark(GPA);
        student.setTotalSem(totalsem);
    }
}