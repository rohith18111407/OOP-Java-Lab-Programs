import java.util.Scanner;
class Search
{
    public void binarysearch(int arr[],int key)     //pass the sorted array in ascending order
    {
        int first=0;
        int last=arr.length-1;
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(arr[mid]<key)   first=mid+1;
            else if(arr[mid]==key)
            {
                System.out.println(key+" found at index "+mid);
                break;
            }
            else    last=mid-1;
            mid=(first+last)/2;
        }
        if(first>last)  System.out.println(key+" not found...");
    }

    public int linearsearch(int arr[],int key)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }

}

class Main
{
    public static void main(String []args)
    {
        Scanner scanner=new Scanner(System.in);
        int temp,key,res;
        System.out.println("Enter the size of the array: ");
        int n=scanner.nextInt();
        int []arr=new int[n];   //declaring array in java
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the element: ");
            arr[i]=scanner.nextInt();
        }

        System.out.println("Enter the element to be searched: ");
        key=scanner.nextInt();

        //sorting the array using bubble sort
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println("The array sorted in ascending order is: ");
        for(int i=0;i<n;i++) System.out.print(arr[i]+" ");
        System.out.println();
        Search search=new Search();
        search.binarysearch(arr,key);
        res=search.linearsearch(arr,key);
        if(res!=-1) System.out.println(key+" found at index "+res);
        else    System.out.println(key+" not found...");
    }
}