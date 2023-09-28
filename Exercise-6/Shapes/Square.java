package Shapes;

public class Square         //public class
{
    public double side;             //public class member

    public void getDimensions(double side)          //getter
    {
        this.side=side;
    }

    public double perimeter()          //method to calculate perimeter
    {
        return 4*side;
    }

    public double area()            //method to calculate area
    {
        return side*side;
    }
}