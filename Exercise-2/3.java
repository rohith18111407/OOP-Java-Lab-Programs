import java.util.Scanner;

class SmallestLargestWord    
{
  void large_small(String string)
  {    
    String word = "", small = "", large="";    
    String[] words = new String[100];    
    int length = 0;    
  
    string = string + " ";    
          
    for(int i = 0; i < string.length(); i++)
    {       
        if(string.charAt(i) != ' ')
        {    
            word = word + string.charAt(i);    
        }    
        else
        {        
            words[length] = word;        
            length++;       
            word = "";    
        }    
    }            
   
    small = large = words[0];    
             
    for(int k = 0; k < length; k++)
    {            
        if(small.length() > words[k].length())    
            small = words[k];       
        if(large.length() < words[k].length())    
            large = words[k];    
    }    

    int result1=0,result2=0,j=0;
    System.out.println("Smallest word: " + small);  
    for(int i=0;i<string.length();i++)
    {
        if(j<small.length() && string.charAt(i)==small.charAt(j))
        {
            result1=1;
            j++;
            if(j==small.length())
            {
                System.out.println(small+" found at index "+(i-j+1));
                break;
            }
        }
        else
        {
            result1=0;
            j=0;
        }
    }

    j=0;
    System.out.println("Largest word: " + large);    
    for(int i=0;i<string.length();i++)
    {
        if(j<large.length() && string.charAt(i)==large.charAt(j))
        {
            result2=1;
            j++;
            if(j==large.length())
            {
                System.out.println(large+" found at index "+(i-j+1));
                break;
            }
        }
        else
        {
            result2=0;
            j=0;
        }
    }
   }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = scanner.nextLine();
        SmallestLargestWord s=new SmallestLargestWord();
        s.large_small(string);
    }
}