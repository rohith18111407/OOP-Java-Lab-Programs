import java.util.ArrayList;

class Sort
{
    public <E extends Comparable> void bubbleSort(E[] arr)
    {
        E temp;
        System.out.println("Before sorting: ");
        for(E ele:arr)
            System.out.print(ele+" ");
        System.out.println("\n");
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                
                if(arr[j].compareTo(arr[j+1]) > 0)
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println("After sorting: ");
        for(E ele:arr)
            System.out.print(ele+" ");
        System.out.println("\n");
    }
}

class Main3 
{
    public static void main(String args[])
    {
        Sort sort=new Sort();
        Integer arr1[]={7,5,3,9,1,2,4};
        sort.<Integer>bubbleSort(arr1);

        String arr2[]={"Java","C","C++","Python","HTML","CSS","Javascript"};
        sort.<String>bubbleSort(arr2);

        Double arr3[]={9.852,18.0,7.0,11.0,14.0,9.5};
        sort.<Double>bubbleSort(arr3);
    } 
}
