package mypack.converter;

public class TimeConverter
{
    public double hr,min,sec;

    public double hr2min(double hr)
    {
        this.hr=hr;
        return hr*60;
    }

    public double min2sec(double min)
    {
        this.min=min;
        return min*60;
    }

    public double min2hr(double min)
    {
        this.min=min;
        return min/60;
    }

    public double sec2min(double sec)
    {
        this.sec=sec;
        return sec/60;        
    }
}