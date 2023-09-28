import java.util.*;
class Shape
{
    // Class Members
    protected String color = "red";
    // Default Constructor
    public Shape()
    {
    }
    // Arguement Constructor
    public Shape(String color)
    {
        this.color = color;
    }
    // Setter
    public void setColor(String color)
    {
        this.color = color;
    }
    // Getter
    public String getColor()
    {
        return this.color;
    }
    public float getArea()
    {
        return 0;
    }
    public float getPerimeter()
    {
        return 0;
    }
}
class Circle extends Shape
{
    // Class Members
    protected float radius = 1.0f;
    // Default Constructor
    public Circle()
    {
    }
    // Arguement Constructors
    public Circle(float radius)
    {
        this.radius = radius;
    }
    public Circle(float radius, String color)
    {
        super(color);
        this.radius = radius;
    }
    // Setter
    public void setRadius(float radius)
    {
        this.radius = radius;
    }
    // Getter
    public float getRadius()
    {
        return this.radius;
    }
    @Override
    public float getArea()
    {
        return (float) (Math.PI * this.getRadius() * this.getRadius());
    }
    @Override
    public float getPerimeter()
    {
        return (float) (2 * Math.PI * this.getRadius());
    }
}
class Rectangle extends Shape
{
    // Class Members
    protected float width = 1.0f;
    protected float length = 1.0f;
    // Default Constructor
    public Rectangle()
    {
    }
    // Arguement Constructors
    public Rectangle(float width, float length)
    {
        this.width = width;
        this.length = length;
    }
    public Rectangle(float width, float length, String color)
    {
        super(color);
        this.width = width;
        this.length = length;
    }
    // Setters
    public void setWidth(float width)
    {
        this.width = width;
    }
    public void setLength(float length)
    {
        this.length = length;
    }
    // Getters
    public float getWidth()
    {
        return this.width;
    }
    public float getLength()
    {
        return this.length;
    }
    @Override
    public float getArea()
    {
        return (float) (this.getLength() * this.getWidth());
    }
    @Override
    public float getPerimeter()
    {
        return (float) (2 * (this.getLength() + this.getWidth()));
    }
}
class Square extends Rectangle
{
    // No Class Members
    // Default Constructor
    public Square()
    {
    }
    // Arguement Constructors
    public Square(float side)
    {
        super(side, side);
    }
    public Square(float side, String color)
    {
        super(side, side, color);
    }
    // Setter
    public void setSide(float side)
    {
        super.setWidth(side);
        super.setLength(side);
    }
    public float getSide()
    {
        return super.getWidth();
    }
}
class TestShape
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();
        Shape[] shapes = new Shape[n];
        for (int i = 0; i < n; i++)
        {
            System.out.print("\nEnter shape " + (i + 1) + "(Circle -> 0 / Rectangle -> 1 / Square -> 2): ");
            int shapeName = scanner.nextInt();
            switch(shapeName){
            case 0:
                System.out.print("\tEnter the radius: ");
                float radius = scanner.nextFloat();
                System.out.print("\n\tEnter the color: ");
                String colorCir = scanner.next();
                shapes[i] = new Circle(radius, colorCir);
                System.out.println("\n\tThe area and perimeter of the " + shapes[i].getColor() + " circle formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            case 1:
                System.out.print("\tEnter the width: ");
                float width = scanner.nextFloat();
                System.out.print("\n\tEnter the length: ");
                float length = scanner.nextFloat();
                System.out.print("\n\tEnter the color: ");
                String colorRect = scanner.next();
                shapes[i] = new Rectangle(width, length, colorRect);
                System.out.println("\n\tThe area and perimeter of the " + shapes[i].getColor() + " rectangle formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            case 2:
                System.out.print("\tEnter the side: ");
                float side = scanner.nextFloat();
                System.out.print("\n\tEnter the color: ");
                String colorSq = scanner.next();
                shapes[i] = new Square(side, colorSq);
                System.out.println("\n\tThe area and perimeter of the " + shapes[i].getColor() + " square formed is: " + shapes[i].getArea() + " and " + shapes[i].getPerimeter());
                break;
            }
        }
    }
}