package mypack.converter;

public class DistanceConverter
{
    public double km,meter,miles;

    public double meter2KM(double meter)
    {
        this.meter=meter;
        return meter/1000;
    }

    public double miles2KM(double miles)
    {
        this.miles=miles;
        return miles*1.60934;
    }

    public double KM2meter(double km)
    {
        this.km=km;
        return km*1000;
    }

    public double KM2miles(double km)
    {
        this.km=km;
        return km*0.621371;
    }
}