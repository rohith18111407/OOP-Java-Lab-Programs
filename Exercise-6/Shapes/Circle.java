package Shapes;

public class Circle         //public class
{
    public double radius;           //class member

    public void getDimensions(double radius)        //getter
    {
        this.radius=radius;
    }

    public double perimeter()       //method to calculate perimeter
    {
        return 2*Math.PI*radius;
    }

    public double area()        //method to calculate area
    {
        return Math.PI*radius*radius;
    }
}