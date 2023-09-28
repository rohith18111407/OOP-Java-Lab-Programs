package Shapes;

public class Triangle           //public class 
{
    public double side;         //public class member
    public void getDimensions(double side)          //getter
    {
        this.side=side;
    }

    public double perimeter()       //method to calculate perimeter
    {
        return 3*side;
    }

    public double area()            //method to calculate area
    {
        return (Math.sqrt(3)/4)*side*side;
    }
}