import java.util.Scanner;

class Maximum
{
    public <E extends Comparable> E findMax(E[] arr) 
    {
        E max=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i].compareTo(max)>0)
               max=arr[i];
        }
        return max;
    }
}

class Main1
{
    public static void main(String[] args)
    {
        Maximum max=new Maximum();
        Integer arr1[]={21,18,11,14,7,63,69,56};
        System.out.println("Maximum value is: "+max.<Integer>findMax(arr1));
        String arr2[]={"Cat","Dog","Tiger","Ant"};
        System.out.println("Maximum value is: "+ max.<String>findMax(arr2));
        Double arr3[]={2.1,3.9,4.9,5.0,4.95,5.23};
        System.out.println("Maximum value is: "+max.<Double>findMax(arr3));
    }
}
