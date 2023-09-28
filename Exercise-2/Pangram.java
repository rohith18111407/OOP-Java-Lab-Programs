import java.util.Scanner;

class Example
{
    void pangram(String str)
    {
        boolean[] alphaList = new boolean[26];
        int[] countlist=new int[26];
        int index = 0;
        int flag = 1;
        for(int i=0;i<26;i++)
        {
            countlist[i]=0;
        }
        for (int i = 0; i < str.length(); i++)
        {
            if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
            {
                index = str.charAt(i) - 'A';
            }
            else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') 
            {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
            countlist[index]+=1;
        }
        for (int i = 0; i <= 25; i++) 
        {
            if (alphaList[i] == false)
                flag = 0;
        }

        System.out.println("String: " + str);
        if (flag == 1)
        {
            int i=0;
            System.out.println("The above string is a pangram.");
            for(char c='A';c<='Z';c++)
            {
                System.out.println(c+": "+countlist[i]);
                i++;
            }
        }
        else
        {
            int i=0;
            System.out.println("The above string is not a pangram.");
            for(char c='A';c<='Z';c++)
            {
                System.out.println(c+": "+countlist[i]);
                i++;
            }
        }
    }
}

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to check pangram: ");
        String str = scanner.nextLine();
        Example e=new Example();
        e.pangram(str);
    }
}