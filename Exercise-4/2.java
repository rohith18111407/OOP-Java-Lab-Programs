import java.util.Scanner;

abstract class Shape        //abstract class
{
    protected String color="red";   //protected class members

    public Shape()  //default constructor
    {

    }

    public Shape(String color)  //single argument constructor
    {
        this.color=color;
    }

    public String getColor()    //getter
    {
        return this.color;
    }

    public void setColor(String color)      //setter
    {
        this.color=color;
    }

    abstract float getArea();           //abstract methods
    abstract float getPerimeter();
}

interface calculations      //interface
{
    float getArea();
    float getPerimeter();
}

class Circle extends Shape implements calculations
{
    protected float radius=1;       //protected class variable

    public Circle()         //default constructor
    {

    }

    public Circle(float radius)         //single argument constructor
    {
        this.radius=radius;
    }

    public Circle(float radius,String color)          //multiple argument constructor
    {
        super(color);
        this.radius=radius;
    }

    public float getRadius()        //getter    
    {
        return this.radius;
    }

    public void setRadius(float radius)         //setter
    {
        this.radius=radius;
    }

    public float getArea()          //method overriding
    {
        return (float)(Math.PI*radius*radius);
    }

    public float getPerimeter()         //method overriding
    {
        return (float) (2*Math.PI*radius);
    }
}

class Rectangle extends Shape implements calculations
{
    protected float width=1;        //protected class members
    protected float length=1;

    public Rectangle()      //default constructor
    {

    }

    public Rectangle(float width,float length)      //multiple argument constructors
    {
        this.length=length;
        this.width=width;
    }

    public Rectangle(float width,float length,String color)     
    {
        super(color);
        this.length=length;
        this.width=width;
    }

    public float getWidth()         //getter
    {
        return this.width;
    }

    public void setWidth(float width)           //setter
    {
        this.width=width;
    }

    public float getLength()            //getter
    {
        return this.length;
    }

    public void setLength(float length)     //setter
    {
        this.length=length;
    }

    public float getArea()              //method overriding
    {
        return (float)(length*width);
    }

    public float getPerimeter()         //method overriding
    {
        return (float)(2*(length+width));
    }
}

class Square extends Rectangle implements calculations
{
    public Square()         //default constructor
    {

    }

    public Square(float side)           //single argument constructor
    {
        super(side,side);
    }

    public Square(float side,String color)          //multiple argument constructor
    {
        super(side,side,color);
    }  

    public float getSide()      //getter
    {
        return this.length;
    }

    public void setSide(float side)         //setter
    {
        super.setWidth(side);
        super.setLength(side);
    }

    public float getArea()          //method overriding
    {
        return (float)(super.length*super.width);
    }

    public float getPerimeter()         //method overriding
    {
        return (float)(4*super.length);
    }
}

class TestInterface
{
    public static void  main(String[] a)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();
        Shape[] shapes = new Shape[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("Shapes :\n1.Circle \n2.Rectangle \n3.Square \n Enter the shape number: ");
            int shapeName = scanner.nextInt();
            System.out.println();
            switch(shapeName){
            case 1:
                System.out.print("Enter the radius: ");
                float radius = scanner.nextFloat();
                System.out.print("\nEnter the color: ");
                String colorCir = scanner.next();
                shapes[i] = new Circle(radius, colorCir);
                System.out.println("\nThe area and perimeter of the " + shapes[i].getColor() + " circle formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            case 2:
                System.out.print("Enter the width: ");
                float width = scanner.nextFloat();
                System.out.print("\nEnter the length: ");
                float length = scanner.nextFloat();
                System.out.print("\nEnter the color: ");
                String colorRect = scanner.next();
                shapes[i] = new  Rectangle(width, length, colorRect);
                System.out.println("\nThe area and perimeter of the " + shapes[i].getColor() + " rectangle formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            case 3:
                System.out.print("Enter the side: ");
                float side = scanner.nextFloat();
                System.out.print("\nEnter the color: ");
                String colorSq = scanner.next();
                shapes[i] = new Square(side, colorSq);
                System.out.println("\nThe area and perimeter of the " + shapes[i].getColor() + " square formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            default:
                System.out.println("Invalid shape...");
            }
        }
        scanner.close();
    }
}