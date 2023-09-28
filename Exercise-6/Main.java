import Shapes.*;
import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        int choice=0;
        Scanner scanner=new Scanner(System.in);
        do
        {
            System.out.println("PROGRAM TO CALCULATE THE AREA AND PERIMETER OF GIVEN SHAPE\n");
            System.out.println("Choices: ");
            System.out.println("1.Triangle\n2.Square\n3.Circle\n4.Exit\n");
            System.out.println("Enter the choice: ");
            choice=scanner.nextInt();
            System.out.println();
            switch(choice)
            {
                case 1:
                    Triangle t=new Triangle();
                    System.out.println("Enter the side of the equilateral triangle: ");
                    double side1=scanner.nextDouble();
                    t.getDimensions(side1);
                    System.out.println("The perimeter of equilateral triangle is: "+t.perimeter());
                    System.out.println("The area of equilateral triangle is: "+t.area()+"\n");
                    break;
                case 2:
                    Square s=new Square();
                    System.out.println("Enter the side of the Square: ");
                    double side2=scanner.nextDouble();
                    s.getDimensions(side2);
                    System.out.println("The perimeter of Square is: "+s.perimeter());
                    System.out.println("The area of Square is: "+s.area()+"\n");
                    break;
                case 3:
                    Circle c=new Circle();
                    System.out.println("Enter the radius of the circle: ");
                    double radius=scanner.nextDouble();
                    c.getDimensions(radius);
                    System.out.println("The circumference of Circle is: "+c.perimeter());
                    System.out.println("The area of Circle is: "+c.area()+"\n");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice!\n");
            }
        }while(choice!=4);
    }
}